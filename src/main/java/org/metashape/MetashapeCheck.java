package org.metashape;

import java.io.File;

import com.agisoft.metashape.Document;
import com.agisoft.metashape.Metashape;

/**
 * A class that enables to check Agisoft MEtashape (c) Java bindings.
 * @author Julien Seinturier
 *
 */
public class MetashapeCheck {

	/**
	 * Run the check method.
	 */
	public static void check() {
		
		boolean available = MetashapeNatives.isAvailable();
		
		if (available) {
			
			boolean check = true;
			
			try {
				System.out.println("Version: "+Metashape.getVersion());
			} catch (Throwable t) {
				System.err.println("Unable to get Agisoft Metashape(c) version: "+t.getMessage());
				t.printStackTrace(System.err);
				check = false;
			}
			
			try {
				System.out.println("CPU Enabled: "+Metashape.isCpuEnabled());
			} catch (Throwable t) {
				System.err.println("Unable to get Agisoft Metashape(c) CPU enabled: "+t.getMessage());
				t.printStackTrace(System.err);
				check = false;
			}
			
			try {
				Document doc = new Document();
				doc.save("project.psx", null);
				File f = new File("project.psx");
				f.delete();
			} catch (Throwable t) {
				System.err.println("Unable to create a Document: "+t.getMessage());
				t.printStackTrace(System.err);
				check = false;
			}
			
			if (check) {
				System.out.println("Agisoft Metashape(c) Java bindings are functionnal.");
			} else {
				System.err.println("Agisoft Metashape(c) Java bindings are not available.");
			}
			
		} else {
			System.err.println("Agisoft Metashape(c) Java bindings are not available.");
		}
		
	}
}
