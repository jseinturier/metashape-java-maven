/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

import java.lang.AutoCloseable;
import java.util.Optional;
import java.util.Map;

public class Sensor implements AutoCloseable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Sensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Sensor obj) {
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

  @Override
  public void close() {
    delete();
  }

  static public class Reference {

    private Optional<Vector> location;
    private Optional<Vector> rotation;
    private Optional<Vector> location_accuracy;
    private Optional<Vector> rotation_accuracy;
    private boolean location_enabled;
    private boolean rotation_enabled;

    public Reference() {
      location = Optional.empty();
      rotation = Optional.empty();
      location_accuracy = Optional.empty();
      rotation_accuracy = Optional.empty();
      location_enabled = false;
      rotation_enabled = false;
    }

    /**
     *  Location enabled flag.
     */
    public void setLocationEnabled(boolean state) {
      location_enabled = state;
    }

    /**
     *  Location enabled flag.
     */
    public boolean isLocationEnabled() {
      return location_enabled;
    }

    /**
     *  Rotation enabled flag.
     */
    public void setRotationEnabled(boolean state) {
      rotation_enabled = state;
    }

    /**
     *  Rotation enabled flag.
     */
    public boolean isRotationEnabled() {
      return rotation_enabled;
    }

    /**
     *  Sensor coordinates, may be null.
     */
    public void setLocation(Optional<Vector> location) {
      this.location = location;
    }

    /**
     *  Sensor coordinates, may be null.
     */
    public Optional<Vector> getLocation() {
      return location;
    }

    /**
     *  Sensor rotation angles, may be null.
     */
    public void setRotation(Optional<Vector> rotation) {
      this.rotation = rotation;
    }

    /**
     *  Sensor rotation angles, may be null.
     */
    public Optional<Vector> getRotation() {
      return rotation;
    }

    /**
     *  Sensor location accuracy, may be null.
     */
    public void setLocationAccuracy(Optional<Vector> accuracy) {
      location_accuracy = accuracy;
    }

    /**
     *  Sensor location accuracy, may be null.
     */
    public Optional<Vector> getLocationAccuracy() {
      return location_accuracy;
    }

    /**
     *  Sensor rotation accuracy, may be null.
     */
    public void setRotationAccuracy(Optional<Vector> accuracy) {
      rotation_accuracy = accuracy;
    }

    /**
     *  Sensor rotation accuracy, may be null.
     */
    public Optional<Vector> getRotationAccuracy() {
      return rotation_accuracy;
    }

  }

  public Sensor(Sensor sensor) {
    this(MetashapeJNI.new_Sensor(Sensor.getCPtr(sensor), sensor), true);
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
  public Optional<Chunk> getChunk() {
    long ptr = MetashapeJNI.Sensor_getChunk(swigCPtr, this);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new Chunk(ptr, true));
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
  public void setUserCalib(Optional<Calibration> calibration) {
    MetashapeJNI.Sensor_setUserCalib(swigCPtr, this, calibration.isPresent() ? Calibration.getCPtr(calibration.get()) : 0);
  }

  /**
   *  Custom calibration used as initial calibration during photo alignment, may be null.
   */
  public Optional<Calibration> getUserCalib() {
    long ptr = MetashapeJNI.Sensor_getUserCalib(swigCPtr, this);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new Calibration(ptr, true));
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
  public void setMaster(Optional<Sensor> sensor) {
    MetashapeJNI.Sensor_setMaster(swigCPtr, this, sensor.isPresent() ? Sensor.getCPtr(sensor.get()) : 0);
  }

  /**
   *  Sensor master, may be null.
   */
  public Optional<Sensor> getMaster() {
    long ptr = MetashapeJNI.Sensor_getMaster(swigCPtr, this);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new Sensor(ptr, true));
  }

  /**
   *  Sensor reference data.
   */
  public void setReference(Sensor.Reference reference) {
    MetashapeJNI.Sensor_setReference(swigCPtr, this, reference);
  }

  /**
   *  Sensor reference data.
   */
  public Sensor.Reference getReference() { return MetashapeJNI.Sensor_getReference(swigCPtr, this); }

  /**
   *  GPS antenna correction.
   */
  public void setAntenna(Antenna antenna) {
    MetashapeJNI.Sensor_setAntenna(swigCPtr, this, antenna);
  }

  /**
   *  GPS antenna correction.
   */
  public Antenna getAntenna() { return MetashapeJNI.Sensor_getAntenna(swigCPtr, this); }

  /**
   *  Vignetting for each band.
   */
  public void setVignetting(Vignetting[] vignetting) {
    MetashapeJNI.Sensor_setVignetting(swigCPtr, this, vignetting);
  }

  /**
   *  Vignetting for each band.
   */
  public Vignetting[] getVignetting() { return MetashapeJNI.Sensor_getVignetting(swigCPtr, this); }

  /**
   *  Sensor meta data.
   */
  public void setMeta(Map<String,String> meta) {
    MetashapeJNI.Sensor_setMeta(swigCPtr, this, meta);
  }

  /**
   *  Sensor meta data.
   */
  public Map<String,String> getMeta() { return MetashapeJNI.Sensor_getMeta(swigCPtr, this); }

  /**
   *  Make this sensor master in the multi-camera system.
   */
  public void makeMaster() {
    MetashapeJNI.Sensor_makeMaster(swigCPtr, this);
  }

}
