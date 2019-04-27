package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class NullLiteralExpression extends LiteralExpression {

	public NullLiteralExpression() {}

	public NullLiteralExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	@Override public Object getValue() {
		return null;
	}
}
