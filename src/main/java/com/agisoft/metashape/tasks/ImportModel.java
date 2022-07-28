package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportModel extends Task {

	public ImportModel() {
		super("ImportModel");
	}

	/**
	 *  Model coordinate system.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Model coordinate system.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  Load UDIM texture layout.
	 */
	public void setDecodeUdim(boolean value) {
		setParameter("decode_udim", (Object) value);
	}

	/**
	 *  Load UDIM texture layout.
	 */
	public boolean getDecodeUdim() {
		return (boolean) getParameter("decode_udim");
	}

	/**
	 *  Model format. Default: ModelFormat.ModelFormatNone
	 */
	public void setFormat(ModelFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Model format. Default: ModelFormat.ModelFormatNone
	 */
	public ModelFormat getFormat() {
		return (ModelFormat) getParameter("format");
	}

	/**
	 *  Path to model.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to model.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Optional shift to be applied to vertex coordinates.
	 */
	public void setShift(Vector value) {
		setParameter("shift", (Object) value);
	}

	/**
	 *  Optional shift to be applied to vertex coordinates.
	 */
	public Vector getShift() {
		return (Vector) getParameter("shift");
	}

}
