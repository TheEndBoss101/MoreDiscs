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

package com.theendboss101.morediscs.factories;

import com.theendboss101.morediscs.MoreDiscsMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class DiscFactory {
    public static RecordItem createDisc(int comparatorValue, SoundEvent sound, Rarity rarity, int duration) {
        //MoreDiscsMod.LOGGER.debug("Creating disc...");
        return new RecordItem(comparatorValue, sound, new RecordItem.Properties().stacksTo(1).rarity(rarity), duration) {
        };
    }
}
