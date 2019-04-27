package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class DoubleLiteralExpression extends LiteralExpression {
	private final double mValue;

	public DoubleLiteralExpression(double value) {
		mValue = value;
	}

	public DoubleLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn, double value) {
		super(beginLine, endLine, beginColumn, endColumn);
		mValue = value;
	}

	public Double getValue() {
		return mValue;
	}
}
