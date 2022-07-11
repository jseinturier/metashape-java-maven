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
public class ExportPoints extends Task {
  private transient long swigCPtr;

  protected ExportPoints(long cPtr, boolean cMemoryOwn) {
    super(TasksJNI.ExportPoints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExportPoints obj) {
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
        TasksJNI.delete_ExportPoints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExportPoints() {
    this(TasksJNI.new_ExportPoints(), true);
  }

  /**
   *  Enables/disables binary encoding for selected format (if applicable). Default: true
   */
  public void setBinary(boolean value) {
    TasksJNI.ExportPoints_setBinary(swigCPtr, this, value);
  }

  /**
   *  Enables/disables binary encoding for selected format (if applicable). Default: true
   */
  public boolean getBinary() {
    return TasksJNI.ExportPoints_getBinary(swigCPtr, this);
  }

  /**
   *  Block height in meters. Default: 1000.0
   */
  public void setBlockHeight(double value) {
    TasksJNI.ExportPoints_setBlockHeight(swigCPtr, this, value);
  }

  /**
   *  Block height in meters. Default: 1000.0
   */
  public double getBlockHeight() {
    return TasksJNI.ExportPoints_getBlockHeight(swigCPtr, this);
  }

  /**
   *  Block width in meters. Default: 1000.0
   */
  public void setBlockWidth(double value) {
    TasksJNI.ExportPoints_setBlockWidth(swigCPtr, this, value);
  }

  /**
   *  Block width in meters. Default: 1000.0
   */
  public double getBlockWidth() {
    return TasksJNI.ExportPoints_getBlockWidth(swigCPtr, this);
  }

  /**
   *  List of dense point classes to be exported.
   */
  public void setClasses(int[] value) {
    TasksJNI.ExportPoints_setClasses(swigCPtr, this, value);
  }

  /**
   *  List of dense point classes to be exported.
   */
  public int[] getClasses() { return TasksJNI.ExportPoints_getClasses(swigCPtr, this); }

  /**
   *  Clip point cloud to boundary shapes. Default: true
   */
  public void setClipToBoundary(boolean value) {
    TasksJNI.ExportPoints_setClipToBoundary(swigCPtr, this, value);
  }

  /**
   *  Clip point cloud to boundary shapes. Default: true
   */
  public boolean getClipToBoundary() {
    return TasksJNI.ExportPoints_getClipToBoundary(swigCPtr, this);
  }

  /**
   *  Convert colors to 8 bit RGB. Default: true
   */
  public void setColorsRgb8Bit(boolean value) {
    TasksJNI.ExportPoints_setColorsRgb8Bit(swigCPtr, this, value);
  }

  /**
   *  Convert colors to 8 bit RGB. Default: true
   */
  public boolean getColorsRgb8Bit() {
    return TasksJNI.ExportPoints_getColorsRgb8Bit(swigCPtr, this);
  }

  /**
   *  Optional comment (if supported by selected format).
   */
  public void setComment(String value) {
    TasksJNI.ExportPoints_setComment(swigCPtr, this, value);
  }

  /**
   *  Optional comment (if supported by selected format).
   */
  public String getComment() {
    return TasksJNI.ExportPoints_getComment(swigCPtr, this);
  }

  /**
   *  Enable compression (Cesium format only). Default: true
   */
  public void setCompression(boolean value) {
    TasksJNI.ExportPoints_setCompression(swigCPtr, this, value);
  }

  /**
   *  Enable compression (Cesium format only). Default: true
   */
  public boolean getCompression() {
    return TasksJNI.ExportPoints_getCompression(swigCPtr, this);
  }

  /**
   *  Output coordinate system.
   */
  public void setCRS(CoordinateSystem value) {
    TasksJNI.ExportPoints_setCRS(swigCPtr, this, CoordinateSystem.getCPtr(value), value);
  }

  /**
   *  Output coordinate system.
   */
  public CoordinateSystem getCRS() {
    return new CoordinateSystem(TasksJNI.ExportPoints_getCRS(swigCPtr, this), true);
  }

  /**
   *  Export format. Default: PointsFormat.PointsFormatNone
   */
  public void setFormat(PointsFormat value) {
    TasksJNI.ExportPoints_setFormat(swigCPtr, this, value.ordinal());
  }

  /**
   *  Export format. Default: PointsFormat.PointsFormatNone
   */
  public PointsFormat getFormat() {
    return PointsFormat.class.getEnumConstants()[TasksJNI.ExportPoints_getFormat(swigCPtr, this)];
  }

  /**
   *  Image data format. Default: ImageFormat.ImageFormatJPEG
   */
  public void setImageFormat(ImageFormat value) {
    TasksJNI.ExportPoints_setImageFormat(swigCPtr, this, value.ordinal());
  }

  /**
   *  Image data format. Default: ImageFormat.ImageFormatJPEG
   */
  public ImageFormat getImageFormat() {
    return ImageFormat.class.getEnumConstants()[TasksJNI.ExportPoints_getImageFormat(swigCPtr, this)];
  }

  /**
   *  Path to output file.
   */
  public void setPath(String value) {
    TasksJNI.ExportPoints_setPath(swigCPtr, this, value);
  }

  /**
   *  Path to output file.
   */
  public String getPath() {
    return TasksJNI.ExportPoints_getPath(swigCPtr, this);
  }

  /**
   *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
   */
  public void setRasterTransform(RasterTransformType value) {
    TasksJNI.ExportPoints_setRasterTransform(swigCPtr, this, value.ordinal());
  }

  /**
   *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
   */
  public RasterTransformType getRasterTransform() {
    return RasterTransformType.class.getEnumConstants()[TasksJNI.ExportPoints_getRasterTransform(swigCPtr, this)];
  }

  /**
   *  Region to be exported.
   */
  public void setRegion(BBox2d value) {
    TasksJNI.ExportPoints_setRegion(swigCPtr, this, BBox2d.getCPtr(value), value);
  }

  /**
   *  Region to be exported.
   */
  public BBox2d getRegion() {
    return new BBox2d(TasksJNI.ExportPoints_getRegion(swigCPtr, this), true);
  }

  /**
   *  Enables/disables export of point classes. Default: true
   */
  public void setSaveClasses(boolean value) {
    TasksJNI.ExportPoints_setSaveClasses(swigCPtr, this, value);
  }

  /**
   *  Enables/disables export of point classes. Default: true
   */
  public boolean getSaveClasses() {
    return TasksJNI.ExportPoints_getSaveClasses(swigCPtr, this);
  }

  /**
   *  Enables/disables export of point colors. Default: true
   */
  public void setSaveColors(boolean value) {
    TasksJNI.ExportPoints_setSaveColors(swigCPtr, this, value);
  }

  /**
   *  Enables/disables export of point colors. Default: true
   */
  public boolean getSaveColors() {
    return TasksJNI.ExportPoints_getSaveColors(swigCPtr, this);
  }

  /**
   *  Enable comment export. Default: true
   */
  public void setSaveComment(boolean value) {
    TasksJNI.ExportPoints_setSaveComment(swigCPtr, this, value);
  }

  /**
   *  Enable comment export. Default: true
   */
  public boolean getSaveComment() {
    return TasksJNI.ExportPoints_getSaveComment(swigCPtr, this);
  }

  /**
   *  Enables/disables export of point confidence. Default: true
   */
  public void setSaveConfidence(boolean value) {
    TasksJNI.ExportPoints_setSaveConfidence(swigCPtr, this, value);
  }

  /**
   *  Enables/disables export of point confidence. Default: true
   */
  public boolean getSaveConfidence() {
    return TasksJNI.ExportPoints_getSaveConfidence(swigCPtr, this);
  }

  /**
   *  Enable image export. Default: false
   */
  public void setSaveImages(boolean value) {
    TasksJNI.ExportPoints_setSaveImages(swigCPtr, this, value);
  }

  /**
   *  Enable image export. Default: false
   */
  public boolean getSaveImages() {
    return TasksJNI.ExportPoints_getSaveImages(swigCPtr, this);
  }

  /**
   *  Enables/disables export of point normals. Default: true
   */
  public void setSaveNormals(boolean value) {
    TasksJNI.ExportPoints_setSaveNormals(swigCPtr, this, value);
  }

  /**
   *  Enables/disables export of point normals. Default: true
   */
  public boolean getSaveNormals() {
    return TasksJNI.ExportPoints_getSaveNormals(swigCPtr, this);
  }

  /**
   *  Optional shift to be applied to point coordinates.
   */
  public void setShift(Vector3d value) {
    TasksJNI.ExportPoints_setShift(swigCPtr, this, Vector3d.getCPtr(value), value);
  }

  /**
   *  Optional shift to be applied to point coordinates.
   */
  public Vector3d getShift() {
    return new Vector3d(TasksJNI.ExportPoints_getShift(swigCPtr, this), true);
  }

  /**
   *  Selects between dense point cloud and sparse point cloud. If not specified, uses dense cloud if available. Default: DataSource.DenseCloudData
   */
  public void setSourceData(DataSource value) {
    TasksJNI.ExportPoints_setSourceData(swigCPtr, this, value.ordinal());
  }

  /**
   *  Selects between dense point cloud and sparse point cloud. If not specified, uses dense cloud if available. Default: DataSource.DenseCloudData
   */
  public DataSource getSourceData() {
    return DataSource.class.getEnumConstants()[TasksJNI.ExportPoints_getSourceData(swigCPtr, this)];
  }

  /**
   *  Enable tiled export. Default: false
   */
  public void setSplitInBlocks(boolean value) {
    TasksJNI.ExportPoints_setSplitInBlocks(swigCPtr, this, value);
  }

  /**
   *  Enable tiled export. Default: false
   */
  public boolean getSplitInBlocks() {
    return TasksJNI.ExportPoints_getSplitInBlocks(swigCPtr, this);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public void setSubdivideTask(boolean value) {
    TasksJNI.ExportPoints_setSubdivideTask(swigCPtr, this, value);
  }

  /**
   *  Enable fine-level task subdivision. Default: true
   */
  public boolean getSubdivideTask() {
    return TasksJNI.ExportPoints_getSubdivideTask(swigCPtr, this);
  }

  /**
   *  Default view.
   */
  public void setViewpoint(Viewpoint value) {
    TasksJNI.ExportPoints_setViewpoint(swigCPtr, this, Viewpoint.getCPtr(value), value);
  }

  /**
   *  Default view.
   */
  public Viewpoint getViewpoint() {
    return new Viewpoint(TasksJNI.ExportPoints_getViewpoint(swigCPtr, this), true);
  }

}
