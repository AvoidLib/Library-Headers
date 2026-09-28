package org.apache.maven.artifact.versioning;

public class VersionRange {
    private VersionRange() {}

    public ArtifactVersion getRecommendedVersion() {
        throw new RuntimeException("Implemented");
    }
}
