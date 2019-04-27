package io.github.pietrocaselani.simplejava.ast;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class PackageDeclaration extends Node {
	private String mPackageName;

	public PackageDeclaration() {}

	public PackageDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public PackageDeclaration(String packageName) {
		mPackageName = packageName;
	}

	public PackageDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, String packageName) {
		super(beginLine, endLine, beginColumn, endColumn);
		mPackageName = packageName;
	}

	public String getPackageName() {
		return mPackageName;
	}

	public void setPackageName(String packageName) {
		mPackageName = packageName;
	}
}
