package com.shad0wb1ade.bedrockitemsreborn.blocks;

import com.shad0wb1ade.bedrockitemsreborn.init.BIRItems;
import com.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class BedrockOre extends Block {
    public BedrockOre(Material material) {
        super(material);
        this.setBlockName("bedrockOre");
        this.setBlockTextureName(Refs.MODID + ":" + "bedrockOre");
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 4);
        this.setHardness(256.0F);
        this.setResistance(180000000.0F);
    }
    public BedrockOre() {
        //:(
        this(Material.rock);
    }
    public Item getItemDropped(int meta, Random random, int fort) {
        //:(
        return BIRItems.BedrockShards;
    }
    public int quantityDropped(Random random) {
        //:(
        return 3;
    }
}
