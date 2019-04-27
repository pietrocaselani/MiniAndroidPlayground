package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ConditionalAndExpressionParser {
	public static Expression parse(SimpleJavaParser.ConditionalAndExpressionContext context) {
		final Expression expression;

		if (context.conditionalAndExpression() == null) {
			expression = InclusiveOrExpressionParser.parse(context.inclusiveOrExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
