package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.TypeDeclaration;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
* Created by Pietro Caselani
* On 1/20/15
* NewJava
*/
public abstract class TypeDeclarationParser<E extends TypeDeclaration> extends NodeParser<SimpleJavaParser.TypeDeclarationContext, E> {
	public TypeDeclarationParser(SimpleJavaParser.TypeDeclarationContext context) {
		super(context);
	}

	public static TypeDeclaration parseTypeDeclaration(SimpleJavaParser.TypeDeclarationContext context) {
		TypeDeclaration typeDeclaration;

		if (context.classDeclaration() != null) {
			typeDeclaration = new ClassDeclarationParser(context.classDeclaration()).parse();
		} else if (context.interfaceDeclaration() != null) {
			//TODO make better!
			final SimpleJavaParser.InterfaceDeclarationContext interfaceDeclarationContext = context.interfaceDeclaration();
			if (interfaceDeclarationContext.normalInterfaceDeclaration() != null) {
				typeDeclaration = new InterfaceDeclarationParser(interfaceDeclarationContext.normalInterfaceDeclaration()).parse();
			} else if (interfaceDeclarationContext.annotationTypeDeclaration() != null) {
				//TODO parse annotation
				typeDeclaration = null;
			} else {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}

		return typeDeclaration;
	}
}
