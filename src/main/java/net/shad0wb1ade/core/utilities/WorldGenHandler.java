package net.shad0wb1ade.core.utilities;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.shad0wb1ade.bedrockitemsreborn.init.BIRGameObjects;

import java.util.Random;

public class WorldGenHandler implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if (!(chunkGenerator instanceof ChunkProviderHell) && !(chunkGenerator instanceof ChunkProviderEnd))
        {
            for (int i = 0; i < 32; i++)
            {
                int randPosX = (chunkX * 16) + random.nextInt(16);
                int randPosY = random.nextInt(16);
                int randPosZ = (chunkZ * 16) + random.nextInt(16);
                new WorldGenMinable(BIRGameObjects.BedrockOre, 0, 8, Blocks.stone).generate(world, random, randPosX, randPosY, randPosZ);
            }
        }
    }
}
