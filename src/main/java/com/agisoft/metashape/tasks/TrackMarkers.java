package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class TrackMarkers extends Task {

	public TrackMarkers() {
		super("TrackMarkers");
	}

	/**
	 *  Starting frame index. Default: 0
	 */
	public void setFirstFrame(int value) {
		setParameter("first_frame", (Object) value);
	}

	/**
	 *  Starting frame index. Default: 0
	 */
	public int getFirstFrame() {
		return (int) getParameter("first_frame");
	}

	/**
	 *  Ending frame index. Default: 0
	 */
	public void setLastFrame(int value) {
		setParameter("last_frame", (Object) value);
	}

	/**
	 *  Ending frame index. Default: 0
	 */
	public int getLastFrame() {
		return (int) getParameter("last_frame");
	}

}
