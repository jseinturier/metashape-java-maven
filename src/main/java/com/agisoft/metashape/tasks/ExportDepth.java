package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportDepth extends Task {

	public ExportDepth() {
		super("ExportDepth");
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
	 *  Enable export of depth map.
	 */
	public void setExportDepth(boolean value) {
		setParameter("export_depth", (Object) value);
	}

	/**
	 *  Enable export of depth map.
	 */
	public boolean getExportDepth() {
		return (boolean) getParameter("export_depth");
	}

	/**
	 *  Enable export of diffuse map.
	 */
	public void setExportDiffuse(boolean value) {
		setParameter("export_diffuse", (Object) value);
	}

	/**
	 *  Enable export of diffuse map.
	 */
	public boolean getExportDiffuse() {
		return (boolean) getParameter("export_diffuse");
	}

	/**
	 *  Enable export of normal map.
	 */
	public void setExportNormals(boolean value) {
		setParameter("export_normals", (Object) value);
	}

	/**
	 *  Enable export of normal map.
	 */
	public boolean getExportNormals() {
		return (boolean) getParameter("export_normals");
	}

	/**
	 *  Path to depth map.
	 */
	public void setPathDepth(String value) {
		setParameter("path_depth", (Object) value);
	}

	/**
	 *  Path to depth map.
	 */
	public String getPathDepth() {
		return (String) getParameter("path_depth");
	}

	/**
	 *  Path to diffuse map.
	 */
	public void setPathDiffuse(String value) {
		setParameter("path_diffuse", (Object) value);
	}

	/**
	 *  Path to diffuse map.
	 */
	public String getPathDiffuse() {
		return (String) getParameter("path_diffuse");
	}

	/**
	 *  Path to normal map.
	 */
	public void setPathNormals(String value) {
		setParameter("path_normals", (Object) value);
	}

	/**
	 *  Path to normal map.
	 */
	public String getPathNormals() {
		return (String) getParameter("path_normals");
	}

}
