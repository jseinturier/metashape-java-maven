package org.metashape;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class enable to check the availability of Metashape(c) natives wraps. 
 * Before any use of Metashape(c) wrapper, a call to {@link #isAvailable() MetashapeNatives.isAvailable()} has to be performed 
 * in order to unpack and load the required libraries.<br><br>
 * Libraries are unpacked to the directory pointed by <code>System.getProperty("java.io.tmpdir")</code>. 
 * @author Julien Seinturier
 */
public class MetashapeNatives {

	private static boolean available = false;

	private static String[] linuxX64Libs = new String[] {"libgfortran.so.3", "libgmp.so.10.compat", "libmetashape.so", "libmpfr.so.4.compat", "libopenblas.so.0", "libstdc++.so.6.compat"};
	private static String[] macosX64Libs = new String[] {"libgmp.10.dylib", "libmetashape.jnilib", "libomp.dylib"};
	private static String[] winX32Libs   = new String[] {"libgmp-10.dll", "libopenblas.dll", "metashape.dll"};
	private static String[] winX64Libs   = new String[] {"libgmp-10.dll", "libopenblas.dll", "metashape.dll"};
	
	{init();}

	private static void init(){

		String osArch    = System.getProperty("os.arch");    // Operating system architecture
		String osName    = System.getProperty("os.name");    // Operating system name

		String nativeLibrariesDir = null;

		String[] libraries = null;
		
		Logger log = Logger.getLogger("com.agisoft.metashape");
		
		if (osName != null){
			if (osName.toUpperCase().contains("WINDOWS")){
				nativeLibrariesDir = "/natives/win";

				if (osArch != null){

					if (osArch.toUpperCase().contains("64")){

						libraries = winX64Libs;
						
						nativeLibrariesDir += "/x64";

					} else if (osArch.toUpperCase().contains("86")){

						libraries = winX32Libs;
						nativeLibrariesDir += "/x32";

					} else {
						log.log(Level.WARNING, "Cannot load Metashape libraries (unknonwn system architecture "+osArch+")");
						available = false;
						return;
					}

				} 

			} else  if (osName.toUpperCase().indexOf("NIS") >= 0 || osName.toUpperCase().indexOf("NUX") >= 0 || osName.toUpperCase().indexOf("AIX") > 0 ) {

				nativeLibrariesDir = "/natives/linux";

				if (osArch != null){
					if (osArch.toUpperCase().contains("AMD64")){
						libraries = linuxX64Libs;
						nativeLibrariesDir += "/x64";

					} else if (osArch.toUpperCase().contains("X86")){
						log.log(Level.WARNING, "Metashape libraries are not available for architecture "+osArch+")");
						available = false;
					}
				} else {
					log.log(Level.WARNING, "Cannot load Metashape libraries (no system architecture os.arch available");
					available = false;
					return;
				}
			} else if (osName.toUpperCase().contains("MAC")){
				nativeLibrariesDir = "/natives/macos";

				if (osArch != null){

					if (osArch.toUpperCase().contains("64")){

						libraries = macosX64Libs;
						
						nativeLibrariesDir += "/x64";

					} else {
						log.log(Level.WARNING, "Cannot load Metashape libraries (unknonwn system architecture "+osArch+")");
						available = false;
						return;
					}

				} 

			} else {
				log.log(Level.WARNING, "Cannot load Metashape libraries (no system architecture os.arch available");
				available = false;
				return;
			} 
		} else {
			log.log(Level.WARNING, "Cannot load Metashape libraries os \""+osName+"\" is not supported.");
			available = false;
			return;
		}


		if (nativeLibrariesDir != null) {

			available = true;
			
			for(String library : libraries) {
				String libraryPath = nativeLibrariesDir+"/"+library;
				
				InputStream inputStream = MetashapeNatives.class.getResourceAsStream(libraryPath);

				OutputStream output = null;

				if (inputStream != null) {

					//Copy the dll to the tmp folder
					String tmpLibraryPath = System.getProperty("java.io.tmpdir")+File.separator+library;

					try{

						output = new BufferedOutputStream(new FileOutputStream(tmpLibraryPath));

						byte[] buffer = new byte[1024];
						int lengthRead;
						while ((lengthRead = inputStream.read(buffer)) > 0) {
							output.write(buffer, 0, lengthRead);
							output.flush();
						}

					} catch(Exception e) {
						log.log(Level.SEVERE, "Cannot extract Metashape resource library "+nativeLibrariesDir+" to "+tmpLibraryPath);
						log.log(Level.SEVERE, e.getMessage(), e);	
					} finally {

						try {
							if (inputStream != null) {
								inputStream.close();
							}

							if (output != null) {
								output.close();
							}
						} catch (IOException e) {
							log.log(Level.WARNING, "Resource closing error.");
						}
					}

					try {

						System.load(tmpLibraryPath);
						log.log(Level.CONFIG, "Loaded "+tmpLibraryPath+" library");
						available &= true;
					} catch (Error e) {
						log.log(Level.SEVERE, "Cannot load Metashape library from "+tmpLibraryPath+": "+e.getMessage(), e);
						available = false;
					} catch (Exception e) {
						log.log(Level.SEVERE, "Cannot load Metashape library from "+tmpLibraryPath+": "+e.getMessage(), e);
						available = false;
					}

				} else {
					log.log(Level.SEVERE, "Cannot extract Metashape library from "+nativeLibrariesDir);
					available = false;
				}
			}
			
			
		}
	}

	/**
	 * Check if the openCV native library is available and accessible from Java.
	 */
	public static boolean isAvailable(){
		if (!available){
			init();
		}

		return available;
	}

}
