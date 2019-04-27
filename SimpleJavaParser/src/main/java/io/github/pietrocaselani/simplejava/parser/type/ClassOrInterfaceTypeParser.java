package io.github.pietrocaselani.simplejava.parser.type;

import io.github.pietrocaselani.simplejava.ast.type.ClassOrInterfaceType;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/26/15
 * NewJava
 */
public final class ClassOrInterfaceTypeParser extends NodeParser<SimpleJavaParser.ClassOrInterfaceTypeContext, ClassOrInterfaceType> {
	public ClassOrInterfaceTypeParser(SimpleJavaParser.ClassOrInterfaceTypeContext context) {
		super(context);
	}

	@Override public ClassOrInterfaceType parse() {
		return null;
	}
}
