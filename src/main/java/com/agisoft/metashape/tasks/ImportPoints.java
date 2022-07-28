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

	/**
	 *  Trajectory file delimiter.
	 */
	public void setTrajColumns(String value) {
		setParameter("traj_columns", (Object) value);
	}

	/**
	 *  Trajectory file delimiter.
	 */
	public String getTrajColumns() {
		return (String) getParameter("traj_columns");
	}

	/**
	 *  Trajectory file column order in csv format (t - time, x/y/z - coordinates).
	 */
	public void setTrajDelimiter(String value) {
		setParameter("traj_delimiter", (Object) value);
	}

	/**
	 *  Trajectory file column order in csv format (t - time, x/y/z - coordinates).
	 */
	public String getTrajDelimiter() {
		return (String) getParameter("traj_delimiter");
	}

	/**
	 *  Trajectory file path.
	 */
	public void setTrajPath(String value) {
		setParameter("traj_path", (Object) value);
	}

	/**
	 *  Trajectory file path.
	 */
	public String getTrajPath() {
		return (String) getParameter("traj_path");
	}

	/**
	 *  Trajectory file number of rows to skip. Default: 0
	 */
	public void setTrajSkipRows(int value) {
		setParameter("traj_skip_rows", (Object) value);
	}

	/**
	 *  Trajectory file number of rows to skip. Default: 0
	 */
	public int getTrajSkipRows() {
		return (int) getParameter("traj_skip_rows");
	}

	/**
	 *  Use trajectory file or origin.
	 */
	public void setUseTrajectory(boolean value) {
		setParameter("use_trajectory", (Object) value);
	}

	/**
	 *  Use trajectory file or origin.
	 */
	public boolean getUseTrajectory() {
		return (boolean) getParameter("use_trajectory");
	}

}
