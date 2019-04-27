package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.InterfaceDeclaration;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/26/15
 * NewJava
 */
public final class InterfaceDeclarationParser extends NodeParser<SimpleJavaParser.NormalInterfaceDeclarationContext, InterfaceDeclaration> {
	public InterfaceDeclarationParser(SimpleJavaParser.NormalInterfaceDeclarationContext context) {
		super(context);
	}

	@Override public InterfaceDeclaration parse() {

		return null;
	}
}
