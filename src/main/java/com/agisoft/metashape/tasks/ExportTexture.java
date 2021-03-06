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
public class ExportTexture extends Task {
  private transient long swigCPtr;

  protected ExportTexture(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.ExportTexture_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExportTexture obj) {
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
        TasksJNI.delete_ExportTexture(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExportTexture() {
    this(TasksJNI.new_ExportTexture(), true);
  }

  /**
   *  Path to output file.
   */
  public void setPath(String value) {
    TasksJNI.ExportTexture_setPath(swigCPtr, this, value);
  }

  /**
   *  Path to output file.
   */
  public String getPath() {
    return TasksJNI.ExportTexture_getPath(swigCPtr, this);
  }

  /**
   *  Enable alpha channel export. Default: false
   */
  public void setSaveAlpha(boolean value) {
    TasksJNI.ExportTexture_setSaveAlpha(swigCPtr, this, value);
  }

  /**
   *  Enable alpha channel export. Default: false
   */
  public boolean getSaveAlpha() {
    return TasksJNI.ExportTexture_getSaveAlpha(swigCPtr, this);
  }

  /**
   *  Texture type. Default: Model.TextureType.DiffuseMap
   */
  public void setTextureType(Model.TextureType value) {
    TasksJNI.ExportTexture_setTextureType(swigCPtr, this, value.ordinal());
  }

  /**
   *  Texture type. Default: Model.TextureType.DiffuseMap
   */
  public Model.TextureType getTextureType() {
    return Model.TextureType.class.getEnumConstants()[TasksJNI.ExportTexture_getTextureType(swigCPtr, this)];
  }

}
