package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportTiledModel extends Task {

	public ExportTiledModel() {
		super("ExportTiledModel");
	}

	/**
	 *  Clip tiled model to boundary shapes.
	 */
	public void setClipToBoundary(boolean value) {
		setParameter("clip_to_boundary", (Object) value);
	}

	/**
	 *  Clip tiled model to boundary shapes.
	 */
	public boolean getClipToBoundary() {
		return (boolean) getParameter("clip_to_boundary");
	}

	/**
	 *  Output coordinate system.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Output coordinate system.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  Tileset subdivision depth (Cesium format only). Default: 5
	 */
	public void setFolderDepth(int value) {
		setParameter("folder_depth", (Object) value);
	}

	/**
	 *  Tileset subdivision depth (Cesium format only). Default: 5
	 */
	public int getFolderDepth() {
		return (int) getParameter("folder_depth");
	}

	/**
	 *  Export format. Default: TiledModelFormat.TiledModelFormatNone
	 */
	public void setFormat(TiledModelFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Export format. Default: TiledModelFormat.TiledModelFormatNone
	 */
	public TiledModelFormat getFormat() {
		return (TiledModelFormat) getParameter("format");
	}

	/**
	 *  Image compression parameters.
	 */
	public void setImageCompression(ImageCompression value) {
		setParameter("image_compression", (Object) value);
	}

	/**
	 *  Image compression parameters.
	 */
	public ImageCompression getImageCompression() {
		return (ImageCompression) getParameter("image_compression");
	}

	/**
	 *  Enable mesh compression (Cesium format only).
	 */
	public void setModelCompression(boolean value) {
		setParameter("model_compression", (Object) value);
	}

	/**
	 *  Enable mesh compression (Cesium format only).
	 */
	public boolean getModelCompression() {
		return (boolean) getParameter("model_compression");
	}

	/**
	 *  Model format for zip export. Default: ModelFormat.ModelFormatCOLLADA
	 */
	public void setModelFormat(ModelFormat value) {
		setParameter("model_format", (Object) value);
	}

	/**
	 *  Model format for zip export. Default: ModelFormat.ModelFormatCOLLADA
	 */
	public ModelFormat getModelFormat() {
		return (ModelFormat) getParameter("model_format");
	}

	/**
	 *  Path to output model.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to output model.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
	 */
	public void setRasterTransform(RasterTransformType value) {
		setParameter("raster_transform", (Object) value);
	}

	/**
	 *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
	 */
	public RasterTransformType getRasterTransform() {
		return (RasterTransformType) getParameter("raster_transform");
	}

	/**
	 *  Target screen space error (Cesium format only). Default: 16.0
	 */
	public void setScreenSpaceError(double value) {
		setParameter("screen_space_error", (Object) value);
	}

	/**
	 *  Target screen space error (Cesium format only). Default: 16.0
	 */
	public double getScreenSpaceError() {
		return (double) getParameter("screen_space_error");
	}

	/**
	 *  Texture format. Default: ImageFormat.ImageFormatJPEG
	 */
	public void setTextureFormat(ImageFormat value) {
		setParameter("texture_format", (Object) value);
	}

	/**
	 *  Texture format. Default: ImageFormat.ImageFormatJPEG
	 */
	public ImageFormat getTextureFormat() {
		return (ImageFormat) getParameter("texture_format");
	}

}
