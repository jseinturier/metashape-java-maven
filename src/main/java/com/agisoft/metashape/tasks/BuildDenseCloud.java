package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildDenseCloud extends Task {

	public BuildDenseCloud() {
		super("BuildDenseCloud");
	}

	/**
	 *  Enable store depth maps option.
	 */
	public void setKeepDepth(boolean value) {
		setParameter("keep_depth", (Object) value);
	}

	/**
	 *  Enable store depth maps option.
	 */
	public boolean getKeepDepth() {
		return (boolean) getParameter("keep_depth");
	}

	/**
	 *  Maximum number of neighbor images to use for depth map filtering. Default: 100
	 */
	public void setMaxNeighbors(int value) {
		setParameter("max_neighbors", (Object) value);
	}

	/**
	 *  Maximum number of neighbor images to use for depth map filtering. Default: 100
	 */
	public int getMaxNeighbors() {
		return (int) getParameter("max_neighbors");
	}

	/**
	 *  Maximum workgroup size. Default: 100
	 */
	public void setMaxWorkgroupSize(int value) {
		setParameter("max_workgroup_size", (Object) value);
	}

	/**
	 *  Maximum workgroup size. Default: 100
	 */
	public int getMaxWorkgroupSize() {
		return (int) getParameter("max_workgroup_size");
	}

	/**
	 *  Enable point colors calculation.
	 */
	public void setPointColors(boolean value) {
		setParameter("point_colors", (Object) value);
	}

	/**
	 *  Enable point colors calculation.
	 */
	public boolean getPointColors() {
		return (boolean) getParameter("point_colors");
	}

	/**
	 *  Enable point confidence calculation.
	 */
	public void setPointConfidence(boolean value) {
		setParameter("point_confidence", (Object) value);
	}

	/**
	 *  Enable point confidence calculation.
	 */
	public boolean getPointConfidence() {
		return (boolean) getParameter("point_confidence");
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

	/**
	 *  Number of cameras in a workitem. Default: 20
	 */
	public void setWorkitemSizeCameras(int value) {
		setParameter("workitem_size_cameras", (Object) value);
	}

	/**
	 *  Number of cameras in a workitem. Default: 20
	 */
	public int getWorkitemSizeCameras() {
		return (int) getParameter("workitem_size_cameras");
	}

}
