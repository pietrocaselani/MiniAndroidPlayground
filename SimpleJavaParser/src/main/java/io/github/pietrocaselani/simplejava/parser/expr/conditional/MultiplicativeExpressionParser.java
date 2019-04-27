package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class MultiplicativeExpressionParser {
	public static Expression parse(SimpleJavaParser.MultiplicativeExpressionContext context) {
		final Expression expression;

		if (context.multiplicativeExpression() == null) {
			expression = UnaryExpressionParser.parse(context.unaryExpression());
		} else {
			expression = null;
			//TODO WTF?
		}

		return expression;
	}
}
