/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Shapes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Shapes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Shapes obj) {
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
        MetashapeJNI.delete_Shapes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Shapes() {
    this(MetashapeJNI.new_Shapes__SWIG_0(), true);
  }

  public Shapes(Shapes shapes) {
    this(MetashapeJNI.new_Shapes__SWIG_1(Shapes.getCPtr(shapes), shapes), true);
  }

  /**
   *  Chunk container.
   */
  public Chunk getChunk() {
    long ptr = MetashapeJNI.Shapes_getChunk(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Chunk(ptr, true);
  }

  /**
   *  Path to shapes data.
   */
  public String getPath() {
    return MetashapeJNI.Shapes_getPath(swigCPtr, this);
  }

  /**
   *  Shapes meta data.
   */
  public void setMeta(MetaData meta) {
    MetashapeJNI.Shapes_setMeta(swigCPtr, this, MetaData.getCPtr(meta), meta);
  }

  /**
   *  Shapes meta data.
   */
  public MetaData getMeta() {
    return new MetaData(MetashapeJNI.Shapes_getMeta(swigCPtr, this), true);
  }

  /**
   *  List of shapes.
   */
  public Shape[] getShapes() { return Shape.cArrayWrap(MetashapeJNI.Shapes_getShapes(swigCPtr, this), true); }

  /**
   *  List of shape groups.
   */
  public ShapeGroup[] getGroups() { return ShapeGroup.cArrayWrap(MetashapeJNI.Shapes_getGroups(swigCPtr, this), true); }

  /**
   *  Projection of shape data.
   */
  public OrthoProjection getProjection() {
    return new OrthoProjection(MetashapeJNI.Shapes_getProjection(swigCPtr, this), true);
  }

}
