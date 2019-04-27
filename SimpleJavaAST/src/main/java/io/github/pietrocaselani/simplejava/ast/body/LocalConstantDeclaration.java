package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.Node;
import io.github.pietrocaselani.simplejava.ast.type.Type;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class LocalConstantDeclaration extends Node {
	private Type mType;
	private List<VariableDeclarator> mVariables;

	public LocalConstantDeclaration() {}

	public LocalConstantDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public LocalConstantDeclaration(Type type, List<VariableDeclarator> variables) {
		setType(type);
		setVariables(variables);
	}

	public LocalConstantDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, Type type, List<VariableDeclarator> variables) {
		super(beginLine, endLine, beginColumn, endColumn);
		setType(type);
		setVariables(variables);
	}

	public Type getType() {
		return mType;
	}

	public void setType(Type type) {
		mType = type;
		setAsParent(type);
	}

	public List<VariableDeclarator> getVariables() {
		return mVariables;
	}

	public void setVariables(List<VariableDeclarator> variables) {
		mVariables = variables;
		setAsParent(variables);
	}
}
