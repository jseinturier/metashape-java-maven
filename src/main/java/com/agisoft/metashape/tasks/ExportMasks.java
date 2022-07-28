package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportMasks extends Task {

	public ExportMasks() {
		super("ExportMasks");
	}

	/**
	 *  List of cameras to process.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  List of cameras to process.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
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
