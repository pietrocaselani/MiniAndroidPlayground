package io.github.pietrocaselani.simplejava.parser.type;

import io.github.pietrocaselani.simplejava.ast.type.ClassOrInterfaceType;
import io.github.pietrocaselani.simplejava.ast.type.Type;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/29/15
 * MiniPlayground
 */
public final class UnannClassOrInterfaceTypeParser {
	public static Type parse(SimpleJavaParser.UnannClassOrInterfaceTypeContext context) {
		final Type type;

		if (context.unannClassType_lfno_unannClassOrInterfaceType() != null) {
			type = parse(context.unannClassType_lfno_unannClassOrInterfaceType());
		} else if (context.unannInterfaceType_lfno_unannClassOrInterfaceType() != null) {
			type = parse(context.unannInterfaceType_lfno_unannClassOrInterfaceType().unannClassType_lfno_unannClassOrInterfaceType());
		} else if (context.unannClassType_lf_unannClassOrInterfaceType() != null) {
			throw new RuntimeException("Not supported yet! " + context.unannClassType_lf_unannClassOrInterfaceType());
		} else if (context.unannInterfaceType_lf_unannClassOrInterfaceType() != null) {
			throw new RuntimeException("Not supported yet! " + context.unannInterfaceType_lf_unannClassOrInterfaceType().toString());
		} else {
			throw new RuntimeException("Unknow class or interface type: " + context.getText());
		}

		return type;
	}

	public static Type parse(SimpleJavaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext context) {
		//TODO WTF is scope?!
		return new ClassOrInterfaceType(null /* Scope */, context.Identifier().getText());
	}
}
