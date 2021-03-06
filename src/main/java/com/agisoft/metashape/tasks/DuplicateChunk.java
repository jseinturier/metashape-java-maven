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
public class DuplicateChunk extends Task {
  private transient long swigCPtr;

  protected DuplicateChunk(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.DuplicateChunk_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DuplicateChunk obj) {
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
        TasksJNI.delete_DuplicateChunk(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DuplicateChunk() {
    this(TasksJNI.new_DuplicateChunk(), true);
  }

  /**
   *  Chunk to copy. Default: -1
   */
  public void setChunk(int value) {
    TasksJNI.DuplicateChunk_setChunk(swigCPtr, this, value);
  }

  /**
   *  Chunk to copy. Default: -1
   */
  public int getChunk() {
    return TasksJNI.DuplicateChunk_getChunk(swigCPtr, this);
  }

  /**
   *  Copy dense clouds. Default: true
   */
  public void setCopyDenseClouds(boolean value) {
    TasksJNI.DuplicateChunk_setCopyDenseClouds(swigCPtr, this, value);
  }

  /**
   *  Copy dense clouds. Default: true
   */
  public boolean getCopyDenseClouds() {
    return TasksJNI.DuplicateChunk_getCopyDenseClouds(swigCPtr, this);
  }

  /**
   *  Copy depth maps. Default: true
   */
  public void setCopyDepthMaps(boolean value) {
    TasksJNI.DuplicateChunk_setCopyDepthMaps(swigCPtr, this, value);
  }

  /**
   *  Copy depth maps. Default: true
   */
  public boolean getCopyDepthMaps() {
    return TasksJNI.DuplicateChunk_getCopyDepthMaps(swigCPtr, this);
  }

  /**
   *  Copy DEMs. Default: true
   */
  public void setCopyElevations(boolean value) {
    TasksJNI.DuplicateChunk_setCopyElevations(swigCPtr, this, value);
  }

  /**
   *  Copy DEMs. Default: true
   */
  public boolean getCopyElevations() {
    return TasksJNI.DuplicateChunk_getCopyElevations(swigCPtr, this);
  }

  /**
   *  Copy keypoints. Default: true
   */
  public void setCopyKeypoints(boolean value) {
    TasksJNI.DuplicateChunk_setCopyKeypoints(swigCPtr, this, value);
  }

  /**
   *  Copy keypoints. Default: true
   */
  public boolean getCopyKeypoints() {
    return TasksJNI.DuplicateChunk_getCopyKeypoints(swigCPtr, this);
  }

  /**
   *  Copy models. Default: true
   */
  public void setCopyModels(boolean value) {
    TasksJNI.DuplicateChunk_setCopyModels(swigCPtr, this, value);
  }

  /**
   *  Copy models. Default: true
   */
  public boolean getCopyModels() {
    return TasksJNI.DuplicateChunk_getCopyModels(swigCPtr, this);
  }

  /**
   *  Copy orthomosaics. Default: true
   */
  public void setCopyOrthomosaics(boolean value) {
    TasksJNI.DuplicateChunk_setCopyOrthomosaics(swigCPtr, this, value);
  }

  /**
   *  Copy orthomosaics. Default: true
   */
  public boolean getCopyOrthomosaics() {
    return TasksJNI.DuplicateChunk_getCopyOrthomosaics(swigCPtr, this);
  }

  /**
   *  Copy tiled models. Default: true
   */
  public void setCopyTiledModels(boolean value) {
    TasksJNI.DuplicateChunk_setCopyTiledModels(swigCPtr, this, value);
  }

  /**
   *  Copy tiled models. Default: true
   */
  public boolean getCopyTiledModels() {
    return TasksJNI.DuplicateChunk_getCopyTiledModels(swigCPtr, this);
  }

  /**
   *  List of frame keys to copy.
   */
  public void setFrames(int[] value) {
    TasksJNI.DuplicateChunk_setFrames(swigCPtr, this, value);
  }

  /**
   *  List of frame keys to copy.
   */
  public int[] getFrames() { return TasksJNI.DuplicateChunk_getFrames(swigCPtr, this); }

  /**
   *  New chunk label.
   */
  public void setLabel(String value) {
    TasksJNI.DuplicateChunk_setLabel(swigCPtr, this, value);
  }

  /**
   *  New chunk label.
   */
  public String getLabel() {
    return TasksJNI.DuplicateChunk_getLabel(swigCPtr, this);
  }

}
