/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * n-channel image.
 */
public class Image {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Image(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Image obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MetashapeJNI.delete_Image(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Image() {
    this(MetashapeJNI.new_Image__SWIG_0(), true);
  }

  public Image(Image image) {
    this(MetashapeJNI.new_Image__SWIG_1(Image.getCPtr(image), image), true);
  }

  public Image(long width, long height, String channels, DataType data_type) {
    this(MetashapeJNI.new_Image__SWIG_2(width, height, channels, data_type.ordinal()), true);
  }

  public boolean isNull() {
    return MetashapeJNI.Image_isNull(swigCPtr, this);
  }

  public Image copy() {
    return new Image(MetashapeJNI.Image_copy(swigCPtr, this), true);
  }

  /**
   *  Image width.
   */
  public long getWidth() {
    return MetashapeJNI.Image_getWidth(swigCPtr, this);
  }

  /**
   *  Image height.
   */
  public long getHeight() {
    return MetashapeJNI.Image_getHeight(swigCPtr, this);
  }

  /**
   *  Number of color channels.
   */
  public long getChannelCount() {
    return MetashapeJNI.Image_getChannelCount(swigCPtr, this);
  }

  public String getChannels() {
    return MetashapeJNI.Image_getChannels(swigCPtr, this);
  }

  public DataType getDataType() {
    return DataType.class.getEnumConstants()[MetashapeJNI.Image_getDataType(swigCPtr, this)];
  }

  public void resize(long width, long height) {
    MetashapeJNI.Image_resize(swigCPtr, this, width, height);
  }

  public Image convert(String channels, DataType data_type) {
    return new Image(MetashapeJNI.Image_convert(swigCPtr, this, channels, data_type.ordinal()), true);
  }

  public boolean save(String path) {
    return MetashapeJNI.Image_save(swigCPtr, this, path);
  }

  public boolean load(String path, int layer, DataType data_type, String channels) {
    return MetashapeJNI.Image_load(swigCPtr, this, path, layer, data_type.ordinal(), channels);
  }

}
