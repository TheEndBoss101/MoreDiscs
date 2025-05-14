package com.theendboss101.morediscs.items;

import com.theendboss101.morediscs.init.Sounds;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MusicDiscFloatingTrees extends RecordItem {
    public MusicDiscFloatingTrees() {
        super(0, Sounds.MUSIC_DISC_FLOATING_TREES, new Properties().stacksTo(1).rarity(Rarity.RARE), 4880);
    }
}