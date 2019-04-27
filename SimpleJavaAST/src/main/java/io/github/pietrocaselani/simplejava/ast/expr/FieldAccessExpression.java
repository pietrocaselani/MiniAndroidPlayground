package io.github.pietrocaselani.simplejava.ast.expr;

/**
 * Created by Pietro Caselani
 * On 2/2/15
 * MiniPlayground
 */
public final class FieldAccessExpression extends Expression {
	private String mFieldName;

	public FieldAccessExpression() {}

	public FieldAccessExpression(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public FieldAccessExpression(String fieldName) {
		setFieldName(fieldName);
	}

	public FieldAccessExpression(int beginLine, int endLine, int beginColumn, int endColumn, String fieldName) {
		super(beginLine, endLine, beginColumn, endColumn);
		setFieldName(fieldName);
	}

	public String getFieldName() {
		return mFieldName;
	}

	public void setFieldName(String fieldName) {
		mFieldName = fieldName;
	}
}
