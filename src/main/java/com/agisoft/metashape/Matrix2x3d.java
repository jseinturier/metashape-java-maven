/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Matrix2x3d {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Matrix2x3d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Matrix2x3d obj) {
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
        MetashapeJNI.delete_Matrix2x3d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Matrix2x3d() {
    this(MetashapeJNI.new_Matrix2x3d__SWIG_0(), true);
  }

  public Matrix2x3d(double[][] data) {
    this(MetashapeJNI.new_Matrix2x3d__SWIG_1(data), true);
  }

  public double get(int row, int col) {
    return MetashapeJNI.Matrix2x3d_get(swigCPtr, this, row, col);
  }

  public void set(int row, int col, double value) {
    MetashapeJNI.Matrix2x3d_set(swigCPtr, this, row, col, value);
  }

  public double[][] getData() { return MetashapeJNI.Matrix2x3d_getData(swigCPtr, this); }

  public Vector2d col(int n) {
    return new Vector2d(MetashapeJNI.Matrix2x3d_col(swigCPtr, this, n), true);
  }

  public Vector3d row(int n) {
    return new Vector3d(MetashapeJNI.Matrix2x3d_row(swigCPtr, this, n), true);
  }

}
