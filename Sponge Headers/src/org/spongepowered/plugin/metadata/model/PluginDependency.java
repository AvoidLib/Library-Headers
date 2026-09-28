package org.spongepowered.plugin.metadata.model;

import org.apache.maven.artifact.versioning.VersionRange;

public record PluginDependency(String id, VersionRange version, LoadOrder loadOrder, boolean optional) {
    public enum LoadOrder {
        UNDEFINED,
        BEFORE,
        AFTER
    }
}
