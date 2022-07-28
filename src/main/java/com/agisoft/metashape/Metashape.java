/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

public class Metashape {
  /**
   *  Metashape version.
   */
  public static String getVersion() {
    return MetashapeJNI.getVersion();
  }

  /**
   *  GPU device bit mask: 1 - use device, 0 - do not use (i.e. value 5 enables device number 0 and 2).
   */
  public static void setGpuMask(long mask) {
    MetashapeJNI.setGpuMask(mask);
  }

  /**
   *  GPU device bit mask: 1 - use device, 0 - do not use (i.e. value 5 enables device number 0 and 2).
   */
  public static long getGpuMask() {
    return MetashapeJNI.getGpuMask();
  }

  /**
   *  Use CPU when GPU is active.
   */
  public static void setCpuEnabled(boolean enable) {
    MetashapeJNI.setCpuEnabled(enable);
  }

  /**
   *  Use CPU when GPU is active.
   */
  public static boolean isCpuEnabled() {
    return MetashapeJNI.isCpuEnabled();
  }

  /**
   *  Project compression level.
   */
  public static void setProjectCompression(int compression) {
    MetashapeJNI.setProjectCompression(compression);
  }

  /**
   *  Project compression level.
   */
  public static int getProjectCompression() {
    return MetashapeJNI.getProjectCompression();
  }

  /**
   *  Store absolute image paths in project files.
   */
  public static void setProjectAbsolutePaths(boolean enable) {
    MetashapeJNI.setProjectAbsolutePaths(enable);
  }

  /**
   *  Store absolute image paths in project files.
   */
  public static boolean getProjectAbsolutePaths() {
    return MetashapeJNI.getProjectAbsolutePaths();
  }

  /**
   *  Network data root path.
   */
  public static void setNetworkPath(String path) {
    MetashapeJNI.setNetworkPath(path);
  }

  /**
   *  Network data root path.
   */
  public static String getNetworkPath() {
    return MetashapeJNI.getNetworkPath();
  }

  /**
   *  Calls malloc_trim on Linux (does nothing on other OS)
   */
  public static void releaseFreeMemory() {
    MetashapeJNI.releaseFreeMemory();
  }

}
