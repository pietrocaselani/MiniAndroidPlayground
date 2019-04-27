package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.Block;
import io.github.pietrocaselani.simplejava.ast.stmt.Statement;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.stmt.BlockStatementParser;

import java.util.ArrayList;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class BlockParser extends NodeParser<SimpleJavaParser.BlockContext, Block> {
	public BlockParser(SimpleJavaParser.BlockContext context) {
		super(context);
	}

	@Override public Block parse() {
		final ArrayList<Statement> nodes = new ArrayList<Statement>();

		if (mContext.blockStatements() != null && mContext.blockStatements().blockStatement() != null) {
			for (final SimpleJavaParser.BlockStatementContext blockStatementContext : mContext.blockStatements().blockStatement()) {
				nodes.add(new BlockStatementParser<Statement>(blockStatementContext).parse());
			}
		}

		return new Block(false, nodes);
	}
}
