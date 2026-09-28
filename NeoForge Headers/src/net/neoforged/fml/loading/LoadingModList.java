package net.neoforged.fml.loading;

import net.neoforged.fml.loading.moddiscovery.ModFileInfo;
import net.neoforged.fml.loading.moddiscovery.ModInfo;

import java.util.List;

public abstract class LoadingModList {
    public abstract List<ModFileInfo> getModFiles();
    public abstract ModFileInfo getModFileById(String modid);
    public abstract List<ModInfo> getMods();
}
