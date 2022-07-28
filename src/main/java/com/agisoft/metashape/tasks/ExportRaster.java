package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportRaster extends Task {

	public ExportRaster() {
		super("ExportRaster");
	}

	/**
	 *  Raster block height in pixels. Default: 10000
	 */
	public void setBlockHeight(int value) {
		setParameter("block_height", (Object) value);
	}

	/**
	 *  Raster block height in pixels. Default: 10000
	 */
	public int getBlockHeight() {
		return (int) getParameter("block_height");
	}

	/**
	 *  Raster block width in pixels. Default: 10000
	 */
	public void setBlockWidth(int value) {
		setParameter("block_width", (Object) value);
	}

	/**
	 *  Raster block width in pixels. Default: 10000
	 */
	public int getBlockWidth() {
		return (int) getParameter("block_width");
	}

	/**
	 *  Clip raster to boundary shapes.
	 */
	public void setClipToBoundary(boolean value) {
		setParameter("clip_to_boundary", (Object) value);
	}

	/**
	 *  Clip raster to boundary shapes.
	 */
	public boolean getClipToBoundary() {
		return (boolean) getParameter("clip_to_boundary");
	}

	/**
	 *  Export description.
	 */
	public void setDescription(String value) {
		setParameter("description", (Object) value);
	}

	/**
	 *  Export description.
	 */
	public String getDescription() {
		return (String) getParameter("description");
	}

	/**
	 *  Export format. Default: RasterFormat.RasterFormatTiles
	 */
	public void setFormat(RasterFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Export format. Default: RasterFormat.RasterFormatTiles
	 */
	public RasterFormat getFormat() {
		return (RasterFormat) getParameter("format");
	}

	/**
	 *  Use global profile (GeoPackage format only).
	 */
	public void setGlobalProfile(boolean value) {
		setParameter("global_profile", (Object) value);
	}

	/**
	 *  Use global profile (GeoPackage format only).
	 */
	public boolean getGlobalProfile() {
		return (boolean) getParameter("global_profile");
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
	 *  Image compression parameters.
	 */
	public void setImageCompression(ImageCompression value) {
		setParameter("image_compression", (Object) value);
	}

	/**
	 *  Image compression parameters.
	 */
	public ImageCompression getImageCompression() {
		return (ImageCompression) getParameter("image_compression");
	}

	/**
	 *  Optional description to be added to image files.
	 */
	public void setImageDescription(String value) {
		setParameter("image_description", (Object) value);
	}

	/**
	 *  Optional description to be added to image files.
	 */
	public String getImageDescription() {
		return (String) getParameter("image_description");
	}

	/**
	 *  Tile format. Default: ImageFormat.ImageFormatNone
	 */
	public void setImageFormat(ImageFormat value) {
		setParameter("image_format", (Object) value);
	}

	/**
	 *  Tile format. Default: ImageFormat.ImageFormatNone
	 */
	public ImageFormat getImageFormat() {
		return (ImageFormat) getParameter("image_format");
	}

	/**
	 *  Maximum zoom level (GeoPackage, Google Map Tiles, MBTiles and World Wind Tiles formats only). Default: -1
	 */
	public void setMaxZoomLevel(int value) {
		setParameter("max_zoom_level", (Object) value);
	}

	/**
	 *  Maximum zoom level (GeoPackage, Google Map Tiles, MBTiles and World Wind Tiles formats only). Default: -1
	 */
	public int getMaxZoomLevel() {
		return (int) getParameter("max_zoom_level");
	}

	/**
	 *  Minimum zoom level (GeoPackage, Google Map Tiles, MBTiles and World Wind Tiles formats only). Default: -1
	 */
	public void setMinZoomLevel(int value) {
		setParameter("min_zoom_level", (Object) value);
	}

	/**
	 *  Minimum zoom level (GeoPackage, Google Map Tiles, MBTiles and World Wind Tiles formats only). Default: -1
	 */
	public int getMinZoomLevel() {
		return (int) getParameter("min_zoom_level");
	}

	/**
	 *  Enable network links generation for KMZ format.
	 */
	public void setNetworkLinks(boolean value) {
		setParameter("network_links", (Object) value);
	}

	/**
	 *  Enable network links generation for KMZ format.
	 */
	public boolean getNetworkLinks() {
		return (boolean) getParameter("network_links");
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
	 *  Path to output orthomosaic.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to output orthomosaic.
	 */
	public String getPath() {
		return (String) getParameter("path");
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
	 *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
	 */
	public void setRasterTransform(RasterTransformType value) {
		setParameter("raster_transform", (Object) value);
	}

	/**
	 *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
	 */
	public RasterTransformType getRasterTransform() {
		return (RasterTransformType) getParameter("raster_transform");
	}

	/**
	 *  Region to be exported.
	 */
	public void setRegion(BBox value) {
		setParameter("region", (Object) value);
	}

	/**
	 *  Region to be exported.
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
	 *  Enable alpha channel generation.
	 */
	public void setSaveAlpha(boolean value) {
		setParameter("save_alpha", (Object) value);
	}

	/**
	 *  Enable alpha channel generation.
	 */
	public boolean getSaveAlpha() {
		return (boolean) getParameter("save_alpha");
	}

	/**
	 *  Enable kml file generation.
	 */
	public void setSaveKml(boolean value) {
		setParameter("save_kml", (Object) value);
	}

	/**
	 *  Enable kml file generation.
	 */
	public boolean getSaveKml() {
		return (boolean) getParameter("save_kml");
	}

	/**
	 *  Enable tile scheme files generation.
	 */
	public void setSaveScheme(boolean value) {
		setParameter("save_scheme", (Object) value);
	}

	/**
	 *  Enable tile scheme files generation.
	 */
	public boolean getSaveScheme() {
		return (boolean) getParameter("save_scheme");
	}

	/**
	 *  Enable world file generation.
	 */
	public void setSaveWorld(boolean value) {
		setParameter("save_world", (Object) value);
	}

	/**
	 *  Enable world file generation.
	 */
	public boolean getSaveWorld() {
		return (boolean) getParameter("save_world");
	}

	/**
	 *  Selects between DEM and orthomosaic. Default: DataSource.OrthomosaicData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Selects between DEM and orthomosaic. Default: DataSource.OrthomosaicData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
	}

	/**
	 *  Split raster in blocks.
	 */
	public void setSplitInBlocks(boolean value) {
		setParameter("split_in_blocks", (Object) value);
	}

	/**
	 *  Split raster in blocks.
	 */
	public boolean getSplitInBlocks() {
		return (boolean) getParameter("split_in_blocks");
	}

	/**
	 *  Tile height in pixels. Default: 256
	 */
	public void setTileHeight(int value) {
		setParameter("tile_height", (Object) value);
	}

	/**
	 *  Tile height in pixels. Default: 256
	 */
	public int getTileHeight() {
		return (int) getParameter("tile_height");
	}

	/**
	 *  Tile width in pixels. Default: 256
	 */
	public void setTileWidth(int value) {
		setParameter("tile_width", (Object) value);
	}

	/**
	 *  Tile width in pixels. Default: 256
	 */
	public int getTileWidth() {
		return (int) getParameter("tile_width");
	}

	/**
	 *  Export title.
	 */
	public void setTitle(String value) {
		setParameter("title", (Object) value);
	}

	/**
	 *  Export title.
	 */
	public String getTitle() {
		return (String) getParameter("title");
	}

	/**
	 *  Enable white background.
	 */
	public void setWhiteBackground(boolean value) {
		setParameter("white_background", (Object) value);
	}

	/**
	 *  Enable white background.
	 */
	public boolean getWhiteBackground() {
		return (boolean) getParameter("white_background");
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
