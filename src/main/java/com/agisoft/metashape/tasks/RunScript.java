package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class RunScript extends Task {

	public RunScript() {
		super("RunScript");
	}

	/**
	 *  Script arguments.
	 */
	public void setArgs(String value) {
		setParameter("args", (Object) value);
	}

	/**
	 *  Script arguments.
	 */
	public String getArgs() {
		return (String) getParameter("args");
	}

	/**
	 *  Script code.
	 */
	public void setCode(String value) {
		setParameter("code", (Object) value);
	}

	/**
	 *  Script code.
	 */
	public String getCode() {
		return (String) getParameter("code");
	}

	/**
	 *  Script path.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Script path.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

}
