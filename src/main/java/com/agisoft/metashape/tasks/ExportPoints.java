package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportPoints extends Task {

	public ExportPoints() {
		super("ExportPoints");
	}

	/**
	 *  Enables/disables binary encoding for selected format (if applicable).
	 */
	public void setBinary(boolean value) {
		setParameter("binary", (Object) value);
	}

	/**
	 *  Enables/disables binary encoding for selected format (if applicable).
	 */
	public boolean getBinary() {
		return (boolean) getParameter("binary");
	}

	/**
	 *  Block height in meters. Default: 1000.0
	 */
	public void setBlockHeight(double value) {
		setParameter("block_height", (Object) value);
	}

	/**
	 *  Block height in meters. Default: 1000.0
	 */
	public double getBlockHeight() {
		return (double) getParameter("block_height");
	}

	/**
	 *  Block width in meters. Default: 1000.0
	 */
	public void setBlockWidth(double value) {
		setParameter("block_width", (Object) value);
	}

	/**
	 *  Block width in meters. Default: 1000.0
	 */
	public double getBlockWidth() {
		return (double) getParameter("block_width");
	}

	/**
	 *  List of dense point classes to be exported.
	 */
	public void setClasses(int[] value) {
		setParameter("classes", (Object) value);
	}

	/**
	 *  List of dense point classes to be exported.
	 */
	public int[] getClasses() {
		return (int[]) getParameter("classes");
	}

	/**
	 *  Clip point cloud to boundary shapes.
	 */
	public void setClipToBoundary(boolean value) {
		setParameter("clip_to_boundary", (Object) value);
	}

	/**
	 *  Clip point cloud to boundary shapes.
	 */
	public boolean getClipToBoundary() {
		return (boolean) getParameter("clip_to_boundary");
	}

	/**
	 *  Convert colors to 8 bit RGB.
	 */
	public void setColorsRgb8Bit(boolean value) {
		setParameter("colors_rgb_8bit", (Object) value);
	}

	/**
	 *  Convert colors to 8 bit RGB.
	 */
	public boolean getColorsRgb8Bit() {
		return (boolean) getParameter("colors_rgb_8bit");
	}

	/**
	 *  Optional comment (if supported by selected format).
	 */
	public void setComment(String value) {
		setParameter("comment", (Object) value);
	}

	/**
	 *  Optional comment (if supported by selected format).
	 */
	public String getComment() {
		return (String) getParameter("comment");
	}

	/**
	 *  Enable compression (Cesium format only).
	 */
	public void setCompression(boolean value) {
		setParameter("compression", (Object) value);
	}

	/**
	 *  Enable compression (Cesium format only).
	 */
	public boolean getCompression() {
		return (boolean) getParameter("compression");
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
	 *  Export format. Default: PointsFormat.PointsFormatNone
	 */
	public void setFormat(PointsFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Export format. Default: PointsFormat.PointsFormatNone
	 */
	public PointsFormat getFormat() {
		return (PointsFormat) getParameter("format");
	}

	/**
	 *  Image data format. Default: ImageFormat.ImageFormatJPEG
	 */
	public void setImageFormat(ImageFormat value) {
		setParameter("image_format", (Object) value);
	}

	/**
	 *  Image data format. Default: ImageFormat.ImageFormatJPEG
	 */
	public ImageFormat getImageFormat() {
		return (ImageFormat) getParameter("image_format");
	}

	/**
	 *  Path to output file.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to output file.
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
	 *  Region to be exported.
	 */
	public void setRegion(BBox value) {
		setParameter("region", (Object) value);
	}

	/**
	 *  Region to be exported.
	 */
	public BBox getRegion() {
		return (BBox) getParameter("region");
	}

	/**
	 *  Enables/disables export of point classes.
	 */
	public void setSaveClasses(boolean value) {
		setParameter("save_classes", (Object) value);
	}

	/**
	 *  Enables/disables export of point classes.
	 */
	public boolean getSaveClasses() {
		return (boolean) getParameter("save_classes");
	}

	/**
	 *  Enables/disables export of point colors.
	 */
	public void setSaveColors(boolean value) {
		setParameter("save_colors", (Object) value);
	}

	/**
	 *  Enables/disables export of point colors.
	 */
	public boolean getSaveColors() {
		return (boolean) getParameter("save_colors");
	}

	/**
	 *  Enable comment export.
	 */
	public void setSaveComment(boolean value) {
		setParameter("save_comment", (Object) value);
	}

	/**
	 *  Enable comment export.
	 */
	public boolean getSaveComment() {
		return (boolean) getParameter("save_comment");
	}

	/**
	 *  Enables/disables export of point confidence.
	 */
	public void setSaveConfidence(boolean value) {
		setParameter("save_confidence", (Object) value);
	}

	/**
	 *  Enables/disables export of point confidence.
	 */
	public boolean getSaveConfidence() {
		return (boolean) getParameter("save_confidence");
	}

	/**
	 *  Enable image export.
	 */
	public void setSaveImages(boolean value) {
		setParameter("save_images", (Object) value);
	}

	/**
	 *  Enable image export.
	 */
	public boolean getSaveImages() {
		return (boolean) getParameter("save_images");
	}

	/**
	 *  Enables/disables export of point normals.
	 */
	public void setSaveNormals(boolean value) {
		setParameter("save_normals", (Object) value);
	}

	/**
	 *  Enables/disables export of point normals.
	 */
	public boolean getSaveNormals() {
		return (boolean) getParameter("save_normals");
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
	 *  Optional shift to be applied to point coordinates.
	 */
	public void setShift(Vector value) {
		setParameter("shift", (Object) value);
	}

	/**
	 *  Optional shift to be applied to point coordinates.
	 */
	public Vector getShift() {
		return (Vector) getParameter("shift");
	}

	/**
	 *  Selects between dense point cloud and tie points. If not specified, uses dense cloud if available. Default: DataSource.DenseCloudData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Selects between dense point cloud and tie points. If not specified, uses dense cloud if available. Default: DataSource.DenseCloudData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
	}

	/**
	 *  Enable tiled export.
	 */
	public void setSplitInBlocks(boolean value) {
		setParameter("split_in_blocks", (Object) value);
	}

	/**
	 *  Enable tiled export.
	 */
	public boolean getSplitInBlocks() {
		return (boolean) getParameter("split_in_blocks");
	}

	/**
	 *  Enable fine-level task subdivision.
	 */
	public void setSubdivideTask(boolean value) {
		setParameter("subdivide_task", (Object) value);
	}

	/**
	 *  Enable fine-level task subdivision.
	 */
	public boolean getSubdivideTask() {
		return (boolean) getParameter("subdivide_task");
	}

	/**
	 *  Default view.
	 */
	public void setViewpoint(Viewpoint value) {
		setParameter("viewpoint", (Object) value);
	}

	/**
	 *  Default view.
	 */
	public Viewpoint getViewpoint() {
		return (Viewpoint) getParameter("viewpoint");
	}

}
