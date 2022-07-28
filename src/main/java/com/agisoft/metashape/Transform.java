package com.agisoft.metashape;

import java.util.Optional;

/**
 * Transformation between chunk and world coordinates systems.
 */
public class Transform {

	private Optional<Matrix> rotation;
	private Optional<Vector> translation;
	private Optional<Double> scale;

	public Transform() {
		reset();
	}

	/**
	 *  Rotation component, may be null.
	 */
	public void setRotation(Optional<Matrix> rotation) {
		this.rotation = rotation;
	}

	/**
	 *  Rotation component, may be null.
	 */
	public Optional<Matrix> getRotation() {
		return rotation;
	}

	/**
	 *  Translation component, may be null.
	 */
	public void setTranslation(Optional<Vector> translation) {
		this.translation = translation;
	}

	/**
	 *  Translation component, may be null.
	 */
	public Optional<Vector> getTranslation() {
		return translation;
	}

	/**
	 *  Scale component, may be null.
	 */
	public void setScale(Optional<Double> scale) {
		this.scale = scale;
	}

	/**
	 *  Scale component, may be null.
	 */
	public Optional<Double> getScale() {
		return scale;
	}

	/**
	 *  Transformation matrix.
	 */
	public void setMatrix(Matrix matrix) {
		translation = Optional.of(matrix.translation());
		rotation = Optional.of(matrix.rotation());
		scale = Optional.of(matrix.scale());
	}

	/**
	 *  Transformation matrix.
	 */
	public Matrix getMatrix() {
		Vector translation = this.translation.orElse(new Vector(0, 0, 0));
		Matrix rotation = this.rotation.orElse(Matrix.makeDiag(new Vector(1, 1, 1, 1)));
		Double scale = this.scale.orElse(1.0);

		return Matrix.makeTranslation(translation).mul(Matrix.makeRotation(rotation)).mul(Matrix.makeScale(new Vector(scale, scale, scale)));
	}

	public boolean hasMatrix() {
		return translation.isPresent() && rotation.isPresent() && scale.isPresent();
	}

	public void reset() {
		translation = Optional.empty();
		rotation = Optional.empty();
		scale = Optional.empty();
	}

	public Vector transformPoint(Vector point) {
		return getMatrix().mulp(point);
	}

	public Vector transformVector(Vector vector) {
		return getMatrix().mulv(vector);
	}

}
