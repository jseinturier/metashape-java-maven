package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildContours extends Task {

	public BuildContours() {
		super("BuildContours");
	}

	/**
	 *  Contour interval. Default: 1.0
	 */
	public void setInterval(double value) {
		setParameter("interval", (Object) value);
	}

	/**
	 *  Contour interval. Default: 1.0
	 */
	public double getInterval() {
		return (double) getParameter("interval");
	}

	/**
	 *  Maximum value of contour range. Default: 10000000000.0
	 */
	public void setMaxValue(double value) {
		setParameter("max_value", (Object) value);
	}

	/**
	 *  Maximum value of contour range. Default: 10000000000.0
	 */
	public double getMaxValue() {
		return (double) getParameter("max_value");
	}

	/**
	 *  Minimum value of contour range. Default: -10000000000.0
	 */
	public void setMinValue(double value) {
		setParameter("min_value", (Object) value);
	}

	/**
	 *  Minimum value of contour range. Default: -10000000000.0
	 */
	public double getMinValue() {
		return (double) getParameter("min_value");
	}

	/**
	 *  Prevent contour intersections.
	 */
	public void setPreventIntersections(boolean value) {
		setParameter("prevent_intersections", (Object) value);
	}

	/**
	 *  Prevent contour intersections.
	 */
	public boolean getPreventIntersections() {
		return (boolean) getParameter("prevent_intersections");
	}

	/**
	 *  Source data for contour generation. Default: DataSource.ElevationData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Source data for contour generation. Default: DataSource.ElevationData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
	}

}
