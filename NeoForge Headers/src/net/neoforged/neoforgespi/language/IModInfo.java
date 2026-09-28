package net.neoforged.neoforgespi.language;

import org.apache.maven.artifact.versioning.VersionRange;

import java.net.URL;
import java.util.Optional;

public interface IModInfo {
    enum Ordering {
        BEFORE,
        AFTER,
        NONE
    }

    enum DependencySide {
        CLIENT,
        SERVER,
        BOTH
    }

    enum DependencyType {
        REQUIRED, OPTIONAL,
        INCOMPATIBLE,
        DISCOURAGED
    }

    interface ModVersion {
        String getModId();
        VersionRange getVersionRange();
        DependencyType getType();
        Optional<String> getReason();
        Ordering getOrdering();
        DependencySide getSide();
        void setOwner(IModInfo owner);
        IModInfo getOwner();
        Optional<URL> getReferralURL();
    }
}
