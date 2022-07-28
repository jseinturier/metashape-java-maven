package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildTiledModel extends Task {

	public BuildTiledModel() {
		super("BuildTiledModel");
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
	 *  Number of faces per megapixel of texture resolution. Default: 20000
	 */
	public void setFaceCount(int value) {
		setParameter("face_count", (Object) value);
	}

	/**
	 *  Number of faces per megapixel of texture resolution. Default: 20000
	 */
	public int getFaceCount() {
		return (int) getParameter("face_count");
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
	 *  Merge tiled model flag.
	 */
	public void setMerge(boolean value) {
		setParameter("merge", (Object) value);
	}

	/**
	 *  Merge tiled model flag.
	 */
	public boolean getMerge() {
		return (boolean) getParameter("merge");
	}

	/**
	 *  Operand asset key. Default: -1
	 */
	public void setOperandAsset(int value) {
		setParameter("operand_asset", (Object) value);
	}

	/**
	 *  Operand asset key. Default: -1
	 */
	public int getOperandAsset() {
		return (int) getParameter("operand_asset");
	}

	/**
	 *  Operand chunk key. Default: -1
	 */
	public void setOperandChunk(int value) {
		setParameter("operand_chunk", (Object) value);
	}

	/**
	 *  Operand chunk key. Default: -1
	 */
	public int getOperandChunk() {
		return (int) getParameter("operand_chunk");
	}

	/**
	 *  Operand frame key. Default: -1
	 */
	public void setOperandFrame(int value) {
		setParameter("operand_frame", (Object) value);
	}

	/**
	 *  Operand frame key. Default: -1
	 */
	public int getOperandFrame() {
		return (int) getParameter("operand_frame");
	}

	/**
	 *  Target model resolution in meters. Default: 0.0
	 */
	public void setPixelSize(double value) {
		setParameter("pixel_size", (Object) value);
	}

	/**
	 *  Target model resolution in meters. Default: 0.0
	 */
	public double getPixelSize() {
		return (double) getParameter("pixel_size");
	}

	/**
	 *  Selects between dense point cloud and mesh. Default: DataSource.DenseCloudData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Selects between dense point cloud and mesh. Default: DataSource.DenseCloudData
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
	 *  Size of tiles in pixels. Default: 256
	 */
	public void setTileSize(int value) {
		setParameter("tile_size", (Object) value);
	}

	/**
	 *  Size of tiles in pixels. Default: 256
	 */
	public int getTileSize() {
		return (int) getParameter("tile_size");
	}

	/**
	 *  Transfer source model texture to tiled model.
	 */
	public void setTransferTexture(boolean value) {
		setParameter("transfer_texture", (Object) value);
	}

	/**
	 *  Transfer source model texture to tiled model.
	 */
	public boolean getTransferTexture() {
		return (boolean) getParameter("transfer_texture");
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
