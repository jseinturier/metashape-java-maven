/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape.tasks;

/**
 * Task class containing processing parameters.
 */
public class AlignCameras extends Task {
  private transient long swigCPtr;

  protected AlignCameras(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.AlignCameras_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AlignCameras obj) {
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
        TasksJNI.delete_AlignCameras(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AlignCameras() {
    this(TasksJNI.new_AlignCameras(), true);
  }

  /**
   *  Enable adaptive fitting of distortion coefficients. Default: false
   */
  public void setAdaptiveFitting(boolean value) {
    TasksJNI.AlignCameras_setAdaptiveFitting(swigCPtr, this, value);
  }

  /**
   *  Enable adaptive fitting of distortion coefficients. Default: false
   */
  public boolean getAdaptiveFitting() {
    return TasksJNI.AlignCameras_getAdaptiveFitting(swigCPtr, this);
  }

  /**
   *  List of cameras to align.
   */
  public void setCameras(int[] value) {
    TasksJNI.AlignCameras_setCameras(swigCPtr, this, value);
  }

  /**
   *  List of cameras to align.
   */
  public int[] getCameras() { return TasksJNI.AlignCameras_getCameras(swigCPtr, this); }

  /**
   *  Minimum number of point projections. Default: 2
   */
  public void setMinImage(int value) {
    TasksJNI.AlignCameras_setMinImage(swigCPtr, this, value);
  }

  /**
   *  Minimum number of point projections. Default: 2
   */
  public int getMinImage() {
    return TasksJNI.AlignCameras_getMinImage(swigCPtr, this);
  }

  /**
   *  Reset current alignment. Default: false
   */
  public void setResetAlignment(boolean value) {
    TasksJNI.AlignCameras_setResetAlignment(swigCPtr, this, value);
  }

  /**
   *  Reset current alignment. Default: false
   */
  public boolean getResetAlignment() {
    return TasksJNI.AlignCameras_getResetAlignment(swigCPtr, this);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public void setSubdivideTask(boolean value) {
    TasksJNI.AlignCameras_setSubdivideTask(swigCPtr, this, value);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public boolean getSubdivideTask() {
    return TasksJNI.AlignCameras_getSubdivideTask(swigCPtr, this);
  }

}
