package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.LocalVariableDeclaration;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class LocalVariableShortDeclatorParser extends NodeParser<SimpleJavaParser.LocalVariableShortDeclarationContext, LocalVariableDeclaration> {
	public LocalVariableShortDeclatorParser(SimpleJavaParser.LocalVariableShortDeclarationContext context) {
		super(context);
	}

	@Override public LocalVariableDeclaration parse() {
		throw new RuntimeException("Gzuz");
	}
}
