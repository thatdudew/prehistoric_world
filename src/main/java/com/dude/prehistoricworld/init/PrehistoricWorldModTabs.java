
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.dude.prehistoricworld.PrehistoricWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrehistoricWorldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrehistoricWorldMod.MODID);
	public static final RegistryObject<CreativeModeTab> PWBLOCKS = REGISTRY.register("pwblocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.prehistoric_world.pwblocks")).icon(() -> new ItemStack(PrehistoricWorldModBlocks.BLACKSANDSTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PrehistoricWorldModBlocks.CAMBRIANFOSSIL.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.COARSESANDYDIRT.get().asItem());
				tabData.accept(PrehistoricWorldModItems.CAMBRIANFOSSILL.get());
				tabData.accept(PrehistoricWorldModBlocks.BLACKSANDSTONE.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.MICROBIALMAT.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.MICROBIALORGANIC_GROUND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.CAUSTICMUD.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.SKILLISSUEBLOCK.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.PROCONODONTUSBLOCK.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.SYRINGOCRINUSBLOCK.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRON.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRONLEAVE.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRON_PLANKS.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRONSLAB.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRONSTAIRS.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRON_FENCES.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRONBUTTON.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LEPIDODENDRON_PRESSUREPLATE.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.BLACKSANDSTONE_WALLS.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.INGENBLOCK.get().asItem());
				tabData.accept(PrehistoricWorldModItems.SULPHUR_BUCKET.get());
				tabData.accept(PrehistoricWorldModBlocks.GLASSSPONGE.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.GINKGOLOG.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.GINKOPLANKS.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.ORGANICGROUND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.SANDYMICROBIALORGANICGROUND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.COARSEREDSANDYDIRT.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.COARSEBLACKSANDYDIRT.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.REDCLAY.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.PEAT.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.LUSHGROUND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.DRIED_MUD.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.MOSSYORGANICGROUND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.FERNYORGANICGROUND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.WHITESAND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.BLACKSAND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.SULPHURBLCOK.get().asItem());
				tabData.accept(PrehistoricWorldModItems.SULPHURITEM.get());
				tabData.accept(PrehistoricWorldModBlocks.BURNTLOG.get().asItem());
				tabData.accept(PrehistoricWorldModItems.REDCLAYBALL.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> P_WFOOD = REGISTRY.register("p_wfood",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.prehistoric_world.p_wfood")).icon(() -> new ItemStack(PrehistoricWorldModItems.PROCONODONTUSRAW.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PrehistoricWorldModItems.PROCONODONTUSRAW.get());
				tabData.accept(PrehistoricWorldModItems.PROCONODONTUSCOOK.get());
				tabData.accept(PrehistoricWorldModItems.SYRINGOCRINUSRAW.get());
				tabData.accept(PrehistoricWorldModItems.SYRINGOCRINUSCOOK.get());
				tabData.accept(PrehistoricWorldModItems.AJKACERATOPSRAW.get());
				tabData.accept(PrehistoricWorldModItems.AJKACERATOPSCOOK.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PrehistoricWorldModItems.PROCONODONTUS_SPAWN_EGG.get());
			tabData.accept(PrehistoricWorldModItems.SYRINGOCRINUS_SPAWN_EGG.get());
			tabData.accept(PrehistoricWorldModItems.AJKACERATOPS_SPAWN_EGG.get());
			tabData.accept(PrehistoricWorldModItems.ANOMALOCARIS_SPAWN_EGG.get());
			tabData.accept(PrehistoricWorldModItems.DICKINSONIA_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PrehistoricWorldModItems.CAMBRIANDIM.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PrehistoricWorldModBlocks.ECHMATOCRINUS_2.get().asItem());
		}
	}
}
