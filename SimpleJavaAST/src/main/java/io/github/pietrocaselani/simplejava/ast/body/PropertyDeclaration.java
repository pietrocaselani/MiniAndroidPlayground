package io.github.pietrocaselani.simplejava.ast.body;

import io.github.pietrocaselani.simplejava.ast.expr.AssignmentExpression;
import io.github.pietrocaselani.simplejava.ast.expr.FieldAccessExpression;
import io.github.pietrocaselani.simplejava.ast.expr.NameExpression;
import io.github.pietrocaselani.simplejava.ast.stmt.ExpressionStatement;
import io.github.pietrocaselani.simplejava.ast.stmt.ReturnStatement;
import io.github.pietrocaselani.simplejava.ast.stmt.Statement;
import io.github.pietrocaselani.simplejava.ast.type.ClassOrInterfaceType;
import io.github.pietrocaselani.simplejava.ast.type.PrimitiveType;
import io.github.pietrocaselani.simplejava.ast.type.Type;
import io.github.pietrocaselani.simplejava.ast.utils.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.github.pietrocaselani.simplejava.ast.ModifierHelper.PRIVATE;
import static io.github.pietrocaselani.simplejava.ast.expr.AssignmentExpression.Operator.ASSIGN;
import static io.github.pietrocaselani.simplejava.ast.type.PrimitiveType.VOID_TYPE;

/**
 * Created by Pietro Caselani
 * On 1/21/15
 * NewJava
 */
public final class PropertyDeclaration extends BodyDeclaration {
    private int mGetterModifiers, mSetterModifiers;
    private MethodDeclaration mGetter, mSetter;
    private FieldDeclaration mField;
    private String mName;
    private Type mType;

    public PropertyDeclaration() {
    }

    public PropertyDeclaration(int beginLine, int endLine, int beginColumn, int endColumn) {
        super(beginLine, endLine, beginColumn, endColumn);
    }

    public PropertyDeclaration(int getterModifiers, int setterModifiers, String name, Type type) {
        mGetterModifiers = getterModifiers;
        mSetterModifiers = setterModifiers;
        mName = name;
        setType(type);
    }

    public PropertyDeclaration(int beginLine, int endLine, int beginColumn, int endColumn, int getterModifiers, int setterModifiers, String name, Type type) {
        super(beginLine, endLine, beginColumn, endColumn);
        mGetterModifiers = getterModifiers;
        mSetterModifiers = setterModifiers;
        mName = name;
        setType(type);
    }

    public int getGetterModifiers() {
        return mGetterModifiers;
    }

    void setGetterModifiers(int getterModifiers) {
        mGetterModifiers = getterModifiers;
    }

    int getSetterModifiers() {
        return mSetterModifiers;
    }

    public void setSetterModifiers(int setterModifiers) {
        mSetterModifiers = setterModifiers;
    }

    String getName() {
        return mName;
    }

    void setName(String name) {
        mName = name;
    }

    Type getType() {
        return mType;
    }

    void setType(Type type) {
        mType = type;
        setAsParent(type);
    }

    public MethodDeclaration getGetter() {
        buildAccessors();
        return mGetter;
    }

    public MethodDeclaration getSetter() {
        buildAccessors();
        return mSetter;
    }

    public FieldDeclaration getField() {
        return mField == null ? mField = buildField() : mField;
    }

    private FieldDeclaration buildField() {
        final List<VariableDeclarator> variables = new ArrayList<VariableDeclarator>(1);

        variables.add(new VariableDeclarator(new VariableDeclaratorId("_" + mName), null));

        return new FieldDeclaration(PRIVATE, mType, variables);
    }

    private void buildAccessors() {
        if (mType != null && mName != null) {
            buildGetter();
            buildSetter();
        }
    }

    private void buildSetter() {
        final String capitalizedName = StringUtils.capitalize(mName, true);

        final Block body = new Block();
        body.setStatic(false);

        final ArrayList<Statement> statements = new ArrayList<Statement>(1);

        statements.add(new ExpressionStatement(new AssignmentExpression(ASSIGN, new NameExpression(mName), new FieldAccessExpression(getFieldName()))));

        body.setStatements(statements);

        final Parameter parameter = new Parameter(0, new VariableDeclaratorId(mName));
        parameter.setType(mType);

        mSetter = new MethodDeclaration(mSetterModifiers, "set" + capitalizedName, VOID_TYPE, body);
        mSetter.setParameters(Collections.singletonList(parameter));
    }

    private void buildGetter() {
        final String getterPrefix;
        if (PrimitiveType.BOOLEAN_TYPE.equals(mType) || (mType instanceof ClassOrInterfaceType && ((ClassOrInterfaceType) mType).getName().toLowerCase().contains("bool"))) {
            getterPrefix = "is";
        } else {
            getterPrefix = "get";
        }

        final String capitalizedName = StringUtils.capitalize(mName, true);

        final Block body = new Block();
        body.setStatic(false);

        final ArrayList<Statement> statements = new ArrayList<Statement>(1);
        statements.add(new ReturnStatement(new FieldAccessExpression(getFieldName())));
        body.setStatements(statements);

        mGetter = new MethodDeclaration(mGetterModifiers, getterPrefix + capitalizedName, mType, body);
    }

    private String getFieldName() {
        return mField.getVariables().get(0).getDeclaratorId().getName();
    }
}
