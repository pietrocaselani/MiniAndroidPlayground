package io.github.pietrocaselani.simplejava.ast.expr;

import io.github.pietrocaselani.simplejava.ast.type.Type;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class IsExpression extends Expression {
	private Expression mExpression;
	private Type mType;

	public IsExpression() {}

	public IsExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public IsExpression(Expression expression, Type type) {
		setExpression(expression);
		setType(type);
	}

	public IsExpression(int beginLine, int endLine, int beginColumn, int endColumn, Expression expression, Type type) {
		super(beginLine, endLine, beginColumn, endColumn);
		setExpression(expression);
		setType(type);
	}

	public Expression getExpression() {
		return mExpression;
	}

	public void setExpression(Expression expression) {
		mExpression = expression;
		setAsParent(expression);
	}

	public Type getType() {
		return mType;
	}

	public void setType(Type type) {
		mType = type;
		setAsParent(type);
	}
}
