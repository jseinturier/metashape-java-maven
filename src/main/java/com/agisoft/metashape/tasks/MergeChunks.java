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
public class MergeChunks extends Task {
  private transient long swigCPtr;

  protected MergeChunks(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.MergeChunks_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MergeChunks obj) {
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
        TasksJNI.delete_MergeChunks(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MergeChunks() {
    this(TasksJNI.new_MergeChunks(), true);
  }

  /**
   *  List of chunks to process.
   */
  public void setChunks(int[] value) {
    TasksJNI.MergeChunks_setChunks(swigCPtr, this, value);
  }

  /**
   *  List of chunks to process.
   */
  public int[] getChunks() { return TasksJNI.MergeChunks_getChunks(swigCPtr, this); }

  /**
   *  Merge dense clouds. Default: true
   */
  public void setMergeDenseClouds(boolean value) {
    TasksJNI.MergeChunks_setMergeDenseClouds(swigCPtr, this, value);
  }

  /**
   *  Merge dense clouds. Default: true
   */
  public boolean getMergeDenseClouds() {
    return TasksJNI.MergeChunks_getMergeDenseClouds(swigCPtr, this);
  }

  /**
   *  Merge depth maps. Default: false
   */
  public void setMergeDepthMaps(boolean value) {
    TasksJNI.MergeChunks_setMergeDepthMaps(swigCPtr, this, value);
  }

  /**
   *  Merge depth maps. Default: false
   */
  public boolean getMergeDepthMaps() {
    return TasksJNI.MergeChunks_getMergeDepthMaps(swigCPtr, this);
  }

  /**
   *  Merge DEMs. Default: false
   */
  public void setMergeElevations(boolean value) {
    TasksJNI.MergeChunks_setMergeElevations(swigCPtr, this, value);
  }

  /**
   *  Merge DEMs. Default: false
   */
  public boolean getMergeElevations() {
    return TasksJNI.MergeChunks_getMergeElevations(swigCPtr, this);
  }

  /**
   *  Merge markers. Default: false
   */
  public void setMergeMarkers(boolean value) {
    TasksJNI.MergeChunks_setMergeMarkers(swigCPtr, this, value);
  }

  /**
   *  Merge markers. Default: false
   */
  public boolean getMergeMarkers() {
    return TasksJNI.MergeChunks_getMergeMarkers(swigCPtr, this);
  }

  /**
   *  Merge models. Default: false
   */
  public void setMergeModels(boolean value) {
    TasksJNI.MergeChunks_setMergeModels(swigCPtr, this, value);
  }

  /**
   *  Merge models. Default: false
   */
  public boolean getMergeModels() {
    return TasksJNI.MergeChunks_getMergeModels(swigCPtr, this);
  }

  /**
   *  Merge orthomosaics. Default: false
   */
  public void setMergeOrthomosaics(boolean value) {
    TasksJNI.MergeChunks_setMergeOrthomosaics(swigCPtr, this, value);
  }

  /**
   *  Merge orthomosaics. Default: false
   */
  public boolean getMergeOrthomosaics() {
    return TasksJNI.MergeChunks_getMergeOrthomosaics(swigCPtr, this);
  }

  /**
   *  Merge tie points. Default: false
   */
  public void setMergeTiepoints(boolean value) {
    TasksJNI.MergeChunks_setMergeTiepoints(swigCPtr, this, value);
  }

  /**
   *  Merge tie points. Default: false
   */
  public boolean getMergeTiepoints() {
    return TasksJNI.MergeChunks_getMergeTiepoints(swigCPtr, this);
  }

}
