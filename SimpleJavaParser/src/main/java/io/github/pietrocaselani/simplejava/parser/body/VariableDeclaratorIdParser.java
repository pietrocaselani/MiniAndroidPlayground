package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.VariableDeclaratorId;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/21/15
 * NewJava
 */
public final class VariableDeclaratorIdParser extends NodeParser<SimpleJavaParser.VariableDeclaratorIdContext, VariableDeclaratorId> {
	public VariableDeclaratorIdParser(SimpleJavaParser.VariableDeclaratorIdContext context) {
		super(context);
	}

	@Override public VariableDeclaratorId parse() {
		return fillNode(new VariableDeclaratorId(mContext.Identifier().getText()));
	}
}
