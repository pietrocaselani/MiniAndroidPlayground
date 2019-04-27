package io.github.pietrocaselani.simplejava.compiler;

import com.android.dx.TypeId;
import io.github.pietrocaselani.simplejava.ast.CompilationUnit;
import io.github.pietrocaselani.simplejava.ast.ImportDeclaration;
import io.github.pietrocaselani.simplejava.ast.TypeDeclaration;
import io.github.pietrocaselani.simplejava.ast.body.Parameter;
import io.github.pietrocaselani.simplejava.ast.type.ClassOrInterfaceType;
import io.github.pietrocaselani.simplejava.ast.type.PrimitiveType;
import io.github.pietrocaselani.simplejava.ast.type.ReferenceType;
import io.github.pietrocaselani.simplejava.ast.type.Type;

import java.util.List;

import static io.github.pietrocaselani.simplejava.ast.type.PrimitiveType.Primitive.*;

/**
 * Created by Pietro Caselani
 * On 1/30/15
 * MiniPlayground
 */
final class TypeIdHelper {
    private static CompilationUnit sCompilationUnit;

    private TypeIdHelper() {
    }

    static void init(CompilationUnit compilationUnit) {
        sCompilationUnit = compilationUnit;
    }

    static String toDexTypeName(String typeName) {
        return "L" + typeName.replaceAll("\\.", "/") + ";";
    }

    static TypeId<? extends Object> parseTypeId(Type type) {
        TypeId<? extends Object> typeId;

        if (type instanceof PrimitiveType) {
            final PrimitiveType primitiveType = (PrimitiveType) type;
            if (primitiveType.getPrimitive() == BOOLEAN) {
                typeId = TypeId.BOOLEAN;
            } else if (primitiveType.getPrimitive() == CHAR) {
                typeId = TypeId.CHAR;
            } else if (primitiveType.getPrimitive() == BYTE) {
                typeId = TypeId.BYTE;
            } else if (primitiveType.getPrimitive() == SHORT) {
                typeId = TypeId.SHORT;
            } else if (primitiveType.getPrimitive() == INT) {
                typeId = TypeId.INT;
            } else if (primitiveType.getPrimitive() == LONG) {
                typeId = TypeId.LONG;
            } else if (primitiveType.getPrimitive() == FLOAT) {
                typeId = TypeId.FLOAT;
            } else if (primitiveType.getPrimitive() == DOUBLE) {
                typeId = TypeId.DOUBLE;
            } else {
                throw new RuntimeException("Unknow primitive " + primitiveType);
            }
        } else if (type.equals(PrimitiveType.VOID_TYPE)) {
            typeId = TypeId.VOID;
        } else if (type instanceof ReferenceType) {
            typeId = parseTypeId(((ReferenceType) type).getType());
        } else if (type instanceof ClassOrInterfaceType) {
            final String name = ((ClassOrInterfaceType) type).getName();
            typeId = findTypeId(name);
        } else {
            throw new RuntimeException("Unknow type " + type);
        }

        return typeId;
    }

    static TypeId[] parseParameters(List<Parameter> parameters) {
        final TypeId[] p;

        if (parameters == null || parameters.size() == 0) {
            p = new TypeId[0];
        } else {
            p = new TypeId[parameters.size()];

            for (int i = 0; i < parameters.size(); i++) {
                p[i] = parseTypeId(parameters.get(i).getType());
            }
        }

        return p;
    }

    static TypeId<? extends Object> findTypeId(String name) {
        String fullTypeName = null;

        if (sCompilationUnit.getImports() != null) {
            fullTypeName = searchOnImports(sCompilationUnit.getImports(), name);
        }

        if (fullTypeName == null) {
            if (sCompilationUnit.getTypes() != null) {
                fullTypeName = searchOnTypes(sCompilationUnit.getTypes(), name);
            }
        }

        if (fullTypeName == null) {
            if (name.equals("String") || name.equals("java.lang.String")) {
                fullTypeName = "java.lang.String";
            } else if (name.equals("Object") || name.equals("java.lang.Object")) {
                fullTypeName = "java.lang.Object";
            } else {
                System.out.println("Error - Type not found: " + name);
                fullTypeName = "java.lang." + name;
            }
        }

        return TypeId.get(toDexTypeName(fullTypeName));
    }

    static String searchOnTypes(List<TypeDeclaration> types, String name) {
        String fullTypeName = null;

        final String packageName = sCompilationUnit.getPackage() != null ? sCompilationUnit.getPackage().getPackageName() : "";

        for (final TypeDeclaration type : types) {
            final String typeName = packageName + "." + type.getName();
            if (typeName.equals(name) && TypesTable.getInstance().contains(typeName)) {
                fullTypeName = typeName;
                break;
            }
        }

        return fullTypeName;
    }

    static String searchOnImports(List<ImportDeclaration> imports, String name) {
        String fullTypeName = null;
        for (final ImportDeclaration importDeclaration : imports) {
            final String importDeclarationName = importDeclaration.getName();
            if (importDeclarationName.equals(name) && TypesTable.getInstance().contains(importDeclarationName)) {
                fullTypeName = importDeclarationName;
                break;
            } else {
                final int dotIndex = importDeclarationName.lastIndexOf(".");
                final String importName = importDeclarationName.substring(dotIndex + 1);
                if (importName.equals(name) && TypesTable.getInstance().contains(importDeclarationName)) {
                    fullTypeName = importDeclarationName;
                    break;
                }
            }
        }
        return fullTypeName;
    }
}
