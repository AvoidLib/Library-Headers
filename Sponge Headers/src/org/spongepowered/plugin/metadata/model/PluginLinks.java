package org.spongepowered.plugin.metadata.model;

import java.net.URI;
import java.util.Optional;

public record PluginLinks(Optional<URI> homepage, Optional<URI> source, Optional<URI> issues) {}
