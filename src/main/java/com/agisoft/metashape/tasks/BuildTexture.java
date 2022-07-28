package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class BuildTexture extends Task {

	public BuildTexture() {
		super("BuildTexture");
	}

	/**
	 *  Texture blending mode. Default: BlendingMode.MosaicBlending
	 */
	public void setBlendingMode(BlendingMode value) {
		setParameter("blending_mode", (Object) value);
	}

	/**
	 *  Texture blending mode. Default: BlendingMode.MosaicBlending
	 */
	public BlendingMode getBlendingMode() {
		return (BlendingMode) getParameter("blending_mode");
	}

	/**
	 *  A list of cameras to be used for texturing.
	 */
	public void setCameras(int[] value) {
		setParameter("cameras", (Object) value);
	}

	/**
	 *  A list of cameras to be used for texturing.
	 */
	public int[] getCameras() {
		return (int[]) getParameter("cameras");
	}

	/**
	 *  Enable hole filling.
	 */
	public void setFillHoles(boolean value) {
		setParameter("fill_holes", (Object) value);
	}

	/**
	 *  Enable hole filling.
	 */
	public boolean getFillHoles() {
		return (boolean) getParameter("fill_holes");
	}

	/**
	 *  Enable ghosting filter.
	 */
	public void setGhostingFilter(boolean value) {
		setParameter("ghosting_filter", (Object) value);
	}

	/**
	 *  Enable ghosting filter.
	 */
	public boolean getGhostingFilter() {
		return (boolean) getParameter("ghosting_filter");
	}

	/**
	 *  Source model. Default: -1
	 */
	public void setSourceModel(int value) {
		setParameter("source_model", (Object) value);
	}

	/**
	 *  Source model. Default: -1
	 */
	public int getSourceModel() {
		return (int) getParameter("source_model");
	}

	/**
	 *  Texture page size. Default: 8192
	 */
	public void setTextureSize(int value) {
		setParameter("texture_size", (Object) value);
	}

	/**
	 *  Texture page size. Default: 8192
	 */
	public int getTextureSize() {
		return (int) getParameter("texture_size");
	}

	/**
	 *  Texture type. Default: Model.TextureType.DiffuseMap
	 */
	public void setTextureType(Model.TextureType value) {
		setParameter("texture_type", (Object) value);
	}

	/**
	 *  Texture type. Default: Model.TextureType.DiffuseMap
	 */
	public Model.TextureType getTextureType() {
		return (Model.TextureType) getParameter("texture_type");
	}

	/**
	 *  Transfer texture.
	 */
	public void setTransferTexture(boolean value) {
		setParameter("transfer_texture", (Object) value);
	}

	/**
	 *  Transfer texture.
	 */
	public boolean getTransferTexture() {
		return (boolean) getParameter("transfer_texture");
	}

}
