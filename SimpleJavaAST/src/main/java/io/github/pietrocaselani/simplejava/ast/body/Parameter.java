package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.type.Type;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class Parameter extends AbstractParameter {
	private Type mType;
	private boolean mVarArg;

	public Parameter() {}

	public Parameter(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public Parameter(int modifiers, VariableDeclaratorId variableDeclaratorId) {
		super(modifiers, variableDeclaratorId);
	}

	public Parameter(int beginLine, int endLine, int beginColumn, int endColumn, int modifiers, VariableDeclaratorId variableDeclaratorId) {
		super(beginLine, endLine, beginColumn, endColumn, modifiers, variableDeclaratorId);
	}

	public Type getType() {
		return mType;
	}

	public void setType(Type type) {
		mType = type;
		setAsParent(type);
	}

	public boolean isVarArg() {
		return mVarArg;
	}

	public void setVarArg(boolean varArg) {
		mVarArg = varArg;
	}
}
