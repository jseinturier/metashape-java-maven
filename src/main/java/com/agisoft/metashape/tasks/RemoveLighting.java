package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class RemoveLighting extends Task {

	public RemoveLighting() {
		super("RemoveLighting");
	}

	/**
	 *  Ambient occlusion multiplier. Should be in range [0.25, 4]. Default: 1.5
	 */
	public void setAmbientOcclusionMultiplier(double value) {
		setParameter("ambient_occlusion_multiplier", (Object) value);
	}

	/**
	 *  Ambient occlusion multiplier. Should be in range [0.25, 4]. Default: 1.5
	 */
	public double getAmbientOcclusionMultiplier() {
		return (double) getParameter("ambient_occlusion_multiplier");
	}

	/**
	 *  Path to ambient occlusion texture atlas. Can be empty.
	 */
	public void setAmbientOcclusionPath(String value) {
		setParameter("ambient_occlusion_path", (Object) value);
	}

	/**
	 *  Path to ambient occlusion texture atlas. Can be empty.
	 */
	public String getAmbientOcclusionPath() {
		return (String) getParameter("ambient_occlusion_path");
	}

	/**
	 *  Enable multi-color processing mode.
	 */
	public void setColorMode(boolean value) {
		setParameter("color_mode", (Object) value);
	}

	/**
	 *  Enable multi-color processing mode.
	 */
	public boolean getColorMode() {
		return (boolean) getParameter("color_mode");
	}

	/**
	 *  Internal blur. Should be in range [0, 4]. Default: 1.5
	 */
	public void setInternalBlur(double value) {
		setParameter("internal_blur", (Object) value);
	}

	/**
	 *  Internal blur. Should be in range [0, 4]. Default: 1.5
	 */
	public double getInternalBlur() {
		return (double) getParameter("internal_blur");
	}

	/**
	 *  Mesh normals noise suppression strength. Should be in range [0, 4]. Default: 1.0
	 */
	public void setMeshNoiseSuppression(double value) {
		setParameter("mesh_noise_suppression", (Object) value);
	}

	/**
	 *  Mesh normals noise suppression strength. Should be in range [0, 4]. Default: 1.0
	 */
	public double getMeshNoiseSuppression() {
		return (double) getParameter("mesh_noise_suppression");
	}

}
