package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class GenerateMasks extends Task {

	public GenerateMasks() {
		super("GenerateMasks");
	}

	/**
	 *  Allowed blur radius on a photo in pix (only if mask_defocus=True). Default: 3.0
	 */
	public void setBlurThreshold(double value) {
		setParameter("blur_threshold", (Object) value);
	}

	/**
	 *  Allowed blur radius on a photo in pix (only if mask_defocus=True). Default: 3.0
	 */
	public double getBlurThreshold() {
		return (double) getParameter("blur_threshold");
	}

	/**
	 *  Optional list of cameras to be processed.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  Optional list of cameras to be processed.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
	}

	/**
	 *  Maximum depth of masked areas in meters (only if mask_defocus=False). Default: 3.4028234663852886e+38
	 */
	public void setDepthThreshold(double value) {
		setParameter("depth_threshold", (Object) value);
	}

	/**
	 *  Maximum depth of masked areas in meters (only if mask_defocus=False). Default: 3.4028234663852886e+38
	 */
	public double getDepthThreshold() {
		return (double) getParameter("depth_threshold");
	}

	/**
	 *  Extend masks to cover whole mesh (only if mask_defocus=True).
	 */
	public void setFixCoverage(boolean value) {
		setParameter("fix_coverage", (Object) value);
	}

	/**
	 *  Extend masks to cover whole mesh (only if mask_defocus=True).
	 */
	public boolean getFixCoverage() {
		return (boolean) getParameter("fix_coverage");
	}

	/**
	 *  Mask defocus areas.
	 */
	public void setMaskDefocus(boolean value) {
		setParameter("mask_defocus", (Object) value);
	}

	/**
	 *  Mask defocus areas.
	 */
	public boolean getMaskDefocus() {
		return (boolean) getParameter("mask_defocus");
	}

	/**
	 *  Mask operation. Default: MaskOperation.MaskOperationReplacement
	 */
	public void setMaskOperation(MaskOperation value) {
		setParameter("mask_operation", (Object) value);
	}

	/**
	 *  Mask operation. Default: MaskOperation.MaskOperationReplacement
	 */
	public MaskOperation getMaskOperation() {
		return (MaskOperation) getParameter("mask_operation");
	}

	/**
	 *  Mask generation mode. Default: MaskingMode.MaskingModeAlpha
	 */
	public void setMaskingMode(MaskingMode value) {
		setParameter("masking_mode", (Object) value);
	}

	/**
	 *  Mask generation mode. Default: MaskingMode.MaskingModeAlpha
	 */
	public MaskingMode getMaskingMode() {
		return (MaskingMode) getParameter("masking_mode");
	}

	/**
	 *  Mask file name template.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Mask file name template.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Background masking tolerance. Default: 10
	 */
	public void setTolerance(int value) {
		setParameter("tolerance", (Object) value);
	}

	/**
	 *  Background masking tolerance. Default: 10
	 */
	public int getTolerance() {
		return (int) getParameter("tolerance");
	}

}
