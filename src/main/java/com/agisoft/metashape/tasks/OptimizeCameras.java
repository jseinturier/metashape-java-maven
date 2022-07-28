package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class OptimizeCameras extends Task {

	public OptimizeCameras() {
		super("OptimizeCameras");
	}

	/**
	 *  Enable adaptive fitting of distortion coefficients.
	 */
	public void setAdaptiveFitting(boolean value) {
		setParameter("adaptive_fitting", (Object) value);
	}

	/**
	 *  Enable adaptive fitting of distortion coefficients.
	 */
	public boolean getAdaptiveFitting() {
		return (boolean) getParameter("adaptive_fitting");
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
	 *  Enable optimization of additional corrections.
	 */
	public void setFitCorrections(boolean value) {
		setParameter("fit_corrections", (Object) value);
	}

	/**
	 *  Enable optimization of additional corrections.
	 */
	public boolean getFitCorrections() {
		return (boolean) getParameter("fit_corrections");
	}

	/**
	 *  Enable optimization of X principal point coordinates.
	 */
	public void setFitCx(boolean value) {
		setParameter("fit_cx", (Object) value);
	}

	/**
	 *  Enable optimization of X principal point coordinates.
	 */
	public boolean getFitCx() {
		return (boolean) getParameter("fit_cx");
	}

	/**
	 *  Enable optimization of Y principal point coordinates.
	 */
	public void setFitCy(boolean value) {
		setParameter("fit_cy", (Object) value);
	}

	/**
	 *  Enable optimization of Y principal point coordinates.
	 */
	public boolean getFitCy() {
		return (boolean) getParameter("fit_cy");
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
	 *  Enable optimization of k3 radial distortion coefficient.
	 */
	public void setFitK4(boolean value) {
		setParameter("fit_k4", (Object) value);
	}

	/**
	 *  Enable optimization of k3 radial distortion coefficient.
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

	/**
	 *  Estimate tie point covariance matrices.
	 */
	public void setTiepointCovariance(boolean value) {
		setParameter("tiepoint_covariance", (Object) value);
	}

	/**
	 *  Estimate tie point covariance matrices.
	 */
	public boolean getTiepointCovariance() {
		return (boolean) getParameter("tiepoint_covariance");
	}

}
