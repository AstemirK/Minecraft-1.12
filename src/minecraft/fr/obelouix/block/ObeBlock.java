package fr.obelouix.block;

import net.minecraft.block.material.Material;

import static net.minecraft.block.Block.registerBlock;

/**
 * Created by Louis on 20/06/2017.
 */
public class ObeBlock {

    public static void registerBlocks() {

        registerBlock(1000, "metro_block", new MetroBlock(Material.GLASS));
    }
}
