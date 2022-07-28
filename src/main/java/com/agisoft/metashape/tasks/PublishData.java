package com.agisoft.metashape.tasks;

import com.agisoft.metashape.*;

/**
 * Task class containing processing parameters.
 */
public class PublishData extends Task {

	public PublishData() {
		super("PublishData");
	}

	/**
	 *  Account name (Melown service).
	 */
	public void setAccount(String value) {
		setParameter("account", (Object) value);
	}

	/**
	 *  Account name (Melown service).
	 */
	public String getAccount() {
		return (String) getParameter("account");
	}

	/**
	 *  Dataset description.
	 */
	public void setDescription(String value) {
		setParameter("description", (Object) value);
	}

	/**
	 *  Dataset description.
	 */
	public String getDescription() {
		return (String) getParameter("description");
	}

	/**
	 *  Service hostname (4DMapper service).
	 */
	public void setHostname(String value) {
		setParameter("hostname", (Object) value);
	}

	/**
	 *  Service hostname (4DMapper service).
	 */
	public String getHostname() {
		return (String) getParameter("hostname");
	}

	/**
	 *  Image compression parameters.
	 */
	public void setImageCompression(ImageCompression value) {
		setParameter("image_compression", (Object) value);
	}

	/**
	 *  Image compression parameters.
	 */
	public ImageCompression getImageCompression() {
		return (ImageCompression) getParameter("image_compression");
	}

	/**
	 *  Mark dataset as draft (Sketchfab service).
	 */
	public void setIsDraft(boolean value) {
		setParameter("is_draft", (Object) value);
	}

	/**
	 *  Mark dataset as draft (Sketchfab service).
	 */
	public boolean getIsDraft() {
		return (boolean) getParameter("is_draft");
	}

	/**
	 *  Set dataset access to private (Pointbox and Sketchfab services).
	 */
	public void setIsPrivate(boolean value) {
		setParameter("is_private", (Object) value);
	}

	/**
	 *  Set dataset access to private (Pointbox and Sketchfab services).
	 */
	public boolean getIsPrivate() {
		return (boolean) getParameter("is_private");
	}

	/**
	 *  Set dataset access to protected (Pointbox service).
	 */
	public void setIsProtected(boolean value) {
		setParameter("is_protected", (Object) value);
	}

	/**
	 *  Set dataset access to protected (Pointbox service).
	 */
	public boolean getIsProtected() {
		return (boolean) getParameter("is_protected");
	}

	/**
	 *  Maximum zoom level. Default: -1
	 */
	public void setMaxZoomLevel(int value) {
		setParameter("max_zoom_level", (Object) value);
	}

	/**
	 *  Maximum zoom level. Default: -1
	 */
	public int getMaxZoomLevel() {
		return (int) getParameter("max_zoom_level");
	}

	/**
	 *  Minimum zoom level. Default: -1
	 */
	public void setMinZoomLevel(int value) {
		setParameter("min_zoom_level", (Object) value);
	}

	/**
	 *  Minimum zoom level. Default: -1
	 */
	public int getMinZoomLevel() {
		return (int) getParameter("min_zoom_level");
	}

	/**
	 *  Account owner (Cesium and Mapbox services).
	 */
	public void setOwner(String value) {
		setParameter("owner", (Object) value);
	}

	/**
	 *  Account owner (Cesium and Mapbox services).
	 */
	public String getOwner() {
		return (String) getParameter("owner");
	}

	/**
	 *  Account password (4DMapper, Melown, Pointscene and Sketchfab services).
	 */
	public void setPassword(String value) {
		setParameter("password", (Object) value);
	}

	/**
	 *  Account password (4DMapper, Melown, Pointscene and Sketchfab services).
	 */
	public String getPassword() {
		return (String) getParameter("password");
	}

	/**
	 *  List of dense point classes to be exported.
	 */
	public void setPointClasses(int[] value) {
		setParameter("point_classes", (Object) value);
	}

