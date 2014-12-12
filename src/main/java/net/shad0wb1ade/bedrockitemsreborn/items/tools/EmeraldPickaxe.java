package net.shad0wb1ade.bedrockitemsreborn.items.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.shad0wb1ade.bedrockitemsreborn.init.BIRGameObjects;
import net.shad0wb1ade.bedrockitemsreborn.references.Refs;

public class EmeraldPickaxe extends ItemPickaxe
{
    public EmeraldPickaxe(String name)
    {
        super(BIRGameObjects.EmeraldToolMaterial);
        this.setUnlocalizedName(name);
        this.setCreativeTab(null);
    }
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Refs.TEXTURE_LOCATION, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Refs.TEXTURE_LOCATION, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
