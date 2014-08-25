package com.shad0wb1ade.bedrockitemsreborn.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BIRRecipes {
    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(BIRItems.DiamondNugget, 9), Items.diamond);

        GameRegistry.addShapedRecipe(new ItemStack(Items.diamond), "###", "###", "###",
                '#', new ItemStack(BIRItems.DiamondNugget));

        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.DiamondStick), "aaa", "aba", "aaa",
                'a', new ItemStack(BIRItems.DiamondNugget),
                'b', new ItemStack(Items.stick));

        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.ObsidiamondStick), " aa", "aba", "aa ",
                'a', new ItemStack(Blocks.obsidian),
                'b', new ItemStack(BIRItems.DiamondStick));

        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockChunk), "###", "###", "###",
                '#', new ItemStack(BIRItems.BedrockShards));

        GameRegistry.addSmelting(new ItemStack(BIRItems.BedrockChunk),new ItemStack(BIRItems.BedrockIngot), 1.0F);

        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockSword), "a  ", "a  ", "b  ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockSword), " a ", " a ", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockSword), "  a", "  a", "  b",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockPickaxe), "aaa", " b ", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockShovel), "a  ", "b  ", "b  ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockShovel), " a ", " b ", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockShovel), "  a", "  b", "  b",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockAxe), "aa ", "ab ", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockAxe), " aa", " ba", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockAxe), "aa ", "ba ", "b  ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockAxe), " aa", " ab", "  b",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockHoe), "aa ", " b ", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockHoe), " aa", " b ", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockHoe), "aa ", "b  ", "b  ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockHoe), " aa", "  b", "  b",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.ObsidiamondStick));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockShears), "  a", " b ", "   ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.DiamondNugget));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockShears), "   ", " a ", "b  ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.DiamondNugget));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockShears), " a ", "b  ", "   ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.DiamondNugget));
        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.BedrockShears), "   ", "  a", " b ",
                'a', new ItemStack(BIRItems.BedrockIngot),
                'b', new ItemStack(BIRItems.DiamondNugget));

        GameRegistry.addShapedRecipe(new ItemStack(BIRItems.EmeraldPickaxe), "aaa", " b ", " b ",
                'a', new ItemStack(Items.emerald),
                'b', new ItemStack(BIRItems.DiamondStick));
    }
}
