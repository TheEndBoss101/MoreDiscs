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
import com.theendboss101.morediscs.items.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class Items {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDiscsMod.MOD_ID);
    public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new Icon());
    public static final RegistryObject<Item> MUSIC_DISC_ALPHA = REGISTRY.register("music_disc_alpha", () -> new MusicDiscAlpha());
    public static final RegistryObject<Item> MUSIC_DISC_BOSS = REGISTRY.register("music_disc_boss", () -> new MusicDiscBoss());
    public static final RegistryObject<Item> MUSIC_DISC_END = REGISTRY.register("music_disc_end", () -> new MusicDiscEnd());
    public static final RegistryObject<Item> MUSIC_DISC_MAGNETIC_CIRCUIT = REGISTRY.register("music_disc_magnetic_circuit", () -> new MusicDiscMagneticCircuit());
    public static final RegistryObject<Item> MUSIC_DISC_BEGINNING_2 = REGISTRY.register("music_disc_beginning_2", () -> new MusicDiscBeginning2());
    public static final RegistryObject<Item> MUSIC_DISC_FLOATING_TREES = REGISTRY.register("music_disc_floating_trees", () -> new MusicDiscFloatingTrees());
    public static final RegistryObject<Item> MUSIC_DISC_MUTATION = REGISTRY.register("music_disc_mutation", () -> new MusicDiscMutation());
    public static final RegistryObject<Item> MUSIC_DISC_MOOG_CITY_2 = REGISTRY.register("music_disc_moog_city_2", () -> new MusicDiscMoogCity2());

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}
