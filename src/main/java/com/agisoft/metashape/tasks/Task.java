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

  /**
   *  Task name.
   */
  public String getName() {
    return TasksJNI.Task_getName(swigCPtr, this);
  }

  /**
   *  List of configured parameter names.
   */
  public String[] getParameterNames() { return TasksJNI.Task_getParameterNames(swigCPtr, this); }

  /**
   * Set parameter value.
   */
  public void setParameter(String name, Variant value) {
    TasksJNI.Task_setParameter(swigCPtr, this, name, Variant.getCPtr(value), value);
  }

  /**
   * Get parameter value.
   */
  public Variant getParameter(String name) {
    return new Variant(TasksJNI.Task_getParameter(swigCPtr, this, name), true);
  }

  /**
   *  Task target.
   */
  public Task.TaskTarget getTarget() {
    return Task.TaskTarget.class.getEnumConstants()[TasksJNI.Task_getTarget(swigCPtr, this)];
  }

  /**
   *  GPU supported flag.
   */
  public boolean isGPUSupported() {
    return TasksJNI.Task_isGPUSupported(swigCPtr, this);
  }

  /**
   *  Workitem count.
   */
  public int getWorkitemCount() {
    return TasksJNI.Task_getWorkitemCount(swigCPtr, this);
  }

  /**
   *  Workitem count.
   */
  public void setWorkitemCount(int count) {
    TasksJNI.Task_setWorkitemCount(swigCPtr, this, count);
  }

  /**
   * Convert task to NetworkTask.
   */
  public NetworkTask toNetworkTask() {
    return new NetworkTask(TasksJNI.Task_toNetworkTask__SWIG_0(swigCPtr, this), true);
  }

  /**
   * Convert task to NetworkTask to be applied to the chunk.
   */
  public NetworkTask toNetworkTask(Chunk chunk) {
    return new NetworkTask(TasksJNI.Task_toNetworkTask__SWIG_1(swigCPtr, this, Chunk.getCPtr(chunk), chunk), true);
  }

  /**
   * Convert task to NetworkTask to be applied to the list of chunks.
   */
  public NetworkTask toNetworkTask(Chunk[] chunks) {
    return new NetworkTask(TasksJNI.Task_toNetworkTask__SWIG_2(swigCPtr, this, Chunk.cArrayUnwrap(chunks)), true);
  }

  /**
   * Convert task to NetworkTask to be applied to the whole project.
   */
  public NetworkTask toNetworkTask(Document doc) {
    return new NetworkTask(TasksJNI.Task_toNetworkTask__SWIG_3(swigCPtr, this, Document.getCPtr(doc), doc), true);
  }

  /**
   * Apply task to chunk.
   */
  public void apply(Chunk chunk, Progress progress) {
    TasksJNI.Task_apply__SWIG_0(swigCPtr, this, Chunk.getCPtr(chunk), chunk, progress);
  }

  /**
   * Apply task to document.
   */
  public void apply(Document doc, Progress progress) {
    TasksJNI.Task_apply__SWIG_1(swigCPtr, this, Document.getCPtr(doc), doc, progress);
  }

  public enum TaskTarget {
    DocumentTarget,
    ChunkTarget,
    FrameTarget;
  }

}
