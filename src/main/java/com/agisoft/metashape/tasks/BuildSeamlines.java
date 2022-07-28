package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildSeamlines extends Task {

	public BuildSeamlines() {
		super("BuildSeamlines");
	}

	/**
	 *  Contour simplificaion threshold. Default: 1.5
	 */
	public void setEpsilon(double value) {
		setParameter("epsilon", (Object) value);
	}

	/**
	 *  Contour simplificaion threshold. Default: 1.5
	 */
	public double getEpsilon() {
		return (double) getParameter("epsilon");
	}

}
