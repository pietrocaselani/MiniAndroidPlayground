package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public abstract class AbstractAssignmentExpression extends Expression {

	public AbstractAssignmentExpression() {}

	public AbstractAssignmentExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}
}
