/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Pair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Pair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Pair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MetashapeJNI.delete_Pair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(Pair[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = Pair.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static Pair[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Pair[] arrayWrapper = new Pair[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Pair(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public Pair() {
    this(MetashapeJNI.new_Pair__SWIG_0(), true);
  }

  public Pair(int first, int second) {
    this(MetashapeJNI.new_Pair__SWIG_1(first, second), true);
  }

  public void setFirst(int value) {
    MetashapeJNI.Pair_first_set(swigCPtr, this, value);
  }

  public int getFirst() {
    return MetashapeJNI.Pair_first_get(swigCPtr, this);
  }

  public void setSecond(int value) {
    MetashapeJNI.Pair_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return MetashapeJNI.Pair_second_get(swigCPtr, this);
  }

}
