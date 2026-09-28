package org.apache.maven.artifact.versioning;

public interface ArtifactVersion extends Comparable<ArtifactVersion> {
    int getBuildNumber();
    int getIncrementalVersion();
    int getMajorVersion();
    int getMinorVersion();
    String getQualifier();
}
