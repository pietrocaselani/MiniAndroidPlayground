package io.github.pietrocaselani.simplejava.parser.type;

import io.github.pietrocaselani.simplejava.ast.type.Type;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

/**
* Created by Pietro Caselani
* On 1/21/15
* NewJava
*/
public abstract class UnannTypeParser<T extends ParserRuleContext, E extends Type> extends NodeParser<T, E> {
	public UnannTypeParser(T context) {
		super(context);
	}

	public static Type parse(SimpleJavaParser.UnannTypeContext unannTypeContext) {
		final Type type;
		if (unannTypeContext.unannPrimitiveType() != null) {
			type = UnannPrimitiveTypeParser.parse(unannTypeContext.unannPrimitiveType());
		} else if (unannTypeContext.unannReferenceType() != null) {
			type = UnannReferenceTypeParser.parse(unannTypeContext.unannReferenceType());
		} else {
			throw new RuntimeException();
		}

		return type;
	}
}
