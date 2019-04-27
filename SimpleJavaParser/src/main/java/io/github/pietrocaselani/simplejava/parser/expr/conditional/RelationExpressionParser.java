package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class RelationExpressionParser {
	public static Expression parse(SimpleJavaParser.RelationalExpressionContext context) {
		final Expression expression;

		if (context.relationalExpression() == null) {
			expression = ShiftExpressionParser.parse(context.shiftExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
