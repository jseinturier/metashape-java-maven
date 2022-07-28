package com.agisoft.metashape;

public class Pair {

	private int first;
	private int second;

	public Pair() {
		first = 0;
		second = 0;
	}

	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public void setFirst(int value) {
		this.first = value;
	}

	public int getFirst() {
		return first;
	}

	public void setSecond(int value) {
		this.second = value;
	}

	public int getSecond() {
		return second;
	}

}
