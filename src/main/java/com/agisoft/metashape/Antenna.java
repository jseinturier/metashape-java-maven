package com.agisoft.metashape;

import java.util.Optional;

/**
 * GPS antenna position relative to camera.
 */
public class Antenna {

	private Vector location;
	private Vector rotation;
	private Optional<Vector> location_reference;
	private Optional<Vector> rotation_reference;
	private Vector location_accuracy;
	private Vector rotation_accuracy;
	private boolean fixed;

	public Antenna() {
		location = new Vector(0, 0, 0);
		rotation = new Vector(0, 0, 0);
		location_reference = Optional.empty();
		rotation_reference = Optional.empty();
		location_accuracy = new Vector(0.05, 0.05, 0.05);
		rotation_accuracy = new Vector(2.0, 2.0, 2.0);
		fixed = true;
	}

	/**
	 *  Fix antenna flag.
	 */
	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	/**
	 *  Fix antenna flag.
	 */
	public boolean isFixed() {
		return fixed;
	}

	/**
	 *  Antenna coordinates.
	 */
	public void setLocation(Vector location) {
		this.location = location;
	}

	/**
	 *  Antenna coordinates.
	 */
	public Vector getLocation() {
		return location;
	}

	/**
	 *  Antenna rotation angles.
	 */
	public void setRotation(Vector rotation) {
		this.rotation = rotation;
	}

	/**
	 *  Antenna rotation angles.
	 */
	public Vector getRotation() {
		return rotation;
	}

	/**
	 *  Antenna location reference.
	 */
	public void setLocationReference(Optional<Vector> reference) {
		this.location_reference = reference;
	}

	/**
	 *  Antenna location reference.
	 */
	public Optional<Vector> getLocationReference() { return location_reference; }

	/**
	 *  Antenna rotation reference.
	 */
	public void setRotationReference(Optional<Vector> reference) {
		this.rotation_reference = reference;
	}

	/**
	 *  Antenna rotation reference.
	 */
	public Optional<Vector> getRotationReference() { return rotation_reference; }

	/**
	 *  Antenna location accuracy.
	 */
	public void setLocationAccuracy(Vector accuracy) {
		this.location_accuracy = accuracy;
	}

	/**
	 *  Antenna location accuracy.
	 */
	public Vector getLocationAccuracy() { return location_accuracy; }

	/**
	 *  Antenna rotation accuracy.
	 */
	public void setRotationAccuracy(Vector accuracy) {
		this.rotation_accuracy = accuracy;
	}

	/**
	 *  Antenna rotation accuracy.
	 */
	public Vector getRotationAccuracy() { return rotation_accuracy; }

}
