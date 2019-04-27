package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.ConditionalExpression;
import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.expr.conditional.ConditionalOrExpressionParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ConditionalExpressionParser {
	public static Expression parse(SimpleJavaParser.ConditionalExpressionContext conditionalExpressionContext) {
		final Expression expression;

		final Expression condition = ConditionalOrExpressionParser.parse(conditionalExpressionContext.conditionalOrExpression());
		if (conditionalExpressionContext.expression() == null || conditionalExpressionContext.conditionalExpression() == null) {
			expression = condition;
		} else {
			final Expression thenExpression = ExpressionParser.parseExpression(conditionalExpressionContext.expression());
			final Expression elseExpression = parse(conditionalExpressionContext.conditionalExpression());
			expression = new ConditionalExpression(condition, thenExpression, elseExpression);
		}

		return expression;
	}
}
