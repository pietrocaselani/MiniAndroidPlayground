package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.type.Type;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class FieldDeclaration extends BodyDeclaration {
	private int mModifiers;
	private Type mType;
	private List<VariableDeclarator> mVariables;

	public FieldDeclaration() {}

	public FieldDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public FieldDeclaration(int modifiers, Type type, List<VariableDeclarator> variables) {
		mModifiers = modifiers;
		setType(type);
		setVariables(variables);
	}

	public FieldDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, int modifiers, Type type, List<VariableDeclarator> variables) {
		super(beginLine, endLine, beginColumn, endColumn);
		mModifiers = modifiers;
		setType(type);
		setVariables(variables);
	}

	public int getModifiers() {
		return mModifiers;
	}

	public void setModifiers(int modifiers) {
		mModifiers = modifiers;
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
