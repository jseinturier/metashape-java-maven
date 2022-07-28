package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class CalibrateColors extends Task {

	public CalibrateColors() {
		super("CalibrateColors");
	}

	/**
	 *  List of cameras to process.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  List of cameras to process.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
	}

	/**
	 *  Source data for calibration. Default: DataSource.ModelData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Source data for calibration. Default: DataSource.ModelData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
	}

	/**
	 *  Calibrate white balance.
	 */
	public void setWhiteBalance(boolean value) {
		setParameter("white_balance", (Object) value);
	}

	/**
	 *  Calibrate white balance.
	 */
	public boolean getWhiteBalance() {
		return (boolean) getParameter("white_balance");
	}

}
