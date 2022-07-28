package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class MergeAssets extends Task {

	public MergeAssets() {
		super("MergeAssets");
	}

	/**
	 *  List of assets to process.
	 */
	public void setAssets(int[] value) {
		setParameter("assets", (Object) value);
	}

	/**
	 *  List of assets to process.
	 */
	public int[] getAssets() {
		return (int[]) getParameter("assets");
	}

	/**
	 *  Asset type. Default: DataSource.DenseCloudData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Asset type. Default: DataSource.DenseCloudData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
	}

}
