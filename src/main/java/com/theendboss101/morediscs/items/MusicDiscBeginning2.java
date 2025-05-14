package com.theendboss101.morediscs.items;

import com.theendboss101.morediscs.init.Sounds;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MusicDiscBeginning2 extends RecordItem {
    public MusicDiscBeginning2() {
        super(0, Sounds.MUSIC_DISC_BEGINNING_2, new Properties().stacksTo(1).rarity(Rarity.RARE), 3500);
    }
}