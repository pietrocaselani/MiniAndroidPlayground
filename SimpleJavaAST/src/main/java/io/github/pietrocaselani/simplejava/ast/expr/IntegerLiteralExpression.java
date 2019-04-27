package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class IntegerLiteralExpression extends LiteralExpression {
	private final int mValue;

	public IntegerLiteralExpression(int value) {
		mValue = value;
	}

	public IntegerLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn, int value) {
		super(beginLine, endLine, beginColumn, endColumn);
		mValue = value;
	}

	public Integer getValue() {
		return mValue;
	}
}
