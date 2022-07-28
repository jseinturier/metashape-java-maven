package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class CloseHoles extends Task {

	public CloseHoles() {
		super("CloseHoles");
	}

	/**
	 *  Close holes within selection.
	 */
	public void setApplyToSelection(boolean value) {
		setParameter("apply_to_selection", (Object) value);
	}

	/**
	 *  Close holes within selection.
	 */
	public boolean getApplyToSelection() {
		return (boolean) getParameter("apply_to_selection");
	}

	/**
	 *  Hole size threshold in percents. Default: 100
	 */
	public void setLevel(int value) {
		setParameter("level", (Object) value);
	}

	/**
	 *  Hole size threshold in percents. Default: 100
	 */
	public int getLevel() {
		return (int) getParameter("level");
	}

}
