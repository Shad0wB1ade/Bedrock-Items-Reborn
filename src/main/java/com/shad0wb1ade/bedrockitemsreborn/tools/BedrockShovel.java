package com.shad0wb1ade.bedrockitemsreborn.tools;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class BedrockShovel extends ItemSpade {
    public BedrockShovel(ToolMaterial BedrockMaterial) {
        super(BedrockMaterial);
        this.setUnlocalizedName("bedrockShovel");
        this.setTextureName(Refs.MODID + ":" + "bedrockShovel");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
