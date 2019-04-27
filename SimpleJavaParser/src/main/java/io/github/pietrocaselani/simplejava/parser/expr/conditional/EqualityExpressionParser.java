package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class EqualityExpressionParser {
	public static Expression parse(SimpleJavaParser.EqualityExpressionContext context) {
		final Expression expression;

		if (context.equalityExpression() == null) {
			expression = RelationExpressionParser.parse(context.relationalExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
