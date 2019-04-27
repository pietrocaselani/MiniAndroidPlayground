package io.github.pietrocaselani.simplejava.parser.expr.primary;

import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class PrimaryParser {
	public static Expression parse(SimpleJavaParser.PrimaryContext primaryContext) {
		final Expression expression;

		if (primaryContext.primaryNoNewArray_lfno_primary() != null) {
			expression = PrimaryNoNewArrayLFNOPrimaryParser.parse(primaryContext.primaryNoNewArray_lfno_primary());
		} else {
			throw new RuntimeException("Fuck " + primaryContext.getText());
		}

		return expression;
	}
}
