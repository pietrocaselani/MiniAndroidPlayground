package io.github.pietrocaselani.simplejava.parser.stmt;

import io.github.pietrocaselani.simplejava.ast.Node;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class StatementParser {
	public static Node parse(SimpleJavaParser.StatementContext statementContext) {
		final Node node;

		if (statementContext.statementWithoutTrailingSubstatement() != null) {
			node = StatementWithoutTrailingSubstatementParser.parse(statementContext.statementWithoutTrailingSubstatement());
		} else if (statementContext.ifThenStatement() != null) {
			node = null;
			//TODO parse if
		} else if (statementContext.ifThenElseStatement() != null) {
			node = null;
			//TODO parse if else
		} else if (statementContext.whileStatement() != null) {
			node = null;
			//TODO parse while
		} else if (statementContext.forStatement() != null) {
			node = null;
			//TODO parse for
		} else if (statementContext.labeledStatement() != null) {
			throw new RuntimeException("WTF?!");
		} else {
			throw new RuntimeException("Unknow statement: " + statementContext.getText());
		}

		return node;
	}
}
