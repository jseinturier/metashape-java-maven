package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class ExportTexture extends Task {

	public ExportTexture() {
		super("ExportTexture");
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
	 *  Enable alpha channel export.
	 */
	public void setSaveAlpha(boolean value) {
		setParameter("save_alpha", (Object) value);
	}

	/**
	 *  Enable alpha channel export.
	 */
	public boolean getSaveAlpha() {
		return (boolean) getParameter("save_alpha");
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

}
