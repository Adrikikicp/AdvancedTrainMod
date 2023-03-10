package com.adrikikicp.atm.core;

import com.adrikikicp.atm.proxy.CommonProxy;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.Name("ATM")
@IFMLLoadingPlugin.MCVersion("1.12.2")
public class CoreMod implements IFMLLoadingPlugin {

    public CoreMod() {
        MixinBootstrap.init();
        new CommonProxy().create();
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
