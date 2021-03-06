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
public class ImportCameras extends Task {
  private transient long swigCPtr;

  protected ImportCameras(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.ImportCameras_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImportCameras obj) {
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
        TasksJNI.delete_ImportCameras(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ImportCameras() {
    this(TasksJNI.new_ImportCameras(), true);
  }

  /**
   *  Ground coordinate system.
   */
  public void setCRS(CoordinateSystem value) {
    TasksJNI.ImportCameras_setCRS(swigCPtr, this, CoordinateSystem.getCPtr(value), value);
  }

  /**
   *  Ground coordinate system.
   */
  public CoordinateSystem getCRS() {
    return new CoordinateSystem(TasksJNI.ImportCameras_getCRS(swigCPtr, this), true);
  }

  /**
   *  File format. Default: CamerasFormat.CamerasFormatXML
   */
  public void setFormat(CamerasFormat value) {
    TasksJNI.ImportCameras_setFormat(swigCPtr, this, value.ordinal());
  }

  /**
   *  File format. Default: CamerasFormat.CamerasFormatXML
   */
  public CamerasFormat getFormat() {
    return CamerasFormat.class.getEnumConstants()[TasksJNI.ImportCameras_getFormat(swigCPtr, this)];
  }

  /**
   *  Path to image list file (Bundler format only).
   */
  public void setImageList(String value) {
    TasksJNI.ImportCameras_setImageList(swigCPtr, this, value);
  }

  /**
   *  Path to image list file (Bundler format only).
   */
  public String getImageList() {
    return TasksJNI.ImportCameras_getImageList(swigCPtr, this);
  }

  /**
   *  Image coordinate system (0 - X right, 1 - X up, 2 - X left, 3 - X down). Default: 0
   */
  public void setImageOrientation(int value) {
    TasksJNI.ImportCameras_setImageOrientation(swigCPtr, this, value);
  }

  /**
   *  Image coordinate system (0 - X right, 1 - X up, 2 - X left, 3 - X down). Default: 0
   */
  public int getImageOrientation() {
    return TasksJNI.ImportCameras_getImageOrientation(swigCPtr, this);
  }

  /**
   *  Enable Bundler image list import. Default: false
   */
  public void setLoadImageList(boolean value) {
    TasksJNI.ImportCameras_setLoadImageList(swigCPtr, this, value);
  }

  /**
   *  Enable Bundler image list import. Default: false
   */
  public boolean getLoadImageList() {
    return TasksJNI.ImportCameras_getLoadImageList(swigCPtr, this);
  }

  /**
   *  Path to the file.
   */
  public void setPath(String value) {
    TasksJNI.ImportCameras_setPath(swigCPtr, this, value);
  }

  /**
   *  Path to the file.
   */
  public String getPath() {
    return TasksJNI.ImportCameras_getPath(swigCPtr, this);
  }

}
