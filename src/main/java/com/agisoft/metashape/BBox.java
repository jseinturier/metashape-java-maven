package com.agisoft.metashape;

public class BBox {

	private Vector min;
	private Vector max;

	public BBox() {
		min = null;
		max = null;
	}

	public BBox(Vector min, Vector max) {
		this.min = min;
		this.max = max;
	}

	/**
	 *  Minimum bounding box corner.
	 */
	public Vector getMin() {
		return min;
	}

	/**
	 *  Maximum bounding box corner.
	 */
	public Vector getMax() {
		return max;
	}

	/**
	 *  Minimum bounding box corner.
	 */
	public void setMin(Vector value) {
		this.min = value;
	}

	/**
	 *  Maximum bounding box corner.
	 */
	public void setMax(Vector value) {
		this.max = value;
	}

}
