package net.happysnowball.pethouse.block_entities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public abstract class PetHouseBlock extends BlockEntity {
    public PetHouseBlock(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
    //test the change log
}
