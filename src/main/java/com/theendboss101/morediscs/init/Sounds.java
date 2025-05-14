/*
 * Copyright 2025 TheEndBoss_101
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.theendboss101.morediscs.init;

import com.theendboss101.morediscs.MoreDiscsMod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;

public class Sounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreDiscsMod.MOD_ID);
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CALM4 = registerSoundEvents("music_disc.calm4");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ALPHA = registerSoundEvents("music_disc.alpha");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_BEGINNING_2 = registerSoundEvents("music_disc.beginning_2");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return REGISTRY.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MoreDiscsMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
