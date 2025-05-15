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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreDiscsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Tabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDiscsMod.MOD_ID);

    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        MoreDiscsMod.LOGGER.debug("Registering tab " + tabData.getTabKey().location());
        if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            // Main Menu
            tabData.accept(Items.MUSIC_DISC_BEGINNING_2.get());
            tabData.accept(Items.MUSIC_DISC_FLOATING_TREES.get());
            tabData.accept(Items.MUSIC_DISC_MOOG_CITY_2.get());
            tabData.accept(Items.MUSIC_DISC_MUTATION.get());
            // Overworld
            tabData.accept(Items.MUSIC_DISC_A_FAMILIAR_ROOM.get());
            tabData.accept(Items.MUSIC_DISC_BROMELIAD.get());
            tabData.accept(Items.MUSIC_DISC_CRESCENT_DUNES.get());
            tabData.accept(Items.MUSIC_DISC_ECHO_IN_THE_WIND.get());
            tabData.accept(Items.MUSIC_DISC_AERIE.get());
            tabData.accept(Items.MUSIC_DISC_ANCESTRY.get());
            tabData.accept(Items.MUSIC_DISC_AN_ORDINARY_DAY.get());
            //tabData.accept(Items.MUSIC_DISC_BELOW_AND_ABOVE.get());
            //tabData.accept(Items.MUSIC_DISC_BROKEN_CLOCKS.get());
            tabData.accept(Items.MUSIC_DISC_CLARK.get());
            tabData.accept(Items.MUSIC_DISC_COMFORTING_MEMORIES.get());
            tabData.accept(Items.MUSIC_DISC_DANNY.get());
            //tabData.accept(Items.MUSIC_DISC_DEEPER.get());
            tabData.accept(Items.MUSIC_DISC_DRY_HANDS.get());




            //tabData.accept(Items.MUSIC_DISC_ELD_UNKNOWN.get());
            //tabData.accept(Items.MUSIC_DISC_ENDLESS.get());
            //tabData.accept(Items.MUSIC_DISC_FEATHERFALL.get());
            tabData.accept(Items.MUSIC_DISC_FIREBUGS.get());
            //tabData.accept(Items.MUSIC_DISC_FIREFLIES.get());
            tabData.accept(Items.MUSIC_DISC_FLOATING_DREAM.get());
            tabData.accept(Items.MUSIC_DISC_HAGGSTROM.get());
            tabData.accept(Items.MUSIC_DISC_INFINITE_AMETHYST.get());
            tabData.accept(Items.MUSIC_DISC_KEY.get());
            //tabData.accept(Items.MUSIC_DISC_KOMOREBI.get());
            tabData.accept(Items.MUSIC_DISC_LABYRINTHINE.get());
            tabData.accept(Items.MUSIC_DISC_LEFT_TO_BLOOM.get());
            //tabData.accept(Items.MUSIC_DISC_LILYPAD.get());
            tabData.accept(Items.MUSIC_DISC_LIVING_MICE.get());
            tabData.accept(Items.MUSIC_DISC_MICE_ON_VENUS.get());
            tabData.accept(Items.MUSIC_DISC_MINECRAFT.get());
            tabData.accept(Items.MUSIC_DISC_ONE_MORE_DAY.get());
            //tabData.accept(Items.MUSIC_DISC_OS_PIANO.get());
            tabData.accept(Items.MUSIC_DISC_OXYGENE.get());
            //tabData.accept(Items.MUSIC_DISC_POKOPOKO.get());
            //tabData.accept(Items.MUSIC_DISC_PUZZLEBOX.get());
            tabData.accept(Items.MUSIC_DISC_STAND_TALL.get());
            tabData.accept(Items.MUSIC_DISC_SUBWOOFER_LULLABY.get());
            tabData.accept(Items.MUSIC_DISC_SWEDEN.get());
            //tabData.accept(Items.MUSIC_DISC_WATCHER.get());
            tabData.accept(Items.MUSIC_DISC_WENDING.get());
            tabData.accept(Items.MUSIC_DISC_WET_HANDS.get());
            //tabData.accept(Items.MUSIC_DISC_YAKUSOKU.get());



            // Creative
            tabData.accept(Items.MUSIC_DISC_BIOME_FEST.get());
            tabData.accept(Items.MUSIC_DISC_BLIND_SPOTS.get());
            tabData.accept(Items.MUSIC_DISC_HAUNT_MUSKIE.get());
            tabData.accept(Items.MUSIC_DISC_ARIA_MATH.get());
            tabData.accept(Items.MUSIC_DISC_DREITON.get());
            tabData.accept(Items.MUSIC_DISC_TASWELL.get());

            // Water
            tabData.accept(Items.MUSIC_DISC_AXOLOTL.get());
            tabData.accept(Items.MUSIC_DISC_DRAGON_FISH.get());
            tabData.accept(Items.MUSIC_DISC_SHUNIJI.get());
            // Nether
            tabData.accept(Items.MUSIC_DISC_BALLAD_OF_THE_CATS.get());
            tabData.accept(Items.MUSIC_DISC_CHRUSOPOEIA.get());
            tabData.accept(Items.MUSIC_DISC_CONCRETE_HALLS.get());
            tabData.accept(Items.MUSIC_DISC_DEAD_VOXEL.get());
            tabData.accept(Items.MUSIC_DISC_RUBEDO.get());
            tabData.accept(Items.MUSIC_DISC_SO_BELOW.get());
            tabData.accept(Items.MUSIC_DISC_WARMTH.get());
            // End
            tabData.accept(Items.MUSIC_DISC_BOSS.get());
            tabData.accept(Items.MUSIC_DISC_THE_END.get());
            // End Poem
            tabData.accept(Items.MUSIC_DISC_ALPHA.get());
            // Removed
            tabData.accept(Items.MUSIC_DISC_MAGNETIC_CIRCUIT.get());
            // Backported
            tabData.accept(Items.MUSIC_DISC_CREATOR.get());
            tabData.accept(Items.MUSIC_DISC_CREATOR_MUSIC_BOX.get());
            tabData.accept(Items.MUSIC_DISC_PRECIPICE.get());
            //tabData.accept(Items.MUSIC_DISC_TEARS.get());
        }
    }

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
