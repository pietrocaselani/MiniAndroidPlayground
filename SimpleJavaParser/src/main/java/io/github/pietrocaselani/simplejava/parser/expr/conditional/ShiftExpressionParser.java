package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ShiftExpressionParser {
	public static Expression parse(SimpleJavaParser.ShiftExpressionContext context) {
		final Expression expression;

		if (context.shiftExpression() == null) {
			expression = AdditiveExpressionParser.parse(context.additiveExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
