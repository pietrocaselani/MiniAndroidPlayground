package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ExclusiveOrExpressionParser {
	public static Expression parse(SimpleJavaParser.ExclusiveOrExpressionContext context) {
		final Expression expression;

		if (context.andExpression() != null) {
			expression = AndExpressionParser.parse(context.andExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
