package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.ClassDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.BodyDeclaration;
import io.github.pietrocaselani.simplejava.ast.type.ClassOrInterfaceType;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.body.FieldDeclarationParser;
import io.github.pietrocaselani.simplejava.parser.body.MethodDeclarationParser;
import io.github.pietrocaselani.simplejava.parser.body.PropertyDeclarationParser;
import io.github.pietrocaselani.simplejava.parser.type.ClassOrInterfaceTypeParser;

import java.util.ArrayList;
import java.util.List;

import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.PUBLIC;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.addModifier;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.parseModifier;

/**
 * Created by Pietro Caselani
 * On 1/26/15
 * NewJava
 */
public final class NormalClassDeclarationParser extends NodeParser<SimpleJavaParser.NormalClassDeclarationContext, ClassDeclaration> {

	public NormalClassDeclarationParser(SimpleJavaParser.NormalClassDeclarationContext context) {
		super(context);
	}

	@Override public ClassDeclaration parse() {
		final String className = mContext.Identifier().getText();

		final ClassOrInterfaceType superClass = mContext.superclass() != null ? parseSuperClass(mContext.superclass()) : null;
		final List<ClassOrInterfaceType> implementionTypes = mContext.superinterfaces() != null ? parseImplementations(mContext.superinterfaces()) : null;

		List<BodyDeclaration> members = parseBody(mContext.classBody());

		int modifiers;

		if (mContext.classModifier() == null || mContext.classModifier().size() == 0) {
			modifiers = PUBLIC;
		} else {
			modifiers = parseModifier(mContext.classModifier().get(0).getText());

			for (int i = 1; i < mContext.classModifier().size(); i++) {
				modifiers = addModifier(modifiers, parseModifier(mContext.classModifier(i).getText()));
			}
		}

		final ClassDeclaration classDeclaration = new ClassDeclaration(className, members, modifiers);

		classDeclaration.setSuperType(superClass);
		classDeclaration.setImplements(implementionTypes);

		return fillNode(classDeclaration);
	}

	private List<ClassOrInterfaceType> parseImplementations(SimpleJavaParser.SuperinterfacesContext superinterfaces) {
		final ArrayList<ClassOrInterfaceType> interfaces = new ArrayList<ClassOrInterfaceType>(superinterfaces.interfaceTypeList().interfaceType().size());

		for (final SimpleJavaParser.InterfaceTypeContext interfaceTypeContext : superinterfaces.interfaceTypeList().interfaceType()) {
			if (interfaceTypeContext.classType().Identifier() != null) {
				interfaces.add(new ClassOrInterfaceType(null /* scope */,interfaceTypeContext.classType().Identifier().getText()));
			} else if (interfaceTypeContext.classType().classOrInterfaceType() != null) {
				interfaces.add(new ClassOrInterfaceTypeParser(interfaceTypeContext.classType().classOrInterfaceType()).parse());
			}
		}

		return interfaces;
	}

	private ClassOrInterfaceType parseSuperClass(SimpleJavaParser.SuperclassContext superclassContext) {
		//TODO parse superClass
		return null;
	}

	private List<BodyDeclaration> parseBody(SimpleJavaParser.ClassBodyContext classBodyContext) {
		final ArrayList<BodyDeclaration> members = new ArrayList<BodyDeclaration>(classBodyContext.classBodyDeclaration().size());

		for (final SimpleJavaParser.ClassBodyDeclarationContext classBodyDeclarationContext : classBodyContext.classBodyDeclaration()) {
			if (classBodyDeclarationContext.classMemberDeclaration() != null) {
				members.add(parseClassMember(classBodyDeclarationContext.classMemberDeclaration()));
			} else if (classBodyDeclarationContext.constructorDeclaration() != null) {
				members.add(parseConstructorMember(classBodyDeclarationContext.constructorDeclaration()));
			} else if (classBodyDeclarationContext.staticInitializer() != null) {
				members.add(parseStaticInitializerMember(classBodyDeclarationContext.staticInitializer()));
			} else if (classBodyDeclarationContext.instanceInitializer() != null) {
				members.add(parseInstanceInitializerMember(classBodyDeclarationContext.instanceInitializer()));
			}
		}

		return members;
	}

	private BodyDeclaration parseInstanceInitializerMember(SimpleJavaParser.InstanceInitializerContext instanceInitializerContext) {
		//TODO parse instance block initializer
		return null;
	}

	private BodyDeclaration parseStaticInitializerMember(SimpleJavaParser.StaticInitializerContext staticInitializerContext) {
		//TODO parse static block initializer
		return null;
	}

	private BodyDeclaration parseConstructorMember(SimpleJavaParser.ConstructorDeclarationContext constructorDeclarationContext) {
		//TODO parse constructor
		return null;
	}

	private BodyDeclaration parseClassMember(SimpleJavaParser.ClassMemberDeclarationContext classMemberDeclarationContext) {
		final BodyDeclaration bodyDeclaration;

		if (classMemberDeclarationContext.fieldDeclaration() != null) {
			bodyDeclaration = new FieldDeclarationParser(classMemberDeclarationContext.fieldDeclaration()).parse();
		} else if (classMemberDeclarationContext.propertyDeclaration() != null) {
			bodyDeclaration = new PropertyDeclarationParser(classMemberDeclarationContext.propertyDeclaration()).parse();
		} else if (classMemberDeclarationContext.methodDeclaration() != null) {
			bodyDeclaration = new MethodDeclarationParser(classMemberDeclarationContext.methodDeclaration()).parse();
		} else if (classMemberDeclarationContext.classDeclaration() != null) {
			//TODO parse inner class
			bodyDeclaration = null;
		} else if (classMemberDeclarationContext.interfaceDeclaration() != null) {
			//TODO parse inner interface
			bodyDeclaration = null;
		} else {
			throw new RuntimeException("Unknow class member " + classMemberDeclarationContext.getText());
		}

		return bodyDeclaration;
	}
}
