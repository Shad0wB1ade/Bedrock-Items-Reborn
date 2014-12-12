package net.shad0wb1ade.bedrockitemsreborn.items.armor.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.shad0wb1ade.bedrockitemsreborn.init.BIRGameObjects;
import net.shad0wb1ade.bedrockitemsreborn.references.Refs;

public class BedrockArmor extends ItemArmor implements ISpecialArmor
{
    public BedrockArmor(ArmorMaterial material, int par2, int par3)
    {
        super(material, par2, par3);
        this.setCreativeTab(null);
    }
    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot)
    {
        if (source.isExplosion())
        {
            return new ArmorProperties(1, 1.0D, 500);
        }
        if (slot == 0 && source == DamageSource.fall)
        {
            return new ArmorProperties(1, 1.0D, 10);
        }
        if (slot == 0 || slot == 3)
        {
            return new ArmorProperties(0, 0.2D, 250);
        }
        return new ArmorProperties(0, 0.3D, 350);
    }
    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot)
    {
        if (slot == 0 || slot == 3)
        {
            return 4;
        }
        return 6;
    }
    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
    {

    }
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == BIRGameObjects.BedrockHelmet || stack.getItem() == BIRGameObjects.BedrockChestplate || stack.getItem() == BIRGameObjects.BedrockBoots)
        {
            return Refs.ARMOR_LOCATION + "bedrockArmor_1.png";
        }
        else if(stack.getItem() == BIRGameObjects.BedrockLeggings)
        {
            return Refs.ARMOR_LOCATION + "bedrockArmor_2.png";
        }
        else
        {
            return null;
        }
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
