package net.shad0wb1ade.bedrockitemsreborn.blocks;

import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.shad0wb1ade.bedrockitemsreborn.init.BIRGameObjects;
import net.shad0wb1ade.core.blocks.BaseBlock;

import java.util.Random;

public class BedrockOre extends BaseBlock
{
    protected Random rand = new Random();

    public BedrockOre(String name)
    {
        super(name);
        this.setHardness(64.0F);
        this.setResistance(6000);
    }
    @Override
    public int getExpDrop(IBlockAccess par1, int par2, int par3)
    {
        return MathHelper.getRandomIntegerInRange(rand, 3, 7);
    }
    @Override
    public Item getItemDropped(int par1, Random par2, int par3)
    {
        return BIRGameObjects.BedrockShard;
    }
    @Override
    public int quantityDropped(Random rand)
    {
        return 1;
    }
    @Override
    protected boolean canSilkHarvest()
    {
        return true;
    }
    @Override
    public int quantityDroppedWithBonus(int quantity, Random rand) {

        if (quantity > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, rand, quantity))
        {
            int j = rand.nextInt(quantity + 2) - 1;
            if (j < 0)
            {
                j = 0;
            }
            return this.quantityDropped(rand) * (j + 1);
        }
        else
        {
            return this.quantityDropped(rand);
        }
    }
}
