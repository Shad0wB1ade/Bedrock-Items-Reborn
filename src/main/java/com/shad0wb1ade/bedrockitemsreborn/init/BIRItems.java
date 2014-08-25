package com.shad0wb1ade.bedrockitemsreborn.init;

import com.shad0wb1ade.bedrockitemsreborn.items.*;
import com.shad0wb1ade.bedrockitemsreborn.tools.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BIRItems {
    //Tool Materials
    public static ToolMaterial BedrockMaterial = EnumHelper.addToolMaterial("BedrockMaterial", 5, -1, 16.0F, 4.0F, 64);
    public static ToolMaterial EmeraldMaterial = EnumHelper.addToolMaterial("EmeraldMaterial", 4, 256, 10.0F, 3.0F, 32);

    //Basic Items
    public static final Item BedrockShards = new BedrockShards();
    public static final Item BedrockChunk = new BedrockChunk();
    public static final Item BedrockIngot = new BedrockIngot();
    public static final Item DiamondStick = new DiamondStick();
    public static final Item DiamondNugget = new DiamondNugget();
    public static final Item ObsidiamondStick = new ObsidiamondStick();

    //Tools
    public static final Item BedrockSword = new BedrockSword(BedrockMaterial);
    public static final Item BedrockPickaxe = new BedrockPickaxe(BedrockMaterial);
    public static final Item BedrockShovel = new BedrockShovel(BedrockMaterial);
    public static final Item BedrockAxe = new BedrockAxe(BedrockMaterial);
    public static final Item BedrockHoe = new BedrockHoe(BedrockMaterial);
    public static final Item BedrockShears = new BedrockShears();

    public static final Item EmeraldPickaxe = new EmeraldPickaxe(EmeraldMaterial);

    public static void init() {
        //Basic Items
        GameRegistry.registerItem(BedrockShards, "bedrockShards");
        GameRegistry.registerItem(BedrockChunk, "bedrockChunk");
        GameRegistry.registerItem(BedrockIngot, "bedrockIngot");
        GameRegistry.registerItem(DiamondStick, "diamondStick");
        GameRegistry.registerItem(DiamondNugget, "diamondNugget");
        GameRegistry.registerItem(ObsidiamondStick, "obsidiamondStick");

        //Tools
        GameRegistry.registerItem(BedrockSword, "bedrockSword");
        GameRegistry.registerItem(BedrockPickaxe, "bedrockPickaxe");
        GameRegistry.registerItem(BedrockShovel, "bedrockShovel");
        GameRegistry.registerItem(BedrockAxe, "bedrockAxe");
        GameRegistry.registerItem(BedrockHoe, "bedrockHoe");
        GameRegistry.registerItem(BedrockShears, "bedrockShears");

        GameRegistry.registerItem(EmeraldPickaxe, "emeraldPickaxe");
    }
}
