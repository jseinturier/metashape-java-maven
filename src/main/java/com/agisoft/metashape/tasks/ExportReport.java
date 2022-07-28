package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportReport extends Task {

	public ExportReport() {
		super("ExportReport");
	}

	/**
	 *  Report description.
	 */
	public void setDescription(String value) {
		setParameter("description", (Object) value);
	}

	/**
	 *  Report description.
	 */
	public String getDescription() {
		return (String) getParameter("description");
	}

	/**
	 *  Font size (pt). Default: 12
	 */
	public void setFontSize(int value) {
		setParameter("font_size", (Object) value);
	}

	/**
	 *  Font size (pt). Default: 12
	 */
	public int getFontSize() {
		return (int) getParameter("font_size");
	}

	/**
	 *  Include system information.
	 */
	public void setIncludeSystemInfo(boolean value) {
		setParameter("include_system_info", (Object) value);
	}

	/**
	 *  Include system information.
	 */
	public boolean getIncludeSystemInfo() {
		return (boolean) getParameter("include_system_info");
	}

	/**
	 *  Enable page numbers.
	 */
	public void setPageNumbers(boolean value) {
		setParameter("page_numbers", (Object) value);
	}

	/**
	 *  Enable page numbers.
	 */
	public boolean getPageNumbers() {
		return (boolean) getParameter("page_numbers");
	}

	/**
	 *  Path to output report.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to output report.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Report title.
	 */
	public void setTitle(String value) {
		setParameter("title", (Object) value);
	}

	/**
	 *  Report title.
	 */
	public String getTitle() {
		return (String) getParameter("title");
	}

	/**
	 *  A list of user defined settings to include on the Processing Parameters page.
	 */
	public void setUserSettings(Property[] value) {
		setParameter("user_settings", (Object) value);
	}

	/**
	 *  A list of user defined settings to include on the Processing Parameters page.
	 */
	public Property[] getUserSettings() {
		return (Property[]) getParameter("user_settings");
	}

}
