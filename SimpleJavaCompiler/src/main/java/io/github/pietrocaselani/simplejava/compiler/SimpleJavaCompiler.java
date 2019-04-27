package io.github.pietrocaselani.simplejava.compiler;

import com.android.dx.DexMaker;
import io.github.pietrocaselani.simplejava.ast.CompilationUnit;
import io.github.pietrocaselani.simplejava.parser.SimpleJavaSourceCodeParser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/20/15
 * NewJava
 */

public final class SimpleJavaCompiler {
    public interface Callback {
        void infoMessage(String message);
    }

    private final Callback mCallback;
    private final File mOutFile;
    static DexMaker sDexMaker = new DexMaker();

    public SimpleJavaCompiler(File outputFile, Callback callback) {
        mOutFile = outputFile;
        mCallback = callback;
    }

    static DexMaker getDexMaker() {
        return sDexMaker;
    }

    public File getOutFile() {
        return mOutFile;
    }

    public void compileFiles(File... files) throws IOException {
        compileFiles(Arrays.asList(files));
    }

    public void compileFiles(List<File> files) throws IOException {
        final DexGenerator dexGenerator = new DexGenerator(mOutFile);

        for (final File file : files) {
            mCallback.infoMessage("Compiling file: " + file.getName());

            final CompilationUnit compilationUnit = SimpleJavaSourceCodeParser.parse(file);
            dexGenerator.addCompilationUnit(compilationUnit);

            mCallback.infoMessage("File: " + file.getName() + " compiled");
        }

        dexGenerator.generate();

        buildDexFile();
    }

    private void buildDexFile() throws IOException {
        final FileOutputStream outputStream = new FileOutputStream(mOutFile);
        outputStream.write(sDexMaker.generate());
        outputStream.close();
    }
}
