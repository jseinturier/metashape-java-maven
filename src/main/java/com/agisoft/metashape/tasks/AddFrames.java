package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class AddFrames extends Task {

	public AddFrames() {
		super("AddFrames");
	}

	/**
	 *  Chunk to copy frames from. Default: -1
	 */
	public void setChunk(int value) {
		setParameter("chunk", (Object) value);
	}

	/**
	 *  Chunk to copy frames from. Default: -1
	 */
	public int getChunk() {
		return (int) getParameter("chunk");
	}

	/**
	 *  Copy dense cloud.
	 */
	public void setCopyDenseCloud(boolean value) {
		setParameter("copy_dense_cloud", (Object) value);
	}

	/**
	 *  Copy dense cloud.
	 */
	public boolean getCopyDenseCloud() {
		return (boolean) getParameter("copy_dense_cloud");
	}

	/**
	 *  Copy depth maps.
	 */
	public void setCopyDepthMaps(boolean value) {
		setParameter("copy_depth_maps", (Object) value);
	}

	/**
	 *  Copy depth maps.
	 */
	public boolean getCopyDepthMaps() {
		return (boolean) getParameter("copy_depth_maps");
	}

	/**
	 *  Copy DEM.
	 */
	public void setCopyElevation(boolean value) {
		setParameter("copy_elevation", (Object) value);
	}

	/**
	 *  Copy DEM.
	 */
	public boolean getCopyElevation() {
		return (boolean) getParameter("copy_elevation");
	}

	/**
	 *  Copy model.
	 */
	public void setCopyModel(boolean value) {
		setParameter("copy_model", (Object) value);
	}

	/**
	 *  Copy model.
	 */
	public boolean getCopyModel() {
		return (boolean) getParameter("copy_model");
	}

	/**
	 *  Copy orthomosaic.
	 */
	public void setCopyOrthomosaic(boolean value) {
		setParameter("copy_orthomosaic", (Object) value);
	}

	/**
	 *  Copy orthomosaic.
	 */
	public boolean getCopyOrthomosaic() {
		return (boolean) getParameter("copy_orthomosaic");
	}

	/**
	 *  Copy tiled model.
	 */
	public void setCopyTiledModel(boolean value) {
		setParameter("copy_tiled_model", (Object) value);
	}

	/**
	 *  Copy tiled model.
	 */
	public boolean getCopyTiledModel() {
		return (boolean) getParameter("copy_tiled_model");
	}

	/**
	 *  List of frame keys to copy.
	 */
	public void setFrames(int[] value) {
		setParameter("frames", (Object) value);
	}

	/**
	 *  List of frame keys to copy.
	 */
	public int[] getFrames() {
		return (int[]) getParameter("frames");
	}

}
