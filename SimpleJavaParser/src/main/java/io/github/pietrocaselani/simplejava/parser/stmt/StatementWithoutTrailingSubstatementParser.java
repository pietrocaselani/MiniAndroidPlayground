package io.github.pietrocaselani.simplejava.parser.stmt;

import io.github.pietrocaselani.simplejava.ast.Node;
import io.github.pietrocaselani.simplejava.ast.body.Block;
import io.github.pietrocaselani.simplejava.ast.stmt.ExpressionStatement;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.body.BlockParser;
import io.github.pietrocaselani.simplejava.parser.expr.StatementExpressionParser;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class StatementWithoutTrailingSubstatementParser {
	public static Node parse(SimpleJavaParser.StatementWithoutTrailingSubstatementContext context) {
		final Node node;

		if (context.block() != null) {
			node = new BlockParser(context.block()).parse();
		} else if (context.expressionStatement() != null) {

			node = StatementExpressionParser.parse(context.expressionStatement().statementExpression());
		} else if (context.switchStatement() != null) {
			//TODO parse switch
			node = null;
		} else if (context.doStatement() != null) {
			//TODO parse do
			node = null;
		} else if (context.breakStatement() != null) {
			//TODO parse break
			node = null;
		} else if (context.continueStatement() != null) {
			//TODO parse continue
			node = null;
		} else if (context.returnStatement() != null) {
			node = new ReturnStatementParser(context.returnStatement()).parse();
		} else if (context.synchronizedStatement() != null) {
			//TODO parse sync
			node = null;
		} else if (context.throwStatement() != null) {
			//TODO parse throw
			node = null;
		} else if (context.tryStatement() != null) {
			//TODO parse try
			node = null;
		} else {
			throw new RuntimeException("Unkown statement: " + context.getText());
		}

		return node;
	}
}
