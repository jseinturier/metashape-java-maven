/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Shape {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Shape(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Shape obj) {
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
        MetashapeJNI.delete_Shape(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(Shape[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = Shape.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static Shape[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Shape[] arrayWrapper = new Shape[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Shape(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public Shape(Shape shape) {
    this(MetashapeJNI.new_Shape(Shape.getCPtr(shape), shape), true);
  }

  /**
   *  Shape identifier.
   */
  public int getKey() {
    return MetashapeJNI.Shape_getKey(swigCPtr, this);
  }

  /**
   *  Shape boundary type.
   */
  public void setBoundaryType(Shape.BoundaryType type) {
    MetashapeJNI.Shape_setBoundaryType(swigCPtr, this, type.ordinal());
  }

  /**
   *  Shape boundary type.
   */
  public Shape.BoundaryType getBoundaryType() {
    return Shape.BoundaryType.class.getEnumConstants()[MetashapeJNI.Shape_getBoundaryType(swigCPtr, this)];
  }

  /**
   *  Shape label.
   */
  public void setLabel(String label) {
    MetashapeJNI.Shape_setLabel(swigCPtr, this, label);
  }

  /**
   *  Shape label.
   */
  public String getLabel() {
    return MetashapeJNI.Shape_getLabel(swigCPtr, this);
  }

  /**
   *  Selects/deselects the shape.
   */
  public void setSelected(boolean state) {
    MetashapeJNI.Shape_setSelected(swigCPtr, this, state);
  }

  /**
   *  Selects/deselects the shape.
   */
  public boolean isSelected() {
    return MetashapeJNI.Shape_isSelected(swigCPtr, this);
  }

  /**
   *  Shape group.
   */
  public void setGroup(ShapeGroup group) {
    MetashapeJNI.Shape_setGroup(swigCPtr, this, ShapeGroup.getCPtr(group), group);
  }

  /**
   *  Shape group.
   */
  public ShapeGroup getGroup() {
    return new ShapeGroup(MetashapeJNI.Shape_getGroup(swigCPtr, this), true);
  }

  /**
   *  Attached shape state.
   */
  public boolean isAttached() {
    return MetashapeJNI.Shape_isAttached(swigCPtr, this);
  }

  /**
   *  True if shape has Z coordinate values.
   */
  public boolean is3D() {
    return MetashapeJNI.Shape_is3D(swigCPtr, this);
  }

  /**
   *  Geometry for the non-attached shape.
   */
  public void setGeometry(Geometry geometry) {
    MetashapeJNI.Shape_setGeometry(swigCPtr, this, Geometry.getCPtr(geometry), geometry);
  }

  /**
   *  Geometry for the non-attached shape.
   */
  public Geometry getGeometry() {
    return new Geometry(MetashapeJNI.Shape_getGeometry(swigCPtr, this), true);
  }

  /**
   *  Geometry for the attached shape.
   */
  public void setAttachedGeometry(AttachedGeometry geometry) {
    MetashapeJNI.Shape_setAttachedGeometry(swigCPtr, this, AttachedGeometry.getCPtr(geometry), geometry);
  }

  /**
   *  Geometry for the attached shape.
   */
  public AttachedGeometry getAttachedGeometry() {
    return new AttachedGeometry(MetashapeJNI.Shape_getAttachedGeometry(swigCPtr, this), true);
  }

  public enum BoundaryType {
    NoBoundary,
    InnerBoundary,
    OuterBoundary;
  }

}
