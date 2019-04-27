package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class FloatLiteralExpression extends LiteralExpression {
	private final float mValue;

	public FloatLiteralExpression(float value) {
		mValue = value;
	}

	public FloatLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn, float value) {
		super(beginLine, endLine, beginColumn, endColumn);
		mValue = value;
	}

	public Float getValue() {
		return mValue;
	}
}
