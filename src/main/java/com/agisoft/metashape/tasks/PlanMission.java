package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class PlanMission extends Task {

	public PlanMission() {
		super("PlanMission");
	}

	/**
	 *  Generate additional viewpoints to increase coverage.
	 */
	public void setAttachViewpoints(boolean value) {
		setParameter("attach_viewpoints", (Object) value);
	}

	/**
	 *  Generate additional viewpoints to increase coverage.
	 */
	public boolean getAttachViewpoints() {
		return (boolean) getParameter("attach_viewpoints");
	}

	/**
	 *  Image capture distance (m). Default: 20.0
	 */
	public void setCaptureDistance(double value) {
		setParameter("capture_distance", (Object) value);
	}

	/**
	 *  Image capture distance (m). Default: 20.0
	 */
	public double getCaptureDistance() {
		return (double) getParameter("capture_distance");
	}

	/**
	 *  Ignore minimum waypoint spacing for additional viewpoints.
	 */
	public void setGroupAttachedViewpoints(boolean value) {
		setParameter("group_attached_viewpoints", (Object) value);
	}

	/**
	 *  Ignore minimum waypoint spacing for additional viewpoints.
	 */
	public boolean getGroupAttachedViewpoints() {
		return (boolean) getParameter("group_attached_viewpoints");
	}

	/**
	 *  Home point shape key. Default: -1
	 */
	public void setHomePoint(int value) {
		setParameter("home_point", (Object) value);
	}

	/**
	 *  Home point shape key. Default: -1
	 */
	public int getHomePoint() {
		return (int) getParameter("home_point");
	}

	/**
	 *  Cover surface with horizontal zigzags instead of vertical.
	 */
	public void setHorizontalZigzags(boolean value) {
		setParameter("horizontal_zigzags", (Object) value);
	}

	/**
	 *  Cover surface with horizontal zigzags instead of vertical.
	 */
	public boolean getHorizontalZigzags() {
		return (boolean) getParameter("horizontal_zigzags");
	}

	/**
	 *  Interesting zone shape layer key. Default: -1
	 */
	public void setInterestingZone(int value) {
		setParameter("interesting_zone", (Object) value);
	}

	/**
	 *  Interesting zone shape layer key. Default: -1
	 */
	public int getInterestingZone() {
		return (int) getParameter("interesting_zone");
	}

	/**
	 *  Maximum camera pitch angle. Default: 0
	 */
	public void setMaxPitch(int value) {
		setParameter("max_pitch", (Object) value);
	}

	/**
	 *  Maximum camera pitch angle. Default: 0
	 */
	public int getMaxPitch() {
		return (int) getParameter("max_pitch");
	}

	/**
	 *  Minimum altitude (m). Default: 10.0
	 */
	public void setMinAltitude(double value) {
		setParameter("min_altitude", (Object) value);
	}

	/**
	 *  Minimum altitude (m). Default: 10.0
	 */
	public double getMinAltitude() {
		return (double) getParameter("min_altitude");
	}

	/**
	 *  Minimum camera pitch angle. Default: -90
	 */
	public void setMinPitch(int value) {
		setParameter("min_pitch", (Object) value);
	}

	/**
	 *  Minimum camera pitch angle. Default: -90
	 */
	public int getMinPitch() {
		return (int) getParameter("min_pitch");
	}

	/**
	 *  Minimum waypoint spacing (m). Default: 0.6
	 */
	public void setMinWaypointSpacing(double value) {
		setParameter("min_waypoint_spacing", (Object) value);
	}

	/**
	 *  Minimum waypoint spacing (m). Default: 0.6
	 */
	public double getMinWaypointSpacing() {
		return (double) getParameter("min_waypoint_spacing");
	}

	/**
	 *  Overlap percent. Default: 65
	 */
	public void setOverlap(int value) {
		setParameter("overlap", (Object) value);
	}

	/**
	 *  Overlap percent. Default: 65
	 */
	public int getOverlap() {
		return (int) getParameter("overlap");
	}

	/**
	 *  Powerlines shape layer key. Default: -1
	 */
	public void setPowerlines(int value) {
		setParameter("powerlines", (Object) value);
	}

	/**
	 *  Powerlines shape layer key. Default: -1
	 */
	public int getPowerlines() {
		return (int) getParameter("powerlines");
	}

	/**
	 *  Restricted zone shape layer key. Default: -1
	 */
	public void setRestrictedZone(int value) {
		setParameter("restricted_zone", (Object) value);
	}

	/**
	 *  Restricted zone shape layer key. Default: -1
	 */
	public int getRestrictedZone() {
		return (int) getParameter("restricted_zone");
	}

	/**
	 *  Safety distance (m). Default: 10.0
	 */
	public void setSafetyDistance(double value) {
		setParameter("safety_distance", (Object) value);
	}

	/**
	 *  Safety distance (m). Default: 10.0
	 */
	public double getSafetyDistance() {
		return (double) getParameter("safety_distance");
	}

	/**
	 *  Safety zone shape layer key. Default: -1
	 */
	public void setSafetyZone(int value) {
		setParameter("safety_zone", (Object) value);
	}

	/**
	 *  Safety zone shape layer key. Default: -1
	 */
	public int getSafetyZone() {
		return (int) getParameter("safety_zone");
	}

	/**
	 *  Sensor key. Default: -1
	 */
	public void setSensor(int value) {
		setParameter("sensor", (Object) value);
	}

	/**
	 *  Sensor key. Default: -1
	 */
	public int getSensor() {
		return (int) getParameter("sensor");
	}

	/**
	 *  Focus on model selection.
	 */
	public void setUseSelection(boolean value) {
		setParameter("use_selection", (Object) value);
	}

	/**
	 *  Focus on model selection.
	 */
	public boolean getUseSelection() {
		return (boolean) getParameter("use_selection");
	}

}
