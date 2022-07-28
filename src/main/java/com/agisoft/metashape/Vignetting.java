package com.agisoft.metashape;

/**
 * Vignetting polynomial.
 */
public class Vignetting {

	private Matrix coeffs;

	public Vignetting() {
		coeffs = Matrix.makeDiag(new Vector(0, 0, 0, 0));
	}

	public Vignetting(double[] data) {
		coeffs = Matrix.makeDiag(new Vector(0, 0, 0, 0));
		coeffs.set(0, 0, data[0]);
		coeffs.set(0, 1, data[1]);
		coeffs.set(0, 2, data[2]);
		coeffs.set(0, 3, data[3]);
		coeffs.set(1, 0, data[4]);
		coeffs.set(1, 1, data[5]);
		coeffs.set(1, 2, data[6]);
		coeffs.set(2, 0, data[7]);
		coeffs.set(2, 1, data[8]);
		coeffs.set(3, 0, data[9]);
	}

	public double[] getData() {
		double[] res = new double[10];
		res[0] = coeffs.get(0, 0);
		res[1] = coeffs.get(0, 1);
		res[2] = coeffs.get(0, 2);
		res[3] = coeffs.get(0, 3);
		res[4] = coeffs.get(1, 0);
		res[5] = coeffs.get(1, 1);
		res[6] = coeffs.get(1, 2);
		res[7] = coeffs.get(2, 0);
		res[8] = coeffs.get(2, 1);
		res[9] = coeffs.get(3, 0);
		return res;
	}

	public void setCoeff(int i, int j, double value) {
		coeffs.set(i, j, value);
	}

	public double getCoeff(int i, int j) {
		return coeffs.get(i, j);
	}

}
