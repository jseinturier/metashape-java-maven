package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportCameras extends Task {

	public ExportCameras() {
		super("ExportCameras");
	}

	/**
	 *  Enables/disables binary encoding for selected format (if applicable).
	 */
	public void setBinary(boolean value) {
		setParameter("binary", (Object) value);
	}

	/**
	 *  Enables/disables binary encoding for selected format (if applicable).
	 */
	public boolean getBinary() {
		return (boolean) getParameter("binary");
	}

	/**
	 *  Path to BINGO GEO INPUT file.
	 */
	public void setBingoPathGeoin(String value) {
		setParameter("bingo_path_geoin", (Object) value);
	}

	/**
	 *  Path to BINGO GEO INPUT file.
	 */
	public String getBingoPathGeoin() {
		return (String) getParameter("bingo_path_geoin");
	}

	/**
	 *  Path to BINGO GPS/IMU file.
	 */
	public void setBingoPathGps(String value) {
		setParameter("bingo_path_gps", (Object) value);
	}

	/**
	 *  Path to BINGO GPS/IMU file.
	 */
	public String getBingoPathGps() {
		return (String) getParameter("bingo_path_gps");
	}

	/**
	 *  Path to BINGO IMAGE COORDINATE file.
	 */
	public void setBingoPathImage(String value) {
		setParameter("bingo_path_image", (Object) value);
	}

	/**
	 *  Path to BINGO IMAGE COORDINATE file.
	 */
	public String getBingoPathImage() {
		return (String) getParameter("bingo_path_image");
	}

	/**
	 *  Path to BINGO ITERA file.
	 */
	public void setBingoPathItera(String value) {
		setParameter("bingo_path_itera", (Object) value);
	}

	/**
	 *  Path to BINGO ITERA file.
	 */
	public String getBingoPathItera() {
		return (String) getParameter("bingo_path_itera");
	}

	/**
	 *  Enables/disables export of BINGO GEO INPUT file.
	 */
	public void setBingoSaveGeoin(boolean value) {
		setParameter("bingo_save_geoin", (Object) value);
	}

	/**
	 *  Enables/disables export of BINGO GEO INPUT file.
	 */
	public boolean getBingoSaveGeoin() {
		return (boolean) getParameter("bingo_save_geoin");
	}

	/**
	 *  Enables/disables export of BINGO GPS/IMU data.
	 */
	public void setBingoSaveGps(boolean value) {
		setParameter("bingo_save_gps", (Object) value);
	}

	/**
	 *  Enables/disables export of BINGO GPS/IMU data.
	 */
	public boolean getBingoSaveGps() {
		return (boolean) getParameter("bingo_save_gps");
	}

	/**
	 *  Enables/disables export of BINGO IMAGE COORDINATE file.
	 */
	public void setBingoSaveImage(boolean value) {
		setParameter("bingo_save_image", (Object) value);
	}

	/**
	 *  Enables/disables export of BINGO IMAGE COORDINATE file.
	 */
	public boolean getBingoSaveImage() {
		return (boolean) getParameter("bingo_save_image");
	}

	/**
	 *  Enables/disables export of BINGO ITERA file.
	 */
	public void setBingoSaveItera(boolean value) {
		setParameter("bingo_save_itera", (Object) value);
	}

	/**
	 *  Enables/disables export of BINGO ITERA file.
	 */
	public boolean getBingoSaveItera() {
		return (boolean) getParameter("bingo_save_itera");
	}

	/**
	 *  Path to Bundler image list file.
	 */
	public void setBundlerPathList(String value) {
		setParameter("bundler_path_list", (Object) value);
	}

	/**
	 *  Path to Bundler image list file.
	 */
	public String getBundlerPathList() {
		return (String) getParameter("bundler_path_list");
	}

	/**
	 *  Enables/disables export of Bundler image list file.
	 */
	public void setBundlerSaveList(boolean value) {
		setParameter("bundler_save_list", (Object) value);
	}

	/**
	 *  Enables/disables export of Bundler image list file.
	 */
	public boolean getBundlerSaveList() {
		return (boolean) getParameter("bundler_save_list");
	}

	/**
	 *  Rotation order (CHAN format only). Default: RotationOrder.RotationOrderXYZ
	 */
	public void setChanRotationOrder(RotationOrder value) {
		setParameter("chan_rotation_order", (Object) value);
	}

	/**
	 *  Rotation order (CHAN format only). Default: RotationOrder.RotationOrderXYZ
	 */
	public RotationOrder getChanRotationOrder() {
		return (RotationOrder) getParameter("chan_rotation_order");
	}

	/**
	 *  Output coordinate system.
	 */
	public void setCRS(CoordinateSystem value) {
		setParameter("crs", (Object) value);
	}

	/**
	 *  Output coordinate system.
	 */
	public CoordinateSystem getCRS() {
		return (CoordinateSystem) getParameter("crs");
	}

	/**
	 *  Export format. Default: CamerasFormat.CamerasFormatXML
	 */
	public void setFormat(CamerasFormat value) {
		setParameter("format", (Object) value);
	}

	/**
	 *  Export format. Default: CamerasFormat.CamerasFormatXML
	 */
	public CamerasFormat getFormat() {
		return (CamerasFormat) getParameter("format");
	}

	/**
	 *  Image coordinate system (0 - X right, 1 - X up, 2 - X left, 3 - X down). Default: 0
	 */
	public void setImageOrientation(int value) {
		setParameter("image_orientation", (Object) value);
	}

	/**
	 *  Image coordinate system (0 - X right, 1 - X up, 2 - X left, 3 - X down). Default: 0
	 */
	public int getImageOrientation() {
		return (int) getParameter("image_orientation");
	}

	/**
	 *  Path to output file.
	 */
	public void setPath(String value) {
		setParameter("path", (Object) value);
	}

	/**
	 *  Path to output file.
	 */
	public String getPath() {
		return (String) getParameter("path");
	}

	/**
	 *  Enables/disables export of invalid image matches.
	 */
	public void setSaveInvalidMatches(boolean value) {
		setParameter("save_invalid_matches", (Object) value);
	}

	/**
	 *  Enables/disables export of invalid image matches.
	 */
	public boolean getSaveInvalidMatches() {
		return (boolean) getParameter("save_invalid_matches");
	}

	/**
	 *  Enables/disables export of manual matching points.
	 */
	public void setSaveMarkers(boolean value) {
		setParameter("save_markers", (Object) value);
	}

	/**
	 *  Enables/disables export of manual matching points.
	 */
	public boolean getSaveMarkers() {
		return (boolean) getParameter("save_markers");
	}

	/**
	 *  Enables/disables export of automatic tie points.
	 */
	public void setSavePoints(boolean value) {
		setParameter("save_points", (Object) value);
	}

	/**
	 *  Enables/disables export of automatic tie points.
	 */
	public boolean getSavePoints() {
		return (boolean) getParameter("save_points");
	}

	/**
	 *  Transform image coordinates to initial calibration.
	 */
	public void setUseInitialCalibration(boolean value) {
		setParameter("use_initial_calibration", (Object) value);
	}

	/**
	 *  Transform image coordinates to initial calibration.
	 */
	public boolean getUseInitialCalibration() {
		return (boolean) getParameter("use_initial_calibration");
	}

	/**
	 *  Enables/disables label based item identifiers.
	 */
	public void setUseLabels(boolean value) {
		setParameter("use_labels", (Object) value);
	}

	/**
	 *  Enables/disables label based item identifiers.
	 */
	public boolean getUseLabels() {
		return (boolean) getParameter("use_labels");
	}

}
