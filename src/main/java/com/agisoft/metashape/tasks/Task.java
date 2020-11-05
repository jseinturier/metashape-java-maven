/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

public class Task {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Task(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Task obj) {
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
        TasksJNI.delete_Task(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Task(Task task) {
    this(TasksJNI.new_Task__SWIG_0(Task.getCPtr(task), task), true);
  }

  public Task(String name) {
    this(TasksJNI.new_Task__SWIG_1(name), true);
  }

  public String getName() {
    return TasksJNI.Task_getName(swigCPtr, this);
  }

  public void setParameter(String name, Variant value) {
    TasksJNI.Task_setParameter(swigCPtr, this, name, Variant.getCPtr(value), value);
  }

  public Variant getParameter(String name) {
    return new Variant(TasksJNI.Task_getParameter(swigCPtr, this, name), true);
  }

  public int getWorkitemCount() {
    return TasksJNI.Task_getWorkitemCount(swigCPtr, this);
  }

  public void setWorkitemCount(int count) {
    TasksJNI.Task_setWorkitemCount(swigCPtr, this, count);
  }

  public void apply(Chunk chunk, Progress progress) {
    TasksJNI.Task_apply__SWIG_0(swigCPtr, this, Chunk.getCPtr(chunk), chunk, progress);
  }

  public void apply(Document doc, Progress progress) {
    TasksJNI.Task_apply__SWIG_1(swigCPtr, this, Document.getCPtr(doc), doc, progress);
  }

}
