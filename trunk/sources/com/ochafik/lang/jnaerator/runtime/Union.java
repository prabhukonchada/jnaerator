/*
	Copyright (c) 2009 Olivier Chafik, All Rights Reserved
	
	This file is part of JNAerator (http://jnaerator.googlecode.com/).
	
	JNAerator is free software: you can redistribute it and/or modify
	it under the terms of the GNU Lesser General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.
	
	JNAerator is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU Lesser General Public License for more details.
	
	You should have received a copy of the GNU Lesser General Public License
	along with JNAerator.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.ochafik.lang.jnaerator.runtime;

public class Union<S extends Union<S>> extends com.sun.jna.Union {
	protected <T extends Union<?>> T setupClone(T clone) {
		write();
		clone.useMemory(getPointer());
		clone.read();
		return clone;
	}
	@SuppressWarnings("unchecked")
	@Override
	public S[] toArray(int size) {
		return (S[])super.toArray(size);
	}
	public S[] toArray() {
		return toArray(1);
	}
	@SuppressWarnings("unchecked")
	@Override
	public S[] toArray(com.sun.jna.Structure[] array) {
		return (S[])super.toArray(array);
	}
}
