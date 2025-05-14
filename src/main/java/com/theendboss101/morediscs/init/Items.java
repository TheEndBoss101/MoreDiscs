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

    public static final RegistryObject<Item> MUSIC_DISC_BALLAD_OF_THE_CATS = REGISTRY.register("music_disc_ballad_of_the_cats", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BALLAD_OF_THE_CATS.get(), Rarity.RARE, 5480));
    public static final RegistryObject<Item> MUSIC_DISC_CHRUSOPOEIA = REGISTRY.register("music_disc_chrysopoeia", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_CHRUSOPOEIA.get(), Rarity.RARE, 4860));
    public static final RegistryObject<Item> MUSIC_DISC_CONCRETE_HALLS = REGISTRY.register("music_disc_concrete_halls", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_CONCRETE_HALLS.get(), Rarity.RARE, 5060));
    public static final RegistryObject<Item> MUSIC_DISC_DEAD_VOXEL = REGISTRY.register("music_disc_dead_voxel", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_DEAD_VOXEL.get(), Rarity.RARE, 5900));
    public static final RegistryObject<Item> MUSIC_DISC_RUBEDO = REGISTRY.register("music_disc_rubedo", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_RUBEDO.get(), Rarity.RARE, 6240));
    public static final RegistryObject<Item> MUSIC_DISC_SO_BELOW = REGISTRY.register("music_disc_so_below", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_SO_BELOW.get(), Rarity.RARE, 6380));
    public static final RegistryObject<Item> MUSIC_DISC_WARMTH = REGISTRY.register("music_disc_warmth", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_WARMTH.get(), Rarity.RARE, 4760));

    public static final RegistryObject<Item> MUSIC_DISC_A_FAMILIAR_ROOM = REGISTRY.register("music_disc_a_familiar_room", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_A_FAMILIAR_ROOM.get(), Rarity.RARE, 4820));
    public static final RegistryObject<Item> MUSIC_DISC_BROMELIAD = REGISTRY.register("music_disc_bromeliad", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BROMELIAD.get(), Rarity.RARE, 6240));
    public static final RegistryObject<Item> MUSIC_DISC_CRESCENT_DUNES = REGISTRY.register("music_disc_crescent_dunes", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_CRESCENT_DUNES.get(), Rarity.RARE, 4960));
    public static final RegistryObject<Item> MUSIC_DISC_ECHO_IN_THE_WIND = REGISTRY.register("music_disc_echo_in_the_wind", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_ECHO_IN_THE_WIND.get(), Rarity.RARE, 5920));

    public static final RegistryObject<Item> MUSIC_DISC_BIOME_FEST = REGISTRY.register("music_disc_biome_fest", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BIOME_FEST.get(), Rarity.RARE, 7560));
    public static final RegistryObject<Item> MUSIC_DISC_BLIND_SPOTS = REGISTRY.register("music_disc_blind_spots", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BLIND_SPOTS.get(), Rarity.RARE, 6640));
    public static final RegistryObject<Item> MUSIC_DISC_HAUNT_MUSKIE = REGISTRY.register("music_disc_haunt_muskie", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_HAUNT_MUSKIE.get(), Rarity.RARE, 7220));
    public static final RegistryObject<Item> MUSIC_DISC_ARIA_MATH = REGISTRY.register("music_disc_aria_math", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_ARIA_MATH.get(), Rarity.RARE, 6200));
    public static final RegistryObject<Item> MUSIC_DISC_DREITON = REGISTRY.register("music_disc_dreiton", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_DREITON.get(), Rarity.RARE, 9940));
    public static final RegistryObject<Item> MUSIC_DISC_TASWELL = REGISTRY.register("music_disc_taswell", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_TASWELL.get(), Rarity.RARE, 10300));


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
