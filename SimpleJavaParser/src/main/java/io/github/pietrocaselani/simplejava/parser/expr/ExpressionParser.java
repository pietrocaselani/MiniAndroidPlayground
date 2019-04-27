package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ExpressionParser {

	public static Expression parseExpression(SimpleJavaParser.ExpressionContext expressionContext) {
		final Expression expression;
		if (expressionContext.lambdaExpression() != null) {
			//TODO parse lambda
			expression = null;
		} else {
			expression = AbstractAssignmentExpressionParser.parse(expressionContext.assignmentExpression());
		}

		return expression;
	}
}
