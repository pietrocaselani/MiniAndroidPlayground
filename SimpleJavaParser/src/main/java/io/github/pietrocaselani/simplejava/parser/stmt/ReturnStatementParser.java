package io.github.pietrocaselani.simplejava.parser.stmt;

import io.github.pietrocaselani.simplejava.ast.stmt.ReturnStatement;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

import static io.github.pietrocaselani.simplejava.parser.expr.ExpressionParser.parseExpression;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class ReturnStatementParser extends NodeParser<SimpleJavaParser.ReturnStatementContext, ReturnStatement> {
	public ReturnStatementParser(SimpleJavaParser.ReturnStatementContext context) {
		super(context);
	}

	@Override public ReturnStatement parse() {
		return fillNode(new ReturnStatement(parseExpression(mContext.expression())));
	}
}
