/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Marker {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Marker(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Marker obj) {
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
        MetashapeJNI.delete_Marker(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(Marker[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = Marker.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static Marker[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Marker[] arrayWrapper = new Marker[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Marker(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public Marker(Marker marker) {
    this(MetashapeJNI.new_Marker(Marker.getCPtr(marker), marker), true);
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
          MetashapeJNI.delete_Marker_Reference(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Reference(Marker.Reference reference) {
      this(MetashapeJNI.new_Marker_Reference(Marker.Reference.getCPtr(reference), reference), true);
    }
  
    /**
     *  Enabled flag.
     */
    public void setEnabled(boolean state) {
      MetashapeJNI.Marker_Reference_setEnabled(swigCPtr, this, state);
    }
  
    /**
     *  Enabled flag.
     */
    public boolean isEnabled() {
      return MetashapeJNI.Marker_Reference_isEnabled(swigCPtr, this);
    }
  
    /**
     *  Marker coordinates, may be null.
     */
    public void setLocation(Vector3d location) {
      MetashapeJNI.Marker_Reference_setLocation(swigCPtr, this, location == null ? 0 : Vector3d.getCPtr(location), location);
    }
  
    /**
     *  Marker coordinates, may be null.
     */
    public Vector3d getLocation() {
      long ptr = MetashapeJNI.Marker_Reference_getLocation(swigCPtr, this);
      if (ptr == 0)
          return null;
      return new Vector3d(ptr, true);
    }
  
    /**
     *  Marker location accuracy, may be null.
     */
    public void setLocationAccuracy(Vector3d accuracy) {
      MetashapeJNI.Marker_Reference_setLocationAccuracy(swigCPtr, this, accuracy == null ? 0 : Vector3d.getCPtr(accuracy), accuracy);
    }
  
    /**
     *  Marker location accuracy, may be null.
     */
    public Vector3d getLocationAccuracy() {
      long ptr = MetashapeJNI.Marker_Reference_getLocationAccuracy(swigCPtr, this);
      if (ptr == 0)
          return null;
      return new Vector3d(ptr, true);
    }
  
  }

  static public class Projection {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Projection(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Projection obj) {
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
          MetashapeJNI.delete_Marker_Projection(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Projection() {
      this(MetashapeJNI.new_Marker_Projection__SWIG_0(), true);
    }
  
    public Projection(Marker.Projection projection) {
      this(MetashapeJNI.new_Marker_Projection__SWIG_1(Marker.Projection.getCPtr(projection), projection), true);
    }
  
    public void setPoint(Vector2d point) {
      MetashapeJNI.Marker_Projection_setPoint(swigCPtr, this, Vector2d.getCPtr(point), point);
    }
  
    public Vector2d getPoint() {
      return new Vector2d(MetashapeJNI.Marker_Projection_getPoint(swigCPtr, this), true);
    }
  
    public void setPinned(boolean pinned) {
      MetashapeJNI.Marker_Projection_setPinned(swigCPtr, this, pinned);
    }
  
    public boolean isPinned() {
      return MetashapeJNI.Marker_Projection_isPinned(swigCPtr, this);
    }
  
    public void setValid(boolean valid) {
      MetashapeJNI.Marker_Projection_setValid(swigCPtr, this, valid);
    }
  
    public boolean isValid() {
      return MetashapeJNI.Marker_Projection_isValid(swigCPtr, this);
    }
  
  }

  /**
   *  Marker identifier.
   */
  public int getKey() {
    return MetashapeJNI.Marker_getKey(swigCPtr, this);
  }

  /**
   *  Chunk container, may be null.
   */
  public Chunk getChunk() {
    long ptr = MetashapeJNI.Marker_getChunk(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Chunk(ptr, true);
  }

  /**
   *  Marker label.
   */
  public void setLabel(String label) {
    MetashapeJNI.Marker_setLabel(swigCPtr, this, label);
  }

  /**
   *  Marker label.
   */
  public String getLabel() {
    return MetashapeJNI.Marker_getLabel(swigCPtr, this);
  }

  /**
   *  Enables/disables the marker.
   */
  public void setEnabled(boolean state) {
    MetashapeJNI.Marker_setEnabled(swigCPtr, this, state);
  }

  /**
   *  Enables/disables the marker.
   */
  public boolean isEnabled() {
    return MetashapeJNI.Marker_isEnabled(swigCPtr, this);
  }

  /**
   *  Selects/deselects the marker.
   */
  public void setSelected(boolean state) {
    MetashapeJNI.Marker_setSelected(swigCPtr, this, state);
  }

  /**
   *  Selects/deselects the marker.
   */
  public boolean isSelected() {
    return MetashapeJNI.Marker_isSelected(swigCPtr, this);
  }

  /**
   * Set marker projection.<br>
   * @param camera Camera key.<br>
   * @param projection Image coordinates, may be null.
   */
  public void setProjection(int camera, Marker.Projection projection) {
    MetashapeJNI.Marker_setProjection(swigCPtr, this, camera, projection == null ? 0 : Marker.Projection.getCPtr(projection));
  }

  /**
   * Get marker projection.<br>
   * @param camera Camera key.<br>
   * @return Image coordinates, may be null.
   */
  public Marker.Projection getProjection(int camera) {
    long ptr = MetashapeJNI.Marker_getProjection(swigCPtr, this, camera);
    if (ptr == 0)
        return null;
    return new Marker.Projection(ptr, true);
  }

  /**
   *  Marker position in the current frame, may be null.
   */
  public Vector3d getPosition() {
    long ptr = MetashapeJNI.Marker_getPosition(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Vector3d(ptr, true);
  }

  /**
   *  List of camera keys containing marker projections.
   */
  public int[] getCameraKeys() { return MetashapeJNI.Marker_getCameraKeys(swigCPtr, this); }

  /**
   *  Marker reference data.
   */
  public Marker.Reference getReference() {
    return new Marker.Reference(MetashapeJNI.Marker_getReference(swigCPtr, this), true);
  }

  /**
   *  Marker reference data.
   */
  public void setReference(Marker.Reference reference) {
    MetashapeJNI.Marker_setReference(swigCPtr, this, Marker.Reference.getCPtr(reference), reference);
  }

  /**
   *  Marker meta data.
   */
  public void setMeta(MetaData meta) {
    MetashapeJNI.Marker_setMeta(swigCPtr, this, MetaData.getCPtr(meta), meta);
  }

  /**
   *  Marker meta data.
   */
  public MetaData getMeta() {
    return new MetaData(MetashapeJNI.Marker_getMeta(swigCPtr, this), true);
  }

}
