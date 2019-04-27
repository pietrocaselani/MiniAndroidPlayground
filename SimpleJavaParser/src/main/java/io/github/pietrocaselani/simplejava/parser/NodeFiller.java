package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.Node;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

/**
 * Created by Pietro Caselani
 * On 1/28/15
 * NewJava
 */
public final class NodeFiller {

	public static <N extends Node, C extends ParserRuleContext> N fillNode(N node, C context) {
		if (context != null) {
			final Token start = context.getStart();
			final Token stop = context.getStop();

			int beginLine = start.getLine();
			int beginColumn = start.getCharPositionInLine();

			int endLine = stop.getLine();
			int endColumn = stop.getStopIndex();

			node.setBeginColumn(beginColumn);
			node.setBeginLine(beginLine);
			node.setEndColumn(endColumn);
			node.setEndLine(endLine);
		}

		return node;
	}
}