	/**
	 *  List of dense point classes to be exported.
	 */
	public int[] getPointClasses() {
		return (int[]) getParameter("point_classes");
	}

	/**
	 *  Output projection.
	 */
	public void setProjection(CoordinateSystem value) {
		setParameter("projection", (Object) value);
	}

	/**
	 *  Output projection.
	 */
	public CoordinateSystem getProjection() {
		return (CoordinateSystem) getParameter("projection");
	}

	/**
	 *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
	 */
	public void setRasterTransform(RasterTransformType value) {
		setParameter("raster_transform", (Object) value);
	}

	/**
	 *  Raster band transformation. Default: RasterTransformType.RasterTransformNone
	 */
	public RasterTransformType getRasterTransform() {
		return (RasterTransformType) getParameter("raster_transform");
	}

	/**
	 *  Output resolution in meters. Default: 0.0
	 */
	public void setResolution(double value) {
		setParameter("resolution", (Object) value);
	}

	/**
	 *  Output resolution in meters. Default: 0.0
	 */
	public double getResolution() {
		return (double) getParameter("resolution");
	}

	/**
	 *  Enables/disables export of camera track.
	 */
	public void setSaveCameraTrack(boolean value) {
		setParameter("save_camera_track", (Object) value);
	}

	/**
	 *  Enables/disables export of camera track.
	 */
	public boolean getSaveCameraTrack() {
		return (boolean) getParameter("save_camera_track");
	}

	/**
	 *  Enables/disables export of point colors.
	 */
	public void setSavePointColors(boolean value) {
		setParameter("save_point_colors", (Object) value);
	}

	/**
	 *  Enables/disables export of point colors.
	 */
	public boolean getSavePointColors() {
		return (boolean) getParameter("save_point_colors");
	}

	/**
	 *  Service to upload on. Default: ServiceType.ServiceSketchfab
	 */
	public void setService(ServiceType value) {
		setParameter("service", (Object) value);
	}

	/**
	 *  Service to upload on. Default: ServiceType.ServiceSketchfab
	 */
	public ServiceType getService() {
		return (ServiceType) getParameter("service");
	}

	/**
	 *  Asset type to upload. Default: DataSource.PointCloudData
	 */
	public void setSourceData(DataSource value) {
		setParameter("source_data", (Object) value);
	}

	/**
	 *  Asset type to upload. Default: DataSource.PointCloudData
	 */
	public DataSource getSourceData() {
		return (DataSource) getParameter("source_data");
	}

	/**
	 *  Dataset tags.
	 */
	public void setTags(String value) {
		setParameter("tags", (Object) value);
	}

	/**
	 *  Dataset tags.
	 */
	public String getTags() {
		return (String) getParameter("tags");
	}

	/**
	 *  Tile size in pixels. Default: 256
	 */
	public void setTileSize(int value) {
		setParameter("tile_size", (Object) value);
	}

	/**
	 *  Tile size in pixels. Default: 256
	 */
	public int getTileSize() {
		return (int) getParameter("tile_size");
	}

	/**
	 *  Dataset title.
	 */
	public void setTitle(String value) {
		setParameter("title", (Object) value);
	}

	/**
	 *  Dataset title.
	 */
	public String getTitle() {
		return (String) getParameter("title");
	}

	/**
	 *  Account token (Cesium, Mapbox, Picterra, Pointbox and Sketchfab services).
	 */
	public void setToken(String value) {
		setParameter("token", (Object) value);
	}

	/**
	 *  Account token (Cesium, Mapbox, Picterra, Pointbox and Sketchfab services).
	 */
	public String getToken() {
		return (String) getParameter("token");
	}

	/**
	 *  Account username (4DMapper, Melown and Pointscene services).
	 */
	public void setUsername(String value) {
		setParameter("username", (Object) value);
	}

	/**
	 *  Account username (4DMapper, Melown and Pointscene services).
	 */
	public String getUsername() {
		return (String) getParameter("username");
	}

}
