package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class MergeChunks extends Task {

	public MergeChunks() {
		super("MergeChunks");
	}

	/**
	 *  List of chunks to process.
	 */
	public void setChunks(int[] value) {
		setParameter("chunks", (Object) value);
	}

	/**
	 *  List of chunks to process.
	 */
	public int[] getChunks() {
		return (int[]) getParameter("chunks");
	}

	/**
	 *  Merge dense clouds.
	 */
	public void setMergeDenseClouds(boolean value) {
		setParameter("merge_dense_clouds", (Object) value);
	}

	/**
	 *  Merge dense clouds.
	 */
	public boolean getMergeDenseClouds() {
		return (boolean) getParameter("merge_dense_clouds");
	}

	/**
	 *  Merge depth maps.
	 */
	public void setMergeDepthMaps(boolean value) {
		setParameter("merge_depth_maps", (Object) value);
	}

	/**
	 *  Merge depth maps.
	 */
	public boolean getMergeDepthMaps() {
		return (boolean) getParameter("merge_depth_maps");
	}

	/**
	 *  Merge DEMs.
	 */
	public void setMergeElevations(boolean value) {
		setParameter("merge_elevations", (Object) value);
	}

	/**
	 *  Merge DEMs.
	 */
	public boolean getMergeElevations() {
		return (boolean) getParameter("merge_elevations");
	}

	/**
	 *  Merge markers.
	 */
	public void setMergeMarkers(boolean value) {
		setParameter("merge_markers", (Object) value);
	}

	/**
	 *  Merge markers.
	 */
	public boolean getMergeMarkers() {
		return (boolean) getParameter("merge_markers");
	}

	/**
	 *  Merge models.
	 */
	public void setMergeModels(boolean value) {
		setParameter("merge_models", (Object) value);
	}

	/**
	 *  Merge models.
	 */
	public boolean getMergeModels() {
		return (boolean) getParameter("merge_models");
	}

	/**
	 *  Merge orthomosaics.
	 */
	public void setMergeOrthomosaics(boolean value) {
		setParameter("merge_orthomosaics", (Object) value);
	}

	/**
	 *  Merge orthomosaics.
	 */
	public boolean getMergeOrthomosaics() {
		return (boolean) getParameter("merge_orthomosaics");
	}

	/**
	 *  Merge tie points.
	 */
	public void setMergeTiepoints(boolean value) {
		setParameter("merge_tiepoints", (Object) value);
	}

	/**
	 *  Merge tie points.
	 */
	public boolean getMergeTiepoints() {
		return (boolean) getParameter("merge_tiepoints");
	}

}
