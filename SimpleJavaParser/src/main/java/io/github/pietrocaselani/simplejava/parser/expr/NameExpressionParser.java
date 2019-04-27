package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.NameExpression;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/30/15
 * MiniPlayground
 */
public final class NameExpressionParser extends NodeParser<SimpleJavaParser.ExpressionNameContext, NameExpression> {
	public NameExpressionParser(SimpleJavaParser.ExpressionNameContext context) {
		super(context);
	}

	@Override public NameExpression parse() {
		final StringBuilder sb = new StringBuilder();

		if (mContext.ambiguousName() != null) {
			sb.append(parseAmbiguousName(mContext.ambiguousName())).append(".");
		}

		final String text = mContext.Identifier().getText();

		if (sb.length() == 0) {
			sb.append(text);
		} else {
			sb.append(".").append(text);
		}

		return fillNode(new NameExpression(sb.toString()));
	}

	private String parseAmbiguousName(SimpleJavaParser.AmbiguousNameContext context) {
		if (context.ambiguousName() != null) {
			return parseAmbiguousName(context.ambiguousName()) + ".";
		} else {
			return context.Identifier().getText();
		}
	}
}
