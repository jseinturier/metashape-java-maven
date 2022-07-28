package com.agisoft.metashape;

public class Matrix {

	private double[][] data;

	public Matrix() {
		data = null;
	}

	public Matrix(int nrows, int ncolumns) {
		data = new double[nrows][ncolumns];
	}

	public Matrix(double[][] data) {
		this.data = data;
	}

	public int getRows() {
		return data.length;
	}

	public int getColumns() {
		return data[0].length;
	}

	public double get(int row, int col) {
		return data[row][col];
	}

	public void set(int row, int col, double value) {
		data[row][col] = value;
	}

	public double[][] getData() {
		return data;
	}

	public void setData(double[][] data) {
		this.data = data;
	}

	public Matrix mul(Matrix other) {
		Matrix res = new Matrix(getRows(), other.getColumns());
		for (int j = 0; j < res.getRows(); j++)
			for (int i = 0; i < res.getColumns(); i++) {
				double sum = 0;
				for (int k = 0; k < getColumns(); k++)
					sum += get(j, k) * other.get(k, i);
				res.set(j, i, sum);
			}
		return res;
	}

	public Vector mul(Vector other) {
		Vector res = new Vector(getRows());
		for (int j = 0; j < getRows(); j++) {
			double sum = 0;
			for (int k = 0; k < getColumns(); k++)
				sum += get(j, k) * other.get(k);
			res.set(j, sum);
		}
		return res;
	}

	public Matrix mul(double c) {
		Matrix res = new Matrix(getRows(), getColumns());
		for (int j = 0; j < getRows(); j++)
			for (int i = 0; i < getColumns(); i++)
				res.data[j][i] = data[j][i] * c;
		return res;
	}

	public Vector mulp(Vector other) {
		double norm = data[getRows() - 1][getColumns() - 1];
		for (int i = 0; i < getColumns() - 1; i++)
			norm += data[getRows() - 1][i] * other.get(i);
		if (norm != 0)
			norm = 1 / norm;

		Vector res = new Vector(getRows() - 1);
		for (int j = 0; j < getRows() - 1; j++) {
			double sum = 0;
			for (int k = 0; k < getColumns() - 1; k++)
				sum += get(j, k) * other.get(k);
			res.set(j, sum * norm);
		}
		return res;
	}

	public Vector mulv(Vector other) {
		Vector res = new Vector(getRows() - 1);
		for (int j = 0; j < getRows() - 1; j++) {
			double sum = 0;
			for (int k = 0; k < getColumns() - 1; k++)
				sum += get(j, k) * other.get(k);
			res.set(j, sum);
		}
		return res;
	}

	public Matrix add(Matrix other) {
		Matrix res = new Matrix(getRows(), getColumns());
		for (int j = 0; j < getRows(); j++)
			for (int i = 0; i < data.length; i++)
				res.data[j][i] = data[j][i] + other.data[j][i];
		return res;
	}

	public Matrix sub(Matrix other) {
		Matrix res = new Matrix(getRows(), getColumns());
		for (int j = 0; j < getRows(); j++)
			for (int i = 0; i < data.length; i++)
				res.data[j][i] = data[j][i] - other.data[j][i];
		return res;
	}

	public Matrix t() {
		Matrix res = new Matrix(getColumns(), getRows());
		for (int j = 0; j < getRows(); j++)
			for (int i = 0; i < data.length; i++)
				res.data[i][j] = data[j][i];
		return res;
	}

	public Vector getRow(int n) {
		return new Vector(data[n]);
	}

	public Vector getColumn(int n) {
		Vector res = new Vector(getRows());
		for (int i = 0; i < getRows(); i++)
			res.set(i, data[i][n]);
		return res;
	}

	public double det() {
		if (getRows() == 2 && getColumns() == 2) {
			return data[0][0] * data[1][1] - data[0][1] * data[1][0];
		}

		if (getRows() == 3 && getColumns() == 3) {
			return (data[0][0]*(data[1][1]*data[2][2] - data[1][2]*data[2][1]) -
				data[0][1]*(data[1][0]*data[2][2] - data[1][2]*data[2][0]) +
				data[0][2]*(data[1][0]*data[2][1] - data[1][1]*data[2][0]));
		}

		if (getRows() == 4 && getColumns() == 4) {
			return ((data[0][0] * data[1][1] - data[0][1] * data[1][0]) * (data[2][2] * data[3][3] - data[2][3] * data[3][2]) -
				(data[0][0] * data[1][2] - data[0][2] * data[1][0]) * (data[2][1] * data[3][3] - data[2][3] * data[3][1]) +
				(data[0][0] * data[1][3] - data[0][3] * data[1][0]) * (data[2][1] * data[3][2] - data[2][2] * data[3][1]) +
				(data[0][1] * data[1][2] - data[0][2] * data[1][1]) * (data[2][0] * data[3][3] - data[2][3] * data[3][0]) -
				(data[0][1] * data[1][3] - data[0][3] * data[1][1]) * (data[2][0] * data[3][2] - data[2][2] * data[3][0]) +
				(data[0][2] * data[1][3] - data[0][3] * data[1][2]) * (data[2][0] * data[3][1] - data[2][1] * data[3][0]));
		}

		return 0;
	}

