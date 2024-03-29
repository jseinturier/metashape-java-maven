/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * License tools.
 */
public class License {
  /**
   *  Get activation status.
   */
  public static boolean isValid() {
    return MetashapeJNI.License_isValid();
  }

  /**
   *  Activate software online using a license key.
   */
  public static void activate(String license_key) {
    MetashapeJNI.License_activate(license_key);
  }

  /**
   *  Create a request for offline activation.
   */
  public static String activateOffline(String license_key) {
    return MetashapeJNI.License_activateOffline(license_key);
  }

  /**
   *  Deactivate software online.
   */
  public static void deactivate() {
    MetashapeJNI.License_deactivate();
  }

  /**
   *  Create a request for offline deactivation.
   */
  public static String deactivateOffline() {
    return MetashapeJNI.License_deactivateOffline();
  }

}
