package org.spongepowered.plugin.metadata.model;

import org.apache.maven.artifact.versioning.VersionRange;

import java.util.Optional;

public record PluginConflict(String id, VersionRange version, boolean fatal, Optional<String> reason) {}
