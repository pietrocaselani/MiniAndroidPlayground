package io.github.pietrocaselani.simplejava.ast.stmt;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;

/**
 * Created by Pietro Caselani
 * On 1/30/15
 * MiniPlayground
 */
public final class ExpressionStatement extends Statement {
	private Expression mExpression;

	public ExpressionStatement() {}

	public ExpressionStatement(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public ExpressionStatement(Expression expression) {
		setExpression(expression);
	}

	public ExpressionStatement(int beginLine, int endLine, int beginColumn, int endColumn, Expression expression) {
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
