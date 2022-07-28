package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ClassifyGroundPoints extends Task {

	public ClassifyGroundPoints() {
		super("ClassifyGroundPoints");
	}

	/**
	 *  Cell size (meters). Default: 50.0
	 */
	public void setCellSize(double value) {
		setParameter("cell_size", (Object) value);
	}

	/**
	 *  Cell size (meters). Default: 50.0
	 */
	public double getCellSize() {
		return (double) getParameter("cell_size");
	}

	/**
	 *  Erosion radius (meters). Default: 0.0
	 */
	public void setErosionRadius(double value) {
		setParameter("erosion_radius", (Object) value);
	}

	/**
	 *  Erosion radius (meters). Default: 0.0
	 */
	public double getErosionRadius() {
		return (double) getParameter("erosion_radius");
	}

	/**
	 *  Maximum angle (degrees). Default: 15.0
	 */
	public void setMaxAngle(double value) {
		setParameter("max_angle", (Object) value);
	}

	/**
	 *  Maximum angle (degrees). Default: 15.0
	 */
	public double getMaxAngle() {
		return (double) getParameter("max_angle");
	}

	/**
	 *  Maximum distance (meters). Default: 1.0
	 */
	public void setMaxDistance(double value) {
		setParameter("max_distance", (Object) value);
	}

	/**
	 *  Maximum distance (meters). Default: 1.0
	 */
	public double getMaxDistance() {
		return (double) getParameter("max_distance");
	}

	/**
	 *  Class of points to be re-classified. Default: -1
	 */
	public void setSourceClass(int value) {
		setParameter("source_class", (Object) value);
	}

	/**
	 *  Class of points to be re-classified. Default: -1
	 */
	public int getSourceClass() {
		return (int) getParameter("source_class");
	}

}
