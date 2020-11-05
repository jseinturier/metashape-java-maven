import java.io.File;
import java.io.FilenameFilter;
import com.agisoft.metashape.*;
import com.agisoft.metashape.tasks.*;

public class align_photos
{

  static class Callback implements Progress {
    public void progress(double value)
    {
      System.out.println("progress: " + value);
    }

    public void status(String value)
    {
      System.out.println("status: " + value);
    }

    public boolean aborted()
    {
      return false;
    }
  }

  public static void main(String[] args) {
    try {
      System.loadLibrary("metashape");
    } catch (UnsatisfiedLinkError e) {
      e.printStackTrace();
    }

    Callback progress = new Callback();

    File dir = new File("images");
    File[] files = dir.listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(".jpg");
      }
    });

    String paths[] = new String[files.length];
    for (int i = 0; i < files.length; i++)
      paths[i] = files[i].getPath();

    Document doc = new Document();
    doc.save("project.psx", new int[0], 0, false, progress);

    Chunk chunk = doc.addChunk();
    chunk.addPhotos(paths, progress);

    MatchPhotos match_photos = new MatchPhotos();
    match_photos.setDownscale(1);
    match_photos.setGenericPreselection(false);
    match_photos.setKeypointLimit(40000);
    match_photos.setTiepointLimit(0);
    match_photos.apply(chunk, progress);
    match_photos.delete();

    AlignCameras align_cameras = new AlignCameras();
    align_cameras.apply(chunk, progress);
    align_cameras.delete();

    BuildDepthMaps build_depth_maps = new BuildDepthMaps();
    build_depth_maps.setDownscale(4);
    build_depth_maps.apply(chunk, progress);
    build_depth_maps.delete();

    BuildDenseCloud build_dense_cloud = new BuildDenseCloud();
    build_dense_cloud.apply(chunk, progress);
    build_dense_cloud.delete();

    BuildDem build_dem = new BuildDem();
    build_dem.apply(chunk, progress);
    build_dem.delete();

    BuildOrthomosaic build_orthomosaic = new BuildOrthomosaic();
    build_orthomosaic.setSurfaceData(DataSource.ElevationData);
    build_orthomosaic.apply(chunk, progress);
    build_orthomosaic.delete();

    doc.save(doc.getPath(), new int[0], 0, false, progress);
    doc.delete();
    System.out.println("finished");
  }
}
