package com.tfc.springboot;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SpringBoot.MODID)
public class SpringBoot {
    public static final String MODID = "springboot"; // <-- 这里必须等于 mods.toml 里的 modId

    public SpringBoot() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
    }
}