package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class GeneratePrescriptionMap extends Task {

	public GeneratePrescriptionMap() {
		super("GeneratePrescriptionMap");
	}

	/**
	 *  Boundary shape group. Default: -1
	 */
	public void setBoundaryShapeGroup(int value) {
		setParameter("boundary_shape_group", (Object) value);
	}

	/**
	 *  Boundary shape group. Default: -1
	 */
	public int getBoundaryShapeGroup() {
		return (int) getParameter("boundary_shape_group");
	}

	/**
	 *  Classification breakpoints.
	 */
	public void setBreakpoints(double[] value) {
		setParameter("breakpoints", (Object) value);
	}

	/**
	 *  Classification breakpoints.
	 */
	public double[] getBreakpoints() {
		return (double[]) getParameter("breakpoints");
	}

	/**
	 *  Step of prescription grid, meters. Default: 1.0
	 */
	public void setCellSize(double value) {
		setParameter("cell_size", (Object) value);
	}

	/**
	 *  Step of prescription grid, meters. Default: 1.0
	 */
	public double getCellSize() {
		return (double) getParameter("cell_size");
	}

	/**
	 *  Number of classes. Default: 4
	 */
	public void setClassCount(int value) {
		setParameter("class_count", (Object) value);
	}

	/**
	 *  Number of classes. Default: 4
	 */
	public int getClassCount() {
		return (int) getParameter("class_count");
	}

	/**
	 *  Index values classification method. Default: ClassificationMethod.JenksNaturalBreaksClassification
	 */
	public void setClassificationMethod(ClassificationMethod value) {
		setParameter("classification_method", (Object) value);
	}

	/**
	 *  Index values classification method. Default: ClassificationMethod.JenksNaturalBreaksClassification
	 */
	public ClassificationMethod getClassificationMethod() {
		return (ClassificationMethod) getParameter("classification_method");
	}

	/**
	 *  Fertilizer rate for each class.
	 */
	public void setRates(double[] value) {
		setParameter("rates", (Object) value);
	}

	/**
	 *  Fertilizer rate for each class.
	 */
	public double[] getRates() {
		return (double[]) getParameter("rates");
	}

}
