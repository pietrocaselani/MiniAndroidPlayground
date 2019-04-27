package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class BinaryExpression extends Expression {
	private Expression mLeft, mRight;
	private Operator mOperator;

	public BinaryExpression() {}

	public BinaryExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public BinaryExpression(Expression left, Expression right, Operator operator) {
		setLeft(left);
		setRight(right);
		mOperator = operator;
	}

	public BinaryExpression(int beginLine, int endLine, int beginColumn, int endColumn, Expression left, Expression right, Operator operator) {
		super(beginLine, endLine, beginColumn, endColumn);
		setLeft(left);
		setRight(right);
		mOperator = operator;
	}

	public Expression getLeft() {
		return mLeft;
	}

	public void setLeft(Expression left) {
		mLeft = left;
		setAsParent(left);
	}

	public Expression getRight() {
		return mRight;
	}

	public void setRight(Expression right) {
		mRight = right;
		setAsParent(right);
	}

	public Operator getOperator() {
		return mOperator;
	}

	public void setOperator(Operator operator) {
		mOperator = operator;
	}

	public static enum Operator {
		OR, // ||
		AND, // &&
		BIN_OR,
		BIN_AND,
		XOR,
		EQUALS,
		NOT_EQUALS,
		LESS,
		GREATER,
		LESS_EQUALS,
		GREATER_EQUALS,
		LEFT_SHIFT,
		RIGHT_SIGNED_SHIFT,
		RIGHT_UNSIGNED_SHIFT,
		PLUS,
		MINUS,
		TIMES,
		DIVIDE,
		REMAINDER;
	}
}
