package io.github.pietrocaselani.simplejava.parser.expr.conditional;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression;
import io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.expr.PostfixExpressionParser;

import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.INVERSE;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.NEGATIVE;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.NOT;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.POSITIVE;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.PRE_DECREMENT;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.PRE_INCREMENT;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class UnaryExpressionParser {
	public static Expression parse(SimpleJavaParser.UnaryExpressionContext context) {
		final Expression expression;

		if (context.preIncrementExpression() != null) {
			expression = new UnaryExpression(parse(context.unaryExpression()), PRE_INCREMENT);
		} else if (context.preDecrementExpression() != null) {
			expression = new UnaryExpression(parse(context.unaryExpression()), PRE_DECREMENT);
		} else if (context.unaryExpressionNotPlusMinus() != null) {
			expression = parseNotPlusMinusExpression(context.unaryExpressionNotPlusMinus());
		} else {
			final String operatorText = context.getChild(0).getText();
			Operator operator;

			if (operatorText.equals("+")) {
				operator = POSITIVE;
			} else if (operatorText.equals("-")) {
				operator = NEGATIVE;
			} else {
				throw new RuntimeException("Unknow operator " + context.getText());
			}

			expression = new UnaryExpression(parse(context.unaryExpression()), operator);
		}

		return expression;
	}

	private static Expression parseNotPlusMinusExpression(SimpleJavaParser.UnaryExpressionNotPlusMinusContext context) {
		Expression expression;

		if (context.postfixExpression() != null) {
			expression = PostfixExpressionParser.parse(context.postfixExpression());
		} else if (context.castExpression() != null) {
			//TODO cast expression
			expression = null;
		} else {
			Operator operator;

			if (context.getText().equals("~")) {
				operator = INVERSE;
			} else if (context.getText().equals("!")) {
				operator = NOT;
			} else {
				throw new RuntimeException("Unknow operator " + context.getText());
			}

			expression = new UnaryExpression(parse(context.unaryExpression()), operator);
		}

		return expression;
	}
}
