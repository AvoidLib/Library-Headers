package org.spongepowered.plugin;

import java.net.URI;
import java.util.Optional;

public interface ResourceQueryable {
    Optional<URI> locateResource(final String path);
}
