package derg.projectivemagistry.common.block.entity.kiln;

import derg.projectivemagistry.common.block.entity.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity implements Inventory {
    protected KilnBlockEntity(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state, RecipeType<? extends AbstractCookingRecipe> recipeType) {
        super(ModBlockEntities.KILN_BE, pos, state, recipeType);
    }

    @Override
    protected Text getContainerName() {
        return null;
    }

    protected int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel) / 2;
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return null;
    }
}
