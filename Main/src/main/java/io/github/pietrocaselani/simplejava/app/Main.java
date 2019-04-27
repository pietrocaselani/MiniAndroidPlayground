package io.github.pietrocaselani.simplejava.app;

import io.github.pietrocaselani.simplejava.compiler.SimpleJavaCompiler;

import java.io.File;
import java.io.IOException;

public final class Main {
    public static void main(String[] args) throws IOException {
        new Main().start();
    }

    private void start() throws IOException {
        final File projectRoot = new File(System.getProperty("user.dir"));
        final File outputFile = new File(projectRoot, "Main/build/generated/hello.dex");

        final File sourceCodeFile = new File(projectRoot, "Main/src/main/resources/hello.simplejava");

        final SimpleJavaCompiler compiler = new SimpleJavaCompiler(outputFile, System.out::println);

        compiler.compileFiles(sourceCodeFile);

        System.out.println("Build success");
    }
}
