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
public class InvertMasks extends Task {
  private transient long swigCPtr;

  protected InvertMasks(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.InvertMasks_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InvertMasks obj) {
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
        TasksJNI.delete_InvertMasks(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public InvertMasks() {
    this(TasksJNI.new_InvertMasks(), true);
  }

  /**
   *  List of cameras to process.
   */
  public void setCameras(int[] value) {
    TasksJNI.InvertMasks_setCameras(swigCPtr, this, value);
  }

  /**
   *  List of cameras to process.
   */
  public int[] getCameras() { return TasksJNI.InvertMasks_getCameras(swigCPtr, this); }

}
