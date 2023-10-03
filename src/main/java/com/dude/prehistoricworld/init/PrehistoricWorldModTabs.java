
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
				tabData.accept(PrehistoricWorldModBlocks.BLACKSANDSTONE.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.MICROBIALMAT.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.MICROBIALORGANIC_GROUND.get().asItem());
				tabData.accept(PrehistoricWorldModBlocks.CAUSTICMUD.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PrehistoricWorldModItems.PROCONODONTUS_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PrehistoricWorldModItems.CAMBRIANFOSSILL.get());
			tabData.accept(PrehistoricWorldModBlocks.ECHMATOCRINUS_2.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(PrehistoricWorldModItems.CAMBRIANDIM.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(PrehistoricWorldModItems.PROCONODONTUSRAW.get());
			tabData.accept(PrehistoricWorldModItems.PROCONODONTUSCOOK.get());
		}
	}
}
