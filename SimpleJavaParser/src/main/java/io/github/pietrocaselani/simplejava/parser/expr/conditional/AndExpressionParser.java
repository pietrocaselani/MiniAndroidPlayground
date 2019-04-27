package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class AndExpressionParser {
	public static Expression parse(SimpleJavaParser.AndExpressionContext context) {
		final Expression expression;

		if (context.andExpression() == null) {
			expression = EqualityExpressionParser.parse(context.equalityExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
