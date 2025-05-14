package com.theendboss101.morediscs.items;

import com.theendboss101.morediscs.init.Sounds;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MusicDiscMagneticCircuit extends RecordItem {
    public MusicDiscMagneticCircuit() {
        super(0, Sounds.MUSIC_DISC_CALM4, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3860);
    }
}