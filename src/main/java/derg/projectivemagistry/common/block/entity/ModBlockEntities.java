package derg.projectivemagistry.common.block.entity;

import derg.projectivemagistry.ProjectiveMagistry;
import derg.projectivemagistry.common.block.ModBlocks;
import derg.projectivemagistry.common.block.entity.Pedestal.AncientPedestalBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<AncientPedestalBlockEntity> ANCIENT_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ProjectiveMagistry.MOD_ID, "ancient_pedestal_be"),
                    BlockEntityType.Builder.create(AncientPedestalBlockEntity::new, ModBlocks.ANCIENT_PEDESTAL).build(null));

    public static final BlockEntityType<AncientPedestalBlockEntity> KILN_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ProjectiveMagistry.MOD_ID, "ancient_pedestal_be"),
                    BlockEntityType.Builder.create(AncientPedestalBlockEntity::new, ModBlocks.ANCIENT_PEDESTAL).build(null));

    public static void registerBlockEntities(){
        ProjectiveMagistry.LOGGER.info("Registering block entities for " + ProjectiveMagistry.MOD_ID);
    }
}
