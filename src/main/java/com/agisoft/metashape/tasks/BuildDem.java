package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildDem extends Task {

	public BuildDem() {
		super("BuildDem");
	}

	/**
	 *  List of dense point classes to be used for surface extraction.
	 */
	public void setClasses(int[] value) {
		setParameter("classes", (Object) value);
	}

	/**
	 *  List of dense point classes to be used for surface extraction.
	 */
	public int[] getClasses() {
		return (int[]) getParameter("classes");
	}

	/**
	 *  Flip X axis direction.
	 */
	public void setFlipX(boolean value) {
		setParameter("flip_x", (Object) value);
	}

	/**
	 *  Flip X axis direction.
	 */
	public boolean getFlipX() {
		return (boolean) getParameter("flip_x");
	}

	/**
	 *  Flip Y axis direction.
	 */
	public void setFlipY(boolean value) {
		setParameter("flip_y", (Object) value);
	}

	/**
	 *  Flip Y axis direction.
	 */
	public boolean getFlipY() {
		return (boolean) getParameter("flip_y");
	}

	/**
	 *  Flip Z axis direction.
	 */
	public void setFlipZ(boolean value) {
		setParameter("flip_z", (Object) value);
	}

	/**
	 *  Flip Z axis direction.
	 */
	public boolean getFlipZ() {
		return (boolean) getParameter("flip_z");
	}

	/**
	 *  Interpolation mode. Default: Interpolation.EnabledInterpolation
	 */
	public void setInterpolation(Interpolation value) {
		setParameter("interpolation", (Object) value);
	}

	/**
	 *  Interpolation mode. Default: Interpolation.EnabledInterpolation
	 */
	public Interpolation getInterpolation() {
		return (Interpolation) getParameter("interpolation");
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
	 *  Output projection.
	 */
	public void setProjection(OrthoProjection value) {
		setParameter("projection", (Object) value);
	}

	/**
	 *  Output projection.
	 */
	public OrthoProjection getProjection() {
		return (OrthoProjection) getParameter("projection");
	}

	/**
	 *  Region to be processed.
	 */
	public void setRegion(BBox value) {
		setParameter("region", (Object) value);
	}

	/**
	 *  Region to be processed.
	 */
	public BBox getRegion() {
		return (BBox) getParameter("region");
	}

	/**
	 *  Output resolution in meters. Default: 0.0
	 */
	public void setResolution(double value) {
		setParameter("resolution", (Object) value);
	}

	/**
	 *  Output resolution in meters. Default: 0.0
	 */
	public double getResolution() {
		return (double) getParameter("resolution");
	}

	/**
	 *  Selects between dense point cloud and tie points. Default: DataSource.DenseCloudData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Selects between dense point cloud and tie points. Default: DataSource.DenseCloudData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
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
	 *  Number of tiles in a workitem. Default: 10
	 */
	public void setWorkitemSizeTiles(int value) {
		setParameter("workitem_size_tiles", (Object) value);
	}

	/**
	 *  Number of tiles in a workitem. Default: 10
	 */
	public int getWorkitemSizeTiles() {
		return (int) getParameter("workitem_size_tiles");
	}

}
