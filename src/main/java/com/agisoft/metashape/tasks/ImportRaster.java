package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ImportRaster extends Task {

	public ImportRaster() {
		super("ImportRaster");
	}

	/**
	 *  Default coordinate system if not specified in GeoTIFF file.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Default coordinate system if not specified in GeoTIFF file.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  No-data value valid flag.
	 */
	public void setHasNodataValue(boolean value) {
		setParameter("has_nodata_value", (Object) value);
	}

	/**
	 *  No-data value valid flag.
	 */
	public boolean getHasNodataValue() {
		return (boolean) getParameter("has_nodata_value");
	}

	/**
	 *  No-data value. Default: -32767.0
	 */
	public void setNodataValue(double value) {
		setParameter("nodata_value", (Object) value);
	}

	/**
	 *  No-data value. Default: -32767.0
	 */
	public double getNodataValue() {
		return (double) getParameter("nodata_value");
	}

	/**
	 *  Path to elevation model in GeoTIFF format.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to elevation model in GeoTIFF format.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Type of raster layer to import. Default: DataSource.ElevationData
	 */
	public void setRasterType(DataSource value) {
		setParameter("raster_type", (Object) value);
	}

	/**
	 *  Type of raster layer to import. Default: DataSource.ElevationData
	 */
	public DataSource getRasterType() {
		return (DataSource) getParameter("raster_type");
	}

}
