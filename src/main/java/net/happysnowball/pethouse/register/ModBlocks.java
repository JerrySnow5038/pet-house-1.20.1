package net.happysnowball.pethouse.register;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.happysnowball.pethouse.PetHouse;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //register blocks
    public static final Block TEST_HOUSE = registerBlocks("test_house",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).sounds(BlockSoundGroup.STONE)));
    private static Block registerBlocks(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PetHouse.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        PetHouse.LOGGER.info("Registering mod blocks for " + PetHouse.MOD_ID);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PetHouse.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
}
