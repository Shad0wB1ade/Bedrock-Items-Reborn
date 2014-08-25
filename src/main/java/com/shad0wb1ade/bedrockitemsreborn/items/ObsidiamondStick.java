package com.shad0wb1ade.bedrockitemsreborn.items;

import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ObsidiamondStick extends Item {
    public ObsidiamondStick() {
        super();
        this.setUnlocalizedName("obsidiamondStick");
        this.setTextureName(Refs.MODID + ":" + "obsidiamondStick");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
        list.add("Obsidian Reinforced");
    }
}
