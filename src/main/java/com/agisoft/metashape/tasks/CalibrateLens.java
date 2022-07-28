package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class CalibrateLens extends Task {

	public CalibrateLens() {
		super("CalibrateLens");
	}

	/**
	 *  Border size to ignore. Default: 10
	 */
	public void setBorder(int value) {
		setParameter("border", (Object) value);
	}

	/**
	 *  Border size to ignore. Default: 10
	 */
	public int getBorder() {
		return (int) getParameter("border");
	}

	/**
	 *  Enable optimization of aspect ratio.
	 */
	public void setFitB1(boolean value) {
		setParameter("fit_b1", (Object) value);
	}

	/**
	 *  Enable optimization of aspect ratio.
	 */
	public boolean getFitB1() {
		return (boolean) getParameter("fit_b1");
	}

	/**
	 *  Enable optimization of skew coefficient.
	 */
	public void setFitB2(boolean value) {
		setParameter("fit_b2", (Object) value);
	}

	/**
	 *  Enable optimization of skew coefficient.
	 */
	public boolean getFitB2() {
		return (boolean) getParameter("fit_b2");
	}

	/**
	 *  Enable optimization of principal point coordinates.
	 */
	public void setFitCxcy(boolean value) {
		setParameter("fit_cxcy", (Object) value);
	}

	/**
	 *  Enable optimization of principal point coordinates.
	 */
	public boolean getFitCxcy() {
		return (boolean) getParameter("fit_cxcy");
	}

	/**
	 *  Enable optimization of focal length coefficient.
	 */
	public void setFitF(boolean value) {
		setParameter("fit_f", (Object) value);
	}

	/**
	 *  Enable optimization of focal length coefficient.
	 */
	public boolean getFitF() {
		return (boolean) getParameter("fit_f");
	}

	/**
	 *  Enable optimization of k1 radial distortion coefficient.
	 */
	public void setFitK1(boolean value) {
		setParameter("fit_k1", (Object) value);
	}

	/**
	 *  Enable optimization of k1 radial distortion coefficient.
	 */
	public boolean getFitK1() {
		return (boolean) getParameter("fit_k1");
	}

	/**
	 *  Enable optimization of k2 radial distortion coefficient.
	 */
	public void setFitK2(boolean value) {
		setParameter("fit_k2", (Object) value);
	}

	/**
	 *  Enable optimization of k2 radial distortion coefficient.
	 */
	public boolean getFitK2() {
		return (boolean) getParameter("fit_k2");
	}

	/**
	 *  Enable optimization of k3 radial distortion coefficient.
	 */
	public void setFitK3(boolean value) {
		setParameter("fit_k3", (Object) value);
	}

	/**
	 *  Enable optimization of k3 radial distortion coefficient.
	 */
	public boolean getFitK3() {
		return (boolean) getParameter("fit_k3");
	}

	/**
	 *  Enable optimization of k4 radial distortion coefficient.
	 */
	public void setFitK4(boolean value) {
		setParameter("fit_k4", (Object) value);
	}

	/**
	 *  Enable optimization of k4 radial distortion coefficient.
	 */
	public boolean getFitK4() {
		return (boolean) getParameter("fit_k4");
	}

	/**
	 *  Enable optimization of p1 tangential distortion coefficient.
	 */
	public void setFitP1(boolean value) {
		setParameter("fit_p1", (Object) value);
	}

	/**
	 *  Enable optimization of p1 tangential distortion coefficient.
	 */
	public boolean getFitP1() {
		return (boolean) getParameter("fit_p1");
	}

	/**
	 *  Enable optimization of p2 tangential distortion coefficient.
	 */
	public void setFitP2(boolean value) {
		setParameter("fit_p2", (Object) value);
	}

	/**
	 *  Enable optimization of p2 tangential distortion coefficient.
	 */
	public boolean getFitP2() {
		return (boolean) getParameter("fit_p2");
	}

}
