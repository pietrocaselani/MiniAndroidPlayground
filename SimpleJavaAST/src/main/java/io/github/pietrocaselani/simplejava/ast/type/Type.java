package io.github.pietrocaselani.simplejava.ast.type;

import io.github.pietrocaselani.simplejava.ast.Node;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public abstract class Type extends Node {

    public Type() {}

    public Type(int beginLine, int endLine, int beginColumn, int endColumn) {
        super(beginLine, endLine, beginColumn, endColumn);
    }
}
