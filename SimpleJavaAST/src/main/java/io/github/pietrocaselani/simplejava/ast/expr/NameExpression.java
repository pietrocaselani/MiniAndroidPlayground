package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 1/30/15
 * MiniPlayground
 */
public final class NameExpression extends Expression {
	private final String mIdentifier;

	public NameExpression(String identifier) {
		mIdentifier = identifier;
	}

	public NameExpression(int beginLine, int endLine, int beginColumn, int endColumn, String identifier) {
		super(beginLine, endLine, beginColumn, endColumn);
		mIdentifier = identifier;
	}

	public String getIdentifier() {
		return mIdentifier;
	}
}
