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
  <version>1.7.2</version>
</dependency>
```

### Standalone
The library can be used as a standalone by downloading the [metashape-1.7.2.jar](https://github.com/jseinturier/metashape-java-maven/releases/download/v1.7.2/metashape-1.7.2.jar) jar and integrating it to the classpath. 

## Usage
The usage is strictly the same as the original distribution from Agisoft (underlying classes are not modified).

Before the first use of any Agisoft Metashape Wrapper class, a call to `org.metashape.MetashapeNatives.isAvailable()` has to be performed in order to unpack and load the required natives libraries.

If you are experiencing a *No license for product (-1)* error, it is recommended to define the `agisoft_LICENSE` environment variable as a path to the license file containing folder.
