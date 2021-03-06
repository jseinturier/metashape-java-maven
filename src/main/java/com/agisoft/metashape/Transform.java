/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * Transformation between chunk and world coordinates systems.
 */
public class Transform {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Transform(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Transform obj) {
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
        MetashapeJNI.delete_Transform(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Transform() {
    this(MetashapeJNI.new_Transform__SWIG_0(), true);
  }

  public Transform(Transform transform) {
    this(MetashapeJNI.new_Transform__SWIG_1(Transform.getCPtr(transform), transform), true);
  }

  /**
   *  Rotation component, may be null.
   */
  public void setRotation(Matrix3x3d rotation) {
    MetashapeJNI.Transform_setRotation(swigCPtr, this, rotation == null ? 0 : Matrix3x3d.getCPtr(rotation), rotation);
  }

  /**
   *  Rotation component, may be null.
   */
  public Matrix3x3d getRotation() {
    long ptr = MetashapeJNI.Transform_getRotation(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Matrix3x3d(ptr, true);
  }

  /**
   *  Translation component, may be null.
   */
  public void setTranslation(Vector3d translation) {
    MetashapeJNI.Transform_setTranslation(swigCPtr, this, translation == null ? 0 : Vector3d.getCPtr(translation), translation);
  }

  /**
   *  Translation component, may be null.
   */
  public Vector3d getTranslation() {
    long ptr = MetashapeJNI.Transform_getTranslation(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Vector3d(ptr, true);
  }

  /**
   *  Scale component, may be null.
   */
  public void setScale(Double scale) {
    MetashapeJNI.Transform_setScale(swigCPtr, this, scale);
  }

  /**
   *  Scale component, may be null.
   */
  public Double getScale() {
    return MetashapeJNI.Transform_getScale(swigCPtr, this);
  }

  /**
   *  Transformation matrix.
   */
  public void setMatrix(Matrix4x4d matrix) {
    MetashapeJNI.Transform_setMatrix(swigCPtr, this, Matrix4x4d.getCPtr(matrix), matrix);
  }

  /**
   *  Transformation matrix.
   */
  public Matrix4x4d getMatrix() {
    return new Matrix4x4d(MetashapeJNI.Transform_getMatrix(swigCPtr, this), true);
  }

  public boolean hasMatrix() {
    return MetashapeJNI.Transform_hasMatrix(swigCPtr, this);
  }

  public void reset() {
    MetashapeJNI.Transform_reset(swigCPtr, this);
  }

  public Vector3d transformPoint(Vector3d point) {
    return new Vector3d(MetashapeJNI.Transform_transformPoint(swigCPtr, this, Vector3d.getCPtr(point), point), true);
  }

  public Vector3d transformVector(Vector3d vector) {
    return new Vector3d(MetashapeJNI.Transform_transformVector(swigCPtr, this, Vector3d.getCPtr(vector), vector), true);
  }

}
