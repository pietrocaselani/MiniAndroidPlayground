package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.CompilationUnit;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaLexer;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class SimpleJavaSourceCodeParser {
    public static CompilationUnit parse(String path) {
        return parse(new File(path));
    }

    public static CompilationUnit parse(File file) {
        return new SimpleJavaSourceCodeParser().parseFile(file);
    }

    private CompilationUnit parseFile(File file) {
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);

            final SimpleJavaLexer lexer = new SimpleJavaLexer(new ANTLRInputStream(fileInputStream));

            final CommonTokenStream tokens = new CommonTokenStream(lexer);

            final SimpleJavaParser parser = new SimpleJavaParser(tokens);

            parser.addErrorListener(new DiagnosticErrorListener());
            parser.setErrorHandler(new DefaultErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

            final SimpleJavaParser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();

//			compilationUnitContext.inspect(parser);

            return new CompilationUnitParser(compilationUnitContext).parse();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
