package com.agisoft.metashape;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NetworkTask {

	private String name;
	private Map<String, Object> params;
	private Map<Integer, int[]> frames;
	private boolean supports_gpu;

	public NetworkTask() {
		params = new HashMap<String, Object>();
		frames = new HashMap<Integer, int[]>();
	}

	/**
	 *  Task name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *  Task name.
	 */
	public String getName() {
		return name;
	}

	/**
	 *  List of configured parameter names.
	 */
	public String[] getParameterNames() {
		return params.keySet().toArray(new String[0]);
	}

	/**
	 * Set parameter value.<br>
	 * @param name Parameter name.<br>
	 * @param value Parameter value.
	 */
	public void setParameter(String name, Object value) {
		params.put(name, value);
	}

	/**
	 * Remove parameter.<br>
	 * @param name Parameter name.<br>
	 */
	public void removeParameter(String name) {
		params.remove(name);
	}

	/**
	 * Check if parameter is configured.<br>
	 * @param name Parameter name.<br>
	 */
	public boolean hasParameter(String name) {
		return params.containsKey(name);
	}

	/**
	 * Get parameter value.<br>
	 * @param name Parameter name.<br>
	 * @return Parameter value, null if parameter does not exist.
	 */
	public Object getParameter(String name) {
		if (params.containsKey(name))
			return params.get(name);
		return null;
	}

	/**
	 *  List of chunk keys to be processed.
	 */
	public void setChunks(int[] chunks) {
		for (int i = 0; i < chunks.length; i++)
			this.frames.put(chunks[i], new int[0]);
	}

	/**
	 *  List of chunk keys to be processed.
	 */
	public int[] getChunks() {
		Integer[] chunks = frames.keySet().toArray(new Integer[0]);
		return Arrays.stream(chunks).mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Get list of frames to be processed for a chunk.<br>
	 * @param chunk Chunk key.<br>
	 * @return List of frame keys.
	 */
	public int[] getFrames(int chunk) {
		if (frames.containsKey(chunk))
			return frames.get(chunk);
		return null;
	}

	/**
	 * Set list of frames to be processed for a chunk.<br>
	 * @param chunk Chunk key.<br>
	 * @param frames List of frame keys.
	 */
	public void setFrames(int chunk, int[] frames) {
		this.frames.put(chunk, frames);
	}

	/**
	 *  GPU supported flag.
	 */
	public void setGPUSupported(boolean enable) {
		this.supports_gpu = enable;
	}

	/**
	 *  GPU supported flag.
	 */
	public boolean isGPUSupported() {
		return supports_gpu;
	}

}
