package derg.projectivemagistry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import derg.projectivemagistry.common.block.ModBlocks;
import derg.projectivemagistry.common.registry.ModItemGroups;
import derg.projectivemagistry.common.item.ModItems;
import derg.projectivemagistry.common.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProjectiveMagistry implements ModInitializer {
	public static final String MOD_ID = "projectivemagistry";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.initialize();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Loading Projective Magistry!");
		ModWorldGeneration.generateModWorldGeneration();

	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
	private static void registerFlammables() {
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASH_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASH_WOOD, 5, 5);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASH_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ASH_LEAVES, 30, 60);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_WOOD, 5, 5);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZEL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZEL_WOOD, 5, 5);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZEL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZEL_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_WOOD, 5, 5);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_LEAVES, 30, 60);
	}
}