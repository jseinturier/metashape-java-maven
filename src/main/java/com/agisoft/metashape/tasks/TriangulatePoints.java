package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class TriangulatePoints extends Task {

	public TriangulatePoints() {
		super("TriangulatePoints");
	}

	/**
	 *  Reprojection error threshold. Default: 10.0
	 */
	public void setMaxError(double value) {
		setParameter("max_error", (Object) value);
	}

	/**
	 *  Reprojection error threshold. Default: 10.0
	 */
	public double getMaxError() {
		return (double) getParameter("max_error");
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

}
