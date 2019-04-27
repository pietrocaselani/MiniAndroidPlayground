package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.TypeDeclaration;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ClassDeclarationParser extends NodeParser<SimpleJavaParser.ClassDeclarationContext, TypeDeclaration> {
	public ClassDeclarationParser(SimpleJavaParser.ClassDeclarationContext context) {
		super(context);
	}

	@Override public TypeDeclaration parse() {
		final TypeDeclaration typeDeclaration;
		if (mContext.normalClassDeclaration() != null) {
			typeDeclaration = new NormalClassDeclarationParser(mContext.normalClassDeclaration()).parse();
		} else {
			//TODO parse enum
			typeDeclaration = null;
		}

		return typeDeclaration;
	}
}