	public Matrix inv() {
		if (getRows() == 2 && getColumns() == 2) {
			double norm = 1 / det();

			Matrix res = new Matrix(getColumns(), getRows());
			res.data[0][0] = + data[1][1] * norm;
			res.data[0][1] = - data[0][1] * norm;
			res.data[1][0] = - data[1][0] * norm;
			res.data[1][1] = + data[0][0] * norm;
			return res;
		}

		if (getRows() == 3 && getColumns() == 3) {
			double norm = 1 / det();

			Matrix res = new Matrix(getColumns(), getRows());
			res.data[0][0] = (data[1][1] * data[2][2] - data[1][2] * data[2][1]) * norm;
			res.data[0][1] = (data[0][2] * data[2][1] - data[0][1] * data[2][2]) * norm;
			res.data[0][2] = (data[0][1] * data[1][2] - data[0][2] * data[1][1]) * norm;

			res.data[1][0] = (data[1][2] * data[2][0] - data[1][0] * data[2][2]) * norm;
			res.data[1][1] = (data[0][0] * data[2][2] - data[0][2] * data[2][0]) * norm;
			res.data[1][2] = (data[0][2] * data[1][0] - data[0][0] * data[1][2]) * norm;

			res.data[2][0] = (data[1][0] * data[2][1] - data[1][1] * data[2][0]) * norm;
			res.data[2][1] = (data[0][1] * data[2][0] - data[0][0] * data[2][1]) * norm;
			res.data[2][2] = (data[0][0] * data[1][1] - data[0][1] * data[1][0]) * norm;
			return res;
		}

		if (getRows() == 4 && getColumns() == 4) {
			double A0 = data[0][0] * data[1][1] - data[0][1] * data[1][0];
			double A1 = data[0][0] * data[1][2] - data[0][2] * data[1][0];
			double A2 = data[0][0] * data[1][3] - data[0][3] * data[1][0];
			double A3 = data[0][1] * data[1][2] - data[0][2] * data[1][1];
			double A4 = data[0][1] * data[1][3] - data[0][3] * data[1][1];
			double A5 = data[0][2] * data[1][3] - data[0][3] * data[1][2];
			double B0 = data[2][0] * data[3][1] - data[2][1] * data[3][0];
			double B1 = data[2][0] * data[3][2] - data[2][2] * data[3][0];
			double B2 = data[2][0] * data[3][3] - data[2][3] * data[3][0];
			double B3 = data[2][1] * data[3][2] - data[2][2] * data[3][1];
			double B4 = data[2][1] * data[3][3] - data[2][3] * data[3][1];
			double B5 = data[2][2] * data[3][3] - data[2][3] * data[3][2];

			double norm = 1 / (A0*B5 - A1*B4 + A2*B3 + A3*B2 - A4*B1 + A5*B0);

			Matrix res = new Matrix(getColumns(), getRows());
			res.data[0][0] = (+data[1][1] * B5 - data[1][2] * B4 + data[1][3] * B3) * norm;
			res.data[0][1] = (-data[0][1] * B5 + data[0][2] * B4 - data[0][3] * B3) * norm;
			res.data[0][2] = (+data[3][1] * A5 - data[3][2] * A4 + data[3][3] * A3) * norm;
			res.data[0][3] = (-data[2][1] * A5 + data[2][2] * A4 - data[2][3] * A3) * norm;

			res.data[1][0] = (-data[1][0] * B5 + data[1][2] * B2 - data[1][3] * B1) * norm;
			res.data[1][1] = (+data[0][0] * B5 - data[0][2] * B2 + data[0][3] * B1) * norm;
			res.data[1][2] = (-data[3][0] * A5 + data[3][2] * A2 - data[3][3] * A1) * norm;
			res.data[1][3] = (+data[2][0] * A5 - data[2][2] * A2 + data[2][3] * A1) * norm;

			res.data[2][0] = (+data[1][0] * B4 - data[1][1] * B2 + data[1][3] * B0) * norm;
			res.data[2][1] = (-data[0][0] * B4 + data[0][1] * B2 - data[0][3] * B0) * norm;
			res.data[2][2] = (+data[3][0] * A4 - data[3][1] * A2 + data[3][3] * A0) * norm;
			res.data[2][3] = (-data[2][0] * A4 + data[2][1] * A2 - data[2][3] * A0) * norm;

			res.data[3][0] = (-data[1][0] * B3 + data[1][1] * B1 - data[1][2] * B0) * norm;
			res.data[3][1] = (+data[0][0] * B3 - data[0][1] * B1 + data[0][2] * B0) * norm;
			res.data[3][2] = (-data[3][0] * A3 + data[3][1] * A1 - data[3][2] * A0) * norm;
			res.data[3][3] = (+data[2][0] * A3 - data[2][1] * A1 + data[2][2] * A0) * norm;
			return res;
		}

		return null;
	}

