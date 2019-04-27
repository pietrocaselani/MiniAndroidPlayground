package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class AbstractAssignmentExpressionParser {

	public static Expression parse(SimpleJavaParser.AssignmentExpressionContext assignmentExpressionContext) {
		Expression expression;

		if (assignmentExpressionContext.assignment() != null) {
			expression = new AssignmentExpressionParser(assignmentExpressionContext.assignment()).parse();
		} else {
			expression = ConditionalExpressionParser.parse(assignmentExpressionContext.conditionalExpression());
		}

		return expression;
	}
}
