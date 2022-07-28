package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class DuplicateAsset extends Task {

	public DuplicateAsset() {
		super("DuplicateAsset");
	}

	/**
	 *  Asset key. Default: -1
	 */
	public void setAssetKey(int value) {
		setParameter("asset_key", (Object) value);
	}

	/**
	 *  Asset key. Default: -1
	 */
	public int getAssetKey() {
		return (int) getParameter("asset_key");
	}

	/**
	 *  Asset type. Default: DataSource.ModelData
	 */
	public void setAssetType(DataSource value) {
		setParameter("asset_type", (Object) value);
	}

	/**
	 *  Asset type. Default: DataSource.ModelData
	 */
	public DataSource getAssetType() {
		return (DataSource) getParameter("asset_type");
	}

	/**
	 *  Clip to boundary shapes.
	 */
	public void setClipToBoundary(boolean value) {
		setParameter("clip_to_boundary", (Object) value);
	}

	/**
	 *  Clip to boundary shapes.
	 */
	public boolean getClipToBoundary() {
		return (boolean) getParameter("clip_to_boundary");
	}

}
