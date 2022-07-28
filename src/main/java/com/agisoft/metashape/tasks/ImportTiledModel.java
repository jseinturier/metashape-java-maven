package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportTiledModel extends Task {

	public ImportTiledModel() {
		super("ImportTiledModel");
	}

	/**
	 *  Path to tiled model.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to tiled model.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

}
