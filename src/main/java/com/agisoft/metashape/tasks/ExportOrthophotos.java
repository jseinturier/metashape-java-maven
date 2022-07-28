package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportOrthophotos extends Task {

	public ExportOrthophotos() {
		super("ExportOrthophotos");
	}

	/**
	 *  List of cameras to process.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  List of cameras to process.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
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
	 *  Use north-up orientation for export.
	 */
	public void setNorthUp(boolean value) {
		setParameter("north_up", (Object) value);
	}

	/**
	 *  Use north-up orientation for export.
	 */
	public boolean getNorthUp() {
		return (boolean) getParameter("north_up");
	}

	/**
	 *  Path to output orthophoto.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to output orthophoto.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Output projection.
	 */
	public void setProjection(OrthoProjection value) {
		setParameter("projection", (Object) value);
	}

	/**
	 *  Output projection.
	 */
	public OrthoProjection getProjection() {
		return (OrthoProjection) getParameter("projection");
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
	 *  Output resolution in meters. Default: 0.0
	 */
	public void setResolution(double value) {
		setParameter("resolution", (Object) value);
	}

	/**
	 *  Output resolution in meters. Default: 0.0
	 */
	public double getResolution() {
		return (double) getParameter("resolution");
	}

	/**
	 *  Pixel size in the X dimension in projected units. Default: 0.0
	 */
	public void setResolutionX(double value) {
		setParameter("resolution_x", (Object) value);
	}

	/**
	 *  Pixel size in the X dimension in projected units. Default: 0.0
	 */
	public double getResolutionX() {
		return (double) getParameter("resolution_x");
	}

	/**
	 *  Pixel size in the Y dimension in projected units. Default: 0.0
	 */
	public void setResolutionY(double value) {
		setParameter("resolution_y", (Object) value);
	}

	/**
	 *  Pixel size in the Y dimension in projected units. Default: 0.0
	 */
	public double getResolutionY() {
		return (double) getParameter("resolution_y");
	}

	/**
	 *  Enable alpha channel generation.
	 */
	public void setSaveAlpha(boolean value) {
		setParameter("save_alpha", (Object) value);
	}

	/**
	 *  Enable alpha channel generation.
	 */
	public boolean getSaveAlpha() {
		return (boolean) getParameter("save_alpha");
	}

	/**
	 *  Enable kml file generation.
	 */
	public void setSaveKml(boolean value) {
		setParameter("save_kml", (Object) value);
	}

	/**
	 *  Enable kml file generation.
	 */
	public boolean getSaveKml() {
		return (boolean) getParameter("save_kml");
	}

	/**
	 *  Enable world file generation.
	 */
	public void setSaveWorld(boolean value) {
		setParameter("save_world", (Object) value);
	}

	/**
	 *  Enable world file generation.
	 */
	public boolean getSaveWorld() {
		return (boolean) getParameter("save_world");
	}

	/**
	 *  Enable white background.
	 */
	public void setWhiteBackground(boolean value) {
		setParameter("white_background", (Object) value);
	}

	/**
	 *  Enable white background.
	 */
	public boolean getWhiteBackground() {
		return (boolean) getParameter("white_background");
	}

}
