package derg.projectivemagistry;

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

}