package com.shad0wb1ade.bedrockitemsreborn.items;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DiamondNugget extends Item {
    public DiamondNugget() {
        super();
        this.setUnlocalizedName("diamondNugget");
        this.setTextureName(Refs.MODID + ":" + "diamondNugget");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
