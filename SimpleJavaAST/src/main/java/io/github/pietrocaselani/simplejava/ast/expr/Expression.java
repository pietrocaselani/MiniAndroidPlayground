package io.github.pietrocaselani.simplejava.ast.expr;

import io.github.pietrocaselani.simplejava.ast.Node;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public abstract class Expression extends Node {

	public Expression() {}

	public Expression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}
}
