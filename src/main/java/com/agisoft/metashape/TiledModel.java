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
 * Tiled model.
 */
public class TiledModel implements AutoCloseable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TiledModel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TiledModel obj) {
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
        MetashapeJNI.delete_TiledModel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  @Override
  public void close() {
    delete();
  }

  public TiledModel(TiledModel tiled_model) {
    this(MetashapeJNI.new_TiledModel(TiledModel.getCPtr(tiled_model), tiled_model), true);
  }

  /**
   *  Tiled model identifier.
   */
  public int getKey() {
    return MetashapeJNI.TiledModel_getKey(swigCPtr, this);
  }

  /**
   *  Chunk container, may be null.
   */
  public Optional<Chunk> getChunk() {
    long ptr = MetashapeJNI.TiledModel_getChunk(swigCPtr, this);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new Chunk(ptr, true));
  }

  /**
   *  Tiled model label.
   */
  public void setLabel(String label) {
    MetashapeJNI.TiledModel_setLabel(swigCPtr, this, label);
  }

  /**
   *  Tiled model label.
   */
  public String getLabel() {
    return MetashapeJNI.TiledModel_getLabel(swigCPtr, this);
  }

  /**
   *  Path to tiled model file.
   */
  public String getPath() {
    return MetashapeJNI.TiledModel_getPath(swigCPtr, this);
  }

  /**
   *  Tiled model meta data.
   */
  public void setMeta(Map<String,String> meta) {
    MetashapeJNI.TiledModel_setMeta(swigCPtr, this, meta);
  }

  /**
   *  Tiled model meta data.
   */
  public Map<String,String> getMeta() { return MetashapeJNI.TiledModel_getMeta(swigCPtr, this); }

  /**
   *  4x4 tiled model transformation matrix.
   */
  public void setTransform(Matrix transform) {
    MetashapeJNI.TiledModel_setTransform(swigCPtr, this, transform);
  }

  /**
   *  4x4 tiled model transformation matrix.
   */
  public Matrix getTransform() { return MetashapeJNI.TiledModel_getTransform(swigCPtr, this); }

  /**
   *  Reference coordinate system, may be null.
   */
  public void setCoordinateSystem(Optional<CoordinateSystem> crs) {
    MetashapeJNI.TiledModel_setCoordinateSystem(swigCPtr, this, crs.isPresent() ? CoordinateSystem.getCPtr(crs.get()) : 0);
  }

  /**
   *  Reference coordinate system, may be null.
   */
  public Optional<CoordinateSystem> getCoordinateSystem() {
    long ptr = MetashapeJNI.TiledModel_getCoordinateSystem(swigCPtr, this);
    if (ptr == 0)
        return Optional.empty();
    return Optional.of(new CoordinateSystem(ptr, true));
  }

  /**
   * Returns ray intersection with the tiled model.<br>
   * @param origin Ray origin.<br>
   * @param target Point on the ray.<br>
   * @return Coordinates of the intersection point, may be null.
   */
  public Optional<Vector> pickPoint(Vector origin, Vector target) {
	Vector values = MetashapeJNI.TiledModel_pickPoint(swigCPtr, this, origin, target);
	return values == null ? Optional.empty() : Optional.of(values); }

  /**
   * Generate tiled model preview image.<br>
   * @param width Preview image width.<br>
   * @param height Preview image height.<br>
   * @param transform 4x4 viewpoint transformation matrix.<br>
   * @return Preview image.
   */
  public Image renderPreview(long width, long height, Matrix transform, Progress progress) {
    return new Image(MetashapeJNI.TiledModel_renderPreview(swigCPtr, this, width, height, transform, progress), true);
  }

}
