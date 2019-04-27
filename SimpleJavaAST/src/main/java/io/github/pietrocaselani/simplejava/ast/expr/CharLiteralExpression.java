package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class CharLiteralExpression extends LiteralExpression {
	private final char mValue;

	public CharLiteralExpression(char value) {
		mValue = value;
	}

	public CharLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn, char value) {
		super(beginLine, endLine, beginColumn, endColumn);
		mValue = value;
	}

	public Character getValue() {
		return mValue;
	}
}
