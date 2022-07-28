package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildModel extends Task {

	public BuildModel() {
		super("BuildModel");
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
	 *  Target face count. Default: FaceCount.HighFaceCount
	 */
	public void setFaceCount(FaceCount value) {
		setParameter("face_count", (Object) value);
	}

	/**
	 *  Target face count. Default: FaceCount.HighFaceCount
	 */
	public FaceCount getFaceCount() {
		return (FaceCount) getParameter("face_count");
	}

	/**
	 *  Custom face count. Default: 200000
	 */
	public void setFaceCountCustom(int value) {
		setParameter("face_count_custom", (Object) value);
	}

	/**
	 *  Custom face count. Default: 200000
	 */
	public int getFaceCountCustom() {
		return (int) getParameter("face_count_custom");
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
	 *  Selects between dense point cloud, tie points and depth maps. Default: DataSource.DenseCloudData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Selects between dense point cloud, tie points and depth maps. Default: DataSource.DenseCloudData
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
	 *  Type of object to be reconstructed. Default: SurfaceType.Arbitrary
	 */
	public void setSurfaceType(SurfaceType value) {
		setParameter("surface_type", (Object) value);
	}

	/**
	 *  Type of object to be reconstructed. Default: SurfaceType.Arbitrary
	 */
	public SurfaceType getSurfaceType() {
		return (SurfaceType) getParameter("surface_type");
	}

	/**
	 *  Trimming radius (no trimming if zero). Default: 10
	 */
	public void setTrimmingRadius(int value) {
		setParameter("trimming_radius", (Object) value);
	}

	/**
	 *  Trimming radius (no trimming if zero). Default: 10
	 */
	public int getTrimmingRadius() {
		return (int) getParameter("trimming_radius");
	}

	/**
	 *  Enable vertex colors calculation.
	 */
	public void setVertexColors(boolean value) {
		setParameter("vertex_colors", (Object) value);
	}

	/**
	 *  Enable vertex colors calculation.
	 */
	public boolean getVertexColors() {
		return (boolean) getParameter("vertex_colors");
	}

	/**
	 *  Enable vertex confidence calculation.
	 */
	public void setVertexConfidence(boolean value) {
		setParameter("vertex_confidence", (Object) value);
	}

	/**
	 *  Enable vertex confidence calculation.
	 */
	public boolean getVertexConfidence() {
		return (boolean) getParameter("vertex_confidence");
	}

	/**
	 *  Enable strict volumetric masking.
	 */
	public void setVolumetricMasks(boolean value) {
		setParameter("volumetric_masks", (Object) value);
	}

	/**
	 *  Enable strict volumetric masking.
	 */
	public boolean getVolumetricMasks() {
		return (boolean) getParameter("volumetric_masks");
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
