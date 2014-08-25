package com.shad0wb1ade.bedrockitemsreborn.tools;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemShears;

public class BedrockShears extends ItemShears {
    public BedrockShears() {
        super();
        this.setUnlocalizedName("bedrockShears");
        this.setTextureName(Refs.MODID + ":" + "bedrockShears");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setMaxDamage(-1);
    }
}
