# Agisoft Metashape(c) Java wrapper for Maven

A Maven compatible distribution of  [Agisoft Metashape(c) Java wrapper](https://www.agisoft.com/downloads/installer/)

# Usage

The usage is strictly the same as the original distribution from Agisoft (underlying classes are not modified).

Before the first use of any Agisoft Metashape Wrapper class, a call to `org.metashape.MetashapeNatives.isAvailable()` has to be perfoemed in order to unpack and load the required natives libraries.