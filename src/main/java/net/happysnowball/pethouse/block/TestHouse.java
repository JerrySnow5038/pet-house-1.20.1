package net.happysnowball.pethouse.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TestHouse extends Block {
    private static final VoxelShape GROUND = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
    private static final VoxelShape GRASS = Block.createCuboidShape(4.0, 1.0, 3.0, 12.0, 2.0, 12.0);
    private static final VoxelShape X_LEFT_WALL = Block.createCuboidShape(2.0, 1.0, 2.0, 3.0, 11.0, 14.0);
    private static final VoxelShape X_RIGHT_WALL = Block.createCuboidShape(13.0, 1.0, 2.0, 14.0, 11.0, 14.0);
    private static final VoxelShape X_BEHIND_WALL = Block.createCuboidShape(3.0, 1.0, 13.0, 13.0, 11.0, 14.0);
    private static final VoxelShape X_A_ROOF = Block.createCuboidShape(2.0, 11.0, 1.0, 14.0, 12.0, 15.0);
    private static final VoxelShape X_B_ROOF = Block.createCuboidShape(3.0, 12.0, 1.0, 13.0, 13.0, 15.0);
    private static final VoxelShape X_C_ROOF = Block.createCuboidShape(4.0, 13.0, 1.0, 12.0, 14.0, 15.0);
    private static final VoxelShape X_D_ROOF = Block.createCuboidShape(5.0, 14.0, 1.0, 11.0, 15.0, 15.0);
    private static final VoxelShape X_E_ROOF = Block.createCuboidShape(6.0, 15.0, 1.0, 10.0, 16.0, 15.0);
    private static final VoxelShape X_HOUSE_SHAPE = VoxelShapes.union(GROUND, GRASS, X_LEFT_WALL, X_RIGHT_WALL,
            X_BEHIND_WALL, X_A_ROOF, X_B_ROOF, X_C_ROOF, X_D_ROOF, X_E_ROOF);




    public TestHouse(Settings settings) {
        super(settings);
    }


    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return X_HOUSE_SHAPE;
    }
}
