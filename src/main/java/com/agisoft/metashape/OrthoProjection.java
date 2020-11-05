/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class OrthoProjection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public OrthoProjection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(OrthoProjection obj) {
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
        MetashapeJNI.delete_OrthoProjection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OrthoProjection() {
    this(MetashapeJNI.new_OrthoProjection__SWIG_0(), true);
  }

  public OrthoProjection(OrthoProjection crs) {
    this(MetashapeJNI.new_OrthoProjection__SWIG_1(OrthoProjection.getCPtr(crs), crs), true);
  }

  public String getAuthority() {
    return MetashapeJNI.OrthoProjection_getAuthority(swigCPtr, this);
  }

  public String getWkt() {
    return MetashapeJNI.OrthoProjection_getWkt(swigCPtr, this);
  }

  public String getProj4() {
    return MetashapeJNI.OrthoProjection_getProj4(swigCPtr, this);
  }

  public boolean init(String wkt) {
    return MetashapeJNI.OrthoProjection_init(swigCPtr, this, wkt);
  }

  public Vector3d project(Vector3d pt) {
    return new Vector3d(MetashapeJNI.OrthoProjection_project(swigCPtr, this, Vector3d.getCPtr(pt), pt), true);
  }

  public Vector3d unproject(Vector3d pt) {
    return new Vector3d(MetashapeJNI.OrthoProjection_unproject(swigCPtr, this, Vector3d.getCPtr(pt), pt), true);
  }

  public Matrix4x4d localframe(Vector3d pt) {
    return new Matrix4x4d(MetashapeJNI.OrthoProjection_localframe(swigCPtr, this, Vector3d.getCPtr(pt), pt), true);
  }

  /**
   * Transform point coordinates between coordinate systems.<br>
   * @param point Point coordinates.<br>
   * @param source Source coordinate system.<br>
   * @param target Target coordinate system.<br>
   * @return Transformed point coordinates.
   */
  public static Vector3d transform(Vector3d point, OrthoProjection source, OrthoProjection target) {
    return new Vector3d(MetashapeJNI.OrthoProjection_transform(Vector3d.getCPtr(point), point, OrthoProjection.getCPtr(source), source, OrthoProjection.getCPtr(target), target), true);
  }

}
