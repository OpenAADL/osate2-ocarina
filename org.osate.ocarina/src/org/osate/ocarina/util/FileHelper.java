package org.osate.ocarina.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.osate.aadl2.util.OsateDebug;

public class FileHelper {
	public static void updatePokMakefile(String directory) {
		List<File> allMakefiles = getMakefileRecursively(new File(directory).toPath());

		for (File makefile : allMakefiles) {
			updatePokMakefile(makefile);
			OsateDebug.osateDebug("makefile" + makefile);
		}
	}

	public static void updatePokMakefile(File makefile) {
		try {
			List<String> lines;

			lines = FileUtils.readLines(makefile, (String) null);

			List<String> newContent = new ArrayList<String>();

			for (String line : lines) {
				String newLine = line.replaceAll("\\.c", "\\.o");
				OsateDebug.osateDebug("old line: " + line);
				OsateDebug.osateDebug("old line: " + newLine);

				newContent.add(newLine);
			}
			FileUtils.writeLines(makefile, null, newContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<File> getMakefileRecursively(Path p) {
		List<File> res = new ArrayList<File>();

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(p)) {
			for (Path file : stream) {
				File newFile = file.toFile();
				if (newFile.isDirectory()) {
					res.addAll(getMakefileRecursively(file));
				} else {
					if (file.toString().endsWith("Makefile")) {
						res.add(file.toFile());
					}
				}
			}
		} catch (IOException | DirectoryIteratorException x) {
			// IOException can never be thrown by the iteration.
			// In this snippet, it can only be thrown by newDirectoryStream.
			System.err.println(x);
		}

		return res;
	}
}