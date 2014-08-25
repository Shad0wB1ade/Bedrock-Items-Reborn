package com.shad0wb1ade.bedrockitemsreborn.items;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DiamondStick extends Item {
    public DiamondStick() {
        super();
        this.setUnlocalizedName("diamondStick");
        this.setTextureName(Refs.MODID + ":" + "diamondStick");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
