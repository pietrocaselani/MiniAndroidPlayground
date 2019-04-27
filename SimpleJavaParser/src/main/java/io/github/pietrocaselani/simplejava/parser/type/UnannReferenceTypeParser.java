package io.github.pietrocaselani.simplejava.parser.type;

import io.github.pietrocaselani.simplejava.ast.type.ReferenceType;
import io.github.pietrocaselani.simplejava.ast.type.Type;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/21/15
 * NewJava
 */
public class UnannReferenceTypeParser {
	public static Type parse(SimpleJavaParser.UnannReferenceTypeContext context) {
		final Type referenceType;

		if (context.unannClassOrInterfaceType() != null) {
			referenceType = new ReferenceType(UnannClassOrInterfaceTypeParser.parse(context.unannClassOrInterfaceType()));
		} else {
			throw new RuntimeException("Unknow type: " + context.getText());
		}

		return referenceType;
	}
}
