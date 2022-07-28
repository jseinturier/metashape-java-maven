package com.agisoft.metashape;

import java.util.Map;

/**
 * Photo instance.
 */
public class Photo {

  private String path;
  private int layer;
  private Map<String,String> meta;

  /**
   *  Path to the image file.
   */
  public void setPath(String path) {
    this.path = path;
  }

  /**
   *  Path to the image file.
   */
  public String getPath() {
    return path;
  }

  /**
   *  Layer index in the image file.
   */
  public void setLayer(int layer) {
    this.layer = layer;
  }

  /**
   *  Layer index in the image file.
   */
  public int getLayer() {
    return layer;
  }

  /**
   *  Photo meta data.
   */
  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }

  /**
   *  Photo meta data.
   */
  public Map<String,String> getMeta() { return meta; }

}
