package derg.projectivemagistry.common.block.crystal;


import net.minecraft.block.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.sound.*;
import net.minecraft.util.hit.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public class crystal_block extends AmethystBlock {

    private final SoundEvent hitSoundEvent;
    private final SoundEvent chimeSoundEvent;

    public crystal_block(AbstractBlock.Settings settings) {
        super(settings);
        this.hitSoundEvent = SoundEvents.BLOCK_AMETHYST_BLOCK_HIT;
        this.chimeSoundEvent = SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME;
    }

@Override
    protected void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (!world.isClient) {
            BlockPos blockPos = hit.getBlockPos();
            world.playSound(null, blockPos, hitSoundEvent, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
            world.playSound(null, blockPos, chimeSoundEvent, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
        }

    }

}
