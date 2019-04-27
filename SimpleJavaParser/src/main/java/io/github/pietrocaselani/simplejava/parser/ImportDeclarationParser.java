package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.ImportDeclaration;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
* Created by Pietro Caselani
* On 1/20/15
* NewJava
*/
public final class ImportDeclarationParser extends NodeParser<SimpleJavaParser.ImportDeclarationContext, ImportDeclaration> {
	public ImportDeclarationParser(SimpleJavaParser.ImportDeclarationContext context) {
		super(context);
	}

	@Override public ImportDeclaration parse() {
		final ImportDeclaration importDeclaration;

		if (mContext.singleStaticImportDeclaration() != null) {
			importDeclaration = singleStaticParse(mContext.singleStaticImportDeclaration());
		} else if (mContext.singleTypeImportDeclaration() != null) {
			importDeclaration = singleTypeParse(mContext.singleTypeImportDeclaration());
		} else if (mContext.staticImportOnDemandDeclaration() != null) {
			importDeclaration = onDemandStaticParse(mContext.staticImportOnDemandDeclaration());
		} else if (mContext.typeImportOnDemandDeclaration() != null) {
			importDeclaration = onDemandTypeParse(mContext.typeImportOnDemandDeclaration());
		} else {
			throw new RuntimeException("Unable to handle import: " + mContext.getText());
		}

		return fillNode(importDeclaration);
	}

	private ImportDeclaration onDemandTypeParse(SimpleJavaParser.TypeImportOnDemandDeclarationContext context) {
		return new ImportDeclaration(false, true, context.packageOrTypeName().getText());
	}

	private ImportDeclaration onDemandStaticParse(SimpleJavaParser.StaticImportOnDemandDeclarationContext context) {
		return new ImportDeclaration(true, true, context.typeName().getText());
	}

	private ImportDeclaration singleTypeParse(SimpleJavaParser.SingleTypeImportDeclarationContext context) {
		return new ImportDeclaration(false, false, context.typeName().getText());
	}

	private ImportDeclaration singleStaticParse(SimpleJavaParser.SingleStaticImportDeclarationContext context) {
		return new ImportDeclaration(true, false, context.typeName().getText());
	}
}
