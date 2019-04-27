package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.Node;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

/**
 * Created by Pietro Caselani
 * On 1/20/15
 * NewJava
 */
public abstract class NodeParser<T extends ParserRuleContext, E extends Node> {
	protected final T mContext;
	protected final Token mStart, mStop;
	protected final int mBeginLine, mBeginColumn;
	protected final int mEndLine, mEndColumn;

	public NodeParser(T context) {
		mContext = context;

		if (context != null) {
			mStart = context.getStart();
			mStop = context.getStop();

			mBeginLine = mStart.getLine();
			mBeginColumn = mStart.getCharPositionInLine();

			mEndLine = mStop.getLine();
			mEndColumn = mStop.getStopIndex();
		} else {
			mStart = null;
			mStop = null;

			mBeginLine = -1;
			mBeginColumn = -1;

			mEndLine = -1;
			mEndColumn = -1;
		}
	}

	protected final E fillNode(E node) {
		node.setBeginColumn(mBeginColumn);
		node.setBeginLine(mBeginLine);
		node.setEndColumn(mEndColumn);
		node.setEndLine(mEndLine);
		return node;
	}

	public abstract E parse();
}
