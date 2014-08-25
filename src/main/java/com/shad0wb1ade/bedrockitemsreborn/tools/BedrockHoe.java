package com.shad0wb1ade.bedrockitemsreborn.tools;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class BedrockHoe extends ItemHoe {
    public BedrockHoe(ToolMaterial BedrockMaterial) {
        super(BedrockMaterial);
        this.setUnlocalizedName("bedrockHoe");
        this.setTextureName(Refs.MODID + ":" + "bedrockHoe");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
