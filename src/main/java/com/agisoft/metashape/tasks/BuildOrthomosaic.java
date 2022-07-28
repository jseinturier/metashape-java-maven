package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildOrthomosaic extends Task {

	public BuildOrthomosaic() {
		super("BuildOrthomosaic");
	}

	/**
	 *  Orthophoto blending mode. Default: BlendingMode.MosaicBlending
	 */
	public void setBlendingMode(BlendingMode value) {
		setParameter("blending_mode", (Object) value);
	}

	/**
	 *  Orthophoto blending mode. Default: BlendingMode.MosaicBlending
	 */
	public BlendingMode getBlendingMode() {
		return (BlendingMode) getParameter("blending_mode");
	}

	/**
	 *  Enable back-face culling.
	 */
	public void setCullFaces(boolean value) {
		setParameter("cull_faces", (Object) value);
	}

	/**
	 *  Enable back-face culling.
	 */
	public boolean getCullFaces() {
		return (boolean) getParameter("cull_faces");
	}

	/**
	 *  Enable hole filling.
	 */
	public void setFillHoles(boolean value) {
		setParameter("fill_holes", (Object) value);
	}

	/**
	 *  Enable hole filling.
	 */
	public boolean getFillHoles() {
		return (boolean) getParameter("fill_holes");
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
	 *  Enable ghosting filter.
	 */
	public void setGhostingFilter(boolean value) {
		setParameter("ghosting_filter", (Object) value);
	}

	/**
	 *  Enable ghosting filter.
	 */
	public boolean getGhostingFilter() {
		return (boolean) getParameter("ghosting_filter");
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
	 *  Refine seamlines based on image content.
	 */
	public void setRefineSeamlines(boolean value) {
		setParameter("refine_seamlines", (Object) value);
	}

	/**
	 *  Refine seamlines based on image content.
	 */
	public boolean getRefineSeamlines() {
		return (boolean) getParameter("refine_seamlines");
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
	 *  Pixel size in meters. Default: 0.0
	 */
	public void setResolution(double value) {
		setParameter("resolution", (Object) value);
	}

	/**
	 *  Pixel size in meters. Default: 0.0
	 */
	public double getResolution() {
		return (double) getParameter("resolution");
	}

	/**
	 *  Pixel size in the X dimension in projected units. Default: 0.0
	 */
	public void setResolutionX(double value) {
		setParameter("resolution_x", (Object) value);
	}

	/**
	 *  Pixel size in the X dimension in projected units. Default: 0.0
	 */
	public double getResolutionX() {
		return (double) getParameter("resolution_x");
	}

	/**
	 *  Pixel size in the Y dimension in projected units. Default: 0.0
	 */
	public void setResolutionY(double value) {
		setParameter("resolution_y", (Object) value);
	}

	/**
	 *  Pixel size in the Y dimension in projected units. Default: 0.0
	 */
	public double getResolutionY() {
		return (double) getParameter("resolution_y");
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
	 *  Orthorectification surface. Default: DataSource.ModelData
	 */
	public void setSurfaceData(DataSource value) {
		setParameter("surface_data", (Object) value);
	}

	/**
	 *  Orthorectification surface. Default: DataSource.ModelData
	 */
	public DataSource getSurfaceData() {
		return (DataSource) getParameter("surface_data");
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
