package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ConvertImages extends Task {

	public ConvertImages() {
		super("ConvertImages");
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
	 *  Apply color correction.
	 */
	public void setColorCorrection(boolean value) {
		setParameter("color_correction", (Object) value);
	}

	/**
	 *  Apply color correction.
	 */
	public boolean getColorCorrection() {
		return (boolean) getParameter("color_correction");
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
	 *  Merge multispectral images.
	 */
	public void setMergePlanes(boolean value) {
		setParameter("merge_planes", (Object) value);
	}

	/**
	 *  Merge multispectral images.
	 */
	public boolean getMergePlanes() {
		return (boolean) getParameter("merge_planes");
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
	 *  Update GPS tags.
	 */
	public void setUpdateGpsTags(boolean value) {
		setParameter("update_gps_tags", (Object) value);
	}

	/**
	 *  Update GPS tags.
	 */
	public boolean getUpdateGpsTags() {
		return (boolean) getParameter("update_gps_tags");
	}

	/**
	 *  Transform to initial calibration.
	 */
	public void setUseInitialCalibration(boolean value) {
		setParameter("use_initial_calibration", (Object) value);
	}

	/**
	 *  Transform to initial calibration.
	 */
	public boolean getUseInitialCalibration() {
		return (boolean) getParameter("use_initial_calibration");
	}

}
