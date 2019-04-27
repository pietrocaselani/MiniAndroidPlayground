package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.Node;
import io.github.pietrocaselani.simplejava.ast.expr.AssignmentExpression;
import io.github.pietrocaselani.simplejava.ast.expr.AssignmentExpression.Operator;
import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.type.UnannTypeParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class AssignmentExpressionParser extends NodeParser<SimpleJavaParser.AssignmentContext, AssignmentExpression> {
	public AssignmentExpressionParser(SimpleJavaParser.AssignmentContext context) {
		super(context);
	}

	@Override public AssignmentExpression parse() {
		final Node target = parseTarget(mContext.leftHandSide());
		final Operator operator = Operator.operatorFrom(mContext.assignmentOperator().getText());
		final Expression value = ExpressionParser.parseExpression(mContext.expression());

		return fillNode(new AssignmentExpression(operator, value, target));
	}

	private Node parseTarget(SimpleJavaParser.LeftHandSideContext leftHandSideContext) {
		final Node node;

		if (leftHandSideContext.unannType() != null) {
			node = UnannTypeParser.parse(leftHandSideContext.unannType());
		} else if (leftHandSideContext.fieldAccess() != null) {
			//TODO parse field
			node = null;
			System.out.println("Field " +leftHandSideContext.fieldAccess().getText());
		} else if (leftHandSideContext.arrayAccess() != null) {
			//TODO parse Array
			node = null;
			System.out.println("Array " +leftHandSideContext.arrayAccess().getText());
		} else {
			throw new RuntimeException("Unknow left hand side: " + leftHandSideContext.getText());
		}

		return node;
	}
}
