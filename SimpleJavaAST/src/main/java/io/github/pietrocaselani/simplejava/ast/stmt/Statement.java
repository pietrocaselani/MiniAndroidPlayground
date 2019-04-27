package io.github.pietrocaselani.simplejava.ast.stmt;

import io.github.pietrocaselani.simplejava.ast.Node;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public abstract class Statement extends Node {

	public Statement() {}

	public Statement(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}
}
