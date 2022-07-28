package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildUV extends Task {

	public BuildUV() {
		super("BuildUV");
	}

	/**
	 *  Camera to be used for texturing in MappingCamera mode. Default: -1
	 */
	public void setCamera(int value) {
		setParameter("camera", (Object) value);
	}

	/**
	 *  Camera to be used for texturing in MappingCamera mode. Default: -1
	 */
	public int getCamera() {
		return (int) getParameter("camera");
	}

	/**
	 *  Texture mapping mode. Default: MappingMode.GenericMapping
	 */
	public void setMappingMode(MappingMode value) {
		setParameter("mapping_mode", (Object) value);
	}

	/**
	 *  Texture mapping mode. Default: MappingMode.GenericMapping
	 */
	public MappingMode getMappingMode() {
		return (MappingMode) getParameter("mapping_mode");
	}

	/**
	 *  Number of texture pages to generate. Default: 1
	 */
	public void setPageCount(int value) {
		setParameter("page_count", (Object) value);
	}

	/**
	 *  Number of texture pages to generate. Default: 1
	 */
	public int getPageCount() {
		return (int) getParameter("page_count");
	}

	/**
	 *  Expected size of texture page at texture generation step. Default: 8192
	 */
	public void setTextureSize(int value) {
		setParameter("texture_size", (Object) value);
	}

	/**
	 *  Expected size of texture page at texture generation step. Default: 8192
	 */
	public int getTextureSize() {
		return (int) getParameter("texture_size");
	}

}
