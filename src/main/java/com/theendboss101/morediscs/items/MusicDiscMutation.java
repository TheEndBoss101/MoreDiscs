package com.theendboss101.morediscs.items;

import com.theendboss101.morediscs.init.Sounds;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class MusicDiscMutation extends RecordItem {
    public MusicDiscMutation() {
        super(0, Sounds.MUSIC_DISC_MUTATION, new Properties().stacksTo(1).rarity(Rarity.RARE), 3680);
    }
}