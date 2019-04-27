package io.github.pietrocaselani.simplejava.parser.type;

import io.github.pietrocaselani.simplejava.ast.type.PrimitiveType;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

/**
* Created by Pietro Caselani
* On 1/21/15
* NewJava
*/
public abstract class UnannPrimitiveTypeParser<T extends ParserRuleContext, E extends PrimitiveType> extends UnannTypeParser<T, E> {
	public UnannPrimitiveTypeParser(T context) {
		super(context);
	}

	public static PrimitiveType parse(SimpleJavaParser.UnannPrimitiveTypeContext unannPrimitiveTypeContext) {
		PrimitiveType primitiveType;

		if (unannPrimitiveTypeContext.numericType() != null) {
			primitiveType = new NumericTypeParser(unannPrimitiveTypeContext.numericType()).parse();
		} else if ("boolean".equals(unannPrimitiveTypeContext.getText())) {
			primitiveType = new BooleanTypeParser(unannPrimitiveTypeContext).parse();
		} else {
			throw new RuntimeException();
		}

		return primitiveType;
	}

	private static class BooleanTypeParser extends UnannPrimitiveTypeParser<SimpleJavaParser.UnannPrimitiveTypeContext, PrimitiveType> {

		public BooleanTypeParser(SimpleJavaParser.UnannPrimitiveTypeContext context) {
			super(context);
		}

		@Override public PrimitiveType parse() {
			return fillNode(PrimitiveType.BOOLEAN_TYPE);
		}
	}
}
