package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.ast.expr.NameExpression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.expr.primary.PrimaryParser;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class PostfixExpressionParser {
	public static Expression parse(SimpleJavaParser.PostfixExpressionContext postfixExpressionContext) {
		final Expression expression;

		if (postfixExpressionContext.primary() != null) {
			expression = PrimaryParser.parse(postfixExpressionContext.primary());
		} else if (postfixExpressionContext.expressionName() != null) {
			expression = new NameExpressionParser(postfixExpressionContext.expressionName()).parse();
		} else {
			throw new RuntimeException("Fuck " + postfixExpressionContext.getText());
		}

		return expression;
	}
}
