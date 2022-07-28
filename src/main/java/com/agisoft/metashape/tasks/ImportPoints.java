package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportPoints extends Task {

	public ImportPoints() {
		super("ImportPoints");
	}

	/**
	 *  Calculate point normals.
	 */
	public void setCalculateNormals(boolean value) {
		setParameter("calculate_normals", (Object) value);
	}

	/**
	 *  Calculate point normals.
	 */
	public boolean getCalculateNormals() {
		return (boolean) getParameter("calculate_normals");
	}

	/**
	 *  Point cloud coordinate system.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Point cloud coordinate system.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  Point cloud format. Default: PointsFormat.PointsFormatNone
	 */
	public void setFormat(PointsFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Point cloud format. Default: PointsFormat.PointsFormatNone
	 */
	public PointsFormat getFormat() {
		return (PointsFormat) getParameter("format");
	}

	/**
	 *  Path to point cloud.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to point cloud.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Number of point neighbors to use for normal estimation. Default: 28
	 */
	public void setPointNeighbors(int value) {
		setParameter("point_neighbors", (Object) value);
	}

	/**
	 *  Number of point neighbors to use for normal estimation. Default: 28
	 */
	public int getPointNeighbors() {
		return (int) getParameter("point_neighbors");
	}

	/**
	 *  Optional shift to be applied to point coordinates.
	 */
	public void setShift(Vector value) {
		setParameter("shift", (Object) value);
	}

	/**
	 *  Optional shift to be applied to point coordinates.
	 */
	public Vector getShift() {
		return (Vector) getParameter("shift");
	}

}
