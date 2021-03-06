/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * Rolling shutter correction model.
 */
public class Shutter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Shutter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Shutter obj) {
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
        MetashapeJNI.delete_Shutter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Shutter() {
    this(MetashapeJNI.new_Shutter__SWIG_0(), true);
  }

  public Shutter(Shutter region) {
    this(MetashapeJNI.new_Shutter__SWIG_1(Shutter.getCPtr(region), region), true);
  }

  public void setTranslation(Vector3d translation) {
    MetashapeJNI.Shutter_setTranslation(swigCPtr, this, Vector3d.getCPtr(translation), translation);
  }

  public Vector3d getTranslation() {
    return new Vector3d(MetashapeJNI.Shutter_getTranslation(swigCPtr, this), true);
  }

  public void setRotation(Matrix3x3d rotation) {
    MetashapeJNI.Shutter_setRotation(swigCPtr, this, Matrix3x3d.getCPtr(rotation), rotation);
  }

  public Matrix3x3d getRotation() {
    return new Matrix3x3d(MetashapeJNI.Shutter_getRotation(swigCPtr, this), true);
  }

}
