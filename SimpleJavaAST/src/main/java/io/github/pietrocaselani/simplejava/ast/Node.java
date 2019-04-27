package io.github.pietrocaselani.simplejava.ast;

import java.util.List;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public abstract class Node {
	private int mBeginLine, mEndLine;
	private int mBeginColumn, mEndColumn;
	private Node mParent;
	private List<Node> mChildren;

	public Node() {}

	public Node(int beginLine, int endLine, int beginColumn, int endColumn) {
		mBeginLine = beginLine;
		mEndLine = endLine;
		mBeginColumn = beginColumn;
		mEndColumn = endColumn;
	}

	public final int getBeginLine() {
		return mBeginLine;
	}

	public final void setBeginLine(int beginLine) {
		mBeginLine = beginLine;
	}

	public final int getEndLine() {
		return mEndLine;
	}

	public final void setEndLine(int endLine) {
		mEndLine = endLine;
	}

	public final int getBeginColumn() {
		return mBeginColumn;
	}

	public final void setBeginColumn(int beginColumn) {
		mBeginColumn = beginColumn;
	}

	public final int getEndColumn() {
		return mEndColumn;
	}

	public final void setEndColumn(int endColumn) {
		mEndColumn = endColumn;
	}

	public final Node getParent() {
		return mParent;
	}

	public final void setParent(Node parent) {
		mParent = parent;
	}

	public final List<Node> getChildren() {
		return mChildren;
	}

	public final void setChildren(List<Node> children) {
		mChildren = children;
	}

	protected final void setAsParent(Iterable<? extends Node> children) {
		if (children != null) {
			for (final Node child : children) {
				if (child != null) child.setAsParent(this);
			}
		}
	}

	protected final void setAsParent(Node child) {
		if (child != null) child.setParent(this);
	}
}
