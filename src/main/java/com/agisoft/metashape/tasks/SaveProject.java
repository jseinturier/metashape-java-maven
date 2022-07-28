package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class SaveProject extends Task {

	public SaveProject() {
		super("SaveProject");
	}

	/**
	 *  List of chunks to be saved.
	 */
	public void setChunks(int[] value) {
		setParameter("chunks", (Object) value);
	}

	/**
	 *  List of chunks to be saved.
	 */
	public int[] getChunks() {
		return (int[]) getParameter("chunks");
	}

	/**
	 *  Path to project.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to project.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Project version to save.
	 */
	public void setVersion(String value) {
		setParameter("version", (Object) value);
	}

	/**
	 *  Project version to save.
	 */
	public String getVersion() {
		return (String) getParameter("version");
	}

}
