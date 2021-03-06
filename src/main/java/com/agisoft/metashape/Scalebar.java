/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Scalebar {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Scalebar(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Scalebar obj) {
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
        MetashapeJNI.delete_Scalebar(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(Scalebar[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = Scalebar.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static Scalebar[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Scalebar[] arrayWrapper = new Scalebar[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Scalebar(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public Scalebar(Scalebar scalebar) {
    this(MetashapeJNI.new_Scalebar(Scalebar.getCPtr(scalebar), scalebar), true);
  }

  static public class Reference {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Reference(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Reference obj) {
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
          MetashapeJNI.delete_Scalebar_Reference(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Reference(Scalebar.Reference reference) {
      this(MetashapeJNI.new_Scalebar_Reference(Scalebar.Reference.getCPtr(reference), reference), true);
    }
  
    /**
     *  Enabled flag.
     */
    public void setEnabled(boolean state) {
      MetashapeJNI.Scalebar_Reference_setEnabled(swigCPtr, this, state);
    }
  
    /**
     *  Enabled flag.
     */
    public boolean isEnabled() {
      return MetashapeJNI.Scalebar_Reference_isEnabled(swigCPtr, this);
    }
  
    /**
     *  Scale bar length, may be null.
     */
    public void setDistance(Double distance) {
      MetashapeJNI.Scalebar_Reference_setDistance(swigCPtr, this, distance);
    }
  
    /**
     *  Scale bar length, may be null.
     */
    public Double getDistance() {
      return MetashapeJNI.Scalebar_Reference_getDistance(swigCPtr, this);
    }
  
    /**
     *  Scale bar length accuracy, may be null.
     */
    public void setDistanceAccuracy(Double accuracy) {
      MetashapeJNI.Scalebar_Reference_setDistanceAccuracy(swigCPtr, this, accuracy);
    }
  
    /**
     *  Scale bar length accuracy, may be null.
     */
    public Double getDistanceAccuracy() {
      return MetashapeJNI.Scalebar_Reference_getDistanceAccuracy(swigCPtr, this);
    }
  
  }

  /**
   *  Scale bar identifier.
   */
  public int getKey() {
    return MetashapeJNI.Scalebar_getKey(swigCPtr, this);
  }

  /**
   *  Chunk container, may be null.
   */
  public Chunk getChunk() {
    long ptr = MetashapeJNI.Scalebar_getChunk(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Chunk(ptr, true);
  }

  /**
   *  Scale bar label.
   */
  public void setLabel(String label) {
    MetashapeJNI.Scalebar_setLabel(swigCPtr, this, label);
  }

  /**
   *  Scale bar label.
   */
  public String getLabel() {
    return MetashapeJNI.Scalebar_getLabel(swigCPtr, this);
  }

  /**
   *  Selects/deselects the scale bar.
   */
  public void setSelected(boolean state) {
    MetashapeJNI.Scalebar_setSelected(swigCPtr, this, state);
  }

  /**
   *  Selects/deselects the scale bar.
   */
  public boolean isSelected() {
    return MetashapeJNI.Scalebar_isSelected(swigCPtr, this);
  }

  /**
   *  Scale bar reference data.
   */
  public Scalebar.Reference getReference() {
    return new Scalebar.Reference(MetashapeJNI.Scalebar_getReference(swigCPtr, this), true);
  }

  /**
   *  Scale bar reference data.
   */
  public void setReference(Scalebar.Reference reference) {
    MetashapeJNI.Scalebar_setReference(swigCPtr, this, Scalebar.Reference.getCPtr(reference), reference);
  }

  /**
   *  Scale bar meta data.
   */
  public void setMeta(MetaData meta) {
    MetashapeJNI.Scalebar_setMeta(swigCPtr, this, MetaData.getCPtr(meta), meta);
  }

  /**
   *  Scale bar meta data.
   */
  public MetaData getMeta() {
    return new MetaData(MetashapeJNI.Scalebar_getMeta(swigCPtr, this), true);
  }

}
