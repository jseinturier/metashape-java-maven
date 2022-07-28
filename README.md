# Agisoft Metashape(c) Java wrapper for Maven

A Maven compatible and autonomous distribution of [Agisoft Metashape(c) Java wrapper](https://www.agisoft.com/downloads/installer/). This wrapper embbeds and deploys the underlying natives libraries according to the system without the need of managing external libraries. 

## Integration

### Maven
To import the library just add the following dependency to your maven project:
```xml

<!-- JOrigin repository -->          
<repository>
  <id>jorigin</id>
  <name>jorigin-maven</name>
  <url>https://maven.jorigin.org</url>
</repository>

<!-- The Agisoft Metashape Java  Wrapper -->
<dependency>
  <groupId>com.agisoft</groupId>
  <artifactId>metashape</artifactId>
  <version>1.8.2</version>
</dependency>
```

### Standalone
The library can be used as a standalone by downloading the [metashape-1.8.3.jar](https://github.com/jseinturier/metashape-java-maven/releases/download/v1.8.3/metashape-1.8.3.jar) jar and integrating it to the classpath. 

## Usage
The usage is strictly the same as the original distribution from Agisoft (underlying classes are not modified).

Before the first use of any Agisoft Metashape Wrapper class, a call to `org.metashape.MetashapeNatives.isAvailable()` has to be performed in order to unpack and load the required natives libraries.

If you are experiencing a *No license for product (-1)* error, it is recommended to define an `agisoft_LICENSE` environment variable that points to the folder where Agisoft Metashape(c) license file (default `rlm_roam.lic` or other `.lic` file) is stored. By default this folder is:
- `C:\Program Files\Agisoft\Metashape Pro` on windows x64
- `C:\Program Files (x86)\Agisoft\Metashape Pro` on windows x32


