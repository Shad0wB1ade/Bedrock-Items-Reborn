package com.shad0wb1ade.bedrockitemsreborn.items;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BedrockChunk extends Item {
    public BedrockChunk() {
        super();
        this.setUnlocalizedName("bedrockChunk");
        this.setTextureName(Refs.MODID + ":" + "bedrockChunk");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
