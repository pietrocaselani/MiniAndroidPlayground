package io.github.pietrocaselani.simplejava.ast.stmt;

import io.github.pietrocaselani.simplejava.ast.body.LocalVariableDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;
import io.github.pietrocaselani.simplejava.ast.type.Type;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class LocalVariableDeclarationStatement extends Statement {
	private LocalVariableDeclaration mLocalVariableDeclaration;

	public LocalVariableDeclarationStatement() {}

	public LocalVariableDeclarationStatement(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public LocalVariableDeclarationStatement(LocalVariableDeclaration localVariableDeclaration) {
		setLocalVariableDeclaration(localVariableDeclaration);
	}

	public LocalVariableDeclarationStatement(int beginLine, int endLine, int beginColumn, int endColumn, LocalVariableDeclaration localVariableDeclaration) {
		super(beginLine, endLine, beginColumn, endColumn);
		setLocalVariableDeclaration(localVariableDeclaration);
	}

	public LocalVariableDeclaration getLocalVariableDeclaration() {
		return mLocalVariableDeclaration;
	}

	public void setLocalVariableDeclaration(LocalVariableDeclaration localVariableDeclaration) {
		mLocalVariableDeclaration = localVariableDeclaration;
		setAsParent(localVariableDeclaration);
	}
}
