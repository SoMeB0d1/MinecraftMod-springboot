package com.tfc.springboot;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpringBoot.MODID)
public class SpringBootEffects {

    // 速度6 => amplifier=5；跳跃5 => amplifier=4
    private static final int SPEED_AMPLIFIER = 4;
    private static final int JUMP_AMPLIFIER = 1;

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();

        if (entity.level().isClientSide) return;

        ItemStack boots = entity.getItemBySlot(EquipmentSlot.FEET);
        if (!boots.is(ModItems.SPRING_BOOTS.get())) return;

        // ambient=true, visible=false(无粒子), showIcon=true(显示图标)
        entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, SPEED_AMPLIFIER, true, false, true));
        entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 40, JUMP_AMPLIFIER, true, false, true));
    }
}