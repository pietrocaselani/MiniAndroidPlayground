package io.github.pietrocaselani.simplejava.ast;

import io.github.pietrocaselani.simplejava.ast.body.BodyDeclaration;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public abstract class TypeDeclaration extends Node {
	private String mName;
	private List<? extends Node> mMembers;
	private int mModifiers;

	public TypeDeclaration() {}

	public TypeDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public TypeDeclaration(String name, List<? extends Node> members, int modifiers) {
		mName = name;
		setMembers(members);
		mModifiers = modifiers;
	}

	public TypeDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, String name, List<? extends Node> members, int modifiers) {
		super(beginLine, endLine, beginColumn, endColumn);
		mName = name;
		setMembers(members);
		mModifiers = modifiers;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public List<? extends Node> getMembers() {
		return mMembers;
	}

	public void setMembers(List<? extends Node> members) {
		mMembers = members;
		setAsParent(members);
	}

	public int getModifiers() {
		return mModifiers;
	}

	public void setModifiers(int modifiers) {
		mModifiers = modifiers;
	}
}
