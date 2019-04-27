package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class StringLiteralExpression extends LiteralExpression {
	private final String mValue;

	public StringLiteralExpression(String value) {
		mValue = value;
	}

	public StringLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn, String value) {
		super(beginLine, endLine, beginColumn, endColumn);
		mValue = value;
	}

	public String getValue() {
		return mValue;
	}
}
