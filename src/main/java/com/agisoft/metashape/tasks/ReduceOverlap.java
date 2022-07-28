package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ReduceOverlap extends Task {

	public ReduceOverlap() {
		super("ReduceOverlap");
	}

	/**
	 *  Target number of cameras observing each point of the surface. Default: 3
	 */
	public void setOverlap(int value) {
		setParameter("overlap", (Object) value);
	}

	/**
	 *  Target number of cameras observing each point of the surface. Default: 3
	 */
	public int getOverlap() {
		return (int) getParameter("overlap");
	}

	/**
	 *  Focus on model selection.
	 */
	public void setUseSelection(boolean value) {
		setParameter("use_selection", (Object) value);
	}

	/**
	 *  Focus on model selection.
	 */
	public boolean getUseSelection() {
		return (boolean) getParameter("use_selection");
	}

}
