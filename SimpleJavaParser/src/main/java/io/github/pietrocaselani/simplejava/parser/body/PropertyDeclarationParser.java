package io.github.pietrocaselani.simplejava.parser.body;

import io.github.pietrocaselani.simplejava.ast.body.PropertyDeclaration;
import io.github.pietrocaselani.simplejava.ast.type.Type;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.type.UnannTypeParser;

import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.parseModifier;

/**
* Created by Pietro Caselani
* On 1/21/15
* NewJava
*/
public final class PropertyDeclarationParser extends NodeParser<SimpleJavaParser.PropertyDeclarationContext, PropertyDeclaration> {
	public PropertyDeclarationParser(SimpleJavaParser.PropertyDeclarationContext context) {
		super(context);
	}

	@Override public PropertyDeclaration parse() {
		if (mContext.propertyAccessor() == null || mContext.propertyAccessor().size() != 2) {
			throw new RuntimeException("Property must have 2 accessors. Line: " + mBeginLine + " Column: " + mBeginColumn);
		}

		final int getterModifiers, setterModifiers;

		final SimpleJavaParser.PropertyAccessorContext propertyAccessorContext1 = mContext.propertyAccessor(0);
		final SimpleJavaParser.PropertyAccessorContext propertyAccessorContext2 = mContext.propertyAccessor(1);

		if (propertyAccessorContext1.propertyAccessorName().getText().equals("get")) {
			getterModifiers = handleGetter(propertyAccessorContext1);
			if (propertyAccessorContext2.propertyAccessorName().getText().equals("set")) {
				setterModifiers = handleSetter(propertyAccessorContext2);
			} else {
				throw new RuntimeException("Property needs a setter. Line: " + mBeginLine + " Column: " + mBeginColumn);
			}
		} else if (propertyAccessorContext1.propertyAccessorName().getText().equals("set")) {
			setterModifiers = handleSetter(propertyAccessorContext2);
			if (propertyAccessorContext2.propertyAccessorName().getText().equals("get")) {
				getterModifiers = handleGetter(propertyAccessorContext1);
			} else {
				throw new RuntimeException("Property needs a getter. Line: " + mBeginLine + " Column: " + mBeginColumn);
			}
		} else {
			throw new RuntimeException("Property needs a getter and setter. Line: " + mBeginLine + " Column: " + mBeginColumn);
		}

		final String propertyName = mContext.Identifier().getText();

		final Type propertyType = UnannTypeParser.parse(mContext.unannType());

		return fillNode(new PropertyDeclaration(getterModifiers, setterModifiers, propertyName, propertyType));
	}

	private int handleSetter(SimpleJavaParser.PropertyAccessorContext propertyAccessorContextSetter) {
		if (propertyAccessorContextSetter.propertyModifier().size() > 1) throw new RuntimeException("Only one modifier!");

		final String modifierText;

		if (propertyAccessorContextSetter.propertyModifier().size() == 0) {
			modifierText = "public";
		} else {
			final SimpleJavaParser.PropertyModifierContext propertyModifierContext = propertyAccessorContextSetter.propertyModifier(0);
			modifierText = propertyModifierContext.getText();
		}

		return parseModifier(modifierText);
	}

	private int handleGetter(SimpleJavaParser.PropertyAccessorContext propertyAccessorContextGetter) {
		if (propertyAccessorContextGetter.propertyModifier().size() > 1) throw new RuntimeException("Only one modifier!");

		final String modifierText;

		if (propertyAccessorContextGetter.propertyModifier().size() == 0) {
			modifierText = "public";
		} else {
			final SimpleJavaParser.PropertyModifierContext propertyModifierContext = propertyAccessorContextGetter.propertyModifier(0);
			modifierText = propertyModifierContext.getText();
		}

		return parseModifier(modifierText);
	}
}
