package com.minecolonies.core.items;

import com.minecolonies.api.items.IMinecoloniesFoodItem;
import com.minecolonies.api.util.constant.TranslationConstants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

/**
 * A custom item class for bowl food items.
 */
public class ItemBowlFood extends BowlFoodItem implements IMinecoloniesFoodItem
{
    /**
     * The job producing this.
     */
    private final String producer;

    /**
     * The food tier.
     */
    private final int tier;

    /**
     * Creates a new food item.
     *
     * @param builder the item properties to use.
     * @param producer the key for the worker that produces it.
     * @param tier the nutrition tier.
     */
    public ItemBowlFood(@NotNull final Properties builder, final String producer, final int tier)
    {
        super(builder);
        this.producer = producer;
        this.tier = tier;
    }

    @Override
    public void appendHoverText(@NotNull final ItemStack stack, @Nullable final Level worldIn, @NotNull final List<Component> tooltip, @NotNull final TooltipFlag flagIn)
    {
        tooltip.add(Component.translatable(TranslationConstants.FOOD_TOOLTIP + this.producer));
        tooltip.add(Component.translatable(TranslationConstants.TIER_TOOLTIP + this.tier));
    }

    @Override
    public int getTier()
    {
        return tier;
    }
}
