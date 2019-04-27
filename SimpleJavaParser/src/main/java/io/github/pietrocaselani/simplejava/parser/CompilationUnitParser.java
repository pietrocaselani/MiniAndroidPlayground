package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.CompilationUnit;
import io.github.pietrocaselani.simplejava.ast.ImportDeclaration;
import io.github.pietrocaselani.simplejava.ast.PackageDeclaration;
import io.github.pietrocaselani.simplejava.ast.TypeDeclaration;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

import java.util.ArrayList;
import java.util.List;

/**
* Created by Pietro Caselani
* On 1/20/15
* NewJava
*/
public class CompilationUnitParser extends NodeParser<SimpleJavaParser.CompilationUnitContext, CompilationUnit> {

	public CompilationUnitParser(SimpleJavaParser.CompilationUnitContext context) {
		super(context);
	}

	@Override public CompilationUnit parse() {
		final PackageDeclaration packageDeclaration = new PackageDeclarationParser(mContext.packageDeclaration()).parse();

		final List<SimpleJavaParser.ImportDeclarationContext> importDeclarationContexts = mContext.importDeclaration();

		final ArrayList<ImportDeclaration> imports = new ArrayList<ImportDeclaration>(importDeclarationContexts.size());

		for (final SimpleJavaParser.ImportDeclarationContext importDeclarationContext : importDeclarationContexts) {
			imports.add(new ImportDeclarationParser(importDeclarationContext).parse());
		}

		final List<SimpleJavaParser.TypeDeclarationContext> typeDeclarationContexts = mContext.typeDeclaration();
		final ArrayList<TypeDeclaration> typeDeclarations = new ArrayList<TypeDeclaration>(typeDeclarationContexts.size());

		for (final SimpleJavaParser.TypeDeclarationContext typeDeclarationContext : typeDeclarationContexts) {
			typeDeclarations.add(TypeDeclarationParser.parseTypeDeclaration(typeDeclarationContext));
		}

		return fillNode(new CompilationUnit(packageDeclaration, imports, typeDeclarations));
	}
}
