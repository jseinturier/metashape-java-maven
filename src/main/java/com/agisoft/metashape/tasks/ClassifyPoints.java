package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ClassifyPoints extends Task {

	public ClassifyPoints() {
		super("ClassifyPoints");
	}

	/**
	 *  Required confidence level. Default: 0.0
	 */
	public void setConfidence(double value) {
		setParameter("confidence", (Object) value);
	}

	/**
	 *  Required confidence level. Default: 0.0
	 */
	public double getConfidence() {
		return (double) getParameter("confidence");
	}

	/**
	 *  Class of points to be re-classified. Default: -1
	 */
	public void setSourceClass(int value) {
		setParameter("source_class", (Object) value);
	}

	/**
	 *  Class of points to be re-classified. Default: -1
	 */
	public int getSourceClass() {
		return (int) getParameter("source_class");
	}

	/**
	 *  Enable fine-level task subdivision.
	 */
	public void setSubdivideTask(boolean value) {
		setParameter("subdivide_task", (Object) value);
	}

	/**
	 *  Enable fine-level task subdivision.
	 */
	public boolean getSubdivideTask() {
		return (boolean) getParameter("subdivide_task");
	}

	/**
	 *  Target point classes for classification.
	 */
	public void setTargetClasses(int[] value) {
		setParameter("target_classes", (Object) value);
	}

	/**
	 *  Target point classes for classification.
	 */
	public int[] getTargetClasses() {
		return (int[]) getParameter("target_classes");
	}

}