	public Vector translation() {
		if (getRows() != 4 || getColumns() != 4)
			return null;

		Vector res = new Vector(data[0][3], data[1][3], data[2][3]);

		return res.mul(1 / data[3][3]);
	}

	public double scale() {
		Matrix M = new Matrix(3, 3);
		M.data[0] = new double[] { data[0][0], data[0][1], data[0][2] };
		M.data[1] = new double[] { data[1][0], data[1][1], data[1][2] };
		M.data[2] = new double[] { data[2][0], data[2][1], data[2][2] };

		Matrix MtM = M.t().mul(M);

		double res = (MtM.data[0][0] + MtM.data[1][1] + MtM.data[2][2]) / 3;
		if (res <= 0)
			return 0;
		return Math.sqrt(res);
	}

	public Vector scale3() {
		Matrix M = new Matrix(3, 3);
		M.data[0] = new double[] { data[0][0], data[0][1], data[0][2] };
		M.data[1] = new double[] { data[1][0], data[1][1], data[1][2] };
		M.data[2] = new double[] { data[2][0], data[2][1], data[2][2] };

		Matrix MtM = M.t().mul(M);

		Vector res = new Vector(MtM.data[0][0], MtM.data[1][1], MtM.data[2][2]);
		if (res.getX() > 0) res.setX(Math.sqrt(res.getX()));
		if (res.getY() > 0) res.setY(Math.sqrt(res.getY()));
		if (res.getZ() > 0) res.setZ(Math.sqrt(res.getZ()));
		return res;
	}

	public Matrix rotation() {
		if (getRows() != 4 || getColumns() != 4)
			return null;

		Matrix res = new Matrix(3, 3);
		res.data[0] = new double[] { data[0][0], data[0][1], data[0][2] };
		res.data[1] = new double[] { data[1][0], data[1][1], data[1][2] };
		res.data[2] = new double[] { data[2][0], data[2][1], data[2][2] };

		Vector s = scale3();
		if (s.getX() != 0) s.setX(1 / s.getX());
		if (s.getY() != 0) s.setY(1 / s.getY());
		if (s.getZ() != 0) s.setZ(1 / s.getZ());

		return res.mul(Matrix.makeDiag(s));
	}

	public static Matrix makeDiag(Vector v) {
		Matrix res = new Matrix(v.getSize(), v.getSize());
		for (int j = 0; j < v.getSize(); j++) {
			for (int i = 0; i < v.getSize(); i++)
				res.set(j, i, 0);
			res.set(j, j, v.get(j));
		}
		return res;
	}

	public static Matrix makeRotation(Matrix rotation)
	{
		Matrix res = new Matrix(rotation.getRows() + 1, rotation.getColumns() + 1);
		for (int j = 0; j < rotation.getRows(); j++) {
			for (int i = 0; i < rotation.getColumns(); i++)
				res.set(j, i, rotation.get(j, i));
			res.set(j, rotation.getColumns(), 0);
		}
		for (int i = 0; i < rotation.getColumns(); i++)
			res.set(rotation.getRows(), i, 0);
		res.set(rotation.getRows(), rotation.getColumns(), 1);
		return res;
	}

	public static Matrix makeTranslation(Vector translation)
	{
		Matrix res = new Matrix(translation.getSize() + 1, translation.getSize() + 1);
		for (int j = 0; j < res.getRows(); j++) {
			for (int i = 0; i < res.getColumns(); i++)
				res.set(j, i, 0);
		}
		for (int j = 0; j < translation.getSize(); j++)
			res.set(j, translation.getSize(), translation.get(j));
		res.set(translation.getSize(), translation.getSize(), 1);
		return res;
	}

	public static Matrix makeScale(Vector scale)
	{
		Matrix res = new Matrix(scale.getSize() + 1, scale.getSize() + 1);
		for (int j = 0; j < res.getRows(); j++) {
			for (int i = 0; i < res.getColumns(); i++)
				res.set(j, i, 0);
		}
		for (int j = 0; j < scale.getSize(); j++)
			res.set(j, j, scale.get(j));
		res.set(scale.getSize(), scale.getSize(), 1);
		return res;
	}

}
