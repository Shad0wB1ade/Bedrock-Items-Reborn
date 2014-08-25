package com.shad0wb1ade.bedrockitemsreborn.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import com.shad0wb1ade.bedrockitemsreborn.blocks.*;

public class BIRBlocks {
    public static final Block BedrockOre = new BedrockOre();

    public static void init() {
        GameRegistry.registerBlock(BedrockOre, "bedrockOre");
    }
}
