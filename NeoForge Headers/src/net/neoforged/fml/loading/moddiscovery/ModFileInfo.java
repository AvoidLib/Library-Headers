package net.neoforged.fml.loading.moddiscovery;

import java.net.URL;
import java.util.List;
import java.util.Optional;

public abstract class ModFileInfo {
    public abstract ModFile getFile();
    public abstract URL getIssueURL();
    public abstract Optional<String> getCodeSigningFingerprint();
    public abstract String versionString();
    public abstract boolean showAsDataPack();
    public abstract boolean showAsResourcePack();
    public abstract List<String> usesServices();
    public abstract String getLicense();
}
