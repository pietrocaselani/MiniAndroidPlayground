package io.github.pietrocaselani.simplejava.ast.type;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class PrimitiveType extends Type {
	public static final PrimitiveType BYTE_TYPE = new PrimitiveType(Primitive.BYTE);
	public static final PrimitiveType SHORT_TYPE = new PrimitiveType(Primitive.SHORT);
	public static final PrimitiveType INT_TYPE = new PrimitiveType(Primitive.INT);
	public static final PrimitiveType LONG_TYPE = new PrimitiveType(Primitive.LONG);
	public static final PrimitiveType FLOAT_TYPE = new PrimitiveType(Primitive.FLOAT);
	public static final PrimitiveType DOUBLE_TYPE = new PrimitiveType(Primitive.DOUBLE);
	public static final PrimitiveType BOOLEAN_TYPE = new PrimitiveType(Primitive.BOOLEAN);
	public static final PrimitiveType CHAR_TYPE = new PrimitiveType(Primitive.CHAR);
	public static final VoidType VOID_TYPE = new VoidType();
	private Primitive mPrimitive;

	public PrimitiveType() {}

	public PrimitiveType(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public PrimitiveType(Primitive primitive) {
		mPrimitive = primitive;
	}

	public PrimitiveType(int beginLine, int endLine, int beginColumn, int endColumn, Primitive primitive) {
		super(beginLine, endLine, beginColumn, endColumn);
		mPrimitive = primitive;
	}

	public Primitive getPrimitive() {
		return mPrimitive;
	}

	public void setPrimitive(Primitive primitive) {
		mPrimitive = primitive;
	}

	@Override public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;

		final PrimitiveType that = (PrimitiveType) object;

		return mPrimitive == that.mPrimitive;
	}

	@Override public int hashCode() {
		return mPrimitive != null ? mPrimitive.hashCode() * 11 : 0;
	}

	public enum Primitive {
		BOOLEAN, CHAR, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE;

		public static Primitive primitiveFrom(String text) {
			if ("boolean".equals(text)) {
				return BOOLEAN;
			} else if ("char".equals(text)) {
				return CHAR;
			} else if ("byte".equals(text)) {
				return BYTE;
			} else if ("short".equals(text)) {
				return SHORT;
			} else if ("int".equals(text)) {
				return INT;
			} else if ("long".equals(text)) {
				return LONG;
			} else if ("float".equals(text)) {
				return FLOAT;
			} else if ("double".equals(text)) {
				return DOUBLE;
			} else {
				throw new RuntimeException("Not found");
			}
		}
	}
}
