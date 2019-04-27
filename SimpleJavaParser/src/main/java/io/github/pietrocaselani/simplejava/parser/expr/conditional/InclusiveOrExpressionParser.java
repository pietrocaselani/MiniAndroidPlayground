package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class InclusiveOrExpressionParser {
	public static Expression parse(SimpleJavaParser.InclusiveOrExpressionContext context) {
		final Expression expression;

		if (context.inclusiveOrExpression() == null) {
			expression = ExclusiveOrExpressionParser.parse(context.exclusiveOrExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
