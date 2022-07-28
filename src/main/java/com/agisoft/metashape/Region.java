package com.agisoft.metashape;

/**
 * Region parameters.
 */
public class Region {

	private Matrix rotation;
	private Vector center;
	private Vector size;

	public Region() {
		rotation = Matrix.makeDiag(new Vector(1, 1, 1));
		center = new Vector(0, 0, 0);
		size = new Vector(0, 0, 0);
	}

	/**
	 *  Region rotation matrix.
	 */
	public void setRotation(Matrix rotation) {
		this.rotation = rotation;
	}

	/**
	 *  Region rotation matrix.
	 */
	public Matrix getRotation() { return rotation; }

	/**
	 *  Region center coordinates.
	 */
	public void setCenter(Vector center) {
		this.center = center;
	}

	/**
	 *  Region center coordinates.
	 */
	public Vector getCenter() { return center; }

	/**
	 *  Region size.
	 */
	public void setSize(Vector size) {
		this.size = size;
	}

	/**
	 *  Region size.
	 */
	public Vector getSize() { return size; }

}
