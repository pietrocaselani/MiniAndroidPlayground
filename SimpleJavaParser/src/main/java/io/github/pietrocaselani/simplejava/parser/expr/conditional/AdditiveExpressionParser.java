package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class AdditiveExpressionParser {
	public static Expression parse(SimpleJavaParser.AdditiveExpressionContext context) {
		final Expression expression;

		if (context.additiveExpression() == null) {
			expression = MultiplicativeExpressionParser.parse(context.multiplicativeExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
