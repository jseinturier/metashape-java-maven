package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class LoadProject extends Task {

	public LoadProject() {
		super("LoadProject");
	}

	/**
	 *  Path to project file.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to project file.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Open project in read only mode.
	 */
	public void setReadOnly(boolean value) {
		setParameter("read_only", (Object) value);
	}

	/**
	 *  Open project in read only mode.
	 */
	public boolean getReadOnly() {
		return (boolean) getParameter("read_only");
	}

}
