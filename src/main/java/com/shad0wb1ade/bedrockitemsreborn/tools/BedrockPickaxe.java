package com.shad0wb1ade.bedrockitemsreborn.tools;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BedrockPickaxe extends ItemPickaxe {
    public BedrockPickaxe(ToolMaterial BedrockMaterial) {
        super(BedrockMaterial);
        this.setUnlocalizedName("bedrockPickaxe");
        this.setTextureName(Refs.MODID + ":" + "bedrockPickaxe");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
