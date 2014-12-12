package net.shad0wb1ade.core.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.shad0wb1ade.bedrockitemsreborn.references.Refs;

public class BaseBlock extends Block
{
    public BaseBlock(String name)
    {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(null);
        this.setStepSound(soundTypeStone);
        this.setHardness(8.0F);
        this.setResistance(1000.0F);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Refs.TEXTURE_LOCATION, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
