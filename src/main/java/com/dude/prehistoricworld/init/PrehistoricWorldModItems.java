
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.dude.prehistoricworld.item.TestItem;
import com.dude.prehistoricworld.item.SyringocrinusrawItem;
import com.dude.prehistoricworld.item.SyringocrinuscookItem;
import com.dude.prehistoricworld.item.SulphurItem;
import com.dude.prehistoricworld.item.ProconodontusrawItem;
import com.dude.prehistoricworld.item.ProconodontuscookItem;
import com.dude.prehistoricworld.item.CambrianfossillItem;
import com.dude.prehistoricworld.item.CambriandimItem;
import com.dude.prehistoricworld.item.AjkaceratopsrawItem;
import com.dude.prehistoricworld.item.AjkaceratopscookItem;
import com.dude.prehistoricworld.item.AirItem;
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
	public static final RegistryObject<Item> ECHMATOCRINUS_2 = block(PrehistoricWorldModBlocks.ECHMATOCRINUS_2);
	public static final RegistryObject<Item> PROCONODONTUS_SPAWN_EGG = REGISTRY.register("proconodontus_spawn_egg", () -> new ForgeSpawnEggItem(PrehistoricWorldModEntities.PROCONODONTUS, -65485, -65485, new Item.Properties()));
	public static final RegistryObject<Item> PROCONODONTUSRAW = REGISTRY.register("proconodontusraw", () -> new ProconodontusrawItem());
	public static final RegistryObject<Item> PROCONODONTUSCOOK = REGISTRY.register("proconodontuscook", () -> new ProconodontuscookItem());
	public static final RegistryObject<Item> SKILLISSUEBLOCK = block(PrehistoricWorldModBlocks.SKILLISSUEBLOCK);
	public static final RegistryObject<Item> SYRINGOCRINUS_SPAWN_EGG = REGISTRY.register("syringocrinus_spawn_egg", () -> new ForgeSpawnEggItem(PrehistoricWorldModEntities.SYRINGOCRINUS, -10027264, -6684928, new Item.Properties()));
	public static final RegistryObject<Item> SYRINGOCRINUSRAW = REGISTRY.register("syringocrinusraw", () -> new SyringocrinusrawItem());
	public static final RegistryObject<Item> SYRINGOCRINUSCOOK = REGISTRY.register("syringocrinuscook", () -> new SyringocrinuscookItem());
	public static final RegistryObject<Item> PROCONODONTUSBLOCK = block(PrehistoricWorldModBlocks.PROCONODONTUSBLOCK);
	public static final RegistryObject<Item> SYRINGOCRINUSBLOCK = block(PrehistoricWorldModBlocks.SYRINGOCRINUSBLOCK);
	public static final RegistryObject<Item> LEPIDODENDRON = block(PrehistoricWorldModBlocks.LEPIDODENDRON);
	public static final RegistryObject<Item> LEPIDODENDRONLEAVE = block(PrehistoricWorldModBlocks.LEPIDODENDRONLEAVE);
	public static final RegistryObject<Item> LEPIDODENDRON_PLANKS = block(PrehistoricWorldModBlocks.LEPIDODENDRON_PLANKS);
	public static final RegistryObject<Item> LEPIDODENDRONSLAB = block(PrehistoricWorldModBlocks.LEPIDODENDRONSLAB);
	public static final RegistryObject<Item> LEPIDODENDRONSTAIRS = block(PrehistoricWorldModBlocks.LEPIDODENDRONSTAIRS);
	public static final RegistryObject<Item> LEPIDODENDRON_FENCES = block(PrehistoricWorldModBlocks.LEPIDODENDRON_FENCES);
	public static final RegistryObject<Item> LEPIDODENDRONBUTTON = block(PrehistoricWorldModBlocks.LEPIDODENDRONBUTTON);
	public static final RegistryObject<Item> LEPIDODENDRON_PRESSUREPLATE = block(PrehistoricWorldModBlocks.LEPIDODENDRON_PRESSUREPLATE);
	public static final RegistryObject<Item> BLACKSANDSTONE_WALLS = block(PrehistoricWorldModBlocks.BLACKSANDSTONE_WALLS);
	public static final RegistryObject<Item> AJKACERATOPS_SPAWN_EGG = REGISTRY.register("ajkaceratops_spawn_egg", () -> new ForgeSpawnEggItem(PrehistoricWorldModEntities.AJKACERATOPS, -16711936, -16724992, new Item.Properties()));
	public static final RegistryObject<Item> AJKACERATOPSRAW = REGISTRY.register("ajkaceratopsraw", () -> new AjkaceratopsrawItem());
	public static final RegistryObject<Item> AJKACERATOPSCOOK = REGISTRY.register("ajkaceratopscook", () -> new AjkaceratopscookItem());
	public static final RegistryObject<Item> INGENBLOCK = block(PrehistoricWorldModBlocks.INGENBLOCK);
	public static final RegistryObject<Item> SULPHUR_BUCKET = REGISTRY.register("sulphur_bucket", () -> new SulphurItem());
	public static final RegistryObject<Item> AIR = REGISTRY.register("air", () -> new AirItem());
	public static final RegistryObject<Item> ANOMALOCARIS_SPAWN_EGG = REGISTRY.register("anomalocaris_spawn_egg", () -> new ForgeSpawnEggItem(PrehistoricWorldModEntities.ANOMALOCARIS, -13369345, -13382401, new Item.Properties()));
	public static final RegistryObject<Item> GLASSSPONGE = block(PrehistoricWorldModBlocks.GLASSSPONGE);
	public static final RegistryObject<Item> GINKGOLOG = block(PrehistoricWorldModBlocks.GINKGOLOG);
	public static final RegistryObject<Item> GINKOPLANKS = block(PrehistoricWorldModBlocks.GINKOPLANKS);
	public static final RegistryObject<Item> ORGANICGROUND = block(PrehistoricWorldModBlocks.ORGANICGROUND);
	public static final RegistryObject<Item> SANDYMICROBIALORGANICGROUND = block(PrehistoricWorldModBlocks.SANDYMICROBIALORGANICGROUND);
	public static final RegistryObject<Item> COARSEREDSANDYDIRT = block(PrehistoricWorldModBlocks.COARSEREDSANDYDIRT);
	public static final RegistryObject<Item> COARSEBLACKSANDYDIRT = block(PrehistoricWorldModBlocks.COARSEBLACKSANDYDIRT);
	public static final RegistryObject<Item> REDCLAY = block(PrehistoricWorldModBlocks.REDCLAY);
	public static final RegistryObject<Item> PEAT = block(PrehistoricWorldModBlocks.PEAT);
	public static final RegistryObject<Item> LUSHGROUND = block(PrehistoricWorldModBlocks.LUSHGROUND);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
