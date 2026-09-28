package org.spongepowered.plugin.metadata;

import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.spongepowered.plugin.metadata.model.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PluginMetadata {
    String id();
    ArtifactVersion version();
    PluginLoaderSpecification loader();
    Optional<String> name();
    Optional<String> description();
    Optional<String> license();
    PluginBranding branding();
    PluginLinks links();
    List<PluginContributor> contributors();
    List<PluginConflict> conflicts();
    Collection<PluginDependency> dependencies();
    Map<String, Object> properties();
}
