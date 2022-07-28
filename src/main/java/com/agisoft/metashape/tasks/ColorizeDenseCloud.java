package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ColorizeDenseCloud extends Task {

	public ColorizeDenseCloud() {
		super("ColorizeDenseCloud");
	}

	/**
	 *  Source data to extract colors from. Default: DataSource.ImagesData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Source data to extract colors from. Default: DataSource.ImagesData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
	}

}
