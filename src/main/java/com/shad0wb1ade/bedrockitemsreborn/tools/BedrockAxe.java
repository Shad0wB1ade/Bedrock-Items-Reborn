package com.shad0wb1ade.bedrockitemsreborn.tools;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class BedrockAxe extends ItemAxe {
    public BedrockAxe(ToolMaterial BedrockMaterial) {
        super(BedrockMaterial);
        this.setUnlocalizedName("bedrockAxe");
        this.setTextureName(Refs.MODID + ":" + "bedrockAxe");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
