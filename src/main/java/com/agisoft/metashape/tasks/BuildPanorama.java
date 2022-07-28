package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildPanorama extends Task {

	public BuildPanorama() {
		super("BuildPanorama");
	}

	/**
	 *  Panorama blending mode. Default: BlendingMode.MosaicBlending
	 */
	public void setBlendingMode(BlendingMode value) {
		setParameter("blending_mode", (Object) value);
	}

	/**
	 *  Panorama blending mode. Default: BlendingMode.MosaicBlending
	 */
	public BlendingMode getBlendingMode() {
		return (BlendingMode) getParameter("blending_mode");
	}

	/**
	 *  List of camera groups to process.
	 */
	public void setCameraGroups(int[] value) {
		setParameter("camera_groups", (Object) value);
	}

	/**
	 *  List of camera groups to process.
	 */
	public int[] getCameraGroups() {
		return (int[]) getParameter("camera_groups");
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
	 *  Enable ghosting filter.
	 */
	public void setGhostingFilter(boolean value) {
		setParameter("ghosting_filter", (Object) value);
	}

	/**
	 *  Enable ghosting filter.
	 */
	public boolean getGhostingFilter() {
		return (boolean) getParameter("ghosting_filter");
	}

	/**
	 *  Height of output panorama. Default: 0
	 */
	public void setHeight(int value) {
		setParameter("height", (Object) value);
	}

	/**
	 *  Height of output panorama. Default: 0
	 */
	public int getHeight() {
		return (int) getParameter("height");
	}

	/**
	 *  Region to be generated.
	 */
	public void setRegion(BBox value) {
		setParameter("region", (Object) value);
	}

	/**
	 *  Region to be generated.
	 */
	public BBox getRegion() {
		return (BBox) getParameter("region");
	}

	/**
	 *  Panorama 3x3 orientation matrix.
	 */
	public void setRotation(Matrix value) {
		setParameter("rotation", (Object) value);
	}

	/**
	 *  Panorama 3x3 orientation matrix.
	 */
	public Matrix getRotation() {
		return (Matrix) getParameter("rotation");
	}

	/**
	 *  Width of output panorama. Default: 0
	 */
	public void setWidth(int value) {
		setParameter("width", (Object) value);
	}

	/**
	 *  Width of output panorama. Default: 0
	 */
	public int getWidth() {
		return (int) getParameter("width");
	}

}
