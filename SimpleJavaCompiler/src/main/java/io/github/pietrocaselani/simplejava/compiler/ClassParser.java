package io.github.pietrocaselani.simplejava.compiler;

import com.android.dx.FieldId;
import com.android.dx.TypeId;
import io.github.pietrocaselani.simplejava.ast.ClassDeclaration;
import io.github.pietrocaselani.simplejava.ast.Node;
import io.github.pietrocaselani.simplejava.ast.body.FieldDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.MethodDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.PropertyDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;
import io.github.pietrocaselani.simplejava.ast.type.ClassOrInterfaceType;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static io.github.pietrocaselani.simplejava.compiler.SimpleJavaCompiler.sDexMaker;

/**
 * Created by Pietro Caselani
 * On 1/30/15
 * MiniPlayground
 */
final class ClassParser {
    final String mPackageName;
    final ClassDeclaration mClassDeclaration;
    final TypeId mClassType;
    final List<FieldId> mFields;

    ClassParser(File outFile, String packageName, ClassDeclaration classDeclaration) {
        mPackageName = packageName;
        mClassDeclaration = classDeclaration;

        mFields = new ArrayList<>();

        final String typeName = packageName == null ? classDeclaration.getName() : packageName + "." + classDeclaration.getName();

        mClassType = TypeId.get(TypeIdHelper.toDexTypeName(typeName));

        sDexMaker.declare(mClassType, outFile.getName(), classDeclaration.getModifiers(), TypeId.OBJECT);
    }

    TypeId parse() {
        parseMembers();

        return mClassType;
    }

    private void parseMembers() {
        for (final Node member : mClassDeclaration.getMembers()) {
            if (member instanceof FieldDeclaration) {
                parseField((FieldDeclaration) member);
            } else if (member instanceof PropertyDeclaration) {
                parseProperty((PropertyDeclaration) member);
            } else if (member instanceof MethodDeclaration) {
                new MethodParser(this, (MethodDeclaration) member);
            } else if (member instanceof ClassOrInterfaceType) {

            }
        }
    }

    private void parseProperty(PropertyDeclaration propertyDeclaration) {
        parseField(propertyDeclaration.getField());
        new MethodParser(this, propertyDeclaration.getGetter());
        new MethodParser(this, propertyDeclaration.getSetter());
    }

    //region Right
    private void parseField(FieldDeclaration fieldDeclaration) {
        final TypeId<?> typeId = TypeIdHelper.parseTypeId(fieldDeclaration.getType());
        final int modifiers = fieldDeclaration.getModifiers();

        for (final VariableDeclarator variableDeclarator : fieldDeclaration.getVariables()) {
            final FieldId<?, ?> field = mClassType.getField(typeId, variableDeclarator.getDeclaratorId().getName());
            mFields.add(field);
            sDexMaker.declare(field, modifiers, null);
        }
    }

    FieldId findField(String fieldName) {
        for (final FieldId field : mFields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }
        return null;
    }
    //endregion
}
