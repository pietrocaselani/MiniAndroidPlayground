package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.ModifierHelper;
import io.github.pietrocaselani.simplejava.ast.body.Block;
import io.github.pietrocaselani.simplejava.ast.body.MethodDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.Parameter;
import io.github.pietrocaselani.simplejava.ast.type.PrimitiveType;
import io.github.pietrocaselani.simplejava.ast.type.Type;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.type.UnannTypeParser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.PACKAGE;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.PRIVATE;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.PROTECTED;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.PUBLIC;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.addModifier;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.hasModifier;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.parseModifier;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class MethodDeclarationParser extends NodeParser<SimpleJavaParser.MethodDeclarationContext, MethodDeclaration> {
	public MethodDeclarationParser(SimpleJavaParser.MethodDeclarationContext context) {
		super(context);
	}

	@Override public MethodDeclaration parse() {
		int modifiers;
		if (mContext.methodModifier() == null || mContext.methodModifier().size() == 0) {
			modifiers = PUBLIC;
		} else {
			modifiers = parseModifier(mContext.methodModifier(0).getText());

			for (int i = 1; i < mContext.methodModifier().size(); i++) {
				modifiers = addModifier(modifiers, parseModifier(mContext.methodModifier(i).getText()));
			}

			if (!hasModifier(modifiers, PUBLIC) && !hasModifier(modifiers, PACKAGE) &&
					!hasModifier(modifiers, PROTECTED) && !hasModifier(modifiers, PRIVATE)) {
				modifiers = addModifier(modifiers, PUBLIC);
			}
		}

		final Type returnType = parseReturn(mContext.methodHeader().result());

		final String methodName;
		final Block methodBody;
		final List<Parameter> parameters;

		if (mContext.methodHeader().typeParameters() != null) {
			throw new RuntimeException("Generics no support yet!");
		} else {
			final SimpleJavaParser.MethodDeclaratorContext methodDeclaratorContext = mContext.methodHeader().methodDeclarator();
			methodName = methodDeclaratorContext.Identifier().getText();
			methodBody = new BlockParser(mContext.methodBody().block()).parse();
			parameters = parseParameters(methodDeclaratorContext.formalParameterList());
		}

		final MethodDeclaration methodDeclaration = new MethodDeclaration(modifiers, methodName, returnType, methodBody);
		methodDeclaration.setParameters(parameters);

		return fillNode(methodDeclaration);
	}

	private List<Parameter> parseParameters(SimpleJavaParser.FormalParameterListContext formalParameterListContext) {
		final ArrayList<Parameter> parameters = new ArrayList<Parameter>();
		if (formalParameterListContext != null) {
			if (formalParameterListContext.formalParameters() != null && formalParameterListContext.formalParameters() != null) {
				parameters.addAll(parseFormalParameters(formalParameterListContext.formalParameters()));
			}

			if (formalParameterListContext.lastFormalParameter() != null) {
				if (formalParameterListContext.lastFormalParameter().formalParameter() != null) {
					parameters.add(new ParameterParser(formalParameterListContext.lastFormalParameter().formalParameter()).parse());
				} else {
					parameters.add(new LastParameterParser(formalParameterListContext.lastFormalParameter()).parse());
				}
			}
		}

		return parameters;
	}

	private Collection<? extends Parameter> parseFormalParameters(SimpleJavaParser.FormalParametersContext formalParametersContext) {
		final ArrayList<Parameter> parameters = new ArrayList<Parameter>();

		if (formalParametersContext.formalParameter() != null && formalParametersContext.formalParameter().size() > 0) {
			for (final SimpleJavaParser.FormalParameterContext formalParameterContext : formalParametersContext.formalParameter()) {
				parameters.add(new ParameterParser(formalParameterContext).parse());
			}
		}

		if (formalParametersContext.receiverParameter() != null) {
			throw new RuntimeException("Unknow paramenter " + formalParametersContext.receiverParameter().getText());
		}

		return parameters;
	}

	private Type parseReturn(SimpleJavaParser.ResultContext resultContext) {
		final Type type;

		if (resultContext == null || resultContext.unannType() == null || resultContext.getText() == null || resultContext.getText().length() == 0) {
			type = PrimitiveType.VOID_TYPE;
		} else {
			type = UnannTypeParser.parse(resultContext.unannType());
		}

		return type;
	}
}
