package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportLaserScans extends Task {

	public ImportLaserScans() {
		super("ImportLaserScans");
	}

	/**
	 *  List of files to import.
	 */
	public void setFilenames(String[] value) {
		setParameter("filenames", (Object) value);
	}

	/**
	 *  List of files to import.
	 */
	public String[] getFilenames() {
		return (String[]) getParameter("filenames");
	}

	/**
	 *  Point cloud format. Default: PointsFormat.PointsFormatNone
	 */
	public void setFormat(PointsFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Point cloud format. Default: PointsFormat.PointsFormatNone
	 */
	public PointsFormat getFormat() {
		return (PointsFormat) getParameter("format");
	}

	/**
	 *  Path template to output files.
	 */
	public void setImagePath(String value) {
		setParameter("image_path", (Object) value);
	}

	/**
	 *  Path template to output files.
	 */
	public String getImagePath() {
		return (String) getParameter("image_path");
	}

	/**
	 *  Import as a multi-camera system
	 */
	public void setMultiplane(boolean value) {
		setParameter("multiplane", (Object) value);
	}

	/**
	 *  Import as a multi-camera system
	 */
	public boolean getMultiplane() {
		return (boolean) getParameter("multiplane");
	}

}
