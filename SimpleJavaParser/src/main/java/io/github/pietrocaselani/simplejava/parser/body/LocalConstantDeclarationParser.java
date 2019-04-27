package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.LocalConstantDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.LocalVariableDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;
import io.github.pietrocaselani.simplejava.ast.expr.Expression;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.expr.VariableInitializerParser;
import io.github.pietrocaselani.simplejava.parser.type.UnannTypeParser;

import java.util.ArrayList;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class LocalConstantDeclarationParser extends NodeParser<SimpleJavaParser.LocalConstantDeclarationContext, LocalConstantDeclaration> {
	public LocalConstantDeclarationParser(SimpleJavaParser.LocalConstantDeclarationContext context) {
		super(context);
	}

	@Override public LocalConstantDeclaration parse() {
		final LocalConstantDeclaration localConstantDeclaration = new LocalConstantDeclaration();
		localConstantDeclaration.setType(UnannTypeParser.parse(mContext.unannType()));

		final ArrayList<VariableDeclarator> variables = new ArrayList<VariableDeclarator>();

		if (mContext.variableDeclaratorList() != null) {
			for (final SimpleJavaParser.VariableDeclaratorContext variableDeclaratorContext : mContext.variableDeclaratorList().variableDeclarator()) {
				variables.add(new VariableDeclaratorParser(variableDeclaratorContext).parse());
			}
		}

		localConstantDeclaration.setVariables(variables);

		return fillNode(localConstantDeclaration);
	}
}
