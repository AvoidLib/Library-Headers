package org.spongepowered.plugin.metadata.model;

import org.apache.maven.artifact.versioning.VersionRange;

public record PluginLoaderSpecification(String name, VersionRange version) {}
