package com.minecolonies.api.blocks;

import com.minecolonies.api.blocks.types.RackType;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public abstract class AbstractBlockMinecoloniesRack<B extends AbstractBlockMinecoloniesRack<B>> extends AbstractBlockMinecolonies<B> implements EntityBlock, SimpleWaterloggedBlock
{
    public static final EnumProperty<RackType> VARIANT = EnumProperty.create("variant", RackType.class);

    /**
     * The position it faces.
     */
    public static final DirectionProperty      FACING       = HorizontalDirectionalBlock.FACING;
    /**
     * Whether the block is waterlogged.
     */
    public static final BooleanProperty        WATERLOGGED  = BlockStateProperties.WATERLOGGED;

    public AbstractBlockMinecoloniesRack(final Properties properties)
    {
        super(properties.noOcclusion());
    }

    /**
     * Check if a certain block should be replaced with a rack.
     *
     * @param block the block to check.
     * @return true if so.
     */
    public static boolean shouldBlockBeReplacedWithRack(final Block block)
    {
        return block == Blocks.CHEST || block instanceof AbstractBlockMinecoloniesRack;
    }
}
