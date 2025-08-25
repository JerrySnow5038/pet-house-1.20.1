package net.happysnowball.pethouse.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TestHouse extends Block {
    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
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
    private static final VoxelShape Z_LEFT_WALL = Block.createCuboidShape(2.0, 1.0, 2.0, 14.0, 11.0, 3.0);
    private static final VoxelShape Z_RIGHT_WALL = Block.createCuboidShape(2.0, 1.0, 13.0, 14.0, 11.0, 14.0);
    private static final VoxelShape Z_BEHIND_WALL = Block.createCuboidShape(13.0, 1.0, 3.0, 14.0, 11.0, 13.0);
    private static final VoxelShape Z_A_ROOF = Block.createCuboidShape(1.0, 11.0, 2.0, 15.0, 12.0, 14.0);
    private static final VoxelShape Z_B_ROOF = Block.createCuboidShape(1.0, 12.0, 3.0, 15.0, 13.0, 13.0);
    private static final VoxelShape Z_C_ROOF = Block.createCuboidShape(1.0, 13.0, 4.0, 15.0, 14.0, 12.0);
    private static final VoxelShape Z_D_ROOF = Block.createCuboidShape(1.0, 14.0, 5.0, 15.0, 15.0, 11.0);
    private static final VoxelShape Z_E_ROOF = Block.createCuboidShape(1.0, 15.0, 5.0, 15.0, 16.0, 10.0);
    private static final VoxelShape X_HOUSE_SHAPE = VoxelShapes.union(GROUND, GRASS, X_LEFT_WALL, X_RIGHT_WALL,
            X_BEHIND_WALL, X_A_ROOF, X_B_ROOF, X_C_ROOF, X_D_ROOF, X_E_ROOF);
    private static final VoxelShape Z_HOUSE_SHAPE = VoxelShapes.union(GROUND, GRASS, Z_LEFT_WALL, Z_RIGHT_WALL,
            Z_BEHIND_WALL, Z_A_ROOF, Z_B_ROOF, Z_C_ROOF, Z_D_ROOF, Z_E_ROOF);


    public TestHouse(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }


    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? X_HOUSE_SHAPE : Z_HOUSE_SHAPE;
    }
}
