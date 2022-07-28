package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class AnalyzePhotos extends Task {

	public AnalyzePhotos() {
		super("AnalyzePhotos");
	}

	/**
	 *  List of cameras to be analyzed.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  List of cameras to be analyzed.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
	}

	/**
	 *  Constrain analyzed image region by mask.
	 */
	public void setFilterMask(boolean value) {
		setParameter("filter_mask", (Object) value);
	}

	/**
	 *  Constrain analyzed image region by mask.
	 */
	public boolean getFilterMask() {
		return (boolean) getParameter("filter_mask");
	}

}
