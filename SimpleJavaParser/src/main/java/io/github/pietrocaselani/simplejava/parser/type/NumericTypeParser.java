package io.github.pietrocaselani.simplejava.parser.type;

import io.github.pietrocaselani.simplejava.ast.type.PrimitiveType;
import io.github.pietrocaselani.simplejava.ast.type.PrimitiveType.Primitive;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
* Created by Pietro Caselani
* On 1/21/15
* NewJava
*/
public final class NumericTypeParser extends UnannPrimitiveTypeParser<SimpleJavaParser.NumericTypeContext, PrimitiveType> {
	public NumericTypeParser(SimpleJavaParser.NumericTypeContext context) {
		super(context);
	}

	@Override public PrimitiveType parse() {
		PrimitiveType primitiveType;
		if (mContext.integralType() != null) {
			primitiveType = new PrimitiveType(Primitive.primitiveFrom(mContext.integralType().getText()));
		} else if (mContext.floatingPointType() != null) {
			primitiveType = new PrimitiveType(Primitive.primitiveFrom(mContext.floatingPointType().getText()));
		} else {
			throw new RuntimeException();
		}

		return fillNode(primitiveType);
	}
}
