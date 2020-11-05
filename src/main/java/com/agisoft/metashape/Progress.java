package com.agisoft.metashape;

public interface Progress
{
	public void progress(double progress);
	public void status(String status);
	public boolean aborted();
}
