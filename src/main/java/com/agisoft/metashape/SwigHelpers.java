package com.agisoft.metashape;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Array;

class SwigHelpers {

	static <T> long[] cArrayUnwrap(T[] arrayWrapper, Class<T> type) {
		try {
			Method method = type.getMethod("getCPtr", type);
			long[] cArray = new long[arrayWrapper.length];
			for (int i=0; i < arrayWrapper.length; i++)
				cArray[i] = (long) method.invoke(null, arrayWrapper[i]);
			return cArray;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	static <T> T[] cArrayWrap(long[] cArray, boolean cMemoryOwn, Class<T> type) {
		try {
			Constructor<T> ctor = type.getConstructor(long.class, boolean.class);
			@SuppressWarnings("unchecked")
			T[] arrayWrapper = (T[]) Array.newInstance(type, cArray.length);
			for (int i = 0; i < cArray.length; i++)
				arrayWrapper[i] = ctor.newInstance(cArray[i], cMemoryOwn);
			return arrayWrapper;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
