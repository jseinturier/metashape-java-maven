package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class DetectFiducials extends Task {

	public DetectFiducials() {
		super("DetectFiducials");
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
	 *  Generate background masks.
	 */
	public void setGenerateMasks(boolean value) {
		setParameter("generate_masks", (Object) value);
	}

	/**
	 *  Generate background masks.
	 */
	public boolean getGenerateMasks() {
		return (boolean) getParameter("generate_masks");
	}

}
