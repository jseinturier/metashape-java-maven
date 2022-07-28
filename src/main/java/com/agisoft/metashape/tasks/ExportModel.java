package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportModel extends Task {

	public ExportModel() {
		super("ExportModel");
	}

	/**
	 *  Enables/disables binary encoding (if supported by format).
	 */
	public void setBinary(boolean value) {
		setParameter("binary", (Object) value);
	}

	/**
	 *  Enables/disables binary encoding (if supported by format).
	 */
	public boolean getBinary() {
		return (boolean) getParameter("binary");
	}

	/**
	 *  Clip model to boundary shapes.
	 */
	public void setClipToBoundary(boolean value) {
		setParameter("clip_to_boundary", (Object) value);
	}

	/**
	 *  Clip model to boundary shapes.
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
	 *  Embeds texture inside the model file (if supported by format).
	 */
	public void setEmbedTexture(boolean value) {
		setParameter("embed_texture", (Object) value);
	}

	/**
	 *  Embeds texture inside the model file (if supported by format).
	 */
	public boolean getEmbedTexture() {
		return (boolean) getParameter("embed_texture");
	}

	/**
	 *  Export format. Default: ModelFormat.ModelFormatNone
	 */
	public void setFormat(ModelFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Export format. Default: ModelFormat.ModelFormatNone
	 */
	public ModelFormat getFormat() {
		return (ModelFormat) getParameter("format");
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
	 *  Number of digits after the decimal point (for text formats). Default: 6
	 */
	public void setPrecision(int value) {
		setParameter("precision", (Object) value);
	}

	/**
	 *  Number of digits after the decimal point (for text formats). Default: 6
	 */
	public int getPrecision() {
		return (int) getParameter("precision");
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
	 *  Enables/disables alpha channel export.
	 */
	public void setSaveAlpha(boolean value) {
		setParameter("save_alpha", (Object) value);
	}

	/**
	 *  Enables/disables alpha channel export.
	 */
	public boolean getSaveAlpha() {
		return (boolean) getParameter("save_alpha");
	}

	/**
	 *  Enables/disables camera export.
	 */
	public void setSaveCameras(boolean value) {
		setParameter("save_cameras", (Object) value);
	}

	/**
	 *  Enables/disables camera export.
	 */
	public boolean getSaveCameras() {
		return (boolean) getParameter("save_cameras");
	}

	/**
	 *  Enables/disables export of vertex colors.
	 */
	public void setSaveColors(boolean value) {
		setParameter("save_colors", (Object) value);
	}

	/**
	 *  Enables/disables export of vertex colors.
	 */
	public boolean getSaveColors() {
		return (boolean) getParameter("save_colors");
	}

	/**
	 *  Enables/disables comment export.
	 */
	public void setSaveComment(boolean value) {
		setParameter("save_comment", (Object) value);
	}

	/**
	 *  Enables/disables comment export.
	 */
	public boolean getSaveComment() {
		return (boolean) getParameter("save_comment");
	}

	/**
	 *  Enables/disables export of vertex confidence.
	 */
	public void setSaveConfidence(boolean value) {
		setParameter("save_confidence", (Object) value);
	}

	/**
	 *  Enables/disables export of vertex confidence.
	 */
	public boolean getSaveConfidence() {
		return (boolean) getParameter("save_confidence");
	}

	/**
	 *  Enables/disables marker export.
	 */
	public void setSaveMarkers(boolean value) {
		setParameter("save_markers", (Object) value);
	}

	/**
	 *  Enables/disables marker export.
	 */
	public boolean getSaveMarkers() {
		return (boolean) getParameter("save_markers");
	}

	/**
	 *  Enables/disables export of vertex normals.
	 */
	public void setSaveNormals(boolean value) {
		setParameter("save_normals", (Object) value);
	}

	/**
	 *  Enables/disables export of vertex normals.
	 */
	public boolean getSaveNormals() {
		return (boolean) getParameter("save_normals");
	}

	/**
	 *  Enables/disables texture export.
	 */
	public void setSaveTexture(boolean value) {
		setParameter("save_texture", (Object) value);
	}

	/**
	 *  Enables/disables texture export.
	 */
	public boolean getSaveTexture() {
		return (boolean) getParameter("save_texture");
	}

	/**
	 *  Enables/disables UDIM texture layout.
	 */
	public void setSaveUdim(boolean value) {
		setParameter("save_udim", (Object) value);
	}

	/**
	 *  Enables/disables UDIM texture layout.
	 */
	public boolean getSaveUdim() {
		return (boolean) getParameter("save_udim");
	}

	/**
	 *  Enables/disables uv coordinates export.
	 */
	public void setSaveUv(boolean value) {
		setParameter("save_uv", (Object) value);
	}

	/**
	 *  Enables/disables uv coordinates export.
	 */
	public boolean getSaveUv() {
		return (boolean) getParameter("save_uv");
	}

	/**
	 *  Optional shift to be applied to vertex coordinates.
	 */
	public void setShift(Vector value) {
		setParameter("shift", (Object) value);
	}

	/**
	 *  Optional shift to be applied to vertex coordinates.
	 */
	public Vector getShift() {
		return (Vector) getParameter("shift");
	}

	/**
	 *  Strips camera label extensions during export.
	 */
	public void setStripExtensions(boolean value) {
		setParameter("strip_extensions", (Object) value);
	}

	/**
	 *  Strips camera label extensions during export.
	 */
	public boolean getStripExtensions() {
		return (boolean) getParameter("strip_extensions");
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
