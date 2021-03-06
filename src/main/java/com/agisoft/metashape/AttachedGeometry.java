/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * Attached geometry definition.
 */
public class AttachedGeometry {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public AttachedGeometry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(AttachedGeometry obj) {
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
        MetashapeJNI.delete_AttachedGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(AttachedGeometry[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = AttachedGeometry.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static AttachedGeometry[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    AttachedGeometry[] arrayWrapper = new AttachedGeometry[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new AttachedGeometry(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public AttachedGeometry() {
    this(MetashapeJNI.new_AttachedGeometry__SWIG_0(), true);
  }

  public AttachedGeometry(AttachedGeometry geometry) {
    this(MetashapeJNI.new_AttachedGeometry__SWIG_1(AttachedGeometry.getCPtr(geometry), geometry), true);
  }

  public void setType(Geometry.Type type) {
    MetashapeJNI.AttachedGeometry_setType(swigCPtr, this, type.ordinal());
  }

  public Geometry.Type getType() {
    return Geometry.Type.class.getEnumConstants()[MetashapeJNI.AttachedGeometry_getType(swigCPtr, this)];
  }

  public void setVertices(int[] vertices) {
    MetashapeJNI.AttachedGeometry_setVertices(swigCPtr, this, vertices);
  }

  public int[] getVertices() { return MetashapeJNI.AttachedGeometry_getVertices(swigCPtr, this); }

  public void setGeometries(AttachedGeometry[] geometries) {
    MetashapeJNI.AttachedGeometry_setGeometries(swigCPtr, this, AttachedGeometry.cArrayUnwrap(geometries));
  }

  public AttachedGeometry[] getGeometries() { return AttachedGeometry.cArrayWrap(MetashapeJNI.AttachedGeometry_getGeometries(swigCPtr, this), true); }

  public static AttachedGeometry makePoint(int point) {
    return new AttachedGeometry(MetashapeJNI.AttachedGeometry_makePoint(point), true);
  }

  public static AttachedGeometry makeLineString(int[] vertices) {
    return new AttachedGeometry(MetashapeJNI.AttachedGeometry_makeLineString(vertices), true);
  }

  public static AttachedGeometry makePolygon(int[] exterior_ring) {
    return new AttachedGeometry(MetashapeJNI.AttachedGeometry_makePolygon(exterior_ring), true);
  }

  public static AttachedGeometry makeMultiPoint(AttachedGeometry[] collection) {
    return new AttachedGeometry(MetashapeJNI.AttachedGeometry_makeMultiPoint(AttachedGeometry.cArrayUnwrap(collection)), true);
  }

  public static AttachedGeometry makeMultiLineString(AttachedGeometry[] collection) {
    return new AttachedGeometry(MetashapeJNI.AttachedGeometry_makeMultiLineString(AttachedGeometry.cArrayUnwrap(collection)), true);
  }

  public static AttachedGeometry makeMultiPolygon(AttachedGeometry[] collection) {
    return new AttachedGeometry(MetashapeJNI.AttachedGeometry_makeMultiPolygon(AttachedGeometry.cArrayUnwrap(collection)), true);
  }

  public static AttachedGeometry makeGeometryCollection(AttachedGeometry[] collection) {
    return new AttachedGeometry(MetashapeJNI.AttachedGeometry_makeGeometryCollection(AttachedGeometry.cArrayUnwrap(collection)), true);
  }

}
