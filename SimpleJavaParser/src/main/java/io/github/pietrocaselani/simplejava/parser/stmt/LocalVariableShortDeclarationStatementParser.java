package io.github.pietrocaselani.simplejava.parser.stmt;

import io.github.pietrocaselani.simplejava.ast.body.LocalVariableDeclaration;
import io.github.pietrocaselani.simplejava.ast.stmt.LocalVariableDeclarationStatement;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.body.LocalVariableShortDeclatorParser;

/**
 * Created by Pietro Caselani
 * On 3/3/15
 * MiniPlayground
 */
public class LocalVariableShortDeclarationStatementParser extends NodeParser<SimpleJavaParser.LocalVariableShortDeclarationStatementContext, LocalVariableDeclarationStatement> {
	public LocalVariableShortDeclarationStatementParser(SimpleJavaParser.LocalVariableShortDeclarationStatementContext context) {
		super(context);
	}

	@Override public LocalVariableDeclarationStatement parse() {
		final LocalVariableDeclaration parse = new LocalVariableShortDeclatorParser(mContext.localVariableShortDeclaration()).parse();
		final LocalVariableDeclarationStatement statement = new LocalVariableDeclarationStatement(parse);

		return fillNode(statement);
	}
}
