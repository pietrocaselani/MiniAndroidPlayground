// Generated from SimpleJava.g4 by ANTLR 4.7.2

package io.github.pietrocaselani.simplejava.parser.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaParser}.
 */
public interface SimpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimpleJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimpleJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(SimpleJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(SimpleJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(SimpleJavaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(SimpleJavaParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(SimpleJavaParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(SimpleJavaParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(SimpleJavaParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(SimpleJavaParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(SimpleJavaParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(SimpleJavaParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(SimpleJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(SimpleJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(SimpleJavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(SimpleJavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(SimpleJavaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(SimpleJavaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(SimpleJavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(SimpleJavaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(SimpleJavaParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(SimpleJavaParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(SimpleJavaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(SimpleJavaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(SimpleJavaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(SimpleJavaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(SimpleJavaParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(SimpleJavaParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SimpleJavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SimpleJavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(SimpleJavaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(SimpleJavaParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(SimpleJavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(SimpleJavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(SimpleJavaParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(SimpleJavaParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(SimpleJavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(SimpleJavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(SimpleJavaParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(SimpleJavaParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(SimpleJavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(SimpleJavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(SimpleJavaParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(SimpleJavaParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(SimpleJavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(SimpleJavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(SimpleJavaParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(SimpleJavaParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(SimpleJavaParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(SimpleJavaParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(SimpleJavaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(SimpleJavaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SimpleJavaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SimpleJavaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(SimpleJavaParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(SimpleJavaParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(SimpleJavaParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(SimpleJavaParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(SimpleJavaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(SimpleJavaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(SimpleJavaParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(SimpleJavaParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(SimpleJavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(SimpleJavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(SimpleJavaParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(SimpleJavaParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SimpleJavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SimpleJavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(SimpleJavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(SimpleJavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(SimpleJavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(SimpleJavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(SimpleJavaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(SimpleJavaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(SimpleJavaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(SimpleJavaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(SimpleJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(SimpleJavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(SimpleJavaParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(SimpleJavaParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(SimpleJavaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(SimpleJavaParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(SimpleJavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(SimpleJavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(SimpleJavaParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(SimpleJavaParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(SimpleJavaParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(SimpleJavaParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(SimpleJavaParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(SimpleJavaParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(SimpleJavaParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(SimpleJavaParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SimpleJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SimpleJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(SimpleJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(SimpleJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(SimpleJavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(SimpleJavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(SimpleJavaParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(SimpleJavaParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#propertyAccessorName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessorName(SimpleJavaParser.PropertyAccessorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#propertyAccessorName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessorName(SimpleJavaParser.PropertyAccessorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#propertyAccessor}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessor(SimpleJavaParser.PropertyAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#propertyAccessor}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessor(SimpleJavaParser.PropertyAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(SimpleJavaParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(SimpleJavaParser.PropertyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(SimpleJavaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(SimpleJavaParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(SimpleJavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(SimpleJavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(SimpleJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(SimpleJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(SimpleJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(SimpleJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(SimpleJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(SimpleJavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(SimpleJavaParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(SimpleJavaParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(SimpleJavaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(SimpleJavaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(SimpleJavaParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(SimpleJavaParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(SimpleJavaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(SimpleJavaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(SimpleJavaParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(SimpleJavaParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(SimpleJavaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(SimpleJavaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(SimpleJavaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(SimpleJavaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(SimpleJavaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(SimpleJavaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(SimpleJavaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(SimpleJavaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(SimpleJavaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(SimpleJavaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(SimpleJavaParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(SimpleJavaParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(SimpleJavaParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(SimpleJavaParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(SimpleJavaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(SimpleJavaParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(SimpleJavaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(SimpleJavaParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(SimpleJavaParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(SimpleJavaParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(SimpleJavaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(SimpleJavaParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(SimpleJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(SimpleJavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(SimpleJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(SimpleJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(SimpleJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(SimpleJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(SimpleJavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(SimpleJavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(SimpleJavaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(SimpleJavaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(SimpleJavaParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(SimpleJavaParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(SimpleJavaParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(SimpleJavaParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(SimpleJavaParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(SimpleJavaParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(SimpleJavaParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(SimpleJavaParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(SimpleJavaParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(SimpleJavaParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(SimpleJavaParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(SimpleJavaParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(SimpleJavaParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(SimpleJavaParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(SimpleJavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(SimpleJavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(SimpleJavaParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(SimpleJavaParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(SimpleJavaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(SimpleJavaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(SimpleJavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(SimpleJavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(SimpleJavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(SimpleJavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(SimpleJavaParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(SimpleJavaParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(SimpleJavaParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(SimpleJavaParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(SimpleJavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(SimpleJavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(SimpleJavaParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(SimpleJavaParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(SimpleJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(SimpleJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(SimpleJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(SimpleJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(SimpleJavaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(SimpleJavaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(SimpleJavaParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(SimpleJavaParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(SimpleJavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(SimpleJavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(SimpleJavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(SimpleJavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(SimpleJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(SimpleJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(SimpleJavaParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(SimpleJavaParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(SimpleJavaParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(SimpleJavaParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(SimpleJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(SimpleJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(SimpleJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(SimpleJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(SimpleJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(SimpleJavaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(SimpleJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(SimpleJavaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(SimpleJavaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(SimpleJavaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(SimpleJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(SimpleJavaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(SimpleJavaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(SimpleJavaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SimpleJavaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SimpleJavaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(SimpleJavaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(SimpleJavaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(SimpleJavaParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(SimpleJavaParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(SimpleJavaParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(SimpleJavaParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(SimpleJavaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(SimpleJavaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(SimpleJavaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(SimpleJavaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(SimpleJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(SimpleJavaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(SimpleJavaParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(SimpleJavaParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(SimpleJavaParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(SimpleJavaParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(SimpleJavaParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(SimpleJavaParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(SimpleJavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(SimpleJavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(SimpleJavaParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(SimpleJavaParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(SimpleJavaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(SimpleJavaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SimpleJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SimpleJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localConstantShortDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalConstantShortDeclarationStatement(SimpleJavaParser.LocalConstantShortDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localConstantShortDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalConstantShortDeclarationStatement(SimpleJavaParser.LocalConstantShortDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localConstantShortDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalConstantShortDeclaration(SimpleJavaParser.LocalConstantShortDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localConstantShortDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalConstantShortDeclaration(SimpleJavaParser.LocalConstantShortDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localConstantDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalConstantDeclarationStatement(SimpleJavaParser.LocalConstantDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localConstantDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalConstantDeclarationStatement(SimpleJavaParser.LocalConstantDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localConstantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalConstantDeclaration(SimpleJavaParser.LocalConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localConstantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalConstantDeclaration(SimpleJavaParser.LocalConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localVariableShortDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableShortDeclarationStatement(SimpleJavaParser.LocalVariableShortDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localVariableShortDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableShortDeclarationStatement(SimpleJavaParser.LocalVariableShortDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(SimpleJavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(SimpleJavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localVariableShortDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableShortDeclaration(SimpleJavaParser.LocalVariableShortDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localVariableShortDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableShortDeclaration(SimpleJavaParser.LocalVariableShortDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(SimpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(SimpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(SimpleJavaParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(SimpleJavaParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(SimpleJavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(SimpleJavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(SimpleJavaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(SimpleJavaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(SimpleJavaParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(SimpleJavaParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(SimpleJavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(SimpleJavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SimpleJavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(SimpleJavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(SimpleJavaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(SimpleJavaParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(SimpleJavaParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(SimpleJavaParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(SimpleJavaParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(SimpleJavaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(SimpleJavaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(SimpleJavaParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(SimpleJavaParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(SimpleJavaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(SimpleJavaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(SimpleJavaParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(SimpleJavaParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(SimpleJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(SimpleJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(SimpleJavaParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(SimpleJavaParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(SimpleJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(SimpleJavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(SimpleJavaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(SimpleJavaParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SimpleJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(SimpleJavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(SimpleJavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(SimpleJavaParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(SimpleJavaParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SimpleJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SimpleJavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(SimpleJavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(SimpleJavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(SimpleJavaParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(SimpleJavaParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(SimpleJavaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(SimpleJavaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(SimpleJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(SimpleJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(SimpleJavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(SimpleJavaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(SimpleJavaParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(SimpleJavaParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(SimpleJavaParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(SimpleJavaParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(SimpleJavaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(SimpleJavaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SimpleJavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SimpleJavaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SimpleJavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SimpleJavaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimpleJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimpleJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SimpleJavaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SimpleJavaParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(SimpleJavaParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(SimpleJavaParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(SimpleJavaParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(SimpleJavaParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(SimpleJavaParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(SimpleJavaParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(SimpleJavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(SimpleJavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(SimpleJavaParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(SimpleJavaParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(SimpleJavaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(SimpleJavaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(SimpleJavaParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(SimpleJavaParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(SimpleJavaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(SimpleJavaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(SimpleJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(SimpleJavaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(SimpleJavaParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(SimpleJavaParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SimpleJavaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SimpleJavaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SimpleJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SimpleJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(SimpleJavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(SimpleJavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(SimpleJavaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(SimpleJavaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(SimpleJavaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(SimpleJavaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(SimpleJavaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(SimpleJavaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(SimpleJavaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(SimpleJavaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(SimpleJavaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(SimpleJavaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(SimpleJavaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(SimpleJavaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(SimpleJavaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(SimpleJavaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(SimpleJavaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(SimpleJavaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(SimpleJavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(SimpleJavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(SimpleJavaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(SimpleJavaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(SimpleJavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(SimpleJavaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(SimpleJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(SimpleJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(SimpleJavaParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(SimpleJavaParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(SimpleJavaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(SimpleJavaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(SimpleJavaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(SimpleJavaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(SimpleJavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(SimpleJavaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(SimpleJavaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(SimpleJavaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(SimpleJavaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(SimpleJavaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(SimpleJavaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(SimpleJavaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(SimpleJavaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(SimpleJavaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(SimpleJavaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(SimpleJavaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(SimpleJavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(SimpleJavaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(SimpleJavaParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(SimpleJavaParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(SimpleJavaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(SimpleJavaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(SimpleJavaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(SimpleJavaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(SimpleJavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(SimpleJavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(SimpleJavaParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(SimpleJavaParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(SimpleJavaParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(SimpleJavaParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(SimpleJavaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(SimpleJavaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(SimpleJavaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(SimpleJavaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(SimpleJavaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(SimpleJavaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(SimpleJavaParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(SimpleJavaParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(SimpleJavaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(SimpleJavaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(SimpleJavaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(SimpleJavaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleJavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleJavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(SimpleJavaParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(SimpleJavaParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SimpleJavaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SimpleJavaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(SimpleJavaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(SimpleJavaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(SimpleJavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(SimpleJavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(SimpleJavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(SimpleJavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(SimpleJavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(SimpleJavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(SimpleJavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(SimpleJavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SimpleJavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SimpleJavaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SimpleJavaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SimpleJavaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SimpleJavaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SimpleJavaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(SimpleJavaParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(SimpleJavaParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SimpleJavaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SimpleJavaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SimpleJavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SimpleJavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SimpleJavaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SimpleJavaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(SimpleJavaParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(SimpleJavaParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(SimpleJavaParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(SimpleJavaParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(SimpleJavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(SimpleJavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(SimpleJavaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(SimpleJavaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(SimpleJavaParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(SimpleJavaParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(SimpleJavaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(SimpleJavaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(SimpleJavaParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(SimpleJavaParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(SimpleJavaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(SimpleJavaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(SimpleJavaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(SimpleJavaParser.CastExpressionContext ctx);
}