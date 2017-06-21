package fr.obelouix.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Bootstrap;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Created by Louis on 20/06/2017.
 */
public class ObeBlocks {

    public static Block MetroBLOCK;


    @Nullable

    /**
     * Returns the Block in the blockRegistry with the specified name.
     */
    private static Block getRegisteredBlock(String blockName)
    {
        Block block = Block.REGISTRY.getObject(new ResourceLocation(blockName));

        if (!Blocks.CACHE.add(block))
        {
            throw new IllegalStateException("Invalid Block requested: " + blockName);
        }
        else
        {
            return block;
        }
    }

    static {
        if (!Bootstrap.isRegistered()) {
            throw new RuntimeException("Accessed Blocks before Bootstrap!");
        } else {
            MetroBLOCK = getRegisteredBlock("metro_block");
        }
    }
}
