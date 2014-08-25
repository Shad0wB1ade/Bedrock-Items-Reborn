package com.shad0wb1ade.bedrockitemsreborn.items;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BedrockIngot extends Item {
    public BedrockIngot() {
        super();
        this.setUnlocalizedName("bedrockIngot");
        this.setTextureName(Refs.MODID + ":" + "bedrockIngot");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
}
