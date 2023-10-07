
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dude.prehistoricworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.dude.prehistoricworld.block.SyringocrinusblockBlock;
import com.dude.prehistoricworld.block.SkillissueblockBlock;
import com.dude.prehistoricworld.block.ProconodontusblockBlock;
import com.dude.prehistoricworld.block.MicrobialorganicGroundBlock;
import com.dude.prehistoricworld.block.MicrobialmatBlock;
import com.dude.prehistoricworld.block.LepidodendronstairsBlock;
import com.dude.prehistoricworld.block.LepidodendronslabBlock;
import com.dude.prehistoricworld.block.LepidodendronleaveBlock;
import com.dude.prehistoricworld.block.LepidodendronbuttonBlock;
import com.dude.prehistoricworld.block.LepidodendronPressureplateBlock;
import com.dude.prehistoricworld.block.LepidodendronPlanksBlock;
import com.dude.prehistoricworld.block.LepidodendronFenceBlock;
import com.dude.prehistoricworld.block.LepidodendronBlock;
import com.dude.prehistoricworld.block.EchmatocrinusBlock;
import com.dude.prehistoricworld.block.CoarsesandydirtBlock;
import com.dude.prehistoricworld.block.CausticmudBlock;
import com.dude.prehistoricworld.block.CambrianfossilBlock;
import com.dude.prehistoricworld.block.CambriandimPortalBlock;
import com.dude.prehistoricworld.block.BlacksandstonewallBlock;
import com.dude.prehistoricworld.block.BlacksandstoneBlock;
import com.dude.prehistoricworld.PrehistoricWorldMod;

public class PrehistoricWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PrehistoricWorldMod.MODID);
	public static final RegistryObject<Block> CAMBRIANFOSSIL = REGISTRY.register("cambrianfossil", () -> new CambrianfossilBlock());
	public static final RegistryObject<Block> COARSESANDYDIRT = REGISTRY.register("coarsesandydirt", () -> new CoarsesandydirtBlock());
	public static final RegistryObject<Block> CAMBRIANDIM_PORTAL = REGISTRY.register("cambriandim_portal", () -> new CambriandimPortalBlock());
	public static final RegistryObject<Block> BLACKSANDSTONE = REGISTRY.register("blacksandstone", () -> new BlacksandstoneBlock());
	public static final RegistryObject<Block> MICROBIALMAT = REGISTRY.register("microbialmat", () -> new MicrobialmatBlock());
	public static final RegistryObject<Block> MICROBIALORGANIC_GROUND = REGISTRY.register("microbialorganic_ground", () -> new MicrobialorganicGroundBlock());
	public static final RegistryObject<Block> CAUSTICMUD = REGISTRY.register("causticmud", () -> new CausticmudBlock());
	public static final RegistryObject<Block> ECHMATOCRINUS_2 = REGISTRY.register("echmatocrinus_2", () -> new EchmatocrinusBlock());
	public static final RegistryObject<Block> SKILLISSUEBLOCK = REGISTRY.register("skillissueblock", () -> new SkillissueblockBlock());
	public static final RegistryObject<Block> PROCONODONTUSBLOCK = REGISTRY.register("proconodontusblock", () -> new ProconodontusblockBlock());
	public static final RegistryObject<Block> SYRINGOCRINUSBLOCK = REGISTRY.register("syringocrinusblock", () -> new SyringocrinusblockBlock());
	public static final RegistryObject<Block> LEPIDODENDRON = REGISTRY.register("lepidodendron", () -> new LepidodendronBlock());
	public static final RegistryObject<Block> LEPIDODENDRONLEAVE = REGISTRY.register("lepidodendronleave", () -> new LepidodendronleaveBlock());
	public static final RegistryObject<Block> LEPIDODENDRON_PLANKS = REGISTRY.register("lepidodendron_planks", () -> new LepidodendronPlanksBlock());
	public static final RegistryObject<Block> LEPIDODENDRONSLAB = REGISTRY.register("lepidodendronslab", () -> new LepidodendronslabBlock());
	public static final RegistryObject<Block> LEPIDODENDRONSTAIRS = REGISTRY.register("lepidodendronstairs", () -> new LepidodendronstairsBlock());
	public static final RegistryObject<Block> LEPIDODENDRON_FENCES = REGISTRY.register("lepidodendron_fences", () -> new LepidodendronFenceBlock());
	public static final RegistryObject<Block> LEPIDODENDRONBUTTON = REGISTRY.register("lepidodendronbutton", () -> new LepidodendronbuttonBlock());
	public static final RegistryObject<Block> LEPIDODENDRON_PRESSUREPLATE = REGISTRY.register("lepidodendron_pressureplate", () -> new LepidodendronPressureplateBlock());
	public static final RegistryObject<Block> BLACKSANDSTONE_WALLS = REGISTRY.register("blacksandstone_walls", () -> new BlacksandstonewallBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			CoarsesandydirtBlock.blockColorLoad(event);
		}
	}
}
