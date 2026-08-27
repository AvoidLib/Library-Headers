package net.minecraftforge.fml.loading;

import net.minecraftforge.fml.loading.moddiscovery.ModFileInfo;

import java.util.List;

public abstract class LoadingModList {
    public abstract List<ModFileInfo> getModFiles();
    public abstract ModFileInfo getModFileById(String modid);
}
