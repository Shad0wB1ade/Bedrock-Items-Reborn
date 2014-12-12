package net.shad0wb1ade.bedrockitemsreborn.items.tools;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.shad0wb1ade.core.items.BaseItem;

public class BedrockPaxel extends BaseItem
{
    public BedrockPaxel(String name)
    {
        super(name);
        this.setMaxDamage(-1);
        this.isFull3D();
    }
    @Override
    public boolean canHarvestBlock(Block block, ItemStack itemStack)
    {
        return block != Blocks.web;
    }
    @Override
    public float getDigSpeed(ItemStack itemstack, Block block, int meta)
    {
        return 16.0F;
    }
}
