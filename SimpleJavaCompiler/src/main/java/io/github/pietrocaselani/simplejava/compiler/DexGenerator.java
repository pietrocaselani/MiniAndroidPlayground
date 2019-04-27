package io.github.pietrocaselani.simplejava.compiler;

import io.github.pietrocaselani.simplejava.ast.ClassDeclaration;
import io.github.pietrocaselani.simplejava.ast.CompilationUnit;
import io.github.pietrocaselani.simplejava.ast.PackageDeclaration;
import io.github.pietrocaselani.simplejava.ast.TypeDeclaration;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Pietro Caselani
 * On 1/29/15
 * MiniPlayground
 */
public final class DexGenerator {
	private final File mOutFile;
	private final ArrayList<CompilationUnit> mCompilationUnits;

	public DexGenerator(File outFile) {
		mOutFile = outFile;
		mCompilationUnits = new ArrayList<CompilationUnit>();
	}

	public void addCompilationUnit(CompilationUnit compilationUnit) {
		mCompilationUnits.add(compilationUnit);
		TypesTable.getInstance().add(compilationUnit);
	}

	void generate() {
		for (final CompilationUnit compilationUnit : mCompilationUnits) {
			TypeIdHelper.init(compilationUnit);

			final PackageDeclaration packageDeclaration = compilationUnit.getPackage();

			final String packageName = packageDeclaration == null ? null : packageDeclaration.getPackageName();

			for (final TypeDeclaration typeDeclaration : compilationUnit.getTypes()) {
				if (typeDeclaration instanceof ClassDeclaration) {
					new ClassParser(mOutFile, packageName, (ClassDeclaration) typeDeclaration).parse();
				}
			}
		}
	}
}
