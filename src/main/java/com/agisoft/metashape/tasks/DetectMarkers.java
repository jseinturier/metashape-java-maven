package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class DetectMarkers extends Task {

	public DetectMarkers() {
		super("DetectMarkers");
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
	 *  Ignore masked image regions.
	 */
	public void setFilterMask(boolean value) {
		setParameter("filter_mask", (Object) value);
	}

	/**
	 *  Ignore masked image regions.
	 */
	public boolean getFilterMask() {
		return (boolean) getParameter("filter_mask");
	}

	/**
	 *  List of frames to process.
	 */
	public void setFrames(int[] value) {
		setParameter("frames", (Object) value);
	}

	/**
	 *  List of frames to process.
	 */
	public int[] getFrames() {
		return (int[]) getParameter("frames");
	}

	/**
	 *  Detect markers on black background.
	 */
	public void setInverted(boolean value) {
		setParameter("inverted", (Object) value);
	}

	/**
	 *  Detect markers on black background.
	 */
	public boolean getInverted() {
		return (boolean) getParameter("inverted");
	}

	/**
	 *  Maximum residual for non-coded targets in pixels. Default: 5.0
	 */
	public void setMaximumResidual(double value) {
		setParameter("maximum_residual", (Object) value);
	}

	/**
	 *  Maximum residual for non-coded targets in pixels. Default: 5.0
	 */
	public double getMaximumResidual() {
		return (double) getParameter("maximum_residual");
	}

	/**
	 *  Minimum distance between targets in pixels (CrossTarget type only). Default: 5
	 */
	public void setMinimumDist(int value) {
		setParameter("minimum_dist", (Object) value);
	}

	/**
	 *  Minimum distance between targets in pixels (CrossTarget type only). Default: 5
	 */
	public int getMinimumDist() {
		return (int) getParameter("minimum_dist");
	}

	/**
	 *  Minimum target radius in pixels to be detected (CrossTarget type only). Default: 0
	 */
	public void setMinimumSize(int value) {
		setParameter("minimum_size", (Object) value);
	}

	/**
	 *  Minimum target radius in pixels to be detected (CrossTarget type only). Default: 0
	 */
	public int getMinimumSize() {
		return (int) getParameter("minimum_size");
	}

	/**
	 *  Disable parity checking.
	 */
	public void setNoparity(boolean value) {
		setParameter("noparity", (Object) value);
	}

	/**
	 *  Disable parity checking.
	 */
	public boolean getNoparity() {
		return (boolean) getParameter("noparity");
	}

	/**
	 *  Type of targets. Default: TargetType.CircularTarget12bit
	 */
	public void setTargetType(TargetType value) {
		setParameter("target_type", (Object) value);
	}

	/**
	 *  Type of targets. Default: TargetType.CircularTarget12bit
	 */
	public TargetType getTargetType() {
		return (TargetType) getParameter("target_type");
	}

	/**
	 *  Detector tolerance (0 - 100). Default: 50
	 */
	public void setTolerance(int value) {
		setParameter("tolerance", (Object) value);
	}

	/**
	 *  Detector tolerance (0 - 100). Default: 50
	 */
	public int getTolerance() {
		return (int) getParameter("tolerance");
	}

}
