package com.theendboss101.morediscs.items;

import com.theendboss101.morediscs.init.Sounds;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MusicDiscMoogCity2 extends RecordItem {
    public MusicDiscMoogCity2() {
        super(0, Sounds.MUSIC_DISC_MOOG_CITY_2, new Properties().stacksTo(1).rarity(Rarity.RARE), 3580);
    }
}