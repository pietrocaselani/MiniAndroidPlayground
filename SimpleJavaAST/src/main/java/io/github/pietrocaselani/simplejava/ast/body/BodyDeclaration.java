package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.Node;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public abstract class BodyDeclaration extends Node {

	public BodyDeclaration() {}

	public BodyDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}
}
