package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.expr.conditional.UnaryExpressionParser;

import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.POS_DECREMENT;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.POS_INCREMENT;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.PRE_DECREMENT;
import static io.github.pietrocaselani.simplejava.ast.expr.UnaryExpression.Operator.PRE_INCREMENT;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class StatementExpressionParser {
	public static Expression parse(SimpleJavaParser.StatementExpressionContext context) {
		final Expression expression;

		if (context.assignment() != null) {
			expression = new AssignmentExpressionParser(context.assignment()).parse();
		} else if (context.preIncrementExpression() != null) {
			expression = new UnaryExpression(UnaryExpressionParser.parse(context.preIncrementExpression().unaryExpression()), PRE_INCREMENT);
		} else if (context.preDecrementExpression() != null) {
			expression = new UnaryExpression(UnaryExpressionParser.parse(context.preDecrementExpression().unaryExpression()), PRE_DECREMENT);
		} else if (context.postIncrementExpression() != null) {
			expression = new UnaryExpression(UnaryExpressionParser.parse(context.preIncrementExpression().unaryExpression()), POS_INCREMENT);
		} else if (context.postDecrementExpression() != null) {
			expression = new UnaryExpression(UnaryExpressionParser.parse(context.preIncrementExpression().unaryExpression()), POS_DECREMENT);
		} else if (context.methodInvocation() != null) {
			//TODO parse method invocation
			expression = null;
		} else if (context.classInstanceCreationExpression() != null) {
			//TODO parse class instance creation
			expression = null;
		} else {
			throw new RuntimeException("Unknow statement: " + context.getText());
		}

		return expression;
	}
}
