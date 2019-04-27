package io.github.pietrocaselani.simplejava.ast;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class ImportDeclaration extends Node {
	private boolean mStatic, mStar;
	private String mName;

	public ImportDeclaration() {}

	public ImportDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public ImportDeclaration(boolean aStatic, boolean star, String name) {
		mStatic = aStatic;
		mStar = star;
		mName = name;
	}

	public ImportDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, boolean aStatic, boolean star, String name) {
		super(beginLine, endLine, beginColumn, endColumn);
		mStatic = aStatic;
		mStar = star;
		mName = name;
	}

	public boolean isStatic() {
		return mStatic;
	}

	public void setStatic(boolean aStatic) {
		mStatic = aStatic;
	}

	public boolean isStar() {
		return mStar;
	}

	public void setStar(boolean star) {
		mStar = star;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}
}
