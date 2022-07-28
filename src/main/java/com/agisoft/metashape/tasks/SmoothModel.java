package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class SmoothModel extends Task {

	public SmoothModel() {
		super("SmoothModel");
	}

	/**
	 *  Apply to selected faces.
	 */
	public void setApplyToSelection(boolean value) {
		setParameter("apply_to_selection", (Object) value);
	}

	/**
	 *  Apply to selected faces.
	 */
	public boolean getApplyToSelection() {
		return (boolean) getParameter("apply_to_selection");
	}

	/**
	 *  Fix borders.
	 */
	public void setFixBorders(boolean value) {
		setParameter("fix_borders", (Object) value);
	}

	/**
	 *  Fix borders.
	 */
	public boolean getFixBorders() {
		return (boolean) getParameter("fix_borders");
	}

	/**
	 *  Preserve edges.
	 */
	public void setPreserveEdges(boolean value) {
		setParameter("preserve_edges", (Object) value);
	}

	/**
	 *  Preserve edges.
	 */
	public boolean getPreserveEdges() {
		return (boolean) getParameter("preserve_edges");
	}

	/**
	 *  Smoothing strength. Default: 3.0
	 */
	public void setStrength(double value) {
		setParameter("strength", (Object) value);
	}

	/**
	 *  Smoothing strength. Default: 3.0
	 */
	public double getStrength() {
		return (double) getParameter("strength");
	}

}
