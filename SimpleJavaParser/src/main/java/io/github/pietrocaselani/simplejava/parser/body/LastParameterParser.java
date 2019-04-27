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
public final class LastParameterParser extends NodeParser<SimpleJavaParser.LastFormalParameterContext, Parameter> {
	public LastParameterParser(SimpleJavaParser.LastFormalParameterContext context) {
		super(context);
	}

	@Override public Parameter parse() {
		final Parameter parameter = new Parameter(0, new VariableDeclaratorIdParser(mContext.variableDeclaratorId()).parse());

		parameter.setType(UnannTypeParser.parse(mContext.unannType()));
		parameter.setVarArg(true);

		return fillNode(parameter);
	}
}
