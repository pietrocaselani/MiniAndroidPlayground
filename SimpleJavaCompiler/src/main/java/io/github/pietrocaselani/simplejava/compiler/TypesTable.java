package io.github.pietrocaselani.simplejava.compiler;

import io.github.pietrocaselani.simplejava.ast.CompilationUnit;
import io.github.pietrocaselani.simplejava.ast.TypeDeclaration;

import java.util.ArrayList;

/**
 * Created by Pietro Caselani
 * On 1/30/15
 * MiniPlayground
 */
final class TypesTable {
	private final ArrayList<String> mTypes;
	private static TypesTable sInstance;

	public static TypesTable getInstance() {
		return sInstance == null ? sInstance = new TypesTable() : sInstance;
	}

	private TypesTable() {
		mTypes = new ArrayList<String>();
	}

	void add(CompilationUnit compilationUnit) {
		final String packageName = compilationUnit.getPackage() != null ? compilationUnit.getPackage().getPackageName() : "";

		for (final TypeDeclaration typeDeclaration : compilationUnit.getTypes()) {
			mTypes.add(packageName + "." + typeDeclaration.getName());
		}
	}

	boolean contains(String packageName, String typeName) {
		if (typeName == null) throw new RuntimeException("typeName can't be null.");

		return packageName == null ? contains(typeName) : contains(packageName + "." + typeName);
	}

	boolean contains(String typeName) {
		return mTypes.contains(typeName);
	}
}
