package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportReference extends Task {

	public ImportReference() {
		super("ImportReference");
	}

	/**
	 *  Column order in csv format (n - label, o - enabled flag, x/y/z - coordinates, X/Y/Z - coordinate accuracy, a/b/c - rotation angles, A/B/C - rotation angle accuracy, [] - group of multiple values, | - column separator within group).
	 */
	public void setColumns(String value) {
		setParameter("columns", (Object) value);
	}

	/**
	 *  Column order in csv format (n - label, o - enabled flag, x/y/z - coordinates, X/Y/Z - coordinate accuracy, a/b/c - rotation angles, A/B/C - rotation angle accuracy, [] - group of multiple values, | - column separator within group).
	 */
	public String getColumns() {
		return (String) getParameter("columns");
	}

	/**
	 *  Create markers for missing entries (csv format only).
	 */
	public void setCreateMarkers(boolean value) {
		setParameter("create_markers", (Object) value);
	}

	/**
	 *  Create markers for missing entries (csv format only).
	 */
	public boolean getCreateMarkers() {
		return (boolean) getParameter("create_markers");
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
	 *  File format. Default: ReferenceFormat.ReferenceFormatCSV
	 */
	public void setFormat(ReferenceFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  File format. Default: ReferenceFormat.ReferenceFormatCSV
	 */
	public ReferenceFormat getFormat() {
		return (ReferenceFormat) getParameter("format");
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
	 *  Matches reference data based on coordinates alone (csv format only).
	 */
	public void setIgnoreLabels(boolean value) {
		setParameter("ignore_labels", (Object) value);
	}

	/**
	 *  Matches reference data based on coordinates alone (csv format only).
	 */
	public boolean getIgnoreLabels() {
		return (boolean) getParameter("ignore_labels");
	}

	/**
	 *  List of items to load reference for (csv format only). Default: ReferenceItems.7
	 */
	public void setItems(ReferenceItems value) {
		setParameter("items", (Object) value);
	}

	/**
	 *  List of items to load reference for (csv format only). Default: ReferenceItems.7
	 */
	public ReferenceItems getItems() {
		return (ReferenceItems) getParameter("items");
	}

	/**
	 *  Path to the file with reference data.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to the file with reference data.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Shutter lag in seconds (APM format only). Default: 0.0
	 */
	public void setShutterLag(double value) {
		setParameter("shutter_lag", (Object) value);
	}

	/**
	 *  Shutter lag in seconds (APM format only). Default: 0.0
	 */
	public double getShutterLag() {
		return (double) getParameter("shutter_lag");
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

	/**
	 *  Error threshold in meters used when ignore_labels is set (csv format only). Default: 0.1
	 */
	public void setThreshold(double value) {
		setParameter("threshold", (Object) value);
	}

	/**
	 *  Error threshold in meters used when ignore_labels is set (csv format only). Default: 0.1
	 */
	public double getThreshold() {
		return (double) getParameter("threshold");
	}

}
