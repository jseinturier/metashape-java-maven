package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportCameras extends Task {

	public ImportCameras() {
		super("ImportCameras");
	}

	/**
	 *  Ground coordinate system.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Ground coordinate system.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  File format. Default: CamerasFormat.CamerasFormatXML
	 */
	public void setFormat(CamerasFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  File format. Default: CamerasFormat.CamerasFormatXML
	 */
	public CamerasFormat getFormat() {
		return (CamerasFormat) getParameter("format");
	}

	/**
	 *  Path to image list file (Bundler format only).
	 */
	public void setImageList(String value) {
		setParameter("image_list", (Object) value);
	}

	/**
	 *  Path to image list file (Bundler format only).
	 */
	public String getImageList() {
		return (String) getParameter("image_list");
	}

	/**
	 *  Image coordinate system (0 - X right, 1 - X up, 2 - X left, 3 - X down). Default: 0
	 */
	public void setImageOrientation(int value) {
		setParameter("image_orientation", (Object) value);
	}

	/**
	 *  Image coordinate system (0 - X right, 1 - X up, 2 - X left, 3 - X down). Default: 0
	 */
	public int getImageOrientation() {
		return (int) getParameter("image_orientation");
	}

	/**
	 *  Enable Bundler image list import.
	 */
	public void setLoadImageList(boolean value) {
		setParameter("load_image_list", (Object) value);
	}

	/**
	 *  Enable Bundler image list import.
	 */
	public boolean getLoadImageList() {
		return (boolean) getParameter("load_image_list");
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
