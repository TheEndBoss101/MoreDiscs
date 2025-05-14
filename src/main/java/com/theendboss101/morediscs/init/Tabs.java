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
            tabData.accept(Items.MUSIC_DISC_MAGNETIC_CIRCUIT.get());
            tabData.accept(Items.MUSIC_DISC_BOSS.get());
            tabData.accept(Items.MUSIC_DISC_END.get());
            tabData.accept(Items.MUSIC_DISC_ALPHA.get());
            tabData.accept(Items.MUSIC_DISC_BEGINNING_2.get());
            tabData.accept(Items.MUSIC_DISC_FLOATING_TREES.get());
            tabData.accept(Items.MUSIC_DISC_MUTATION.get());
            tabData.accept(Items.MUSIC_DISC_MOOG_CITY_2.get());
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
