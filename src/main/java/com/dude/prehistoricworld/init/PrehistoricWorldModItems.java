
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.dude.prehistoricworld.item.CambrianfossillItem;
import com.dude.prehistoricworld.item.CambriandimItem;
import com.dude.prehistoricworld.PrehistoricWorldMod;

public class PrehistoricWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricWorldMod.MODID);
	public static final RegistryObject<Item> CAMBRIANFOSSIL = block(PrehistoricWorldModBlocks.CAMBRIANFOSSIL);
	public static final RegistryObject<Item> COARSESANDYDIRT = block(PrehistoricWorldModBlocks.COARSESANDYDIRT);
	public static final RegistryObject<Item> CAMBRIANFOSSILL = REGISTRY.register("cambrianfossill", () -> new CambrianfossillItem());
	public static final RegistryObject<Item> CAMBRIANDIM = REGISTRY.register("cambriandim", () -> new CambriandimItem());
	public static final RegistryObject<Item> BLACKSANDSTONE = block(PrehistoricWorldModBlocks.BLACKSANDSTONE);
	public static final RegistryObject<Item> MICROBIALMAT = block(PrehistoricWorldModBlocks.MICROBIALMAT);
	public static final RegistryObject<Item> MICROBIALORGANIC_GROUND = block(PrehistoricWorldModBlocks.MICROBIALORGANIC_GROUND);
	public static final RegistryObject<Item> CAUSTICMUD = block(PrehistoricWorldModBlocks.CAUSTICMUD);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
