package com.agisoft.metashape;

/**
 * Rational polynomial coefficients model.
 */
public class RPCModel {

	private Vector image_offset;
	private Vector image_scale;
	private Vector object_offset;
	private Vector object_scale;
	private double line_num_coeff[];
	private double line_den_coeff[];
	private double sample_num_coeff[];
	private double sample_den_coeff[];

	public RPCModel() {
		image_offset = new Vector(0, 0);
		image_scale = new Vector(1, 1);
		object_offset = new Vector(0, 0, 0);
		object_scale = new Vector(1, 1, 1);
		line_num_coeff = new double[20];
		line_den_coeff = new double[20];
		sample_num_coeff = new double[20];
		sample_den_coeff = new double[20];
	}

	public void setImageOffset(Vector image_offset) {
		this.image_offset = image_offset;
	}

	public Vector getImageOffset() { return image_offset; }

	public void setImageScale(Vector image_scale) {
		this.image_scale = image_scale;
	}

	public Vector getImageScale() { return image_scale; }

	public void setObjectOffset(Vector object_offset) {
		this.object_offset = object_offset;
	}

	public Vector getObjectOffset() { return object_offset; }

	public void setObjectScale(Vector object_scale) {
		this.object_scale = object_scale;
	}

	public Vector getObjectScale() { return object_scale; }

	public void setLineNumCoeff(double[] coeff) {
		this.line_num_coeff = coeff;
	}

	public double[] getLineNumCoeff() { return line_num_coeff; }

	public void setLineDenCoeff(double[] coeff) {
		this.line_den_coeff = coeff;
	}

	public double[] getLineDenCoeff() { return line_den_coeff; }

	public void setSampleNumCoeff(double[] coeff) {
		this.sample_num_coeff = coeff;
	}

	public double[] getSampleNumCoeff() { return sample_num_coeff; }

	public void setSampleDenCoeff(double[] coeff) {
		this.sample_den_coeff = coeff;
	}

	public double[] getSampleDenCoeff() { return sample_den_coeff; }

}
