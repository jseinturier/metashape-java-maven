/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

import java.lang.AutoCloseable;
import java.util.Optional;
import java.util.Map;

/**
 * CameraGroup objects define groups of multiple cameras. The grouping is established by<br>
 * assignment of a CameraGroup instance to the Camera.group attribute of participating cameras.<br>
 * <br>
 * The type attribute of CameraGroup instances defines the effect of such grouping on processing<br>
 * results and can be set to Folder (no effect) or Station (coincident projection centers).
 */
public class CameraGroup implements AutoCloseable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CameraGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CameraGroup obj) {
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
        MetashapeJNI.delete_CameraGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  @Override
  public void close() {
    delete();
  }

  public CameraGroup(CameraGroup camera_group) {
    this(MetashapeJNI.new_CameraGroup(CameraGroup.getCPtr(camera_group), camera_group), true);
  }

  /**
   *  Camera group key.
   */
  public int getKey() {
    return MetashapeJNI.CameraGroup_getKey(swigCPtr, this);
  }

  /**
   *  Chunk container, may be null.
   */
  public Optional<Chunk> getChunk() {
    long ptr = MetashapeJNI.CameraGroup_getChunk(swigCPtr, this);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new Chunk(ptr, true));
  }

  /**
   *  Camera group type.
   */
  public void setGroupType(CameraGroup.GroupType type) {
    MetashapeJNI.CameraGroup_setGroupType(swigCPtr, this, type.ordinal());
  }

  /**
   *  Camera group type.
   */
  public CameraGroup.GroupType getGroupType() {
    return CameraGroup.GroupType.class.getEnumConstants()[MetashapeJNI.CameraGroup_getGroupType(swigCPtr, this)];
  }

  /**
   *  Camera group label.
   */
  public void setLabel(String label) {
    MetashapeJNI.CameraGroup_setLabel(swigCPtr, this, label);
  }

  /**
   *  Camera group label.
   */
  public String getLabel() {
    return MetashapeJNI.CameraGroup_getLabel(swigCPtr, this);
  }

  /**
   *  Current selection state.
   */
  public void setSelected(boolean state) {
    MetashapeJNI.CameraGroup_setSelected(swigCPtr, this, state);
  }

  /**
   *  Current selection state.
   */
  public boolean isSelected() {
    return MetashapeJNI.CameraGroup_isSelected(swigCPtr, this);
  }

  public enum GroupType {
    GroupTypeFolder,
    GroupTypeStation;
  }

}
