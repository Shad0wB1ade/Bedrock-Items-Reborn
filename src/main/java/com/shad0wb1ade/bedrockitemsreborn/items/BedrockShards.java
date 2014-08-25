package com.shad0wb1ade.bedrockitemsreborn.items;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BedrockShards extends Item {
    public BedrockShards() {
        super();
        this.setUnlocalizedName("bedrockShards");
        this.setTextureName(Refs.MODID + ":" + "bedrockShards");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
