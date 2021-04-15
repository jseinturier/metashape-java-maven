/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * Digital elevation model.
 */
public class Elevation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Elevation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Elevation obj) {
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
        MetashapeJNI.delete_Elevation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(Elevation[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = Elevation.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static Elevation[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Elevation[] arrayWrapper = new Elevation[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Elevation(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public Elevation() {
    this(MetashapeJNI.new_Elevation__SWIG_0(), true);
  }

  public Elevation(Elevation elevation) {
    this(MetashapeJNI.new_Elevation__SWIG_1(Elevation.getCPtr(elevation), elevation), true);
  }

  /**
   *  Elevation model identifier.
   */
  public int getKey() {
    return MetashapeJNI.Elevation_getKey(swigCPtr, this);
  }

  /**
   *  Chunk container, may be null.
   */
  public Chunk getChunk() {
    long ptr = MetashapeJNI.Elevation_getChunk(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Chunk(ptr, true);
  }

  /**
   *  Elevation model label.
   */
  public void setLabel(String label) {
    MetashapeJNI.Elevation_setLabel(swigCPtr, this, label);
  }

  /**
   *  Elevation model label.
   */
  public String getLabel() {
    return MetashapeJNI.Elevation_getLabel(swigCPtr, this);
  }

  /**
   *  Path to elevation data.
   */
  public String getPath() {
    return MetashapeJNI.Elevation_getPath(swigCPtr, this);
  }

  /**
   *  Elevation model meta data.
   */
  public void setMeta(MetaData meta) {
    MetashapeJNI.Elevation_setMeta(swigCPtr, this, MetaData.getCPtr(meta), meta);
  }

  /**
   *  Elevation model meta data.
   */
  public MetaData getMeta() {
    return new MetaData(MetashapeJNI.Elevation_getMeta(swigCPtr, this), true);
  }

  /**
   *  Elevation model width.
   */
  public long getWidth() {
    return MetashapeJNI.Elevation_getWidth(swigCPtr, this);
  }

  /**
   *  Elevation model height.
   */
  public long getHeight() {
    return MetashapeJNI.Elevation_getHeight(swigCPtr, this);
  }

  /**
   *  Coordinates of the top left corner.
   */
  public Vector2d getTopLeft() {
    return new Vector2d(MetashapeJNI.Elevation_getTopLeft(swigCPtr, this), true);
  }

  /**
   *  Coordinates of the bottom right corner.
   */
  public Vector2d getBottomRight() {
    return new Vector2d(MetashapeJNI.Elevation_getBottomRight(swigCPtr, this), true);
  }

  /**
   *  Projection of elevation model.
   */
  public OrthoProjection getProjection() {
    return new OrthoProjection(MetashapeJNI.Elevation_getProjection(swigCPtr, this), true);
  }

  /**
   *  DEM resolution in meters.
   */
  public double getResolution() {
    return MetashapeJNI.Elevation_getResolution(swigCPtr, this);
  }

  /**
   *  Minimum elevation value.
   */
  public float getMinElevation() {
    return MetashapeJNI.Elevation_getMinElevation(swigCPtr, this);
  }

  /**
   *  Maximum elevation value.
   */
  public float getMaxElevation() {
    return MetashapeJNI.Elevation_getMaxElevation(swigCPtr, this);
  }

}
