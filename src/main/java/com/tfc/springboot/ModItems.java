package com.tfc.springboot;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpringBoot.MODID);

    public static final RegistryObject<Item> STEEL_SPRING =
            ITEMS.register("steel_spring", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPRING_BOOTS =
            ITEMS.register("spring_boots", () -> new SpringBootsItem(
                    ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()
            ));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}