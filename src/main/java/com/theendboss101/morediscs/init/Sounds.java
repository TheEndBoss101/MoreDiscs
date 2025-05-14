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

    public static final RegistryObject<SoundEvent> MUSIC_DISC_NULL = registerSoundEvents("music_disc.null");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MAGNETIC_CIRCUIT = registerSoundEvents("music_disc.calm4");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ALPHA = registerSoundEvents("music_disc.alpha");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_BEGINNING_2 = registerSoundEvents("music_disc.beginning_2");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_BOSS = registerSoundEvents("music_disc.boss");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_END = registerSoundEvents("music_disc.end");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FLOATING_TREES = registerSoundEvents("music_disc.floating_trees");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MOOG_CITY_2 = registerSoundEvents("music_disc.moog_city_2");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MUTATION = registerSoundEvents("music_disc.mutation");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CREATOR = registerSoundEvents("music_disc.creator");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CREATOR_MUSIC_BOX = registerSoundEvents("music_disc.creator_music_box");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PRECIPICE = registerSoundEvents("music_disc.precipice");
    //public static final RegistryObject<SoundEvent> MUSIC_DISC_TEARS = registerSoundEvents("music_disc.tears");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_AXOLOTL = registerSoundEvents("music_disc.axolotl");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_DRAGON_FISH = registerSoundEvents("music_disc.dragon_fish");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SHUNIJI = registerSoundEvents("music_disc.shuniji");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_BALLAD_OF_THE_CATS = registerSoundEvents("music_disc.ballad_of_the_cats");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CHRUSOPOEIA = registerSoundEvents("music_disc.chrysopoeia");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CONCRETE_HALLS = registerSoundEvents("music_disc.concrete_halls");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_DEAD_VOXEL = registerSoundEvents("music_disc.dead_voxel");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_RUBEDO = registerSoundEvents("music_disc.rubedo");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SO_BELOW = registerSoundEvents("music_disc.so_below");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_WARMTH = registerSoundEvents("music_disc.warmth");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_A_FAMILIAR_ROOM = registerSoundEvents("music_disc.a_familiar_room");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_BROMELIAD = registerSoundEvents("music_disc.bromeliad");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CRESCENT_DUNES = registerSoundEvents("music_disc.crescent_dunes");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ECHO_IN_THE_WIND = registerSoundEvents("music_disc.echo_in_the_wind");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_BIOME_FEST = registerSoundEvents("music_disc.biome_fest");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_BLIND_SPOTS = registerSoundEvents("music_disc.blind_spots");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAUNT_MUSKIE = registerSoundEvents("music_disc.haunt_muskie");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ARIA_MATH = registerSoundEvents("music_disc.aria_math");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_DREITON = registerSoundEvents("music_disc.dreiton");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_TASWELL = registerSoundEvents("music_disc.taswell");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return REGISTRY.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MoreDiscsMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
