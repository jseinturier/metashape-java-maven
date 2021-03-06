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
public class ExportMarkers extends Task {
  private transient long swigCPtr;

  protected ExportMarkers(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.ExportMarkers_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExportMarkers obj) {
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
        TasksJNI.delete_ExportMarkers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExportMarkers() {
    this(TasksJNI.new_ExportMarkers(), true);
  }

  /**
   *  Enables/disables binary encoding for selected format (if applicable). Default: false
   */
  public void setBinary(boolean value) {
    TasksJNI.ExportMarkers_setBinary(swigCPtr, this, value);
  }

  /**
   *  Enables/disables binary encoding for selected format (if applicable). Default: false
   */
  public boolean getBinary() {
    return TasksJNI.ExportMarkers_getBinary(swigCPtr, this);
  }

  /**
   *  Output coordinate system.
   */
  public void setCRS(CoordinateSystem value) {
    TasksJNI.ExportMarkers_setCRS(swigCPtr, this, CoordinateSystem.getCPtr(value), value);
  }

  /**
   *  Output coordinate system.
   */
  public CoordinateSystem getCRS() {
    return new CoordinateSystem(TasksJNI.ExportMarkers_getCRS(swigCPtr, this), true);
  }

  /**
   *  Path to output file.
   */
  public void setPath(String value) {
    TasksJNI.ExportMarkers_setPath(swigCPtr, this, value);
  }

  /**
   *  Path to output file.
   */
  public String getPath() {
    return TasksJNI.ExportMarkers_getPath(swigCPtr, this);
  }

}
