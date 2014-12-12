package net.shad0wb1ade.bedrockitemsreborn.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.shad0wb1ade.bedrockitemsreborn.items.tools.*;
import net.shad0wb1ade.bedrockitemsreborn.items.armor.*;
import net.shad0wb1ade.bedrockitemsreborn.references.Refs;
import net.shad0wb1ade.core.items.*;

public class BIRGameObjects
{
    public static ToolMaterial EmeraldToolMaterial = EnumHelper.addToolMaterial("EmeraldToolMaterial", 4, 512, 24.0F, 10.0F, 64);
    public static ToolMaterial BedrockSwordMaterial = EnumHelper.addToolMaterial("BedrockSwordMaterial", 5, -1, 16.0F, 8.0F, 32);
    public static ToolMaterial BedrockToolMaterial = EnumHelper.addToolMaterial("BedrockToolMaterial", 5, -1, 16.0F, 4.0F, 32);
    public static ArmorMaterial BedrockArmorMaterial = EnumHelper.addArmorMaterial("BedrockArmorMaterial", -1, new int[]{3, 8, 6, 3}, 32);

    public static final Item DiamondNugget = new BaseItem(Refs.DIAMOND_NUGGET);
    public static final Item DiamondStick = new BaseItem(Refs.DIAMOND_STICK);
    public static final Item ObsidianStick = new BaseItem(Refs.OBSIDIAN_STICK);
    public static final Item BedrockShard = new BaseItem(Refs.BEDROCK_SHARD);
    public static final Item BedrockChunk = new BaseItem(Refs.BEDROCK_CHUNK);
    public static final Item BedrockNugget = new BaseItem(Refs.BEDROCK_NUGGET);
    public static final Item BedrockIngot = new BaseItem(Refs.BEDROCK_INGOT);

    public static final Item EmeraldPickaxe = new EmeraldPickaxe(Refs.EMERALD_PICKAXE);
    public static final Item BedrockSword = new BedrockSword(Refs.BEDROCK_SWORD);
    public static final Item BedrockPickaxe = new BedrockPickaxe(Refs.BEDROCK_PICKAXE);
    public static final Item BedrockSpade = new BedrockSpade(Refs.BEDROCK_SPADE);
    public static final Item BedrockAxe = new BedrockAxe(Refs.BEDROCK_AXE);
    public static final Item BedrockHoe = new BedrockHoe(Refs.BEDROCK_HOE);
    public static final Item BedrockShears = new BedrockShears(Refs.BEDROCK_SHEARS);
    public static final Item BedrockPaxel = new BedrockPaxel(Refs.BEDROCK_PAXEL);

    public static final Item BedrockHelmet = new BedrockHelmet(Refs.BEDROCK_HELMET);
    public static final Item BedrockChestplate = new BedrockChestplate(Refs.BEDROCK_CHESTPLATE);
    public static final Item BedrockLeggings = new BedrockLeggings(Refs.BEDROCK_LEGGINGS);
    public static final Item BedrockBoots = new BedrockBoots(Refs.BEDROCK_BOOTS);

    public static void initItems()
    {
        GameRegistry.registerItem(DiamondNugget, Refs.DIAMOND_NUGGET);
        GameRegistry.registerItem(DiamondStick, Refs.DIAMOND_STICK);
        GameRegistry.registerItem(ObsidianStick, Refs.OBSIDIAN_STICK);
        GameRegistry.registerItem(BedrockShard, Refs.BEDROCK_SHARD);
        GameRegistry.registerItem(BedrockChunk, Refs.BEDROCK_CHUNK);
        GameRegistry.registerItem(BedrockNugget, Refs.BEDROCK_NUGGET);
        GameRegistry.registerItem(BedrockIngot, Refs.BEDROCK_INGOT);

        GameRegistry.registerItem(EmeraldPickaxe, Refs.EMERALD_PICKAXE);
        GameRegistry.registerItem(BedrockSword, Refs.BEDROCK_SWORD);
        GameRegistry.registerItem(BedrockPickaxe, Refs.BEDROCK_PICKAXE);
        GameRegistry.registerItem(BedrockSpade, Refs.BEDROCK_SPADE);
        GameRegistry.registerItem(BedrockAxe, Refs.BEDROCK_AXE);
        GameRegistry.registerItem(BedrockHoe, Refs.BEDROCK_HOE);
        GameRegistry.registerItem(BedrockShears, Refs.BEDROCK_SHEARS);
        GameRegistry.registerItem(BedrockPaxel, Refs.BEDROCK_PAXEL);

        GameRegistry.registerItem(BedrockHelmet, Refs.BEDROCK_HELMET);
        GameRegistry.registerItem(BedrockChestplate, Refs.BEDROCK_CHESTPLATE);
        GameRegistry.registerItem(BedrockLeggings, Refs.BEDROCK_LEGGINGS);
        GameRegistry.registerItem(BedrockBoots, Refs.BEDROCK_BOOTS);
    }
    public static void initBlocks()
    {

    }
}
