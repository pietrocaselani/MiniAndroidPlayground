package io.github.pietrocaselani.simplejava.ast;

import io.github.pietrocaselani.simplejava.ast.body.BodyDeclaration;
import io.github.pietrocaselani.simplejava.ast.type.ClassOrInterfaceType;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class ClassDeclaration extends TypeDeclaration {
	private ClassOrInterfaceType mSuperType;
	private List<ClassOrInterfaceType> mImplements;

	public ClassDeclaration() {}

	public ClassDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public ClassDeclaration(String name, List<BodyDeclaration> members, int modifiers) {
		super(name, members, modifiers);
	}

	public ClassDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, String name, List<BodyDeclaration> members, int modifiers) {
		super(beginLine, endLine, beginColumn, endColumn, name, members, modifiers);
	}

	public ClassOrInterfaceType getSuperType() {
		return mSuperType;
	}

	public void setSuperType(ClassOrInterfaceType superType) {
		mSuperType = superType;
		setAsParent(superType);
	}

	public List<ClassOrInterfaceType> getImplements() {
		return mImplements;
	}

	public void setImplements(List<ClassOrInterfaceType> anImplements) {
		mImplements = anImplements;
		setAsParent(anImplements);
	}
}
