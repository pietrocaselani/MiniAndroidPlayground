package io.github.pietrocaselani.simplejava.compiler;

import com.android.dx.*;
import io.github.pietrocaselani.simplejava.ast.body.Block;
import io.github.pietrocaselani.simplejava.ast.body.MethodDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.Parameter;
import io.github.pietrocaselani.simplejava.ast.expr.*;
import io.github.pietrocaselani.simplejava.ast.stmt.ExpressionStatement;
import io.github.pietrocaselani.simplejava.ast.stmt.LocalVariableDeclarationStatement;
import io.github.pietrocaselani.simplejava.ast.stmt.ReturnStatement;
import io.github.pietrocaselani.simplejava.ast.stmt.Statement;

import java.util.HashMap;

import static io.github.pietrocaselani.simplejava.compiler.SimpleJavaCompiler.sDexMaker;


/**
 * Created by Pietro Caselani
 * On 1/30/15
 * MiniPlayground
 */
final class MethodParser {
	final MethodDeclaration mMethodDeclaration;
	final MethodId mMethodId;
	final TypeId mClassType, mReturnType;
	final TypeId[] mParamenters;
	final Code mCode;
	final HashMap<Object, Local> mLocalNameMap;
	final ClassParser mClassParser;
	private boolean mHandleReturn;

	MethodParser(ClassParser classParser, MethodDeclaration methodDeclaration) {
		mClassParser = classParser;
		mClassType = classParser.mClassType;
		mMethodDeclaration = methodDeclaration;

		mLocalNameMap = new HashMap<>();

		mReturnType = TypeIdHelper.parseTypeId(methodDeclaration.getReturn());
		mParamenters = TypeIdHelper.parseParameters(methodDeclaration.getParameters());

		mMethodId = mClassType.getMethod(mReturnType, methodDeclaration.getName(), mParamenters);

		mCode = sDexMaker.declare(mMethodId, methodDeclaration.getModifiers());

		createLocals(methodDeclaration.getBody());

		parseBody(methodDeclaration.getBody());

		if (!mHandleReturn) {
			if (mReturnType.equals(TypeId.VOID)) {
				mCode.returnVoid();
			} else {
				throw new RuntimeException("Missing return on method " + classParser.mClassDeclaration.getName() + "." + methodDeclaration.getName());
			}
		}
	}

	MethodId getMethodId() {
		return mMethodId;
	}

	private void parseBody(Block body) {
		if (body.getStatements().size() == 0) {
			mHandleReturn = true;
			mCode.returnVoid();
		} else {
			for (final Statement node : body.getStatements()) {
				parseStatement(node);
			}
		}
	}

	private void parseStatement(Statement node) {
		if (node instanceof ReturnStatement) {
			mHandleReturn = true;
			if (mReturnType.equals(TypeId.VOID)) {
				mCode.returnVoid();
			} else {
				final Expression expression = ((ReturnStatement) node).getExpression();
				mCode.returnValue(parseExpression(expression));
			}
		} else if (node instanceof ExpressionStatement) {
			final Expression expression = ((ExpressionStatement) node).getExpression();
			parseExpression(expression);
		}
	}

	private void createLocals(Block body) {
		for (final Statement statement : body.getStatements()) {
			if (statement instanceof ReturnStatement) {
				addLocal(((ReturnStatement) statement).getExpression());
			} else if (statement instanceof ExpressionStatement) {
				addLocal(((ExpressionStatement) statement).getExpression());
			} else if (statement instanceof LocalVariableDeclarationStatement) {

			}
		}
	}

	private void addLocal(Expression expression) {
		if (expression instanceof FieldAccessExpression) {
			final FieldAccessExpression fieldAccessExpression = (FieldAccessExpression) expression;

			final String fieldName = fieldAccessExpression.getFieldName();
			final FieldId field = mClassParser.findField(fieldName);

			final Local fieldLocal = mCode.newLocal(field.getType());
			mLocalNameMap.put(fieldName, fieldLocal);
		} else if (expression instanceof NameExpression) {
			final String identifier = ((NameExpression) expression).getIdentifier();
			mLocalNameMap.put(identifier, parseIdentifier(identifier));
		} else if (expression instanceof LiteralExpression) {
			throw new RuntimeException("need type id for literal?");
//			final LiteralExpression literalExpression = (LiteralExpression) expression;
//			local = mCode.newLocal(typeId);
//			mLocalNameMap.put((literalExpression).getValue(), local);
		} else if (expression instanceof AssignmentExpression) {
			final Expression targetExpression = (Expression) ((AssignmentExpression) expression).getTarget();
			addLocal(targetExpression);

			final Expression valueExpression = ((AssignmentExpression) expression).getValue();
			addLocal(valueExpression);
		}
	}

	private Local parseExpression(Expression expression) {
		Local local = null;
		if (expression instanceof NameExpression) {
			local = parseIdentifier(((NameExpression) expression).getIdentifier());
		} else if (expression instanceof LiteralExpression) {
			throw new RuntimeException("WTF??!");
//			mCode.loadConstant(local, ((LiteralExpression) expression).getValue());
		} else if (expression instanceof AssignmentExpression) {
			final Local value = parseExpression(((AssignmentExpression) expression).getValue());

			final Expression targetExpression = (Expression) ((AssignmentExpression) expression).getTarget();
			if (targetExpression instanceof FieldAccessExpression) {
				setOnField((FieldAccessExpression) targetExpression, value);
			} else {
				throw new RuntimeException("WTF?!");
			}
		} else if (expression instanceof FieldAccessExpression) {
			local = getFromField((FieldAccessExpression) expression);
		} else {
			throw new RuntimeException("WTF?!");
		}

		return local;
	}

	private Local getFromField(FieldAccessExpression expression) {
		final String fieldName = expression.getFieldName();

		final FieldId field = mClassParser.findField(fieldName);

		final Local localThis = mCode.getThis(mClassType);
		Local local = mLocalNameMap.get(fieldName);
		mCode.iget(field, local, localThis);
		return local;
	}

	private void setOnField(FieldAccessExpression expression, Local value) {
		final String fieldName = expression.getFieldName();

		final FieldId field = mClassParser.findField(fieldName);

		final Local localThis = mCode.getThis(mClassType);

		mCode.iput(field, localThis, value);
	}

	private Local parseIdentifier(String identifier) {
		if (mLocalNameMap.containsKey(identifier)) {
			return mLocalNameMap.get(identifier);
		} else if (mMethodDeclaration.getParameters() != null && mMethodDeclaration.getParameters().size() > 0) {
			for (int i = 0; i < mMethodDeclaration.getParameters().size(); i++) {
				final Parameter parameter = mMethodDeclaration.getParameters().get(i);
				if (parameter.getVariableDeclaratorId().getName().equals(identifier)) {
					return mCode.getParameter(i, mParamenters[i]);
				}
			}
		}

		return null;
	}
}
