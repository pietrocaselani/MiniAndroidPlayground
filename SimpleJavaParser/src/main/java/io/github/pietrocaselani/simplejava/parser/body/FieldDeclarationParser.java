package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.FieldDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;
import io.github.pietrocaselani.simplejava.ast.type.Type;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.type.UnannTypeParser;

import java.util.ArrayList;

import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.PRIVATE;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.addModifier;
import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.parseModifier;

/**
 * Created by Pietro Caselani
 * On 1/21/15
 * NewJava
 */
public final class FieldDeclarationParser extends NodeParser<SimpleJavaParser.FieldDeclarationContext, FieldDeclaration> {

	public FieldDeclarationParser(SimpleJavaParser.FieldDeclarationContext context) {
		super(context);
	}

	@Override public FieldDeclaration parse() {
		int modifiers;
		if (mContext.fieldModifier() == null || mContext.fieldModifier().size() == 0) {
			modifiers = PRIVATE;
		} else {
			modifiers = parseModifier(mContext.fieldModifier().get(0).getText());

			for (int i = 1; i < mContext.fieldModifier().size(); i++) {
				modifiers = addModifier(modifiers, parseModifier(mContext.fieldModifier(i).getText()));
			}
		}

		final Type type = UnannTypeParser.parse(mContext.unannType());

		final ArrayList<VariableDeclarator> variables = new ArrayList<VariableDeclarator>(mContext.variableDeclaratorList().variableDeclarator().size());

		for (final SimpleJavaParser.VariableDeclaratorContext variableDeclaratorContext : mContext.variableDeclaratorList().variableDeclarator()) {
			variables.add(new VariableDeclaratorParser(variableDeclaratorContext).parse());
		}

		return fillNode(new FieldDeclaration(modifiers, type, variables));
	}
}
