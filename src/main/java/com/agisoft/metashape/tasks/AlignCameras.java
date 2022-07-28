package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class AlignCameras extends Task {

	public AlignCameras() {
		super("AlignCameras");
	}

	/**
	 *  Enable adaptive fitting of distortion coefficients.
	 */
	public void setAdaptiveFitting(boolean value) {
		setParameter("adaptive_fitting", (Object) value);
	}

	/**
	 *  Enable adaptive fitting of distortion coefficients.
	 */
	public boolean getAdaptiveFitting() {
		return (boolean) getParameter("adaptive_fitting");
	}

	/**
	 *  List of cameras to align.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  List of cameras to align.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
	}

	/**
	 *  Minimum number of point projections. Default: 2
	 */
	public void setMinImage(int value) {
		setParameter("min_image", (Object) value);
	}

	/**
	 *  Minimum number of point projections. Default: 2
	 */
	public int getMinImage() {
		return (int) getParameter("min_image");
	}

	/**
	 *  Reset current alignment.
	 */
	public void setResetAlignment(boolean value) {
		setParameter("reset_alignment", (Object) value);
	}

	/**
	 *  Reset current alignment.
	 */
	public boolean getResetAlignment() {
		return (boolean) getParameter("reset_alignment");
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

}
