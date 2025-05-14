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
import com.theendboss101.morediscs.factories.DiscFactory;
import com.theendboss101.morediscs.items.*;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class Items {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDiscsMod.MOD_ID);
    public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new Icon());

    public static final RegistryObject<Item> MUSIC_DISC_NULL = REGISTRY.register("music_disc_null", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_NULL.get(), Rarity.RARE, 12000));
    public static final RegistryObject<Item> MUSIC_DISC_BEGINNING_2 = REGISTRY.register("music_disc_beginning_2", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BEGINNING_2.get(), Rarity.RARE, 3500));
    public static final RegistryObject<Item> MUSIC_DISC_MOOG_CITY_2 = REGISTRY.register("music_disc_moog_city_2", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_MOOG_CITY_2.get(), Rarity.RARE, 3580));
    public static final RegistryObject<Item> MUSIC_DISC_BOSS = REGISTRY.register("music_disc_boss", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BOSS.get(), Rarity.RARE, 6920));
    public static final RegistryObject<Item> MUSIC_DISC_END = REGISTRY.register("music_disc_end", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_END.get(), Rarity.RARE, 18060));
    public static final RegistryObject<Item> MUSIC_DISC_ALPHA = REGISTRY.register("music_disc_alpha", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_ALPHA.get(), Rarity.RARE, 12040));
    public static final RegistryObject<Item> MUSIC_DISC_MAGNETIC_CIRCUIT = REGISTRY.register("music_disc_magnetic_circuit", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_MAGNETIC_CIRCUIT.get(), Rarity.RARE, 3860));
    public static final RegistryObject<Item> MUSIC_DISC_FLOATING_TREES = REGISTRY.register("music_disc_floating_trees", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_FLOATING_TREES.get(), Rarity.RARE, 4880));
    public static final RegistryObject<Item> MUSIC_DISC_MUTATION = REGISTRY.register("music_disc_mutation", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_MUTATION.get(), Rarity.RARE, 3680));
    public static final RegistryObject<Item> MUSIC_DISC_AXOLOTL = REGISTRY.register("music_disc_axolotl", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_AXOLOTL.get(), Rarity.RARE, 6060));
    public static final RegistryObject<Item> MUSIC_DISC_DRAGON_FISH = REGISTRY.register("music_disc_dragon_fish", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_DRAGON_FISH.get(), Rarity.RARE, 7460));
    public static final RegistryObject<Item> MUSIC_DISC_SHUNIJI = REGISTRY.register("music_disc_shuniji", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_SHUNIJI.get(), Rarity.RARE, 3680));

    public static final RegistryObject<Item> MUSIC_DISC_CREATOR = REGISTRY.register("music_disc_creator", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_CREATOR.get(), Rarity.RARE, 3520));
    public static final RegistryObject<Item> MUSIC_DISC_CREATOR_MUSIC_BOX = REGISTRY.register("music_disc_creator_music_box", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_CREATOR_MUSIC_BOX.get(), Rarity.RARE, 1460));
    public static final RegistryObject<Item> MUSIC_DISC_PRECIPICE = REGISTRY.register("music_disc_precipice", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_PRECIPICE.get(), Rarity.RARE, 4880));
    //public static final RegistryObject<Item> MUSIC_DISC_TEARS = REGISTRY.register("music_disc_tears", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_TEARS.get(), Rarity.RARE, 3500));



    //public static final RegistryObject<Item> MUSIC_DISC_ALPHA = REGISTRY.register("music_disc_alpha", () -> new MusicDiscAlpha());
    //public static final RegistryObject<Item> MUSIC_DISC_BOSS = REGISTRY.register("music_disc_boss", () -> new MusicDiscBoss());
    //public static final RegistryObject<Item> MUSIC_DISC_END = REGISTRY.register("music_disc_end", () -> new MusicDiscEnd());
    //public static final RegistryObject<Item> MUSIC_DISC_MAGNETIC_CIRCUIT = REGISTRY.register("music_disc_magnetic_circuit", () -> new MusicDiscMagneticCircuit());
    //public static final RegistryObject<Item> MUSIC_DISC_BEGINNING_2 = REGISTRY.register("music_disc_beginning_2", () -> new MusicDiscBeginning2());
    //public static final RegistryObject<Item> MUSIC_DISC_FLOATING_TREES = REGISTRY.register("music_disc_floating_trees", () -> new MusicDiscFloatingTrees());
    //public static final RegistryObject<Item> MUSIC_DISC_MUTATION = REGISTRY.register("music_disc_mutation", () -> new MusicDiscMutation());
    //public static final RegistryObject<Item> MUSIC_DISC_MOOG_CITY_2 = REGISTRY.register("music_disc_moog_city_2", () -> new MusicDiscMoogCity2());

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}
