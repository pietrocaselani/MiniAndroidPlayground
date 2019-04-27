package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.Node;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public abstract class AbstractParameter extends Node {
	private int mModifiers;
	private VariableDeclaratorId mVariableDeclaratorId;

	public AbstractParameter() {}

	public AbstractParameter(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public AbstractParameter(int modifiers, VariableDeclaratorId variableDeclaratorId) {
		mModifiers = modifiers;
		mVariableDeclaratorId = variableDeclaratorId;
	}

	public AbstractParameter(int beginLine, int endLine, int beginColumn, int endColumn, int modifiers, VariableDeclaratorId variableDeclaratorId) {
		super(beginLine, endLine, beginColumn, endColumn);
		mModifiers = modifiers;
		mVariableDeclaratorId = variableDeclaratorId;
	}

	public final int getModifiers() {
		return mModifiers;
	}

	public final void setModifiers(int modifiers) {
		mModifiers = modifiers;
	}

	public final VariableDeclaratorId getVariableDeclaratorId() {
		return mVariableDeclaratorId;
	}

	public final void setVariableDeclaratorId(VariableDeclaratorId variableDeclaratorId) {
		mVariableDeclaratorId = variableDeclaratorId;
		setAsParent(variableDeclaratorId);
	}
}
