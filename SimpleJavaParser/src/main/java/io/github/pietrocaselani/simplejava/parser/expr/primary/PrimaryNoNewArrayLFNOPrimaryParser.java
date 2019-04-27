package io.github.pietrocaselani.simplejava.parser.expr.primary;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.expr.LiteralParser;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class PrimaryNoNewArrayLFNOPrimaryParser {
	public static Expression parse(SimpleJavaParser.PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primaryContext) {
		final Expression expression;

		if (primaryNoNewArray_lfno_primaryContext.literal() != null) {
			expression = LiteralParser.parse(primaryNoNewArray_lfno_primaryContext.literal());
		} else {
			throw new RuntimeException("Fuck " + primaryNoNewArray_lfno_primaryContext.getText());
		}

		return expression;
	}
}
