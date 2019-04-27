package io.github.pietrocaselani.simplejava.ast.expr;

import io.github.pietrocaselani.simplejava.ast.Node;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class AssignmentExpression extends AbstractAssignmentExpression {
	private Operator mOperator;
	private Expression mValue;
	private Node mTarget;

	public AssignmentExpression() {}

	public AssignmentExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public AssignmentExpression(Operator operator, Expression value, Node target) {
		mOperator = operator;
		setValue(value);
		setTarget(target);
	}

	public AssignmentExpression(int beginLine, int endLine, int beginColumn, int endColumn, Operator operator, Expression value, Node target) {
		super(beginLine, endLine, beginColumn, endColumn);
		mOperator = operator;
		setValue(value);
		setTarget(target);
	}

	public Operator getOperator() {
		return mOperator;
	}

	public void setOperator(Operator operator) {
		mOperator = operator;
	}

	public Expression getValue() {
		return mValue;
	}

	public void setValue(Expression value) {
		mValue = value;
		setAsParent(value);
	}

	public Node getTarget() {
		return mTarget;
	}

	public void setTarget(Node target) {
		mTarget = target;
		setAsParent(target);
	}

	public static enum Operator {
		ASSIGN, // =
		PLUS_ASSIGN, // +=
		MINUS_ASSIGN, // -=
		MUL_ASSIGN, // *=
		DIV_ASSIGN, // /=
		AND_ASSIGN, // &=
		OR_ASSIGN, // |=
		XOR_ASSIGN, // ^=
		REMIDER_ASSIGN, // %=
		LEFT_SHIFT_ASSIGN, // <<=
		RIGHT_SIGNED_SHIFT_ASSIGN, // >>=
		RIGHT_UNSIGNED_SHIFT_ASSIGN; // >>>=

		public static Operator operatorFrom(String text) {
			if ("=".equals(text)) {
				return ASSIGN;
			} else if ("+=".equals(text)) {
				return PLUS_ASSIGN;
			} else if ("-=".equals(text)) {
				return MINUS_ASSIGN;
			} else if ("*=".equals(text)) {
				return MUL_ASSIGN;
			} else if ("/=".equals(text)) {
				return DIV_ASSIGN;
			} else if ("&=".equals(text)) {
				return AND_ASSIGN;
			} else if ("|=".equals(text)) {
				return OR_ASSIGN;
			} else if ("^=".equals(text)) {
				return XOR_ASSIGN;
			} else if ("%=".equals(text)) {
				return REMIDER_ASSIGN;
			} else if ("<<=".equals(text)) {
				return LEFT_SHIFT_ASSIGN;
			} else if (">>=".equals(text)) {
				return RIGHT_SIGNED_SHIFT_ASSIGN;
			} else if (">>>=".equals(text)) {
				return RIGHT_UNSIGNED_SHIFT_ASSIGN;
			} else {
				throw new RuntimeException("Not found");
			}
		}
	}
}
