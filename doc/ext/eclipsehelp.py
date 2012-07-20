# -*- coding: utf-8 -*-
"""
    eclipsehelp
    ~~~~~~~~~~~

    Build an Eclipse help plug-in.
    Adapted from sphinx/htmlhelp.py (by Georg Brandl).

    :copyright: 2009 Method Park Software AG, and others
    :license: BSD.
"""

import os, cgi, zipfile

from docutils import nodes
from sphinx import addnodes
from sphinx.builders.html import StandaloneHTMLBuilder

plugin_xml_tpl = '''\
<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.2"?>
<plugin>
   <extension point="org.eclipse.help.toc">
      <toc file="toc.xml" primary="true" />
   </extension>
</plugin>
'''

manifest_mf_tpl = '''\
Manifest-Version: 1.0
Bundle-ActivationPolicy: lazy
Bundle-Name: %%pluginName
Bundle-Localization: plugin
Bundle-Vendor: %%providerName
Bundle-Version: %(eclipse_plugin_version)s
Bundle-ManifestVersion: 2
Bundle-SymbolicName: %(eclipse_plugin_id)s;singleton:=true
'''

plugin_properties_tpl='''\
pluginName=%(eclipse_plugin_nice_name)s
providerName=%(eclipse_plugin_provider_name)s
'''


class TocAutomaton(object):
    "write toc XML to the given file, driven by node visitor events"
    def __init__(self, f):
        self.f = f
        self.level = 0
    def handle_node(self, node):
        if isinstance(node, nodes.list_item):
            self.handle_list_item(node)
        elif isinstance(node, nodes.reference):
            self.handle_reference(node)
        elif isinstance(node, nodes.bullet_list):
            self.handle_bullet_list(node)
        elif isinstance(node, addnodes.compact_paragraph):
            self.handle_compact_paragraph(node)
    def handle_list_item(self, node):
        self.handle_balanced_container(node)
    def handle_bullet_list(self, node):
        self.handle_balanced_container(node)
    def handle_compact_paragraph(self, node):
        self.handle_subnodes(node)
    def handle_reference(self, node):
        link = node['refuri']
        title = cgi.escape(node.astext()).replace('"','&quot;')
        item = '   '*self.level + '<topic href="%(link)s" label="%(title)s">\n' % locals()
        self.f.write(item.encode('ascii', 'xmlcharrefreplace'))
        self.level += 1
    def handle_subnodes(self, nodeiter):
        for subnode in nodeiter:
            self.handle_node(subnode)
    def handle_balanced_container(self, node):
        level_before = self.level
        self.handle_subnodes(node)
        while self.level > level_before:
            self.level -= 1
            self.f.write('</topic>\n')


def generate_toc(builder, f):
    tocdoc = builder.env.get_and_resolve_doctree(builder.config.master_doc, builder,
                                                 prune_toctrees=False)

    f.write('<toc label="%s" topic="%s">\n'%(
            cgi.escape(builder.config.html_short_title),
            'index.html'))
    # the TOC
    tocdoc = builder.env.get_and_resolve_doctree(builder.config.master_doc, builder,
                                                 prune_toctrees=False)

        

    istoctree = lambda node: isinstance(node, addnodes.compact_paragraph) and \
                node.has_key('toctree')
    
    for node in tocdoc.traverse(istoctree):
        automaton = TocAutomaton(f)
        automaton.handle_node(node)

    f.write('</toc>')

def create_jar(jarname, outdir):
    """"create a jar with given full filename, 
    containing all of outdir except for .doctrees and any .jar files"""
    jar = zipfile.ZipFile(jarname, 'w')
    for dirname, dirs, files in os.walk(outdir):
        if '.doctrees' in dirs:
            dirs.remove('.doctrees')
        reldir = dirname[len(outdir)+1:]
        for filename in files:
            if not filename.lower().endswith(".jar"):
                relfilename = os.path.join(reldir, filename)
                absfilename = os.path.join(dirname, filename)
                jar.write(absfilename, relfilename)
    

def build_eclipse_plugin(builder, outdir):
    config = builder.config
    builder.info("creating Eclipse plugin declaration files...")
    meta_inf_dir = os.path.join(outdir,"META-INF")
    if not os.path.exists(meta_inf_dir):
        os.mkdir(meta_inf_dir)    
    mode = "wt"

    configdict = dict(
        eclipse_plugin_version = config.eclipse_plugin_version,
        eclipse_plugin_id = config.eclipse_plugin_id,
        eclipse_plugin_nice_name = config.eclipse_plugin_nice_name,
        eclipse_plugin_provider_name = config.eclipse_plugin_provider_name)

    file(os.path.join(outdir,"plugin.xml"), mode).write( 
        plugin_xml_tpl % configdict)
    file(os.path.join(outdir,"plugin.properties"), mode).write(
        plugin_properties_tpl % configdict)
    file(os.path.join(meta_inf_dir,"MANIFEST.MF"), mode).write(
        manifest_mf_tpl % configdict )

    builder.info("creating toc.xml for Eclipse Help from table of contents...")
    generate_toc(builder, file(os.path.join(outdir,"toc.xml"), mode))

    if builder.config.eclipse_create_jar:
        builder.info("creating JAR from eclipse help plugin...")
        create_jar(os.path.join(outdir, builder.config.eclipse_jar_name), 
                   outdir)


class EclipseHelpBuilder(StandaloneHTMLBuilder):
    """
    Builder that also outputs Eclipse HTML help plugin manifest and TOC file.
    Adapted from HTMLHelpBuilder.
    """
    name = 'eclipsehelp'

    # don't copy the reST source
    copysource = False
    supported_image_types = ['image/png', 'image/gif', 'image/jpeg']

    # don't add links
    add_header_links = False
    add_definition_links = False

    def init(self):
        StandaloneHTMLBuilder.init(self)
        # the output files for HTML help must be .html only
        self.out_suffix = '.html'

    def handle_finish(self):
        build_eclipse_plugin(self, self.outdir)

def setup(app):
    "the Sphinx extension setup function which adds a config value and a builder"
    app.add_config_value('eclipse_plugin_id', "com.example.sphinx.eclipsehelp.no.plugin.id.given", False)
    app.add_config_value('eclipse_plugin_nice_name', "Nameless Sphinx Eclipsehelp plugin", False)
    app.add_config_value('eclipse_plugin_provider_name', "Nameless Sphinx Eclipsehelp plugin provider", False)
    app.add_config_value('eclipse_plugin_version', "1.0.0", False)
    app.add_config_value('eclipse_create_jar', False, False)
    app.add_config_value('eclipse_jar_name', "sphinx_generated_eclipse_help.jar", False)
    app.add_builder(EclipseHelpBuilder)