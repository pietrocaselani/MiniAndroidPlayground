package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class UnaryExpression extends Expression {
	private Expression mExpression;
	private Operator mOperator;

	public UnaryExpression() {}

	public UnaryExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public UnaryExpression(Expression expression, Operator operator) {
		setExpression(expression);
		mOperator = operator;
	}

	public UnaryExpression(int beginLine, int endLine, int beginColumn, int endColumn, Expression expression, Operator operator) {
		super(beginLine, endLine, beginColumn, endColumn);
		setExpression(expression);
		mOperator = operator;
	}

	public Expression getExpression() {
		return mExpression;
	}

	public void setExpression(Expression expression) {
		mExpression = expression;
		setAsParent(expression);
	}

	public Operator getOperator() {
		return mOperator;
	}

	public void setOperator(Operator operator) {
		mOperator = operator;
	}

	public static enum Operator {
		POSITIVE,
		NEGATIVE,
		PRE_INCREMENT,
		PRE_DECREMENT,
		NOT,
		INVERSE,
		POS_INCREMENT,
		POS_DECREMENT;
	}
}
