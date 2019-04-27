package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclaratorId;
import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.expr.VariableInitializerParser;

/**
 * Created by Pietro Caselani
 * On 1/21/15
 * NewJava
 */
public final class VariableDeclaratorParser extends NodeParser<SimpleJavaParser.VariableDeclaratorContext, VariableDeclarator> {
	public VariableDeclaratorParser(SimpleJavaParser.VariableDeclaratorContext context) {
		super(context);
	}

	@Override public VariableDeclarator parse() {
		final VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorIdParser(mContext.variableDeclaratorId()).parse();

		final Expression init = VariableInitializerParser.parse(mContext.variableInitializer());

		return fillNode(new VariableDeclarator(variableDeclaratorId, init));
	}
}
