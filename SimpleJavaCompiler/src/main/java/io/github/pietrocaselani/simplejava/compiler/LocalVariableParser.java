package io.github.pietrocaselani.simplejava.compiler;

import com.android.dx.Local;
import com.android.dx.TypeId;
import io.github.pietrocaselani.simplejava.ast.body.LocalConstantDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.LocalVariableDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.VariableDeclarator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pietro Caselani
 * On 3/3/15
 * MiniPlayground
 */
final class LocalVariableParser {
    final List<Local> mLocals;
    final List<String> mNames;
    final TypeId mType;


    LocalVariableParser(MethodParser methodParser, LocalVariableDeclaration variableDeclaration) {
        mType = TypeIdHelper.parseTypeId(variableDeclaration.getType());
        mNames = new ArrayList<String>(variableDeclaration.getVariables().size());
        mLocals = new ArrayList<Local>();

        for (final VariableDeclarator variableDeclarator : variableDeclaration.getVariables()) {
            mNames.add(variableDeclarator.getDeclaratorId().getName());
            mLocals.add(methodParser.mCode.newLocal(mType));
        }
    }

    LocalVariableParser(MethodParser methodParser, LocalConstantDeclaration constantDeclaration) {
        mType = TypeIdHelper.parseTypeId(constantDeclaration.getType());
        mNames = new ArrayList<String>(constantDeclaration.getVariables().size());
        mLocals = new ArrayList<Local>();

        for (final VariableDeclarator variableDeclarator : constantDeclaration.getVariables()) {
            mNames.add(variableDeclarator.getDeclaratorId().getName());
            mLocals.add(methodParser.mCode.newLocal(mType));
        }
    }

    public List<Local> getLocals() {
        return mLocals;
    }

    public List<String> getNames() {
        return mNames;
    }

    public TypeId getType() {
        return mType;
    }
}
