/*
 * Copyright (C) 2007 Júlio Vilmar Gesser.
 *
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 05/10/2006
 */
package io.github.pietrocaselani.simplejava.ast.type;

/**
 * Created by Pietro Caselani
 * On 1/23/15
 * NewJava
 */
public final class ClassOrInterfaceType extends Type {
	private ClassOrInterfaceType mScope;
	private String mName;

	public ClassOrInterfaceType() {}

	public ClassOrInterfaceType(int beginLine, int endLine, int beginColumn, int endColumn) {
		super(beginLine, endLine, beginColumn, endColumn);
	}

	public ClassOrInterfaceType(ClassOrInterfaceType scope, String name) {
		setScope(scope);
		mName = name;
	}

	public ClassOrInterfaceType(int beginLine, int endLine, int beginColumn, int endColumn, ClassOrInterfaceType scope, String name) {
		super(beginLine, endLine, beginColumn, endColumn);
		setScope(scope);
		mName = name;
	}

	public ClassOrInterfaceType getScope() {
		return mScope;
	}

	public void setScope(ClassOrInterfaceType scope) {
		mScope = scope;
		setAsParent(scope);
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

}
