package com.shad0wb1ade.bedrockitemsreborn.tools;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class BedrockSword extends ItemSword {
    public BedrockSword(ToolMaterial BedrockMaterial) {
        super(BedrockMaterial);
        this.setUnlocalizedName("bedrockSword");
        this.setTextureName(Refs.MODID + ":" + "bedrockSword");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
