package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportShapes extends Task {

	public ImportShapes() {
		super("ImportShapes");
	}

	/**
	 *  Boundary type to be applied to imported shapes. Default: Shape.BoundaryType.NoBoundary
	 */
	public void setBoundaryType(Shape.BoundaryType value) {
		setParameter("boundary_type", (Object) value);
	}

	/**
	 *  Boundary type to be applied to imported shapes. Default: Shape.BoundaryType.NoBoundary
	 */
	public Shape.BoundaryType getBoundaryType() {
		return (Shape.BoundaryType) getParameter("boundary_type");
	}

	/**
	 *  Column order in csv format (n - label, x/y/z - coordinates, d - description, [] - group of multiple values, | - column separator within group).
	 */
	public void setColumns(String value) {
		setParameter("columns", (Object) value);
	}

	/**
	 *  Column order in csv format (n - label, x/y/z - coordinates, d - description, [] - group of multiple values, | - column separator within group).
	 */
	public String getColumns() {
		return (String) getParameter("columns");
	}

	/**
	 *  Reference data coordinate system (csv format only).
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Reference data coordinate system (csv format only).
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  Column delimiter in csv format.
	 */
	public void setDelimiter(String value) {
		setParameter("delimiter", (Object) value);
	}

	/**
	 *  Column delimiter in csv format.
	 */
	public String getDelimiter() {
		return (String) getParameter("delimiter");
	}

	/**
	 *  Shapes format. Default: ShapesFormat.ShapesFormatNone
	 */
	public void setFormat(ShapesFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Shapes format. Default: ShapesFormat.ShapesFormatNone
	 */
	public ShapesFormat getFormat() {
		return (ShapesFormat) getParameter("format");
	}

	/**
	 *  Combine consequitive delimiters in csv format.
	 */
	public void setGroupDelimiters(boolean value) {
		setParameter("group_delimiters", (Object) value);
	}

	/**
	 *  Combine consequitive delimiters in csv format.
	 */
	public boolean getGroupDelimiters() {
		return (boolean) getParameter("group_delimiters");
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
	 *  Replace current shapes with new data.
	 */
	public void setReplace(boolean value) {
		setParameter("replace", (Object) value);
	}

	/**
	 *  Replace current shapes with new data.
	 */
	public boolean getReplace() {
		return (boolean) getParameter("replace");
	}

	/**
	 *  Number of rows to skip in (csv format only). Default: 0
	 */
	public void setSkipRows(int value) {
		setParameter("skip_rows", (Object) value);
	}

	/**
	 *  Number of rows to skip in (csv format only). Default: 0
	 */
	public int getSkipRows() {
		return (int) getParameter("skip_rows");
	}

}
