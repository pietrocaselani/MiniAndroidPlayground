package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

import static io.github.pietrocaselani.simplejava.parser.NodeFiller.fillNode;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class VariableInitializerParser {
	public static Expression parse(SimpleJavaParser.VariableInitializerContext variableInitializerContext) {
		final Expression node;

		if (variableInitializerContext == null) {
			node = null;
		} else if (variableInitializerContext.expression() != null) {
			node = ExpressionParser.parseExpression(variableInitializerContext.expression());
		} else {
			throw new RuntimeException("Fuck " + variableInitializerContext.getText());
		}

		return fillNode(node, variableInitializerContext);
	}
}
