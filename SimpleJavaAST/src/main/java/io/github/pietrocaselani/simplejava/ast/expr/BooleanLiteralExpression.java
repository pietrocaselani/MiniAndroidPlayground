package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class BooleanLiteralExpression extends LiteralExpression {
	private final boolean mValue;

	public BooleanLiteralExpression(boolean value) {
		mValue = value;
	}

	public BooleanLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn, boolean value) {
		super(beginLine, endLine, beginColumn, endColumn);
		mValue = value;
	}

	@Override public Boolean getValue() {
		return mValue;
	}
}
