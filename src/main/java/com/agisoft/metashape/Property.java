package com.agisoft.metashape;

public class Property {

	private String label;
	private String value;

	public Property() {
		label = new String();
		value = new String();
	}

	public Property(String label, String value) {
		this.label = label;
		this.value = value;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
