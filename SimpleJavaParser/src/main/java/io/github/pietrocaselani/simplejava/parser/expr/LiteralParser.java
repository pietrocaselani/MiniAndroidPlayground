package io.github.pietrocaselani.simplejava.parser.expr;

import io.github.pietrocaselani.simplejava.ast.expr.BooleanLiteralExpression;
import io.github.pietrocaselani.simplejava.ast.expr.CharLiteralExpression;
import io.github.pietrocaselani.simplejava.ast.expr.FloatLiteralExpression;
import io.github.pietrocaselani.simplejava.ast.expr.IntegerLiteralExpression;
import io.github.pietrocaselani.simplejava.ast.expr.LiteralExpression;
import io.github.pietrocaselani.simplejava.ast.expr.NullLiteralExpression;
import io.github.pietrocaselani.simplejava.ast.expr.StringLiteralExpression;
import io.github.pietrocaselani.simplejava.parser.NodeFiller;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

import static io.github.pietrocaselani.simplejava.parser.NodeFiller.fillNode;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class LiteralParser {
	public static LiteralExpression parse(SimpleJavaParser.LiteralContext literalContext) {
		LiteralExpression literalExpression;

		final String text = literalContext.getText();

		if (literalContext.BooleanLiteral() != null) {
			literalExpression = new BooleanLiteralExpression(Boolean.parseBoolean(text));
		} else if (literalContext.CharacterLiteral() != null) {
			literalExpression = new CharLiteralExpression(text.charAt(1));
		} else if (literalContext.FloatingPointLiteral() != null) {
			literalExpression = new FloatLiteralExpression(Float.valueOf(text));
		} else if (literalContext.IntegerLiteral() != null) {
			literalExpression = new IntegerLiteralExpression(Integer.valueOf(text));
		} else if (literalContext.NullLiteral() != null) {
			literalExpression = new NullLiteralExpression();
		} else if (literalContext.StringLiteral() != null) {
			literalExpression = new StringLiteralExpression(text);
		} else {
			throw new RuntimeException("Unkown literal " + text);
		}

		return fillNode(literalExpression, literalContext);
	}
}
