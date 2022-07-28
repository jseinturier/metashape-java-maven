package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportMarkers extends Task {

	public ImportMarkers() {
		super("ImportMarkers");
	}

	/**
	 *  Path to the file.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to the file.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

}
