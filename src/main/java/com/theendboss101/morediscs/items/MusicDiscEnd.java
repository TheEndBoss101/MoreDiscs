package com.theendboss101.morediscs.items;

import com.theendboss101.morediscs.init.Sounds;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MusicDiscEnd extends RecordItem {
    public MusicDiscEnd() {
        super(0, Sounds.MUSIC_DISC_END, new Properties().stacksTo(1).rarity(Rarity.RARE), 18060);
    }
}