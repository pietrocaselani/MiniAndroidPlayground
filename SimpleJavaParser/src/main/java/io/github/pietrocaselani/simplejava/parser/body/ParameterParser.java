package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.Parameter;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclaratorId;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.type.UnannTypeParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class ParameterParser extends NodeParser<SimpleJavaParser.FormalParameterContext, Parameter> {
	public ParameterParser(SimpleJavaParser.FormalParameterContext context) {
		super(context);
	}

	@Override public Parameter parse() {
		final int modifiers = 0;

		final VariableDeclaratorId variableDeclaratorId = new VariableDeclaratorIdParser(mContext.variableDeclaratorId()).parse();

		final Parameter parameter = new Parameter(modifiers, variableDeclaratorId);

		parameter.setType(UnannTypeParser.parse(mContext.unannType()));
		parameter.setVarArg(false);

		return fillNode(parameter);
	}
}
