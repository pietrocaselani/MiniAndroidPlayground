package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.Node;
import io.github.pietrocaselani.simplejava.ast.expr.Expression;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class VariableDeclarator extends Node {
	private VariableDeclaratorId mDeclaratorId;
	private Expression mInit;

	public VariableDeclarator() {}

	public VariableDeclarator(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public VariableDeclarator(VariableDeclaratorId declaratorId, Expression init) {
		setDeclaratorId(declaratorId);
		setInit(init);
	}

	public VariableDeclarator(int beginLine, int endLine, int beginColumn, int endColumn, VariableDeclaratorId declaratorId, Expression init) {
		super(beginLine, endLine, beginColumn, endColumn);
		setDeclaratorId(declaratorId);
		setInit(init);
	}

	public VariableDeclaratorId getDeclaratorId() {
		return mDeclaratorId;
	}

	public void setDeclaratorId(VariableDeclaratorId declaratorId) {
		mDeclaratorId = declaratorId;
		setAsParent(declaratorId);
	}

	public Expression getInit() {
		return mInit;
	}

	public void setInit(Expression init) {
		mInit = init;
		setAsParent(init);
	}
}
