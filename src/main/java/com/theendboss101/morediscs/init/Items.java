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
    public static final RegistryObject<Item> MUSIC_DISC_THE_END = REGISTRY.register("music_disc_the_end", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_THE_END.get(), Rarity.RARE, 18060));
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
    //TODO: Import MUSIC_DISC_TEARS (Not Added)
    public static final RegistryObject<Item> MUSIC_DISC_TEARS = REGISTRY.register("music_disc_tears", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_TEARS.get(), Rarity.RARE, 3500));

    public static final RegistryObject<Item> MUSIC_DISC_AERIE = REGISTRY.register("music_disc_aerie", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_AERIE.get(), Rarity.RARE, 5920));
    public static final RegistryObject<Item> MUSIC_DISC_ANCESTRY = REGISTRY.register("music_disc_ancestry", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_ANCESTRY.get(), Rarity.RARE, 6860));
    public static final RegistryObject<Item> MUSIC_DISC_AN_ORDINARY_DAY = REGISTRY.register("music_disc_an_ordinary_day", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_AN_ORDINARY_DAY.get(), Rarity.RARE, 6620));
    //TODO: Import MUSIC_DISC_BELOW_AND_ABOVE & MUSIC_DISC_BROKEN_CLOCKS (Not Added)
    public static final RegistryObject<Item> MUSIC_DISC_BELOW_AND_ABOVE = REGISTRY.register("music_disc_below_and_above", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BELOW_AND_ABOVE.get(), Rarity.RARE, 4240));
    public static final RegistryObject<Item> MUSIC_DISC_BROKEN_CLOCKS = REGISTRY.register("music_disc_broken_clocks", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_BROKEN_CLOCKS.get(), Rarity.RARE, 4260));
    public static final RegistryObject<Item> MUSIC_DISC_CLARK = REGISTRY.register("music_disc_clark", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_CLARK.get(), Rarity.RARE, 3820));
    public static final RegistryObject<Item> MUSIC_DISC_COMFORTING_MEMORIES = REGISTRY.register("music_disc_comforting_memories", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_COMFORTING_MEMORIES.get(), Rarity.RARE, 5500));
    public static final RegistryObject<Item> MUSIC_DISC_DANNY = REGISTRY.register("music_disc_danny", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_DANNY.get(), Rarity.RARE, 5080));
    //TODO: Import MUSIC_DISC_DEEPER (Backport)
    public static final RegistryObject<Item> MUSIC_DISC_DEEPER = REGISTRY.register("music_disc_deeper", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_DEEPER.get(), Rarity.RARE, 6060));
    public static final RegistryObject<Item> MUSIC_DISC_DRY_HANDS = REGISTRY.register("music_disc_dry_hands", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_DRY_HANDS.get(), Rarity.RARE, 1360));

    public static final RegistryObject<Item> MUSIC_DISC_ELD_UNKNOWN = REGISTRY.register("music_disc_eld_unknown", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_ELD_UNKNOWN.get(), Rarity.RARE, 5920));
    public static final RegistryObject<Item> MUSIC_DISC_ENDLESS = REGISTRY.register("music_disc_endless", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_ENDLESS.get(), Rarity.RARE, 8040));
    public static final RegistryObject<Item> MUSIC_DISC_FEATHERFALL = REGISTRY.register("music_disc_featherfall", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_FEATHERFALL.get(), Rarity.RARE, 6900));
    public static final RegistryObject<Item> MUSIC_DISC_FIREBUGS = REGISTRY.register("music_disc_firebugs", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_FIREBUGS.get(), Rarity.RARE, 6240));
    public static final RegistryObject<Item> MUSIC_DISC_FIREFLIES = REGISTRY.register("music_disc_fireflies", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_FIREFLIES.get(), Rarity.RARE, 3100));
    public static final RegistryObject<Item> MUSIC_DISC_FLOATING_DREAM = REGISTRY.register("music_disc_floating_dream", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_FLOATING_DREAM.get(), Rarity.RARE, 4120));
    public static final RegistryObject<Item> MUSIC_DISC_HAGGSTROM = REGISTRY.register("music_disc_haggstrom", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_HAGGSTROM.get(), Rarity.RARE, 4080));
    public static final RegistryObject<Item> MUSIC_DISC_INFINITE_AMETHYST = REGISTRY.register("music_disc_infinite_amethyst", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_INFINITE_AMETHYST.get(), Rarity.RARE, 5420));
    public static final RegistryObject<Item> MUSIC_DISC_KEY = REGISTRY.register("music_disc_key", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_KEY.get(), Rarity.RARE, 1300));
    public static final RegistryObject<Item> MUSIC_DISC_KOMOREBI = REGISTRY.register("music_disc_komorebi", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_KOMOREBI.get(), Rarity.RARE, 5760));
    public static final RegistryObject<Item> MUSIC_DISC_LABYRINTHINE = REGISTRY.register("music_disc_labyrinthine", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_LABYRINTHINE.get(), Rarity.RARE, 6480));
    public static final RegistryObject<Item> MUSIC_DISC_LEFT_TO_BLOOM = REGISTRY.register("music_disc_left_to_bloom", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_LEFT_TO_BLOOM.get(), Rarity.RARE, 6840));
    public static final RegistryObject<Item> MUSIC_DISC_LILYPAD = REGISTRY.register("music_disc_lilypad", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_LILYPAD.get(), Rarity.RARE, 4700));
    public static final RegistryObject<Item> MUSIC_DISC_LIVING_MICE = REGISTRY.register("music_disc_living_mice", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_LIVING_MICE.get(), Rarity.RARE, 3540));
    public static final RegistryObject<Item> MUSIC_DISC_MICE_ON_VENUS = REGISTRY.register("music_disc_mice_on_venus", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_MICE_ON_VENUS.get(), Rarity.RARE, 5620));
    public static final RegistryObject<Item> MUSIC_DISC_MINECRAFT = REGISTRY.register("music_disc_minecraft", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_MINECRAFT.get(), Rarity.RARE, 5080));
    public static final RegistryObject<Item> MUSIC_DISC_ONE_MORE_DAY = REGISTRY.register("music_disc_one_more_day", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_ONE_MORE_DAY.get(), Rarity.RARE, 5560));
    public static final RegistryObject<Item> MUSIC_DISC_OS_PIANO = REGISTRY.register("music_disc_os_piano", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_OS_PIANO.get(), Rarity.RARE, 5500));
    public static final RegistryObject<Item> MUSIC_DISC_OXYGENE = REGISTRY.register("music_disc_oxygene", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_OXYGENE.get(), Rarity.RARE, 1300));
    public static final RegistryObject<Item> MUSIC_DISC_POKOPOKO = REGISTRY.register("music_disc_pokopoko", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_POKOPOKO.get(), Rarity.RARE, 6080));
    public static final RegistryObject<Item> MUSIC_DISC_PUZZLEBOX = REGISTRY.register("music_disc_puzzlebox", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_PUZZLEBOX.get(), Rarity.RARE, 5980));
    public static final RegistryObject<Item> MUSIC_DISC_STAND_TALL = REGISTRY.register("music_disc_stand_tall", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_STAND_TALL.get(), Rarity.RARE, 6160));
    public static final RegistryObject<Item> MUSIC_DISC_SUBWOOFER_LULLABY = REGISTRY.register("music_disc_subwoofer_lullaby", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_SUBWOOFER_LULLABY.get(), Rarity.RARE, 4160));
    public static final RegistryObject<Item> MUSIC_DISC_SWEDEN = REGISTRY.register("music_disc_sweden", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_SWEDEN.get(), Rarity.RARE, 4300));
    public static final RegistryObject<Item> MUSIC_DISC_WATCHER = REGISTRY.register("music_disc_watcher", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_WATCHER.get(), Rarity.RARE, 6640));
    public static final RegistryObject<Item> MUSIC_DISC_WENDING = REGISTRY.register("music_disc_wending", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_WENDING.get(), Rarity.RARE, 6280));
    public static final RegistryObject<Item> MUSIC_DISC_WET_HANDS = REGISTRY.register("music_disc_wet_hands", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_WET_HANDS.get(), Rarity.RARE, 1800));
    public static final RegistryObject<Item> MUSIC_DISC_YAKUSOKU = REGISTRY.register("music_disc_yakusoku", () -> DiscFactory.createDisc(0, Sounds.MUSIC_DISC_YAKUSOKU.get(), Rarity.RARE, 5420));


    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}
