package com.shad0wb1ade.bedrockitemsreborn.tools;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class EmeraldPickaxe extends ItemPickaxe {
    public EmeraldPickaxe(ToolMaterial EmeraldMaterial) {
        super(EmeraldMaterial);
        this.setUnlocalizedName("emeraldPickaxe");
        this.setTextureName(Refs.MODID + ":" + "emeraldPickaxe");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
