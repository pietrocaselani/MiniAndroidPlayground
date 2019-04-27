package io.github.pietrocaselani.simplejava.ast.type;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class ReferenceType extends Type {
	private Type mType;

	public ReferenceType() {}

	public ReferenceType(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public ReferenceType(Type type) {
		mType = type;
	}

	public ReferenceType(int beginLine, int endLine, int beginColumn, int endColumn, Type type) {
		super(beginLine, endLine, beginColumn, endColumn);
		mType = type;
	}

	public Type getType() {
		return mType;
	}

	public void setType(Type type) {
		mType = type;
	}
}
