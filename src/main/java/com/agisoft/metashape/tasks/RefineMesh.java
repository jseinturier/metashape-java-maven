package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class RefineMesh extends Task {

	public RefineMesh() {
		super("RefineMesh");
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
	 *  Refinement quality. Default: 4
	 */
	public void setDownscale(int value) {
		setParameter("downscale", (Object) value);
	}

	/**
	 *  Refinement quality. Default: 4
	 */
	public int getDownscale() {
		return (int) getParameter("downscale");
	}

	/**
	 *  Number of refinement iterations. Default: 10
	 */
	public void setIterations(int value) {
		setParameter("iterations", (Object) value);
	}

	/**
	 *  Number of refinement iterations. Default: 10
	 */
	public int getIterations() {
		return (int) getParameter("iterations");
	}

	/**
	 *  Smoothing strength. Should be in range [0, 1]. Default: 0.5
	 */
	public void setSmoothness(double value) {
		setParameter("smoothness", (Object) value);
	}

	/**
	 *  Smoothing strength. Should be in range [0, 1]. Default: 0.5
	 */
	public double getSmoothness() {
		return (double) getParameter("smoothness");
	}

}
