/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Property {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Property(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Property obj) {
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
        MetashapeJNI.delete_Property(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(Property[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = Property.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static Property[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Property[] arrayWrapper = new Property[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Property(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public void setLabel(String value) {
    MetashapeJNI.Property_label_set(swigCPtr, this, value);
  }

  public String getLabel() {
    return MetashapeJNI.Property_label_get(swigCPtr, this);
  }

  public void setValue(String value) {
    MetashapeJNI.Property_value_set(swigCPtr, this, value);
  }

  public String getValue() {
    return MetashapeJNI.Property_value_get(swigCPtr, this);
  }

  public void setChildren(Property[] value) {
    MetashapeJNI.Property_children_set(swigCPtr, this, Property.cArrayUnwrap(value));
  }

  public Property[] getChildren() { return Property.cArrayWrap(MetashapeJNI.Property_children_get(swigCPtr, this), false); }

  public Property() {
    this(MetashapeJNI.new_Property(), true);
  }

}
