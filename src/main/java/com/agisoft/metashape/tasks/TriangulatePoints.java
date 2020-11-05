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
public class TriangulatePoints extends Task {
  private transient long swigCPtr;

  protected TriangulatePoints(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.TriangulatePoints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TriangulatePoints obj) {
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
        TasksJNI.delete_TriangulatePoints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TriangulatePoints() {
    this(TasksJNI.new_TriangulatePoints(), true);
  }

  /**
   *  Reprojection error threshold. Default: 10.0
   */
  public void setMaxError(double value) {
    TasksJNI.TriangulatePoints_setMaxError(swigCPtr, this, value);
  }

  /**
   *  Reprojection error threshold. Default: 10.0
   */
  public double getMaxError() {
    return TasksJNI.TriangulatePoints_getMaxError(swigCPtr, this);
  }

  /**
   *  Minimum number of point projections. Default: 2
   */
  public void setMinImage(int value) {
    TasksJNI.TriangulatePoints_setMinImage(swigCPtr, this, value);
  }

  /**
   *  Minimum number of point projections. Default: 2
   */
  public int getMinImage() {
    return TasksJNI.TriangulatePoints_getMinImage(swigCPtr, this);
  }

}
