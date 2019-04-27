package io.github.pietrocaselani.simplejava.ast.stmt;

import io.github.pietrocaselani.simplejava.ast.body.LocalConstantDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;
import io.github.pietrocaselani.simplejava.ast.type.Type;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class LocalConstantDeclarationStatement extends Statement {
	private LocalConstantDeclaration mLocalConstantDeclaration;

	public LocalConstantDeclarationStatement() {}

	public LocalConstantDeclarationStatement(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public LocalConstantDeclarationStatement(LocalConstantDeclaration localConstantDeclaration) {
		setLocalConstantDeclaration(localConstantDeclaration);
	}

	public LocalConstantDeclarationStatement(int beginLine, int endLine, int beginColumn, int endColumn, LocalConstantDeclaration localConstantDeclaration) {
		super(beginLine, endLine, beginColumn, endColumn);
		setLocalConstantDeclaration(localConstantDeclaration);
	}

	public LocalConstantDeclaration getLocalConstantDeclaration() {
		return mLocalConstantDeclaration;
	}

	public void setLocalConstantDeclaration(LocalConstantDeclaration localConstantDeclaration) {
		mLocalConstantDeclaration = localConstantDeclaration;
		setAsParent(localConstantDeclaration);
	}
}
