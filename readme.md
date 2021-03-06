# Orbit Image Analysis
![Orbit](src/main/resources/resource/orbit_round_64.png)

### A versatile image analysis software for biological image-based quantification.

#####News:
* 2.43: Using bioformats 5.3.0 (direct, no Scifio anymore), support for multi series (e.g. VSI images) and CZI with JPEG-XR compression.

#####Available backends:

* Image provider local (local file system via Bioformats)
* Omero image server (image-provider-omero)

#####Scaleout via

* Spark scaleout (map-reduce-exec-spark)

#####Use gradle to build

Generic jar:

    gradle jar
    java -XX:MaxPermSize=150m -Djavax.xml.parsers.DocumentBuilderFactory=com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl -cp "build/libs/orbit-image-analysis.jar;build/libs/lib/*" com.actelion.research.orbit.imageAnalysis.components.OrbitImageAnalysis

License: GPLv3

Website: http://www.orbit.bio
