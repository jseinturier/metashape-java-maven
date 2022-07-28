package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class DecimateModel extends Task {

	public DecimateModel() {
		super("DecimateModel");
	}

	/**
	 *  Apply to selection.
	 */
	public void setApplyToSelection(boolean value) {
		setParameter("apply_to_selection", (Object) value);
	}

	/**
	 *  Apply to selection.
	 */
	public boolean getApplyToSelection() {
		return (boolean) getParameter("apply_to_selection");
	}

	/**
	 *  Model to process. Default: -1
	 */
	public void setAsset(int value) {
		setParameter("asset", (Object) value);
	}

	/**
	 *  Model to process. Default: -1
	 */
	public int getAsset() {
		return (int) getParameter("asset");
	}

	/**
	 *  Target face count. Default: 200000
	 */
	public void setFaceCount(int value) {
		setParameter("face_count", (Object) value);
	}

	/**
	 *  Target face count. Default: 200000
	 */
	public int getFaceCount() {
		return (int) getParameter("face_count");
	}

}
