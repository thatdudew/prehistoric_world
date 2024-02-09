
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

import com.dude.prehistoricworld.block.ZirconoreBlock;
import com.dude.prehistoricworld.block.ZirconblockBlock;
import com.dude.prehistoricworld.block.WhitesandBlock;
import com.dude.prehistoricworld.block.SyringocrinusblockBlock;
import com.dude.prehistoricworld.block.SulphurblcokBlock;
import com.dude.prehistoricworld.block.SulphurBlock;
import com.dude.prehistoricworld.block.SkillissueblockBlock;
import com.dude.prehistoricworld.block.SandymicrobialorganicgroundBlock;
import com.dude.prehistoricworld.block.SandgroundcoverBlock;
import com.dude.prehistoricworld.block.RedclayBlock;
import com.dude.prehistoricworld.block.ProconodontusblockBlock;
import com.dude.prehistoricworld.block.PeatBlock;
import com.dude.prehistoricworld.block.OrganicgroundBlock;
import com.dude.prehistoricworld.block.NetherrackzirconoreBlock;
import com.dude.prehistoricworld.block.MossyorganicgroundBlock;
import com.dude.prehistoricworld.block.MicrobialorganicGroundBlock;
import com.dude.prehistoricworld.block.MicrobialmatBlock;
import com.dude.prehistoricworld.block.LushgroundBlock;
import com.dude.prehistoricworld.block.LepidodendronstairsBlock;
import com.dude.prehistoricworld.block.LepidodendronslabBlock;
import com.dude.prehistoricworld.block.LepidodendronleaveBlock;
import com.dude.prehistoricworld.block.LepidodendronbuttonBlock;
import com.dude.prehistoricworld.block.LepidodendronPressureplateBlock;
import com.dude.prehistoricworld.block.LepidodendronPlanksBlock;
import com.dude.prehistoricworld.block.LepidodendronFenceBlock;
import com.dude.prehistoricworld.block.LepidodendronBlock;
import com.dude.prehistoricworld.block.IngenblockBlock;
import com.dude.prehistoricworld.block.GroundcoverBlock;
import com.dude.prehistoricworld.block.GlassspongeBlock;
import com.dude.prehistoricworld.block.GinkoplanksBlock;
import com.dude.prehistoricworld.block.GinkgologBlock;
import com.dude.prehistoricworld.block.FernyorganicgroundBlock;
import com.dude.prehistoricworld.block.EchmatocrinusBlock;
import com.dude.prehistoricworld.block.DriedMudBlock;
import com.dude.prehistoricworld.block.DeepslatezirconoreBlock;
import com.dude.prehistoricworld.block.CoarsesandydirtBlock;
import com.dude.prehistoricworld.block.CoarseredsandydirtBlock;
import com.dude.prehistoricworld.block.CoarseblacksandydirtBlock;
import com.dude.prehistoricworld.block.CausticmudBlock;
import com.dude.prehistoricworld.block.CambrianfossilBlock;
import com.dude.prehistoricworld.block.CambriandimPortalBlock;
import com.dude.prehistoricworld.block.BurntlogBlock;
import com.dude.prehistoricworld.block.BlacksandstonewallBlock;
import com.dude.prehistoricworld.block.BlacksandstoneBlock;
import com.dude.prehistoricworld.block.BlacksandBlock;
import com.dude.prehistoricworld.block.AshBlock;
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
	public static final RegistryObject<Block> INGENBLOCK = REGISTRY.register("ingenblock", () -> new IngenblockBlock());
	public static final RegistryObject<Block> SULPHUR = REGISTRY.register("sulphur", () -> new SulphurBlock());
	public static final RegistryObject<Block> GLASSSPONGE = REGISTRY.register("glasssponge", () -> new GlassspongeBlock());
	public static final RegistryObject<Block> GINKGOLOG = REGISTRY.register("ginkgolog", () -> new GinkgologBlock());
	public static final RegistryObject<Block> GINKOPLANKS = REGISTRY.register("ginkoplanks", () -> new GinkoplanksBlock());
	public static final RegistryObject<Block> ORGANICGROUND = REGISTRY.register("organicground", () -> new OrganicgroundBlock());
	public static final RegistryObject<Block> SANDYMICROBIALORGANICGROUND = REGISTRY.register("sandymicrobialorganicground", () -> new SandymicrobialorganicgroundBlock());
	public static final RegistryObject<Block> COARSEREDSANDYDIRT = REGISTRY.register("coarseredsandydirt", () -> new CoarseredsandydirtBlock());
	public static final RegistryObject<Block> COARSEBLACKSANDYDIRT = REGISTRY.register("coarseblacksandydirt", () -> new CoarseblacksandydirtBlock());
	public static final RegistryObject<Block> REDCLAY = REGISTRY.register("redclay", () -> new RedclayBlock());
	public static final RegistryObject<Block> PEAT = REGISTRY.register("peat", () -> new PeatBlock());
	public static final RegistryObject<Block> LUSHGROUND = REGISTRY.register("lushground", () -> new LushgroundBlock());
	public static final RegistryObject<Block> DRIED_MUD = REGISTRY.register("dried_mud", () -> new DriedMudBlock());
	public static final RegistryObject<Block> MOSSYORGANICGROUND = REGISTRY.register("mossyorganicground", () -> new MossyorganicgroundBlock());
	public static final RegistryObject<Block> FERNYORGANICGROUND = REGISTRY.register("fernyorganicground", () -> new FernyorganicgroundBlock());
	public static final RegistryObject<Block> WHITESAND = REGISTRY.register("whitesand", () -> new WhitesandBlock());
	public static final RegistryObject<Block> BLACKSAND = REGISTRY.register("blacksand", () -> new BlacksandBlock());
	public static final RegistryObject<Block> SULPHURBLCOK = REGISTRY.register("sulphurblcok", () -> new SulphurblcokBlock());
	public static final RegistryObject<Block> BURNTLOG = REGISTRY.register("burntlog", () -> new BurntlogBlock());
	public static final RegistryObject<Block> ZIRCONBLOCK = REGISTRY.register("zirconblock", () -> new ZirconblockBlock());
	public static final RegistryObject<Block> ZIRCONORE = REGISTRY.register("zirconore", () -> new ZirconoreBlock());
	public static final RegistryObject<Block> DEEPSLATEZIRCONORE = REGISTRY.register("deepslatezirconore", () -> new DeepslatezirconoreBlock());
	public static final RegistryObject<Block> NETHERRACKZIRCONORE = REGISTRY.register("netherrackzirconore", () -> new NetherrackzirconoreBlock());
	public static final RegistryObject<Block> ASH = REGISTRY.register("ash", () -> new AshBlock());
	public static final RegistryObject<Block> GROUNDCOVER = REGISTRY.register("groundcover", () -> new GroundcoverBlock());
	public static final RegistryObject<Block> SANDGROUNDCOVERFLOWER = REGISTRY.register("sandgroundcoverflower", () -> new SandgroundcoverBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			OrganicgroundBlock.blockColorLoad(event);
		}
	}
}
