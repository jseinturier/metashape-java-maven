package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class MatchPhotos extends Task {

	public MatchPhotos() {
		super("MatchPhotos");
	}

	/**
	 *  List of cameras to match.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  List of cameras to match.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
	}

	/**
	 *  Image alignment accuracy. Default: 1
	 */
	public void setDownscale(int value) {
		setParameter("downscale", (Object) value);
	}

	/**
	 *  Image alignment accuracy. Default: 1
	 */
	public int getDownscale() {
		return (int) getParameter("downscale");
	}

	/**
	 *  Filter points by mask.
	 */
	public void setFilterMask(boolean value) {
		setParameter("filter_mask", (Object) value);
	}

	/**
	 *  Filter points by mask.
	 */
	public boolean getFilterMask() {
		return (boolean) getParameter("filter_mask");
	}

	/**
	 *  Exclude tie points which are stationary across images.
	 */
	public void setFilterStationaryPoints(boolean value) {
		setParameter("filter_stationary_points", (Object) value);
	}

	/**
	 *  Exclude tie points which are stationary across images.
	 */
	public boolean getFilterStationaryPoints() {
		return (boolean) getParameter("filter_stationary_points");
	}

	/**
	 *  Enable generic preselection.
	 */
	public void setGenericPreselection(boolean value) {
		setParameter("generic_preselection", (Object) value);
	}

	/**
	 *  Enable generic preselection.
	 */
	public boolean getGenericPreselection() {
		return (boolean) getParameter("generic_preselection");
	}

	/**
	 *  Enable guided image matching.
	 */
	public void setGuidedMatching(boolean value) {
		setParameter("guided_matching", (Object) value);
	}

	/**
	 *  Enable guided image matching.
	 */
	public boolean getGuidedMatching() {
		return (boolean) getParameter("guided_matching");
	}

	/**
	 *  Store keypoints in the project.
	 */
	public void setKeepKeypoints(boolean value) {
		setParameter("keep_keypoints", (Object) value);
	}

	/**
	 *  Store keypoints in the project.
	 */
	public boolean getKeepKeypoints() {
		return (boolean) getParameter("keep_keypoints");
	}

	/**
	 *  Key point limit. Default: 40000
	 */
	public void setKeypointLimit(int value) {
		setParameter("keypoint_limit", (Object) value);
	}

	/**
	 *  Key point limit. Default: 40000
	 */
	public int getKeypointLimit() {
		return (int) getParameter("keypoint_limit");
	}

	/**
	 *  Key point limit per megapixel. Default: 1000
	 */
	public void setKeypointLimitPerMpx(int value) {
		setParameter("keypoint_limit_per_mpx", (Object) value);
	}

	/**
	 *  Key point limit per megapixel. Default: 1000
	 */
	public int getKeypointLimitPerMpx() {
		return (int) getParameter("keypoint_limit_per_mpx");
	}

	/**
	 *  Apply mask filter to tie points.
	 */
	public void setMaskTiepoints(boolean value) {
		setParameter("mask_tiepoints", (Object) value);
	}

	/**
	 *  Apply mask filter to tie points.
	 */
	public boolean getMaskTiepoints() {
		return (boolean) getParameter("mask_tiepoints");
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
	 *  User defined list of camera pairs to match.
	 */
	public void setPairs(Pair[] value) {
		setParameter("pairs", (Object) value);
	}

	/**
	 *  User defined list of camera pairs to match.
	 */
	public Pair[] getPairs() {
		return (Pair[]) getParameter("pairs");
	}

	/**
	 *  Enable reference preselection.
	 */
	public void setReferencePreselection(boolean value) {
		setParameter("reference_preselection", (Object) value);
	}

	/**
	 *  Enable reference preselection.
	 */
	public boolean getReferencePreselection() {
		return (boolean) getParameter("reference_preselection");
	}

	/**
	 *  Reference preselection mode. Default: ReferencePreselectionMode.ReferencePreselectionSource
	 */
	public void setReferencePreselectionMode(ReferencePreselectionMode value) {
		setParameter("reference_preselection_mode", (Object) value);
	}

	/**
	 *  Reference preselection mode. Default: ReferencePreselectionMode.ReferencePreselectionSource
	 */
	public ReferencePreselectionMode getReferencePreselectionMode() {
		return (ReferencePreselectionMode) getParameter("reference_preselection_mode");
	}

	/**
	 *  Reset current matches.
	 */
	public void setResetMatches(boolean value) {
		setParameter("reset_matches", (Object) value);
	}

	/**
	 *  Reset current matches.
	 */
	public boolean getResetMatches() {
		return (boolean) getParameter("reset_matches");
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
	 *  Tie point limit. Default: 4000
	 */
	public void setTiepointLimit(int value) {
		setParameter("tiepoint_limit", (Object) value);
	}

	/**
	 *  Tie point limit. Default: 4000
	 */
	public int getTiepointLimit() {
		return (int) getParameter("tiepoint_limit");
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
	 *  Number of image pairs in a workitem. Default: 80
	 */
	public void setWorkitemSizePairs(int value) {
		setParameter("workitem_size_pairs", (Object) value);
	}

	/**
	 *  Number of image pairs in a workitem. Default: 80
	 */
	public int getWorkitemSizePairs() {
		return (int) getParameter("workitem_size_pairs");
	}

}
