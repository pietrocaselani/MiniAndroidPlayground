package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.stmt.Statement;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class Block extends BodyDeclaration {
	private boolean mStatic;
	private List<Statement> mStatements;

	public Block() {}

	public Block(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public Block(boolean aStatic, List<Statement> statements) {
		mStatic = aStatic;
		setStatements(statements);
	}

	public Block(int beginLine, int endLine, int beginColumn, int endColumn, boolean aStatic, List<Statement> statements) {
		super(beginLine, endLine, beginColumn, endColumn);
		mStatic = aStatic;
		setStatements(statements);
	}

	public boolean isStatic() {
		return mStatic;
	}

	public void setStatic(boolean aStatic) {
		mStatic = aStatic;
	}

	public List<Statement> getStatements() {
		return mStatements;
	}

	public void setStatements(List<Statement> statements) {
		mStatements = statements;
		setAsParent(statements);
	}
}
