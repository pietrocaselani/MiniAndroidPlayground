package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/24/15
 * NewJava
 */
public final class ConditionalExpression extends AbstractAssignmentExpression {
	private Expression mCondition, mThenExpression, mElseExpression;

	public ConditionalExpression() {}

	public ConditionalExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public ConditionalExpression(Expression condition, Expression thenExpression, Expression elseExpression) {
		setCondition(condition);
		setThenExpression(thenExpression);
		setElseExpression(elseExpression);
	}

	public ConditionalExpression(int beginLine, int endLine, int beginColumn, int endColumn, Expression condition, Expression thenExpression, Expression elseExpression) {
		super(beginLine, endLine, beginColumn, endColumn);
		setCondition(condition);
		setThenExpression(thenExpression);
		setElseExpression(elseExpression);
	}

	public Expression getCondition() {
		return mCondition;
	}

	public void setCondition(Expression condition) {
		mCondition = condition;
		setAsParent(condition);
	}

	public Expression getThenExpression() {
		return mThenExpression;
	}

	public void setThenExpression(Expression thenExpression) {
		mThenExpression = thenExpression;
		setAsParent(thenExpression);
	}

	public Expression getElseExpression() {
		return mElseExpression;
	}

	public void setElseExpression(Expression elseExpression) {
		mElseExpression = elseExpression;
		setAsParent(elseExpression);
	}
}
