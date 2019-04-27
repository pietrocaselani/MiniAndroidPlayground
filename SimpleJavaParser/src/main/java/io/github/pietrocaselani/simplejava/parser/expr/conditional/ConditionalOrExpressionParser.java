package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ConditionalOrExpressionParser {
	public static Expression parse(SimpleJavaParser.ConditionalOrExpressionContext context) {
		final Expression expression;

		if (context.conditionalOrExpression() == null) {
			expression = ConditionalAndExpressionParser.parse(context.conditionalAndExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
