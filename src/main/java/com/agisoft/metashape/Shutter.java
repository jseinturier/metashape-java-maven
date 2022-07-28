package com.agisoft.metashape;

/**
 * Rolling shutter correction model.
 */
public class Shutter {

	private Matrix rotation;
	private Vector translation;

	public Shutter() {
		rotation = Matrix.makeDiag(new Vector(1, 1, 1));
		translation = new Vector(0, 0, 0);
	}

	public void setTranslation(Vector translation) {
		this.translation = translation;
	}

	public Vector getTranslation() { return translation; }

	public void setRotation(Matrix rotation) {
		this.rotation = rotation;
	}

	public Matrix getRotation() { return rotation; }

}
