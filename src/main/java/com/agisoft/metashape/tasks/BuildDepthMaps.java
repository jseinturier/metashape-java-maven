package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildDepthMaps extends Task {

	public BuildDepthMaps() {
		super("BuildDepthMaps");
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
	 *  Depth map quality. Default: 4
	 */
	public void setDownscale(int value) {
		setParameter("downscale", (Object) value);
	}

	/**
	 *  Depth map quality. Default: 4
	 */
	public int getDownscale() {
		return (int) getParameter("downscale");
	}

	/**
	 *  Depth map filtering mode. Default: FilterMode.MildFiltering
	 */
	public void setFilterMode(FilterMode value) {
		setParameter("filter_mode", (Object) value);
	}

	/**
	 *  Depth map filtering mode. Default: FilterMode.MildFiltering
	 */
	public FilterMode getFilterMode() {
		return (FilterMode) getParameter("filter_mode");
	}

	/**
	 *  Maximum number of neighbor images to use for depth map generation. Default: 16
	 */
	public void setMaxNeighbors(int value) {
		setParameter("max_neighbors", (Object) value);
	}

	/**
	 *  Maximum number of neighbor images to use for depth map generation. Default: 16
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
	 *  Enable reuse depth maps option.
	 */
	public void setReuseDepth(boolean value) {
		setParameter("reuse_depth", (Object) value);
	}

	/**
	 *  Enable reuse depth maps option.
	 */
	public boolean getReuseDepth() {
		return (boolean) getParameter("reuse_depth");
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
