package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class DuplicateChunk extends Task {

	public DuplicateChunk() {
		super("DuplicateChunk");
	}

	/**
	 *  Chunk to copy. Default: -1
	 */
	public void setChunk(int value) {
		setParameter("chunk", (Object) value);
	}

	/**
	 *  Chunk to copy. Default: -1
	 */
	public int getChunk() {
		return (int) getParameter("chunk");
	}

	/**
	 *  Copy dense clouds.
	 */
	public void setCopyDenseClouds(boolean value) {
		setParameter("copy_dense_clouds", (Object) value);
	}

	/**
	 *  Copy dense clouds.
	 */
	public boolean getCopyDenseClouds() {
		return (boolean) getParameter("copy_dense_clouds");
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
	 *  Copy DEMs.
	 */
	public void setCopyElevations(boolean value) {
		setParameter("copy_elevations", (Object) value);
	}

	/**
	 *  Copy DEMs.
	 */
	public boolean getCopyElevations() {
		return (boolean) getParameter("copy_elevations");
	}

	/**
	 *  Copy keypoints.
	 */
	public void setCopyKeypoints(boolean value) {
		setParameter("copy_keypoints", (Object) value);
	}

	/**
	 *  Copy keypoints.
	 */
	public boolean getCopyKeypoints() {
		return (boolean) getParameter("copy_keypoints");
	}

	/**
	 *  Copy models.
	 */
	public void setCopyModels(boolean value) {
		setParameter("copy_models", (Object) value);
	}

	/**
	 *  Copy models.
	 */
	public boolean getCopyModels() {
		return (boolean) getParameter("copy_models");
	}

	/**
	 *  Copy orthomosaics.
	 */
	public void setCopyOrthomosaics(boolean value) {
		setParameter("copy_orthomosaics", (Object) value);
	}

	/**
	 *  Copy orthomosaics.
	 */
	public boolean getCopyOrthomosaics() {
		return (boolean) getParameter("copy_orthomosaics");
	}

	/**
	 *  Copy tiled models.
	 */
	public void setCopyTiledModels(boolean value) {
		setParameter("copy_tiled_models", (Object) value);
	}

	/**
	 *  Copy tiled models.
	 */
	public boolean getCopyTiledModels() {
		return (boolean) getParameter("copy_tiled_models");
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

	/**
	 *  New chunk label.
	 */
	public void setLabel(String value) {
		setParameter("label", (Object) value);
	}

	/**
	 *  New chunk label.
	 */
	public String getLabel() {
		return (String) getParameter("label");
	}

}
