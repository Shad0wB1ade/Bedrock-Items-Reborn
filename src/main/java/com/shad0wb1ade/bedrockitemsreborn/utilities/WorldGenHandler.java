package com.shad0wb1ade.bedrockitemsreborn.utilities;

import com.shad0wb1ade.bedrockitemsreborn.init.BIRBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import java.util.Random;

public class WorldGenHandler implements IWorldGenerator {
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if (!(chunkGenerator instanceof ChunkProviderHell) && !(chunkGenerator instanceof ChunkProviderEnd)) {
            for (int i = 0; i < 8; i++) {
                int randPosX = (chunkX * 16) + random.nextInt(16);
                int randPosY = random.nextInt(10);
                int randPosZ = (chunkZ * 16) + random.nextInt(16);
                new WorldGenMinable(BIRBlocks.BedrockOre, 0, 8, Blocks.stone).generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
    }
}
