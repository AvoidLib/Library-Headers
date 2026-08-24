package org.spongepowered.api.plugin;

import org.spongepowered.plugin.PluginContainer;

import java.util.Collection;
import java.util.Optional;

public interface PluginManager {
    Optional<PluginContainer> plugin(String id);
    Collection<PluginContainer> plugins();
}
