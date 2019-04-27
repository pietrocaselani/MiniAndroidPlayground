package io.github.pietrocaselani.simplejava.ast.stmt;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class ReturnStatement extends Statement {
	private Expression mExpression;

	public ReturnStatement() {}

	public ReturnStatement(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public ReturnStatement(Expression expression) {
		setExpression(expression);
	}

	public ReturnStatement(int beginLine, int endLine, int beginColumn, int endColumn, Expression expression) {
		super(beginLine, endLine, beginColumn, endColumn);
		setExpression(expression);
	}

	public Expression getExpression() {
		return mExpression;
	}

	public void setExpression(Expression expression) {
		mExpression = expression;
		setAsParent(expression);
	}
}
