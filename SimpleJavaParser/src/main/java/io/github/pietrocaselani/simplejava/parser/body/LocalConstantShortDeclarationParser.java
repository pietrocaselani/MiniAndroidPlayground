package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.LocalConstantDeclaration;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class LocalConstantShortDeclarationParser extends NodeParser<SimpleJavaParser.LocalConstantShortDeclarationContext, LocalConstantDeclaration> {
	public LocalConstantShortDeclarationParser(SimpleJavaParser.LocalConstantShortDeclarationContext context) {
		super(context);
	}

	@Override public LocalConstantDeclaration parse() {
		throw new RuntimeException("Gzuz");
	}
}
