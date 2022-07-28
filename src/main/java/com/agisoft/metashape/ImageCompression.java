package com.agisoft.metashape;

public class ImageCompression {

	private boolean tiff_big;
	private boolean tiff_tiled;
	private boolean tiff_overviews;
	private TiffCompression tiff_compression;
	private int jpeg_quality;

	public ImageCompression() {
		tiff_big = false;
		tiff_tiled = false;
		tiff_overviews = false;
		tiff_compression = TiffCompression.TiffCompressionLZW;
		jpeg_quality = 90;
	}

	public ImageCompression(boolean tiff_big, boolean tiff_tiled, boolean tiff_overviews, TiffCompression tiff_compression, int jpeg_quality) {
		this.tiff_big = tiff_big;
		this.tiff_tiled = tiff_tiled;
		this.tiff_overviews = tiff_overviews;
		this.tiff_compression = tiff_compression;
		this.jpeg_quality = jpeg_quality;
	}

	/**
	 *  Enable BigTIFF compression for TIFF files.
	 */
	public void setTiffBig(boolean value) {
		this.tiff_big = value;
	}

	/**
	 *  Enable BigTIFF compression for TIFF files.
	 */
	public boolean getTiffBig() {
		return tiff_big;
	}

	/**
	 *  Export tiled TIFF.
	 */
	public void setTiffTiled(boolean value) {
		this.tiff_tiled = value;
	}

	/**
	 *  Export tiled TIFF.
	 */
	public boolean getTiffTiled() {
		return tiff_tiled;
	}

	/**
	 *  Enable image pyramid deneration for TIFF files.
	 */
	public void setTiffOverviews(boolean value) {
		tiff_overviews = value;
	}

	/**
	 *  Enable image pyramid deneration for TIFF files.
	 */
	public boolean getTiffOverviews() {
		return tiff_overviews;
	}

	/**
	 *  Tiff compression.
	 */
	public void setTiffCompression(TiffCompression value) {
		this.tiff_compression = value;
	}

	/**
	 *  Tiff compression.
	 */
	public TiffCompression getTiffCompression() {
		return tiff_compression;
	}

	/**
	 *  JPEG quality.
	 */
	public void setJpegQuality(int value) {
		this.jpeg_quality = value;
	}

	/**
	 *  JPEG quality.
	 */
	public int getJpegQuality() {
		return jpeg_quality;
	}

}
