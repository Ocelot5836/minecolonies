package com.minecolonies.api.blocks;

import com.minecolonies.api.blocks.types.GraveType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public abstract class AbstractBlockMinecoloniesGrave<B extends AbstractBlockMinecoloniesGrave<B>> extends AbstractBlockMinecolonies<B> implements EntityBlock, SimpleWaterloggedBlock
{
    public static final EnumProperty<GraveType> VARIANT = EnumProperty.create("variant", GraveType.class);

    /**
     * The position it faces.
     */
    public static final DirectionProperty      FACING       = HorizontalDirectionalBlock.FACING;
    /**
     * Whether the block is waterlogged.
     */
    public static final BooleanProperty        WATERLOGGED  = BlockStateProperties.WATERLOGGED;

    public AbstractBlockMinecoloniesGrave(final Properties properties)
    {
        super(properties.noOcclusion());
    }

}
