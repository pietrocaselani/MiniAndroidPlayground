package io.github.pietrocaselani.simplejava.parser;

import io.github.pietrocaselani.simplejava.ast.PackageDeclaration;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;

/**
* Created by Pietro Caselani
* On 1/20/15
* NewJava
*/
public class PackageDeclarationParser extends NodeParser<SimpleJavaParser.PackageDeclarationContext, PackageDeclaration> {
	public PackageDeclarationParser(SimpleJavaParser.PackageDeclarationContext context) {
		super(context);
	}

	@Override public PackageDeclaration parse() {
		final PackageDeclaration packageDeclaration;
		if (mContext != null) {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < mContext.Identifier().size(); i++) {
				sb.append(mContext.Identifier(i).getText());
				if (i != mContext.Identifier().size() - 1) {
					sb.append(".");
				}
			}

			packageDeclaration = fillNode(new PackageDeclaration(sb.toString()));
		} else {
			packageDeclaration = null;
		}

		return packageDeclaration;
	}
}
