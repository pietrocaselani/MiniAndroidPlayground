package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.Node;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class VariableDeclaratorId extends Node {
	private String mName;

	public VariableDeclaratorId() {}

	public VariableDeclaratorId(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public VariableDeclaratorId(String name) {
		mName = name;
	}

	public VariableDeclaratorId(int beginLine, int endLine, int beginColumn, int endColumn, String name) {
		super(beginLine, endLine, beginColumn, endColumn);
		mName = name;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}
}
