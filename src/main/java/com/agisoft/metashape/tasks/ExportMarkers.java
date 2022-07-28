package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportMarkers extends Task {

	public ExportMarkers() {
		super("ExportMarkers");
	}

	/**
	 *  Enables/disables binary encoding for selected format (if applicable).
	 */
	public void setBinary(boolean value) {
		setParameter("binary", (Object) value);
	}

	/**
	 *  Enables/disables binary encoding for selected format (if applicable).
	 */
	public boolean getBinary() {
		return (boolean) getParameter("binary");
	}

	/**
	 *  Output coordinate system.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Output coordinate system.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  Path to output file.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to output file.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

}
