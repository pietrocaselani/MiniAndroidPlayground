package io.github.pietrocaselani.simplejava.parser.stmt;

import io.github.pietrocaselani.simplejava.ast.body.LocalVariableDeclaration;
import io.github.pietrocaselani.simplejava.ast.stmt.LocalVariableDeclarationStatement;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.body.LocalVariableDeclarationParser;

/**
 * Created by Pietro Caselani
 * On 3/3/15
 * MiniPlayground
 */
public final class LocalVariableDeclarationStatementParser extends NodeParser<SimpleJavaParser.LocalVariableDeclarationStatementContext, LocalVariableDeclarationStatement> {

	public LocalVariableDeclarationStatementParser(SimpleJavaParser.LocalVariableDeclarationStatementContext context) {
		super(context);
	}

	@Override public LocalVariableDeclarationStatement parse() {
		final LocalVariableDeclarationStatement localVariableDeclarationStatement = new LocalVariableDeclarationStatement();

		final LocalVariableDeclaration parse = new LocalVariableDeclarationParser(mContext.localVariableDeclaration()).parse();
		localVariableDeclarationStatement.setLocalVariableDeclaration(parse);

		return fillNode(localVariableDeclarationStatement);
	}
}
