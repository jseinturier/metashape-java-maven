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

/**
 * Depth map data.
 */
public class DepthMap implements AutoCloseable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DepthMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DepthMap obj) {
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
        MetashapeJNI.delete_DepthMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  @Override
  public void close() {
    delete();
  }

  public DepthMap() {
    this(MetashapeJNI.new_DepthMap__SWIG_0(), true);
  }

  public DepthMap(DepthMap depth_map) {
    this(MetashapeJNI.new_DepthMap__SWIG_1(DepthMap.getCPtr(depth_map), depth_map), true);
  }

  /**
   *  Depth map calibration.
   */
  public void setCalibration(int level, Calibration calib) {
    MetashapeJNI.DepthMap_setCalibration(swigCPtr, this, level, Calibration.getCPtr(calib), calib);
  }

  /**
   *  Depth map calibration, may be null.
   */
  public Optional<Calibration> getCalibration(int level) {
    long ptr = MetashapeJNI.DepthMap_getCalibration(swigCPtr, this, level);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new Calibration(ptr, true));
  }

  /**
   *  Image object with depth map data.
   */
  public void setImage(int level, Image image) {
    MetashapeJNI.DepthMap_setImage(swigCPtr, this, level, Image.getCPtr(image), image);
  }

  /**
   *  Image object with depth map data, may be null.
   */
  public Optional<Image> getImage(int level) {
    long ptr = MetashapeJNI.DepthMap_getImage(swigCPtr, this, level);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new Image(ptr, true));
  }

}
