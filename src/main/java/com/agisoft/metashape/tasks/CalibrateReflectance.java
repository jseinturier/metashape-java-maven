package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class CalibrateReflectance extends Task {

	public CalibrateReflectance() {
		super("CalibrateReflectance");
	}

	/**
	 *  Use calibrated reflectance panels.
	 */
	public void setUseReflectancePanels(boolean value) {
		setParameter("use_reflectance_panels", (Object) value);
	}

	/**
	 *  Use calibrated reflectance panels.
	 */
	public boolean getUseReflectancePanels() {
		return (boolean) getParameter("use_reflectance_panels");
	}

	/**
	 *  Apply irradiance sensor measurements.
	 */
	public void setUseSunSensor(boolean value) {
		setParameter("use_sun_sensor", (Object) value);
	}

	/**
	 *  Apply irradiance sensor measurements.
	 */
	public boolean getUseSunSensor() {
		return (boolean) getParameter("use_sun_sensor");
	}

}
