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
public class ExportReport extends Task {
  private transient long swigCPtr;

  protected ExportReport(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.ExportReport_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExportReport obj) {
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
        TasksJNI.delete_ExportReport(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExportReport() {
    this(TasksJNI.new_ExportReport(), true);
  }

  /**
   *  Report description.
   */
  public void setDescription(String value) {
    TasksJNI.ExportReport_setDescription(swigCPtr, this, value);
  }

  /**
   *  Report description.
   */
  public String getDescription() {
    return TasksJNI.ExportReport_getDescription(swigCPtr, this);
  }

  /**
   *  Include system information. Default: true
   */
  public void setIncludeSystemInfo(boolean value) {
    TasksJNI.ExportReport_setIncludeSystemInfo(swigCPtr, this, value);
  }

  /**
   *  Include system information. Default: true
   */
  public boolean getIncludeSystemInfo() {
    return TasksJNI.ExportReport_getIncludeSystemInfo(swigCPtr, this);
  }

  /**
   *  Enable page numbers. Default: true
   */
  public void setPageNumbers(boolean value) {
    TasksJNI.ExportReport_setPageNumbers(swigCPtr, this, value);
  }

  /**
   *  Enable page numbers. Default: true
   */
  public boolean getPageNumbers() {
    return TasksJNI.ExportReport_getPageNumbers(swigCPtr, this);
  }

  /**
   *  Path to output report.
   */
  public void setPath(String value) {
    TasksJNI.ExportReport_setPath(swigCPtr, this, value);
  }

  /**
   *  Path to output report.
   */
  public String getPath() {
    return TasksJNI.ExportReport_getPath(swigCPtr, this);
  }

  /**
   *  Report title.
   */
  public void setTitle(String value) {
    TasksJNI.ExportReport_setTitle(swigCPtr, this, value);
  }

  /**
   *  Report title.
   */
  public String getTitle() {
    return TasksJNI.ExportReport_getTitle(swigCPtr, this);
  }

  /**
   *  A list of user defined settings to include on the Processing Parameters page.
   */
  public void setUserSettings(Property[] value) {
    TasksJNI.ExportReport_setUserSettings(swigCPtr, this, Property.cArrayUnwrap(value));
  }

  /**
   *  A list of user defined settings to include on the Processing Parameters page.
   */
  public Property[] getUserSettings() { return Property.cArrayWrap(TasksJNI.ExportReport_getUserSettings(swigCPtr, this), true); }

}
