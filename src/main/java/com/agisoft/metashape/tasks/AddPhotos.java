package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class AddPhotos extends Task {

	public AddPhotos() {
		super("AddPhotos");
	}

	/**
	 *  List of file groups.
	 */
	public void setFilegroups(int[] value) {
		setParameter("filegroups", (Object) value);
	}

	/**
	 *  List of file groups.
	 */
	public int[] getFilegroups() {
		return (int[]) getParameter("filegroups");
	}

	/**
	 *  List of files to add.
	 */
	public void setFilenames(String[] value) {
		setParameter("filenames", (Object) value);
	}

	/**
	 *  List of files to add.
	 */
	public String[] getFilenames() {
		return (String[]) getParameter("filenames");
	}

	/**
	 *  Camera group key. Default: -1
	 */
	public void setGroup(int value) {
		setParameter("group", (Object) value);
	}

	/**
	 *  Camera group key. Default: -1
	 */
	public int getGroup() {
		return (int) getParameter("group");
	}

	/**
	 *  Image layout. Default: ImageLayout.UndefinedLayout
	 */
	public void setLayout(ImageLayout value) {
		setParameter("layout", (Object) value);
	}

	/**
	 *  Image layout. Default: ImageLayout.UndefinedLayout
	 */
	public ImageLayout getLayout() {
		return (ImageLayout) getParameter("layout");
	}

	/**
	 *  Load reference coordinates.
	 */
	public void setLoadReference(boolean value) {
		setParameter("load_reference", (Object) value);
	}

	/**
	 *  Load reference coordinates.
	 */
	public boolean getLoadReference() {
		return (boolean) getParameter("load_reference");
	}

	/**
	 *  Load satellite RPC data from auxiliary TXT files.
	 */
	public void setLoadRpcTxt(boolean value) {
		setParameter("load_rpc_txt", (Object) value);
	}

	/**
	 *  Load satellite RPC data from auxiliary TXT files.
	 */
	public boolean getLoadRpcTxt() {
		return (boolean) getParameter("load_rpc_txt");
	}

	/**
	 *  Load accuracy from XMP meta data.
	 */
	public void setLoadXmpAccuracy(boolean value) {
		setParameter("load_xmp_accuracy", (Object) value);
	}

	/**
	 *  Load accuracy from XMP meta data.
	 */
	public boolean getLoadXmpAccuracy() {
		return (boolean) getParameter("load_xmp_accuracy");
	}

	/**
	 *  Load GPS/INS offset from XMP meta data.
	 */
	public void setLoadXmpAntenna(boolean value) {
		setParameter("load_xmp_antenna", (Object) value);
	}

	/**
	 *  Load GPS/INS offset from XMP meta data.
	 */
	public boolean getLoadXmpAntenna() {
		return (boolean) getParameter("load_xmp_antenna");
	}

	/**
	 *  Load calibration from XMP meta data.
	 */
	public void setLoadXmpCalibration(boolean value) {
		setParameter("load_xmp_calibration", (Object) value);
	}

	/**
	 *  Load calibration from XMP meta data.
	 */
	public boolean getLoadXmpCalibration() {
		return (boolean) getParameter("load_xmp_calibration");
	}

	/**
	 *  Load orientation from XMP meta data.
	 */
	public void setLoadXmpOrientation(boolean value) {
		setParameter("load_xmp_orientation", (Object) value);
	}

	/**
	 *  Load orientation from XMP meta data.
	 */
	public boolean getLoadXmpOrientation() {
		return (boolean) getParameter("load_xmp_orientation");
	}

	/**
	 *  Strip file extensions from camera labels.
	 */
	public void setStripExtensions(boolean value) {
		setParameter("strip_extensions", (Object) value);
	}

	/**
	 *  Strip file extensions from camera labels.
	 */
	public boolean getStripExtensions() {
		return (boolean) getParameter("strip_extensions");
	}

}
