/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Sensor {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Sensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Sensor obj) {
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
        MetashapeJNI.delete_Sensor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long[] cArrayUnwrap(Sensor[] arrayWrapper) {
    long[] cArray = new long[arrayWrapper.length];
    for (int i=0; i<arrayWrapper.length; i++)
      cArray[i] = Sensor.getCPtr(arrayWrapper[i]);
    return cArray;
  }

  public static Sensor[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Sensor[] arrayWrapper = new Sensor[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Sensor(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public Sensor(Sensor sensor) {
    this(MetashapeJNI.new_Sensor(Sensor.getCPtr(sensor), sensor), true);
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
          MetashapeJNI.delete_Sensor_Reference(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Reference(Sensor.Reference reference) {
      this(MetashapeJNI.new_Sensor_Reference(Sensor.Reference.getCPtr(reference), reference), true);
    }
  
    /**
     *  Location enabled flag.
     */
    public void setLocationEnabled(boolean state) {
      MetashapeJNI.Sensor_Reference_setLocationEnabled(swigCPtr, this, state);
    }
  
    /**
     *  Location enabled flag.
     */
    public boolean isLocationEnabled() {
      return MetashapeJNI.Sensor_Reference_isLocationEnabled(swigCPtr, this);
    }
  
    /**
     *  Rotation enabled flag.
     */
    public void setRotationEnabled(boolean state) {
      MetashapeJNI.Sensor_Reference_setRotationEnabled(swigCPtr, this, state);
    }
  
    /**
     *  Rotation enabled flag.
     */
    public boolean isRotationEnabled() {
      return MetashapeJNI.Sensor_Reference_isRotationEnabled(swigCPtr, this);
    }
  
    /**
     *  Sensor coordinates, may be null.
     */
    public void setLocation(Vector3d location) {
      MetashapeJNI.Sensor_Reference_setLocation(swigCPtr, this, location == null ? 0 : Vector3d.getCPtr(location), location);
    }
  
    /**
     *  Sensor coordinates, may be null.
     */
    public Vector3d getLocation() {
      long ptr = MetashapeJNI.Sensor_Reference_getLocation(swigCPtr, this);
      if (ptr == 0)
          return null;
      return new Vector3d(ptr, true);
    }
  
    /**
     *  Sensor rotation angles, may be null.
     */
    public void setRotation(Vector3d rotation) {
      MetashapeJNI.Sensor_Reference_setRotation(swigCPtr, this, rotation == null ? 0 : Vector3d.getCPtr(rotation), rotation);
    }
  
    /**
     *  Sensor rotation angles, may be null.
     */
    public Vector3d getRotation() {
      long ptr = MetashapeJNI.Sensor_Reference_getRotation(swigCPtr, this);
      if (ptr == 0)
          return null;
      return new Vector3d(ptr, true);
    }
  
    /**
     *  Sensor location accuracy, may be null.
     */
    public void setLocationAccuracy(Vector3d accuracy) {
      MetashapeJNI.Sensor_Reference_setLocationAccuracy(swigCPtr, this, accuracy == null ? 0 : Vector3d.getCPtr(accuracy), accuracy);
    }
  
    /**
     *  Sensor location accuracy, may be null.
     */
    public Vector3d getLocationAccuracy() {
      long ptr = MetashapeJNI.Sensor_Reference_getLocationAccuracy(swigCPtr, this);
      if (ptr == 0)
          return null;
      return new Vector3d(ptr, true);
    }
  
    /**
     *  Sensor rotation accuracy, may be null.
     */
    public void setRotationAccuracy(Vector3d accuracy) {
      MetashapeJNI.Sensor_Reference_setRotationAccuracy(swigCPtr, this, accuracy == null ? 0 : Vector3d.getCPtr(accuracy), accuracy);
    }
  
    /**
     *  Sensor rotation accuracy, may be null.
     */
    public Vector3d getRotationAccuracy() {
      long ptr = MetashapeJNI.Sensor_Reference_getRotationAccuracy(swigCPtr, this);
      if (ptr == 0)
          return null;
      return new Vector3d(ptr, true);
    }
  
  }

  /**
   *  Sensor identifier.
   */
  public int getKey() {
    return MetashapeJNI.Sensor_getKey(swigCPtr, this);
  }

  /**
   *  Chunk container, may be null.
   */
  public Chunk getChunk() {
    long ptr = MetashapeJNI.Sensor_getChunk(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Chunk(ptr, true);
  }

  /**
   *  Sensor label.
   */
  public void setLabel(String label) {
    MetashapeJNI.Sensor_setLabel(swigCPtr, this, label);
  }

  /**
   *  Sensor label.
   */
  public String getLabel() {
    return MetashapeJNI.Sensor_getLabel(swigCPtr, this);
  }

  /**
   *  Image resolution.
   */
  public void setResolution(long width, long height) {
    MetashapeJNI.Sensor_setResolution(swigCPtr, this, width, height);
  }

  /**
   *  Image width.
   */
  public long getWidth() {
    return MetashapeJNI.Sensor_getWidth(swigCPtr, this);
  }

  /**
   *  Image width.
   */
  public long getHeight() {
    return MetashapeJNI.Sensor_getHeight(swigCPtr, this);
  }

  /**
   *  Sensor projection model.
   */
  public void setCameraModel(Calibration.Type type) {
    MetashapeJNI.Sensor_setCameraModel(swigCPtr, this, type.ordinal());
  }

  /**
   *  Sensor projection model.
   */
  public Calibration.Type getCameraModel() {
    return Calibration.Type.class.getEnumConstants()[MetashapeJNI.Sensor_getCameraModel(swigCPtr, this)];
  }

  /**
   *  Adjusted calibration of the photo.
   */
  public void setCalibration(Calibration calibration) {
    MetashapeJNI.Sensor_setCalibration(swigCPtr, this, Calibration.getCPtr(calibration), calibration);
  }

  /**
   *  Adjusted calibration of the photo.
   */
  public Calibration getCalibration() {
    return new Calibration(MetashapeJNI.Sensor_getCalibration(swigCPtr, this), true);
  }

  /**
   *  Custom calibration used as initial calibration during photo alignment, may be null.
   */
  public void setUserCalib(Calibration calibration) {
    MetashapeJNI.Sensor_setUserCalib(swigCPtr, this, calibration == null ? 0 : Calibration.getCPtr(calibration), calibration);
  }

  /**
   *  Custom calibration used as initial calibration during photo alignment, may be null.
   */
  public Calibration getUserCalib() {
    long ptr = MetashapeJNI.Sensor_getUserCalib(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Calibration(ptr, true);
  }

  /**
   *  Fix calibration flag.
   */
  public void setFixed(boolean fixed) {
    MetashapeJNI.Sensor_setFixed(swigCPtr, this, fixed);
  }

  /**
   *  Fix calibration flag.
   */
  public boolean isFixed() {
    return MetashapeJNI.Sensor_isFixed(swigCPtr, this);
  }

  /**
   *  Pixel size in mm.
   */
  public void setPixelSize(double width, double height) {
    MetashapeJNI.Sensor_setPixelSize(swigCPtr, this, width, height);
  }

  /**
   *  Pixel width in mm.
   */
  public double getPixelWidth() {
    return MetashapeJNI.Sensor_getPixelWidth(swigCPtr, this);
  }

  /**
   *  Pixel height in mm.
   */
  public double getPixelHeight() {
    return MetashapeJNI.Sensor_getPixelHeight(swigCPtr, this);
  }

  /**
   *  Focal length in mm.
   */
  public void setFocalLength(double focal_length) {
    MetashapeJNI.Sensor_setFocalLength(swigCPtr, this, focal_length);
  }

  /**
   *  Focal length in mm.
   */
  public double getFocalLength() {
    return MetashapeJNI.Sensor_getFocalLength(swigCPtr, this);
  }

  /**
   *  Sensor master, may be null.
   */
  public void setMaster(Sensor sensor) {
    MetashapeJNI.Sensor_setMaster(swigCPtr, this, sensor == null ? 0 : Sensor.getCPtr(sensor), sensor);
  }

  /**
   *  Sensor master, may be null.
   */
  public Sensor getMaster() {
    long ptr = MetashapeJNI.Sensor_getMaster(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Sensor(ptr, true);
  }

  /**
   *  Sensor reference data.
   */
  public void setReference(Sensor.Reference reference) {
    MetashapeJNI.Sensor_setReference(swigCPtr, this, Sensor.Reference.getCPtr(reference), reference);
  }

  /**
   *  Sensor reference data.
   */
  public Sensor.Reference getReference() {
    return new Sensor.Reference(MetashapeJNI.Sensor_getReference(swigCPtr, this), true);
  }

  /**
   *  GPS antenna correction.
   */
  public void setAntenna(Antenna antenna) {
    MetashapeJNI.Sensor_setAntenna(swigCPtr, this, Antenna.getCPtr(antenna), antenna);
  }

  /**
   *  GPS antenna correction.
   */
  public Antenna getAntenna() {
    return new Antenna(MetashapeJNI.Sensor_getAntenna(swigCPtr, this), true);
  }

  /**
   *  Vignetting for each band.
   */
  public void setVignetting(Vignetting[] vignetting) {
    MetashapeJNI.Sensor_setVignetting(swigCPtr, this, Vignetting.cArrayUnwrap(vignetting));
  }

  /**
   *  Vignetting for each band.
   */
  public Vignetting[] getVignetting() { return Vignetting.cArrayWrap(MetashapeJNI.Sensor_getVignetting(swigCPtr, this), true); }

  /**
   *  Sensor meta data.
   */
  public void setMeta(MetaData meta) {
    MetashapeJNI.Sensor_setMeta(swigCPtr, this, MetaData.getCPtr(meta), meta);
  }

  /**
   *  Sensor meta data.
   */
  public MetaData getMeta() {
    return new MetaData(MetashapeJNI.Sensor_getMeta(swigCPtr, this), true);
  }

}
