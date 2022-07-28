package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class TransformRaster extends Task {

	public TransformRaster() {
		super("TransformRaster");
	}

	/**
	 *  Asset key to transform. Default: -1
	 */
	public void setAsset(int value) {
		setParameter("asset", (Object) value);
	}

	/**
	 *  Asset key to transform. Default: -1
	 */
	public int getAsset() {
		return (int) getParameter("asset");
	}

	/**
	 *  Selects between DEM and orthomosaic. Default: DataSource.ElevationData
	 */
	public void setDataSource(DataSource value) {
		setParameter("data_source", (Object) value);
	}

	/**
	 *  Selects between DEM and orthomosaic. Default: DataSource.ElevationData
	 */
	public DataSource getDataSource() {
		return (DataSource) getParameter("data_source");
	}

	/**
	 *  Raster height. Default: 0
	 */
	public void setHeight(int value) {
		setParameter("height", (Object) value);
	}

	/**
	 *  Raster height. Default: 0
	 */
	public int getHeight() {
		return (int) getParameter("height");
	}

	/**
	 *  No-data value (DEM export only). Default: -32767.0
	 */
	public void setNodataValue(double value) {
		setParameter("nodata_value", (Object) value);
	}

	/**
	 *  No-data value (DEM export only). Default: -32767.0
	 */
	public double getNodataValue() {
		return (double) getParameter("nodata_value");
	}

	/**
	 *  Use north-up orientation for export.
	 */
	public void setNorthUp(boolean value) {
		setParameter("north_up", (Object) value);
	}

	/**
	 *  Use north-up orientation for export.
	 */
	public boolean getNorthUp() {
		return (boolean) getParameter("north_up");
	}

	/**
	 *  Operand asset key. Default: -1
	 */
	public void setOperandAsset(int value) {
		setParameter("operand_asset", (Object) value);
	}

	/**
	 *  Operand asset key. Default: -1
	 */
	public int getOperandAsset() {
		return (int) getParameter("operand_asset");
	}

	/**
	 *  Operand chunk key. Default: -1
	 */
	public void setOperandChunk(int value) {
		setParameter("operand_chunk", (Object) value);
	}

	/**
	 *  Operand chunk key. Default: -1
	 */
	public int getOperandChunk() {
		return (int) getParameter("operand_chunk");
	}

	/**
	 *  Operand frame key. Default: -1
	 */
	public void setOperandFrame(int value) {
		setParameter("operand_frame", (Object) value);
	}

	/**
	 *  Operand frame key. Default: -1
	 */
	public int getOperandFrame() {
		return (int) getParameter("operand_frame");
	}

	/**
	 *  Output projection.
	 */
	public void setProjection(OrthoProjection value) {
		setParameter("projection", (Object) value);
	}

	/**
	 *  Output projection.
	 */
	public OrthoProjection getProjection() {
		return (OrthoProjection) getParameter("projection");
	}

	/**
	 *  Region to be processed.
	 */
	public void setRegion(BBox value) {
		setParameter("region", (Object) value);
	}

	/**
	 *  Region to be processed.
	 */
	public BBox getRegion() {
		return (BBox) getParameter("region");
	}

	/**
	 *  Output resolution in meters. Default: 0.0
	 */
	public void setResolution(double value) {
		setParameter("resolution", (Object) value);
	}

	/**
	 *  Output resolution in meters. Default: 0.0
	 */
	public double getResolution() {
		return (double) getParameter("resolution");
	}

	/**
	 *  Pixel size in the X dimension in projected units. Default: 0.0
	 */
	public void setResolutionX(double value) {
		setParameter("resolution_x", (Object) value);
	}

	/**
	 *  Pixel size in the X dimension in projected units. Default: 0.0
	 */
	public double getResolutionX() {
		return (double) getParameter("resolution_x");
	}

	/**
	 *  Pixel size in the Y dimension in projected units. Default: 0.0
	 */
	public void setResolutionY(double value) {
		setParameter("resolution_y", (Object) value);
	}

	/**
	 *  Pixel size in the Y dimension in projected units. Default: 0.0
	 */
	public double getResolutionY() {
		return (double) getParameter("resolution_y");
	}

	/**
	 *  Subtraction flag.
	 */
	public void setSubtract(boolean value) {
		setParameter("subtract", (Object) value);
	}

	/**
	 *  Subtraction flag.
	 */
	public boolean getSubtract() {
		return (boolean) getParameter("subtract");
	}

	/**
	 *  Raster width. Default: 0
	 */
	public void setWidth(int value) {
		setParameter("width", (Object) value);
	}

	/**
	 *  Raster width. Default: 0
	 */
	public int getWidth() {
		return (int) getParameter("width");
	}

	/**
	 *  2x3 raster-to-world transformation matrix.
	 */
	public void setWorldTransform(Matrix value) {
		setParameter("world_transform", (Object) value);
	}

	/**
	 *  2x3 raster-to-world transformation matrix.
	 */
	public Matrix getWorldTransform() {
		return (Matrix) getParameter("world_transform");
	}

}
