package com.tfc.springboot;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SpringBootsItem extends ArmorItem {

    // 速度6 => amplifier=5；跳跃5 => amplifier=4
    private static final int SPEED_AMPLIFIER = 5;
    private static final int JUMP_AMPLIFIER = 4;

    public SpringBootsItem(ArmorMaterial material, Type type, Properties props) {
        super(material, type, props);
    }

//    @Override
//    public void onArmorTick(ItemStack stack, Level level, LivingEntity entity) {
//        if (level.isClientSide) return;
//
//        ItemStack boots = entity.getItemBySlot(EquipmentSlot.FEET);
//        if (boots != stack) return;
//
//        entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, SPEED_AMPLIFIER, true, false, true));
//        entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 40, JUMP_AMPLIFIER, true, false, true));
//    }
}