package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportReference extends Task {

	public ExportReference() {
		super("ExportReference");
	}

	/**
	 *  Column order in csv format (n - label, o - enabled flag, x/y/z - coordinates, X/Y/Z - coordinate accuracy, a/b/c - rotation angles, A/B/C - rotation angle accuracy, u/v/w - estimated coordinates, U/V/W - coordinate errors, d/e/f - estimated orientation angles, D/E/F - orientation errors, p/q/r - estimated coordinates variance, i/j/k - estimated orientation angles variance, [] - group of multiple values, | - column separator within group).
	 */
	public void setColumns(String value) {
		setParameter("columns", (Object) value);
	}

	/**
	 *  Column order in csv format (n - label, o - enabled flag, x/y/z - coordinates, X/Y/Z - coordinate accuracy, a/b/c - rotation angles, A/B/C - rotation angle accuracy, u/v/w - estimated coordinates, U/V/W - coordinate errors, d/e/f - estimated orientation angles, D/E/F - orientation errors, p/q/r - estimated coordinates variance, i/j/k - estimated orientation angles variance, [] - group of multiple values, | - column separator within group).
	 */
	public String getColumns() {
		return (String) getParameter("columns");
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
	 *  Export format. Default: ReferenceFormat.ReferenceFormatNone
	 */
	public void setFormat(ReferenceFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Export format. Default: ReferenceFormat.ReferenceFormatNone
	 */
	public ReferenceFormat getFormat() {
		return (ReferenceFormat) getParameter("format");
	}

	/**
	 *  Items to export in CSV format. Default: ReferenceItems.ReferenceItemsCameras
	 */
	public void setItems(ReferenceItems value) {
		setParameter("items", (Object) value);
	}

	/**
	 *  Items to export in CSV format. Default: ReferenceItems.ReferenceItemsCameras
	 */
	public ReferenceItems getItems() {
		return (ReferenceItems) getParameter("items");
	}

	/**
	 *  Path to the output file.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to the output file.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Number of digits after the decimal point (for CSV format). Default: 6
	 */
	public void setPrecision(int value) {
		setParameter("precision", (Object) value);
	}

	/**
	 *  Number of digits after the decimal point (for CSV format). Default: 6
	 */
	public int getPrecision() {
		return (int) getParameter("precision");
	}

}
