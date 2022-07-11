/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class MatchPhotos extends Task {
  private transient long swigCPtr;

  protected MatchPhotos(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.MatchPhotos_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MatchPhotos obj) {
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
        TasksJNI.delete_MatchPhotos(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MatchPhotos() {
    this(TasksJNI.new_MatchPhotos(), true);
  }

  /**
   *  List of cameras to match.
   */
  public void setCameras(int[] value) {
    TasksJNI.MatchPhotos_setCameras(swigCPtr, this, value);
  }

  /**
   *  List of cameras to match.
   */
  public int[] getCameras() { return TasksJNI.MatchPhotos_getCameras(swigCPtr, this); }

  /**
   *  Image alignment accuracy. Default: 1
   */
  public void setDownscale(int value) {
    TasksJNI.MatchPhotos_setDownscale(swigCPtr, this, value);
  }

  /**
   *  Image alignment accuracy. Default: 1
   */
  public int getDownscale() {
    return TasksJNI.MatchPhotos_getDownscale(swigCPtr, this);
  }

  /**
   *  Filter points by mask. Default: false
   */
  public void setFilterMask(boolean value) {
    TasksJNI.MatchPhotos_setFilterMask(swigCPtr, this, value);
  }

  /**
   *  Filter points by mask. Default: false
   */
  public boolean getFilterMask() {
    return TasksJNI.MatchPhotos_getFilterMask(swigCPtr, this);
  }

  /**
   *  Exclude tie points which are stationary across images. Default: true
   */
  public void setFilterStationaryPoints(boolean value) {
    TasksJNI.MatchPhotos_setFilterStationaryPoints(swigCPtr, this, value);
  }

  /**
   *  Exclude tie points which are stationary across images. Default: true
   */
  public boolean getFilterStationaryPoints() {
    return TasksJNI.MatchPhotos_getFilterStationaryPoints(swigCPtr, this);
  }

  /**
   *  Enable generic preselection. Default: true
   */
  public void setGenericPreselection(boolean value) {
    TasksJNI.MatchPhotos_setGenericPreselection(swigCPtr, this, value);
  }

  /**
   *  Enable generic preselection. Default: true
   */
  public boolean getGenericPreselection() {
    return TasksJNI.MatchPhotos_getGenericPreselection(swigCPtr, this);
  }

  /**
   *  Enable guided image matching. Default: false
   */
  public void setGuidedMatching(boolean value) {
    TasksJNI.MatchPhotos_setGuidedMatching(swigCPtr, this, value);
  }

  /**
   *  Enable guided image matching. Default: false
   */
  public boolean getGuidedMatching() {
    return TasksJNI.MatchPhotos_getGuidedMatching(swigCPtr, this);
  }

  /**
   *  Store keypoints in the project. Default: false
   */
  public void setKeepKeypoints(boolean value) {
    TasksJNI.MatchPhotos_setKeepKeypoints(swigCPtr, this, value);
  }

  /**
   *  Store keypoints in the project. Default: false
   */
  public boolean getKeepKeypoints() {
    return TasksJNI.MatchPhotos_getKeepKeypoints(swigCPtr, this);
  }

  /**
   *  Key point limit. Default: 40000
   */
  public void setKeypointLimit(int value) {
    TasksJNI.MatchPhotos_setKeypointLimit(swigCPtr, this, value);
  }

  /**
   *  Key point limit. Default: 40000
   */
  public int getKeypointLimit() {
    return TasksJNI.MatchPhotos_getKeypointLimit(swigCPtr, this);
  }

  /**
   *  Key point limit per megapixel. Default: 1000
   */
  public void setKeypointLimitPerMpx(int value) {
    TasksJNI.MatchPhotos_setKeypointLimitPerMpx(swigCPtr, this, value);
  }

  /**
   *  Key point limit per megapixel. Default: 1000
   */
  public int getKeypointLimitPerMpx() {
    return TasksJNI.MatchPhotos_getKeypointLimitPerMpx(swigCPtr, this);
  }

  /**
   *  Apply mask filter to tie points. Default: true
   */
  public void setMaskTiepoints(boolean value) {
    TasksJNI.MatchPhotos_setMaskTiepoints(swigCPtr, this, value);
  }

  /**
   *  Apply mask filter to tie points. Default: true
   */
  public boolean getMaskTiepoints() {
    return TasksJNI.MatchPhotos_getMaskTiepoints(swigCPtr, this);
  }

  /**
   *  Maximum workgroup size. Default: 100
   */
  public void setMaxWorkgroupSize(int value) {
    TasksJNI.MatchPhotos_setMaxWorkgroupSize(swigCPtr, this, value);
  }

  /**
   *  Maximum workgroup size. Default: 100
   */
  public int getMaxWorkgroupSize() {
    return TasksJNI.MatchPhotos_getMaxWorkgroupSize(swigCPtr, this);
  }

  /**
   *  User defined list of camera pairs to match.
   */
  public void setPairs(Pair[] value) {
    TasksJNI.MatchPhotos_setPairs(swigCPtr, this, Pair.cArrayUnwrap(value));
  }

  /**
   *  User defined list of camera pairs to match.
   */
  public Pair[] getPairs() { return Pair.cArrayWrap(TasksJNI.MatchPhotos_getPairs(swigCPtr, this), true); }

  /**
   *  Enable reference preselection. Default: true
   */
  public void setReferencePreselection(boolean value) {
    TasksJNI.MatchPhotos_setReferencePreselection(swigCPtr, this, value);
  }

  /**
   *  Enable reference preselection. Default: true
   */
  public boolean getReferencePreselection() {
    return TasksJNI.MatchPhotos_getReferencePreselection(swigCPtr, this);
  }

  /**
   *  Reference preselection mode. Default: ReferencePreselectionMode.ReferencePreselectionSource
   */
  public void setReferencePreselectionMode(ReferencePreselectionMode value) {
    TasksJNI.MatchPhotos_setReferencePreselectionMode(swigCPtr, this, value.ordinal());
  }

  /**
   *  Reference preselection mode. Default: ReferencePreselectionMode.ReferencePreselectionSource
   */
  public ReferencePreselectionMode getReferencePreselectionMode() {
    return ReferencePreselectionMode.class.getEnumConstants()[TasksJNI.MatchPhotos_getReferencePreselectionMode(swigCPtr, this)];
  }

  /**
   *  Reset current matches. Default: false
   */
  public void setResetMatches(boolean value) {
    TasksJNI.MatchPhotos_setResetMatches(swigCPtr, this, value);
  }

  /**
   *  Reset current matches. Default: false
   */
  public boolean getResetMatches() {
    return TasksJNI.MatchPhotos_getResetMatches(swigCPtr, this);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public void setSubdivideTask(boolean value) {
    TasksJNI.MatchPhotos_setSubdivideTask(swigCPtr, this, value);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public boolean getSubdivideTask() {
    return TasksJNI.MatchPhotos_getSubdivideTask(swigCPtr, this);
  }

  /**
   *  Tie point limit. Default: 4000
   */
  public void setTiepointLimit(int value) {
    TasksJNI.MatchPhotos_setTiepointLimit(swigCPtr, this, value);
  }

  /**
   *  Tie point limit. Default: 4000
   */
  public int getTiepointLimit() {
    return TasksJNI.MatchPhotos_getTiepointLimit(swigCPtr, this);
  }

  /**
   *  Number of cameras in a workitem. Default: 20
   */
  public void setWorkitemSizeCameras(int value) {
    TasksJNI.MatchPhotos_setWorkitemSizeCameras(swigCPtr, this, value);
  }

  /**
   *  Number of cameras in a workitem. Default: 20
   */
  public int getWorkitemSizeCameras() {
    return TasksJNI.MatchPhotos_getWorkitemSizeCameras(swigCPtr, this);
  }

  /**
   *  Number of image pairs in a workitem. Default: 80
   */
  public void setWorkitemSizePairs(int value) {
    TasksJNI.MatchPhotos_setWorkitemSizePairs(swigCPtr, this, value);
  }

  /**
   *  Number of image pairs in a workitem. Default: 80
   */
  public int getWorkitemSizePairs() {
    return TasksJNI.MatchPhotos_getWorkitemSizePairs(swigCPtr, this);
  }

}
