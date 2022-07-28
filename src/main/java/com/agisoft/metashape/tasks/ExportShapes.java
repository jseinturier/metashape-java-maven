package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportShapes extends Task {

	public ExportShapes() {
		super("ExportShapes");
	}

	/**
	 *  Output coordinate system.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Output coordinate system.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  Export format. Default: ShapesFormat.ShapesFormatNone
	 */
	public void setFormat(ShapesFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Export format. Default: ShapesFormat.ShapesFormatNone
	 */
	public ShapesFormat getFormat() {
		return (ShapesFormat) getParameter("format");
	}

	/**
	 *  A list of shape groups to export.
	 */
	public void setGroups(int[] value) {
		setParameter("groups", (Object) value);
	}

	/**
	 *  A list of shape groups to export.
	 */
	public int[] getGroups() {
		return (int[]) getParameter("groups");
	}

	/**
	 *  Path to shape file.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to shape file.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Save polygons as polylines.
	 */
	public void setPolygonsAsPolylines(boolean value) {
		setParameter("polygons_as_polylines", (Object) value);
	}

	/**
	 *  Save polygons as polylines.
	 */
	public boolean getPolygonsAsPolylines() {
		return (boolean) getParameter("polygons_as_polylines");
	}

	/**
	 *  Export attributes.
	 */
	public void setSaveAttributes(boolean value) {
		setParameter("save_attributes", (Object) value);
	}

	/**
	 *  Export attributes.
	 */
	public boolean getSaveAttributes() {
		return (boolean) getParameter("save_attributes");
	}

	/**
	 *  Export labels.
	 */
	public void setSaveLabels(boolean value) {
		setParameter("save_labels", (Object) value);
	}

	/**
	 *  Export labels.
	 */
	public boolean getSaveLabels() {
		return (boolean) getParameter("save_labels");
	}

	/**
	 *  Export points.
	 */
	public void setSavePoints(boolean value) {
		setParameter("save_points", (Object) value);
	}

	/**
	 *  Export points.
	 */
	public boolean getSavePoints() {
		return (boolean) getParameter("save_points");
	}

	/**
	 *  Export polygons.
	 */
	public void setSavePolygons(boolean value) {
		setParameter("save_polygons", (Object) value);
	}

	/**
	 *  Export polygons.
	 */
	public boolean getSavePolygons() {
		return (boolean) getParameter("save_polygons");
	}

	/**
	 *  Export polylines.
	 */
	public void setSavePolylines(boolean value) {
		setParameter("save_polylines", (Object) value);
	}

	/**
	 *  Export polylines.
	 */
	public boolean getSavePolylines() {
		return (boolean) getParameter("save_polylines");
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
