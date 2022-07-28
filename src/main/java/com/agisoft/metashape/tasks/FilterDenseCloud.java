package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class FilterDenseCloud extends Task {

	public FilterDenseCloud() {
		super("FilterDenseCloud");
	}

	/**
	 *  Dense cloud key to filter. Default: -1
	 */
	public void setAsset(int value) {
		setParameter("asset", (Object) value);
	}

	/**
	 *  Dense cloud key to filter. Default: -1
	 */
	public int getAsset() {
		return (int) getParameter("asset");
	}

	/**
	 *  Desired point spacing (m). Default: 0.0
	 */
	public void setPointSpacing(double value) {
		setParameter("point_spacing", (Object) value);
	}

	/**
	 *  Desired point spacing (m). Default: 0.0
	 */
	public double getPointSpacing() {
		return (double) getParameter("point_spacing");
	}

}
