package com.agisoft.metashape;

import java.lang.Math;

public class Vector {

	private double[] data;

	public Vector() {
		data = null;
	}

	public Vector(int size) {
		data = new double[size];
	}

	public Vector(double x, double y) {
		data = new double[] { x, y };
	}

	public Vector(double x, double y, double z) {
		data = new double[] { x, y, z };
	}

	public Vector(double x, double y, double z, double w) {
		data = new double[] { x, y, z, w };
	}

	public Vector(double[] data) {
		this.data = data;
	}

	public int getSize() {
		return data.length;
	}

	public double get(int index) {
		return data[index];
	}

	public void set(int index, double value) {
		data[index] = value;
	}

	/**
	 *  X component.
	 */
	public double getX() {
		return data[0];
	}

	/**
	 *  Y component.
	 */
	public double getY() {
		return data[1];
	}

	/**
	 *  Z component.
	 */
	public double getZ() {
		return data[2];
	}

	/**
	 *  W component.
	 */
	public double getW() {
		return data[3];
	}

	/**
	 *  X component.
	 */
	public void setX(double value) {
		data[0] = value;
	}

	/**
	 *  Y component.
	 */
	public void setY(double value) {
		data[1] = value;
	}

	/**
	 *  Z component.
	 */
	public void setZ(double value) {
		data[2] = value;
	}

	/**
	 *  W component.
	 */
	public void setW(double value) {
		data[3] = value;
	}

	public double[] getData() {
		return data;
	}

	public void setData(double[] data) {
		this.data = data;
	}

	/**
	 *  Dot product.
	 */
	public double dot(Vector other) {
		double sum = 0;
		for (int i = 0; i < data.length; i++)
			sum += data[i] * other.data[i];
		return sum;
	}

	/**
	 *  Multiplication by scalar.
	 */
	public Vector mul(double c) {
		Vector res = new Vector(new double[data.length]);
		for (int i = 0; i < data.length; i++)
			res.data[i] = data[i] * c;
		return res;
	}

	/**
	 *  Vector sum.
	 */
	public Vector add(Vector other) {
		Vector res = new Vector(new double[data.length]);
		for (int i = 0; i < data.length; i++)
			res.data[i] = data[i] + other.data[i];
		return res;
	}

	/**
	 *  Vector difference.
	 */
	public Vector sub(Vector other) {
		Vector res = new Vector(new double[data.length]);
		for (int i = 0; i < data.length; i++)
			res.data[i] = data[i] - other.data[i];
		return res;
	}

	/**
	 *  Cross product.
	 */
	public Vector cross(Vector other) {
		return new Vector(
			getY() * other.getZ() - other.getY() * getZ(),
			getZ() * other.getX() - other.getZ() * getX(),
			getX() * other.getY() - other.getX() * getY());
	}

	/**
	 *  Vector norm.
	 */
	public double norm() {
		return Math.sqrt(dot(this));
	}

	/**
	 *  Normalized vector.
	 */
	public Vector normalized() {
		double norm = this.norm();
		if (norm != 0)
			norm = 1 / norm;
		return mul(norm);
	}

}
