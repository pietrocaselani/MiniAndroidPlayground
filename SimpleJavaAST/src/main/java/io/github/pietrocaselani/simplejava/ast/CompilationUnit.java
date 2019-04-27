package io.github.pietrocaselani.simplejava.ast;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class CompilationUnit extends Node {
	private PackageDeclaration mPackage;
	private List<ImportDeclaration> mImports;
	private List<TypeDeclaration> mTypes;

	public CompilationUnit() {}

	public CompilationUnit(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public CompilationUnit(PackageDeclaration aPackage, List<ImportDeclaration> imports, List<TypeDeclaration> types) {
		setPackage(aPackage);
		setImports(imports);
		setTypes(types);
	}

	public CompilationUnit(int beginLine, int endLine, int beginColumn, int endColumn, PackageDeclaration aPackage, List<ImportDeclaration> imports, List<TypeDeclaration> types) {
		super(beginLine, endLine, beginColumn, endColumn);
		setPackage(aPackage);
		setImports(imports);
		setTypes(types);
	}

	public PackageDeclaration getPackage() {
		return mPackage;
	}

	public void setPackage(PackageDeclaration aPackage) {
		mPackage = aPackage;
		setAsParent(aPackage);
	}

	public List<ImportDeclaration> getImports() {
		return mImports;
	}

	public void setImports(List<ImportDeclaration> imports) {
		mImports = imports;
		setAsParent(imports);
	}

	public List<TypeDeclaration> getTypes() {
		return mTypes;
	}

	public void setTypes(List<TypeDeclaration> types) {
		mTypes = types;
		setAsParent(types);
	}
}
