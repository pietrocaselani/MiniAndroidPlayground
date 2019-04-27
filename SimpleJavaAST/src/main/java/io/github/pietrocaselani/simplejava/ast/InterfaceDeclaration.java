package io.github.pietrocaselani.simplejava.ast;

import io.github.pietrocaselani.simplejava.ast.body.BodyDeclaration;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class InterfaceDeclaration extends TypeDeclaration {
	private List<InterfaceDeclaration> mSuperInterfaces;

	public InterfaceDeclaration() {}

	public InterfaceDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public InterfaceDeclaration(String name, List<BodyDeclaration> members, int modifiers) {
		super(name, members, modifiers);
	}

	public InterfaceDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, String name, List<BodyDeclaration> members, int modifiers) {
		super(beginLine, endLine, beginColumn, endColumn, name, members, modifiers);
	}

	public List<InterfaceDeclaration> getSuperInterfaces() {
		return mSuperInterfaces;
	}

	public void setSuperInterfaces(List<InterfaceDeclaration> superInterfaces) {
		mSuperInterfaces = superInterfaces;
	}
}
