/*
* Use of the OSATE2-Ocarina plugin is subject to the terms of the license set forth
* at http://www.eclipse.org/legal/cpl-v10.html.
*
* Note: Contributions by user philip.alldredge@uah.edu were performed under contract W31P4Q-05-A-031 for the US Army. 
* These contributions are covered by US Government Unlimited Rights per DFARS 252.227-7014. You are entitled to use this software under the conditions of the Common Public License.
*/
package org.osate.ocarina.real.xtext.ui.annex;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.annexsupport.AnnexHighlighter;
import org.osate.annexsupport.AnnexHighlighterPositionAcceptor;

import org.osate.ocarina.real.xtext.annex.*;
import org.osate.ocarina.real.xtext.real.Model;

public class REALAnnexHighlighter implements AnnexHighlighter
{
	@Override
	public void highlightAnnexSubclause(AnnexSubclause subclause, AnnexHighlighterPositionAcceptor acceptor)
	{
		REALAnnexBlock block = (REALAnnexBlock)subclause;
		highlightAnnexBlock(block, acceptor);
	}

	@Override
	public void highlightAnnexLibrary(AnnexLibrary library,	AnnexHighlighterPositionAcceptor acceptor)
	{
		REALAnnexBlock block = (REALAnnexBlock)library;
		highlightAnnexBlock(block, acceptor);
	}
	
	private void highlightAnnexBlock(REALAnnexBlock block, AnnexHighlighterPositionAcceptor acceptor)
	{
		Model model = block.getREALModel();
		if(model != null)
		{
			ICompositeNode node = NodeModelUtils.findActualNodeFor(model);
			
			for(ILeafNode leafNode : node.getLeafNodes())
			{
				EObject grammarElement = leafNode.getGrammarElement();

				String id = null;
				if(grammarElement instanceof Keyword)
				{
					id = DefaultHighlightingConfiguration.KEYWORD_ID;
				}
				else if(grammarElement instanceof TerminalRule)
				{
					TerminalRule rule = (TerminalRule)grammarElement;
					String ruleName = rule.getName();
					if(ruleName.equals("SL_COMMENT"))
					{
						id = DefaultHighlightingConfiguration.COMMENT_ID;
					}
				}
				else if(grammarElement instanceof RuleCall)
				{
					RuleCall ruleCall = (RuleCall)grammarElement;
					String ruleName = ruleCall.getRule().getName();
					if(ruleName.equals("STRING"))
					{
						id = DefaultHighlightingConfiguration.STRING_ID;
					}
					else if(ruleName.startsWith("PUNC_"))
					{
						id = DefaultHighlightingConfiguration.PUNCTUATION_ID;
					}
				}
				
				if(id != null)
				{
					acceptor.addPosition(leafNode.getOffset(), leafNode.getLength(), id);
				}
			}
		}

	}
}

