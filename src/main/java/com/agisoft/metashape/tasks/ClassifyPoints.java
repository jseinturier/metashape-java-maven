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
public class ClassifyPoints extends Task {
  private transient long swigCPtr;

  protected ClassifyPoints(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.ClassifyPoints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClassifyPoints obj) {
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
        TasksJNI.delete_ClassifyPoints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ClassifyPoints() {
    this(TasksJNI.new_ClassifyPoints(), true);
  }

  /**
   *  Required confidence level. Default: 0.0
   */
  public void setConfidence(double value) {
    TasksJNI.ClassifyPoints_setConfidence(swigCPtr, this, value);
  }

  /**
   *  Required confidence level. Default: 0.0
   */
  public double getConfidence() {
    return TasksJNI.ClassifyPoints_getConfidence(swigCPtr, this);
  }

  /**
   *  Class of points to be re-classified. Default: -1
   */
  public void setSourceClass(int value) {
    TasksJNI.ClassifyPoints_setSourceClass(swigCPtr, this, value);
  }

  /**
   *  Class of points to be re-classified. Default: -1
   */
  public int getSourceClass() {
    return TasksJNI.ClassifyPoints_getSourceClass(swigCPtr, this);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public void setSubdivideTask(boolean value) {
    TasksJNI.ClassifyPoints_setSubdivideTask(swigCPtr, this, value);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public boolean getSubdivideTask() {
    return TasksJNI.ClassifyPoints_getSubdivideTask(swigCPtr, this);
  }

  /**
   *  Target point classes for classification.
   */
  public void setTargetClasses(int[] value) {
    TasksJNI.ClassifyPoints_setTargetClasses(swigCPtr, this, value);
  }

  /**
   *  Target point classes for classification.
   */
  public int[] getTargetClasses() { return TasksJNI.ClassifyPoints_getTargetClasses(swigCPtr, this); }

}
