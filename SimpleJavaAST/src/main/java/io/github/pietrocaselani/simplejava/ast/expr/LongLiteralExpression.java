package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class LongLiteralExpression extends LiteralExpression {
	private final long mValue;

	public LongLiteralExpression(long value) {
		mValue = value;
	}

	public LongLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn, long value) {
		super(beginLine, endLine, beginColumn, endColumn);
		mValue = value;
	}

	public Long getValue() {
		return mValue;
	}
}
