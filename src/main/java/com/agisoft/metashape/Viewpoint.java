package com.agisoft.metashape;

public class Viewpoint {

	private int cx;
	private int cy;
	private Vector O;
	private Matrix R;
	private double scale;
	private double angle;

	public Viewpoint() {
		cx = 0;
		cy = 0;
		O = new Vector(0, 0, 0);
		R = Matrix.makeDiag(new Vector(1, 1, 1));
		scale = 1;
		angle = 1;
	}

	/**
	 *  OpenGL window width.
	 */
	public void setCx(int value) {
		this.cx = value;
	}

	/**
	 *  OpenGL window width.
	 */
	public int getCx() {
		return cx;
	}

	/**
	 *  OpenGL window height.
	 */
	public void setCy(int value) {
		this.cy = value;
	}

	/**
	 *  OpenGL window height.
	 */
	public int getCy() {
		return cy;
	}

	/**
	 *  Center of orbit.
	 */
	public void setO(Vector value) {
		this.O = value;
	}

	/**
	 *  Center of orbit.
	 */
	public Vector getO() { return O; }

	/**
	 *  Camera rotation matrix.
	 */
	public void setR(Matrix value) {
		this.R = value;
	}

	/**
	 *  Camera rotation matrix.
	 */
	public Matrix getR() { return R; }

	/**
	 *  Camera magnification defined by distance to the center of rotation.
	 */
	public void setScale(double value) {
		this.scale = value;
	}

	/**
	 *  Camera magnification defined by distance to the center of rotation.
	 */
	public double getScale() {
		return scale;
	}

	/**
	 *  Camera vertical field of view in degrees.
	 */
	public void setAngle(double value) {
		this.angle = value;
	}

	/**
	 *  Camera vertical field of view in degrees.
	 */
	public double getAngle() {
		return angle;
	}

}
