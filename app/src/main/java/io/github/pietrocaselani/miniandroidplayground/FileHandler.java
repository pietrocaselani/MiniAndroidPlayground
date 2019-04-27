package io.github.pietrocaselani.miniandroidplayground;

import java.io.*;
import java.util.Arrays;
import java.util.List;

final class FileHandler {
    private final File baseDirectory;

    FileHandler(File baseDirectory) {
        this.baseDirectory = baseDirectory;
    }

    File defaultOutputFile() {
        return new File(buildDirectory(), "code.dex");
    }

    File buildDirectory() {
        return ensureDirExists(new File(baseDirectory, "Build"));
    }

    File defaultSourceCodeFile() {
        return new File(buildDirectory(), "code.simplejava");
    }

    File programsDirectory() {
        final File sourceCodeDir = new File(baseDirectory, "Programs");
        return ensureDirExists(sourceCodeDir);
    }

    List<String> listFilesInto(File directory) {
        return Arrays.asList(directory.list());
    }

    String loadContensOf(File file) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        final StringBuilder builder = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }

        reader.close();

        return builder.toString();
    }

    void writeToFile(String text, File file) throws IOException {
        final FileOutputStream stream = new FileOutputStream(file, false);
        stream.write(text.getBytes("UTF-8"));
        stream.close();
    }

    private File ensureDirExists(File directory) {
        if (directory.exists()) return directory;

        directory.mkdirs();

        return directory;
    }
}
