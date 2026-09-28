package net.neoforged.fml.loading.moddiscovery;

import net.neoforged.neoforgespi.language.IModInfo;
import org.apache.maven.artifact.versioning.ArtifactVersion;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class ModInfo implements IModInfo {
    public abstract String getModId();
    public abstract String getDisplayName();
    public abstract String getDescription();
    public abstract String getNamespace();
    public abstract ArtifactVersion getVersion();
    public abstract Optional<String> getLogoFile();
    public abstract Map<String, Object> getModProperties();
    public abstract Optional<URL> getUpdateURL();
    public abstract Optional<URL> getModURL();
    public abstract List<? extends IModInfo.ModVersion> getDependencies();
}
