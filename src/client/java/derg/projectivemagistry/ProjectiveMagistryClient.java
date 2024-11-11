package derg.projectivemagistry;

import derg.projectivemagistry.common.block.ModBlocks;
import derg.projectivemagistry.common.block.entity.ModBlockEntities;
import derg.projectivemagistry.renderer.AncientPedestalBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ProjectiveMagistryClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASH_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HOLLY_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YEW_SAPLING, RenderLayer.getCutout());
		BlockEntityRendererFactories.register(ModBlockEntities.ANCIENT_PEDESTAL_BE, AncientPedestalBlockEntityRenderer::new);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASH_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASH_TRAPDOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_TRAPDOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HOLLY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HOLLY_TRAPDOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YEW_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YEW_TRAPDOOR, RenderLayer.getCutout());

	}
}