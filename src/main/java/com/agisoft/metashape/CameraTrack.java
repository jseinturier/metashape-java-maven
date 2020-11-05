/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * Camera track.
 */
public class CameraTrack {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public CameraTrack(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CameraTrack obj) {
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
        MetashapeJNI.delete_CameraTrack(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(CameraTrack[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = CameraTrack.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static CameraTrack[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    CameraTrack[] arrayWrapper = new CameraTrack[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new CameraTrack(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public CameraTrack() {
    this(MetashapeJNI.new_CameraTrack__SWIG_0(), true);
  }

  public CameraTrack(CameraTrack group) {
    this(MetashapeJNI.new_CameraTrack__SWIG_1(CameraTrack.getCPtr(group), group), true);
  }

  /**
   *  Camera track label.
   */
  public void setLabel(String label) {
    MetashapeJNI.CameraTrack_setLabel(swigCPtr, this, label);
  }

  /**
   *  Camera track label.
   */
  public String getLabel() {
    return MetashapeJNI.CameraTrack_getLabel(swigCPtr, this);
  }

  /**
   *  Current selection state.
   */
  public void setSelected(boolean state) {
    MetashapeJNI.CameraTrack_setSelected(swigCPtr, this, state);
  }

  /**
   *  Current selection state.
   */
  public boolean isSelected() {
    return MetashapeJNI.CameraTrack_isSelected(swigCPtr, this);
  }

  /**
   *  Animation duration.
   */
  public void setDuration(double duration) {
    MetashapeJNI.CameraTrack_setDuration(swigCPtr, this, duration);
  }

  /**
   *  Animation duration.
   */
  public double getDuration() {
    return MetashapeJNI.CameraTrack_getDuration(swigCPtr, this);
  }

  /**
   *  Vertical field of view in degrees.
   */
  public void setFieldOfView(double fov) {
    MetashapeJNI.CameraTrack_setFieldOfView(swigCPtr, this, fov);
  }

  /**
   *  Vertical field of view in degrees.
   */
  public double getFieldOfView() {
    return MetashapeJNI.CameraTrack_getFieldOfView(swigCPtr, this);
  }

  /**
   *  Camera track keyframes.
   */
  public void setKeyframes(int[] keys) {
    MetashapeJNI.CameraTrack_setKeyframes(swigCPtr, this, keys);
  }

  /**
   *  Camera track keyframes.
   */
  public int[] getKeyframes() { return MetashapeJNI.CameraTrack_getKeyframes(swigCPtr, this); }

  /**
   *  Camera track key.
   */
  public int getKey() {
    return MetashapeJNI.CameraTrack_getKey(swigCPtr, this);
  }

  /**
   *  Chunk container.
   */
  public Chunk getChunk() {
    long ptr = MetashapeJNI.CameraTrack_getChunk(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Chunk(ptr, true);
  }

  /**
   *  Camera track meta data.
   */
  public void setMeta(MetaData meta) {
    MetashapeJNI.CameraTrack_setMeta(swigCPtr, this, MetaData.getCPtr(meta), meta);
  }

  /**
   *  Camera track meta data.
   */
  public MetaData getMeta() {
    return new MetaData(MetashapeJNI.CameraTrack_getMeta(swigCPtr, this), true);
  }

}
