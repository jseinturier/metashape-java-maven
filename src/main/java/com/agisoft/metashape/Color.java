package com.agisoft.metashape;

public class Color {

	private short data[];

	public Color() {
		data = new short[3];
	}

	public Color(short red, short green, short blue) {
		data = new short[] { red, green, blue };
	}

	public Color(short[] data) {
		this.data = data;
	}

	/**
	 *  Red component.
	 */
	public short getRed() {
		return data[0];
	}

	/**
	 *  Green component.
	 */
	public short getGreen() {
		return data[1];
	}

	/**
	 *  Blue component.
	 */
	public short getBlue() {
		return data[2];
	}

	/**
	 *  Red component.
	 */
	public void setRed(short value) {
		data[0] = value;
	}

	/**
	 *  Green component.
	 */
	public void setGreen(short value) {
		data[1] = value;
	}

	/**
	 *  Blue component.
	 */
	public void setBlue(short value) {
		data[2] = value;
	}

	public short[] getData() {
		return data;
	}

}
