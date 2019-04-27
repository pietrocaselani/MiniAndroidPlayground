package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.LocalVariableDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.type.UnannTypeParser;

import java.util.ArrayList;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class LocalVariableDeclarationParser extends NodeParser<SimpleJavaParser.LocalVariableDeclarationContext, LocalVariableDeclaration> {
	public LocalVariableDeclarationParser(SimpleJavaParser.LocalVariableDeclarationContext context) {
		super(context);
	}

	@Override public LocalVariableDeclaration parse() {
		final ArrayList<VariableDeclarator> variables = new ArrayList<VariableDeclarator>();

		for (final SimpleJavaParser.VariableDeclaratorContext variableDeclaratorContext : mContext.variableDeclaratorList().variableDeclarator()) {
			variables.add(new VariableDeclaratorParser(variableDeclaratorContext).parse());
		}

		return fillNode(new LocalVariableDeclaration(UnannTypeParser.parse(mContext.unannType()), variables));
	}
}
