package io.github.pietrocaselani.simplejava.parser.stmt;

import io.github.pietrocaselani.simplejava.ast.Node;
import io.github.pietrocaselani.simplejava.parser.ClassDeclarationParser;
import io.github.pietrocaselani.simplejava.parser.NodeParser;
import io.github.pietrocaselani.simplejava.parser.antlr.SimpleJavaParser;
import io.github.pietrocaselani.simplejava.parser.body.LocalConstantDeclarationParser;
import io.github.pietrocaselani.simplejava.parser.body.LocalConstantShortDeclarationParser;
import io.github.pietrocaselani.simplejava.parser.body.LocalVariableDeclarationParser;
import io.github.pietrocaselani.simplejava.parser.body.LocalVariableShortDeclatorParser;

/**
 * Created by Pietro Caselani
 * On 1/27/15
 * NewJava
 */
public final class BlockStatementParser<E extends Node> extends NodeParser<SimpleJavaParser.BlockStatementContext, E> {

	public BlockStatementParser(SimpleJavaParser.BlockStatementContext context) {
		super(context);
	}

	@Override
	@SuppressWarnings("unchecked")
	public E parse() {
		final Node node;

		if (mContext.localVariableDeclarationStatement() != null) {
			node = new LocalVariableDeclarationStatementParser(mContext.localVariableDeclarationStatement()).parse();
		} else if (mContext.localVariableShortDeclarationStatement() != null) {
			node = new LocalVariableShortDeclarationStatementParser(mContext.localVariableShortDeclarationStatement()).parse();
		} else if (mContext.localConstantDeclarationStatement() != null) {
//			node = new LocalConstantDeclarationStatementParser(mContext.localConstantDeclarationStatement()).parse();
			throw new RuntimeException("Unkown Block statement: " + mContext.getText());
		} else if (mContext.localConstantShortDeclarationStatement() != null) {
//			node = new LocalConstantShortDeclarationStatementParser(mContext.localConstantShortDeclarationStatement()).parse();
			throw new RuntimeException("Unkown Block statement: " + mContext.getText());
		} else if (mContext.classDeclaration() != null) {
			node = new ClassDeclarationParser(mContext.classDeclaration()).parse();
		} else if (mContext.statement() != null) {
			node = StatementParser.parse(mContext.statement());
		} else {
			throw new RuntimeException("Unkown Block statement: " + mContext.getText());
		}

		return fillNode((E) node);
	}
}
