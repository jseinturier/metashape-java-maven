/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.agisoft.metashape;

/**
 * Sparse point cloud.
 */
public class PointCloud {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public PointCloud(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointCloud obj) {
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
        MetashapeJNI.delete_PointCloud(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PointCloud() {
    this(MetashapeJNI.new_PointCloud__SWIG_0(), true);
  }

  public PointCloud(PointCloud point_cloud) {
    this(MetashapeJNI.new_PointCloud__SWIG_1(PointCloud.getCPtr(point_cloud), point_cloud), true);
  }

  static public class Track {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Track(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Track obj) {
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
          MetashapeJNI.delete_PointCloud_Track(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setColor(Vector3uc value) {
      MetashapeJNI.PointCloud_Track_color_set(swigCPtr, this, Vector3uc.getCPtr(value), value);
    }
  
    public Vector3uc getColor() {
      long cPtr = MetashapeJNI.PointCloud_Track_color_get(swigCPtr, this);
      return (cPtr == 0) ? null : new Vector3uc(cPtr, false);
    }
  
    public Track() {
      this(MetashapeJNI.new_PointCloud_Track(), true);
    }
  
  }

  static public class Point {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Point(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Point obj) {
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
          MetashapeJNI.delete_PointCloud_Point(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setPoint(Vector3d value) {
      MetashapeJNI.PointCloud_Point_point_set(swigCPtr, this, Vector3d.getCPtr(value), value);
    }
  
    public Vector3d getPoint() {
      long cPtr = MetashapeJNI.PointCloud_Point_point_get(swigCPtr, this);
      return (cPtr == 0) ? null : new Vector3d(cPtr, false);
    }
  
    public void setW(float value) {
      MetashapeJNI.PointCloud_Point_w_set(swigCPtr, this, value);
    }
  
    public float getW() {
      return MetashapeJNI.PointCloud_Point_w_get(swigCPtr, this);
    }
  
    public void setFlags(long value) {
      MetashapeJNI.PointCloud_Point_flags_set(swigCPtr, this, value);
    }
  
    public long getFlags() {
      return MetashapeJNI.PointCloud_Point_flags_get(swigCPtr, this);
    }
  
    public void setId(long value) {
      MetashapeJNI.PointCloud_Point_id_set(swigCPtr, this, value);
    }
  
    public long getId() {
      return MetashapeJNI.PointCloud_Point_id_get(swigCPtr, this);
    }
  
    public Point() {
      this(MetashapeJNI.new_PointCloud_Point(), true);
    }
  
  }

  static public class Projection {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Projection(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Projection obj) {
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
          MetashapeJNI.delete_PointCloud_Projection(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setPoint(Vector2d value) {
      MetashapeJNI.PointCloud_Projection_point_set(swigCPtr, this, Vector2d.getCPtr(value), value);
    }
  
    public Vector2d getPoint() {
      long cPtr = MetashapeJNI.PointCloud_Projection_point_get(swigCPtr, this);
      return (cPtr == 0) ? null : new Vector2d(cPtr, false);
    }
  
    public void setSize(float value) {
      MetashapeJNI.PointCloud_Projection_size_set(swigCPtr, this, value);
    }
  
    public float getSize() {
      return MetashapeJNI.PointCloud_Projection_size_get(swigCPtr, this);
    }
  
    public void setId(long value) {
      MetashapeJNI.PointCloud_Projection_id_set(swigCPtr, this, value);
    }
  
    public long getId() {
      return MetashapeJNI.PointCloud_Projection_id_get(swigCPtr, this);
    }
  
    public Projection() {
      this(MetashapeJNI.new_PointCloud_Projection(), true);
    }
  
  }

  static public class Tracks {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Tracks(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Tracks obj) {
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
          MetashapeJNI.delete_PointCloud_Tracks(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Tracks() {
      this(MetashapeJNI.new_PointCloud_Tracks__SWIG_0(), true);
    }
  
    public Tracks(PointCloud.Tracks tracks) {
      this(MetashapeJNI.new_PointCloud_Tracks__SWIG_1(PointCloud.Tracks.getCPtr(tracks), tracks), true);
    }
  
    public PointCloud.Tracks copy() {
      return new PointCloud.Tracks(MetashapeJNI.PointCloud_Tracks_copy(swigCPtr, this), true);
    }
  
    public void resize(long size) {
      MetashapeJNI.PointCloud_Tracks_resize(swigCPtr, this, size);
    }
  
    public long getSize() {
      return MetashapeJNI.PointCloud_Tracks_getSize(swigCPtr, this);
    }
  
    public void set(long index, PointCloud.Track track) {
      MetashapeJNI.PointCloud_Tracks_set(swigCPtr, this, index, PointCloud.Track.getCPtr(track), track);
    }
  
    public PointCloud.Track get(long index) {
      return new PointCloud.Track(MetashapeJNI.PointCloud_Tracks_get(swigCPtr, this, index), true);
    }
  
  }

  static public class Points {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Points(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Points obj) {
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
          MetashapeJNI.delete_PointCloud_Points(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Points() {
      this(MetashapeJNI.new_PointCloud_Points__SWIG_0(), true);
    }
  
    public Points(PointCloud.Points points) {
      this(MetashapeJNI.new_PointCloud_Points__SWIG_1(PointCloud.Points.getCPtr(points), points), true);
    }
  
    public PointCloud.Points copy() {
      return new PointCloud.Points(MetashapeJNI.PointCloud_Points_copy(swigCPtr, this), true);
    }
  
    public void resize(long size) {
      MetashapeJNI.PointCloud_Points_resize(swigCPtr, this, size);
    }
  
    public long getSize() {
      return MetashapeJNI.PointCloud_Points_getSize(swigCPtr, this);
    }
  
    public void set(long index, PointCloud.Point point) {
      MetashapeJNI.PointCloud_Points_set(swigCPtr, this, index, PointCloud.Point.getCPtr(point), point);
    }
  
    public PointCloud.Point get(long index) {
      return new PointCloud.Point(MetashapeJNI.PointCloud_Points_get(swigCPtr, this, index), true);
    }
  
  }

  static public class Projections {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Projections(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Projections obj) {
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
          MetashapeJNI.delete_PointCloud_Projections(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Projections() {
      this(MetashapeJNI.new_PointCloud_Projections__SWIG_0(), true);
    }
  
    public Projections(PointCloud.Projections projections) {
      this(MetashapeJNI.new_PointCloud_Projections__SWIG_1(PointCloud.Projections.getCPtr(projections), projections), true);
    }
  
    public PointCloud.Projections copy() {
      return new PointCloud.Projections(MetashapeJNI.PointCloud_Projections_copy(swigCPtr, this), true);
    }
  
    public void resize(long size) {
      MetashapeJNI.PointCloud_Projections_resize(swigCPtr, this, size);
    }
  
    public long getSize() {
      return MetashapeJNI.PointCloud_Projections_getSize(swigCPtr, this);
    }
  
    public void set(long index, PointCloud.Projection proj) {
      MetashapeJNI.PointCloud_Projections_set(swigCPtr, this, index, PointCloud.Projection.getCPtr(proj), proj);
    }
  
    public PointCloud.Projection get(long index) {
      return new PointCloud.Projection(MetashapeJNI.PointCloud_Projections_get(swigCPtr, this, index), true);
    }
  
  }

  /**
   *  Chunk container, may be null.
   */
  public Chunk getChunk() {
    long ptr = MetashapeJNI.PointCloud_getChunk(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new Chunk(ptr, true);
  }

  /**
   *  Path to point cloud file.
   */
  public String getPath() {
    return MetashapeJNI.PointCloud_getPath(swigCPtr, this);
  }

  /**
   *  Point cloud meta data.
   */
  public void setMeta(MetaData meta) {
    MetashapeJNI.PointCloud_setMeta(swigCPtr, this, MetaData.getCPtr(meta), meta);
  }

  /**
   *  Point cloud meta data.
   */
  public MetaData getMeta() {
    return new MetaData(MetashapeJNI.PointCloud_getMeta(swigCPtr, this), true);
  }

  /**
   *  List of tracks, may be null.
   */
  public void setTracks(PointCloud.Tracks tracks) {
    MetashapeJNI.PointCloud_setTracks(swigCPtr, this, tracks == null ? 0 : PointCloud.Tracks.getCPtr(tracks));
  }

  /**
   *  List of tracks, may be null.
   */
  public PointCloud.Tracks getTracks() {
    long ptr = MetashapeJNI.PointCloud_getTracks(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new PointCloud.Tracks(ptr, true);
  }

  /**
   *  List of points, may be null.
   */
  public void setPoints(PointCloud.Points points) {
    MetashapeJNI.PointCloud_setPoints(swigCPtr, this, points == null ? 0 : PointCloud.Points.getCPtr(points));
  }

  /**
   *  List of points, may be null.
   */
  public PointCloud.Points getPoints() {
    long ptr = MetashapeJNI.PointCloud_getPoints(swigCPtr, this);
    if (ptr == 0)
        return null;
    return new PointCloud.Points(ptr, true);
  }

  /**
   *  Point projections for the camera, may be null.
   */
  public void setProjections(int camera, PointCloud.Projections projections) {
    MetashapeJNI.PointCloud_setProjections(swigCPtr, this, camera, projections == null ? 0 : PointCloud.Projections.getCPtr(projections));
  }

  /**
   *  Point projections for the camera, may be null.
   */
  public PointCloud.Projections getProjections(int camera) {
    long ptr = MetashapeJNI.PointCloud_getProjections(swigCPtr, this, camera);
    if (ptr == 0)
        return null;
    return new PointCloud.Projections(ptr, true);
  }

  public int[] getCameraKeys() { return MetashapeJNI.PointCloud_getCameraKeys(swigCPtr, this); }

  /**
   * Remove points with insufficient number of projections.<br>
   * @param progress Progress callback.
   */
  public void cleanup(Progress progress) {
    MetashapeJNI.PointCloud_cleanup(swigCPtr, this, progress);
  }

  /**
   * Returns ray intersection with the sparse point cloud.<br>
   * @param origin Ray origin.<br>
   * @param target Point on the ray.<br>
   * @return Coordinates of the intersection point, may be null.
   */
  public Vector3d pickPoint(Vector3d origin, Vector3d target) {
    long ptr = MetashapeJNI.PointCloud_pickPoint(swigCPtr, this, Vector3d.getCPtr(origin), origin, Vector3d.getCPtr(target), target);
    if (ptr == 0)
        return null;
    return new Vector3d(ptr, true);
  }

  /**
   * Generate point cloud preview image.<br>
   * @param width Preview image width.<br>
   * @param height Preview image height.<br>
   * @param transform 4x4 viewpoint transformation matrix.<br>
   * @param point_size Point size.<br>
   * @return Preview image.
   */
  public Image renderPreview(long width, long height, Matrix4x4d transform, int point_size, Progress progress) {
    return new Image(MetashapeJNI.PointCloud_renderPreview(swigCPtr, this, width, height, Matrix4x4d.getCPtr(transform), transform, point_size, progress), true);
  }

}
