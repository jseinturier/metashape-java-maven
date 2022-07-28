package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class CalculatePointNormals extends Task {

	public CalculatePointNormals() {
		super("CalculatePointNormals");
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

}
