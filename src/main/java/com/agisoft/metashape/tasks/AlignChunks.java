package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class AlignChunks extends Task {

	public AlignChunks() {
		super("AlignChunks");
	}

	/**
	 *  List of chunks to be aligned.
	 */
	public void setChunks(int[] value) {
		setParameter("chunks", (Object) value);
	}

	/**
	 *  List of chunks to be aligned.
	 */
	public int[] getChunks() {
		return (int[]) getParameter("chunks");
	}

	/**
	 *  Alignment accuracy. Default: 1
	 */
	public void setDownscale(int value) {
		setParameter("downscale", (Object) value);
	}

	/**
	 *  Alignment accuracy. Default: 1
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
	 *  Fit chunk scale during alignment.
	 */
	public void setFitScale(boolean value) {
		setParameter("fit_scale", (Object) value);
	}

	/**
	 *  Fit chunk scale during alignment.
	 */
	public boolean getFitScale() {
		return (boolean) getParameter("fit_scale");
	}

	/**
	 *  Enables image pair preselection.
	 */
	public void setGenericPreselection(boolean value) {
		setParameter("generic_preselection", (Object) value);
	}

	/**
	 *  Enables image pair preselection.
	 */
	public boolean getGenericPreselection() {
		return (boolean) getParameter("generic_preselection");
	}

	/**
	 *  Maximum number of points for each photo. Default: 40000
	 */
	public void setKeypointLimit(int value) {
		setParameter("keypoint_limit", (Object) value);
	}

	/**
	 *  Maximum number of points for each photo. Default: 40000
	 */
	public int getKeypointLimit() {
		return (int) getParameter("keypoint_limit");
	}

	/**
	 *  List of markers to be used for marker based alignment.
	 */
	public void setMarkers(int[] value) {
		setParameter("markers", (Object) value);
	}

	/**
	 *  List of markers to be used for marker based alignment.
	 */
	public int[] getMarkers() {
		return (int[]) getParameter("markers");
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
	 *  Alignment method (0 - point based, 1 - marker based, 2 - camera based). Default: 0
	 */
	public void setMethod(int value) {
		setParameter("method", (Object) value);
	}

	/**
	 *  Alignment method (0 - point based, 1 - marker based, 2 - camera based). Default: 0
	 */
	public int getMethod() {
		return (int) getParameter("method");
	}

	/**
	 *  Chunk to be used as a reference. Default: -1
	 */
	public void setReference(int value) {
		setParameter("reference", (Object) value);
	}

	/**
	 *  Chunk to be used as a reference. Default: -1
	 */
	public int getReference() {
		return (int) getParameter("reference");
	}

}
