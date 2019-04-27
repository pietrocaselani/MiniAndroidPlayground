package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.type.Type;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class MethodDeclaration extends BodyDeclaration {
	private int mModifiers;
	private String mName;
	private Type mReturn;
	private Block mBody;
	private List<Parameter> mParameters;

	public MethodDeclaration() {}

	public MethodDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public MethodDeclaration(int modifiers, String name, Type aReturn, Block body) {
		mModifiers = modifiers;
		mName = name;
		setReturn(aReturn);
		setBody(body);
	}

	public MethodDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, int modifiers, String name, Type aReturn, Block body) {
		super(beginLine, endLine, beginColumn, endColumn);
		mModifiers = modifiers;
		mName = name;
		setReturn(aReturn);
		setBody(body);
	}

	public int getModifiers() {
		return mModifiers;
	}

	public void setModifiers(int modifiers) {
		mModifiers = modifiers;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public Type getReturn() {
		return mReturn;
	}

	public void setReturn(Type aReturn) {
		mReturn = aReturn;
		setAsParent(aReturn);
	}

	public Block getBody() {
		return mBody;
	}

	public void setBody(Block body) {
		mBody = body;
		setAsParent(body);
	}

	public List<Parameter> getParameters() {
		return mParameters;
	}

	public void setParameters(List<Parameter> parameters) {
		mParameters = parameters;
	}
}
