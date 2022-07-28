package com.agisoft.metashape;

import java.util.Optional;

/**
 * GPS antenna position relative to camera.
 */
public class Antenna {

	private Optional<Vector> location;
	private Optional<Vector> rotation;
	private Optional<Vector> location_reference;
	private Optional<Vector> rotation_reference;
	private Vector location_accuracy;
	private Vector rotation_accuracy;
	private boolean fixed;

	public Antenna() {
		location = Optional.empty();
		rotation = Optional.empty();
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
	 *  Antenna coordinates, may be null.
	 */
	public void setLocation(Optional<Vector> location) {
		this.location = location;
	}

	/**
	 *  Antenna coordinates, may be null.
	 */
	public Optional<Vector> getLocation() {
		return location;
	}

	/**
	 *  Antenna rotation angles, may be null.
	 */
	public void setRotation(Optional<Vector> rotation) {
		this.rotation = rotation;
	}

	/**
	 *  Antenna rotation angles, may be null.
	 */
	public Optional<Vector> getRotation() {
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
