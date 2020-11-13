package net.allkillernofiller.simplysulfur;

import net.allkillernofiller.simplysulfur.init.BlockInit;
import net.allkillernofiller.simplysulfur.init.ItemInit;
import net.allkillernofiller.simplysulfur.world.OreGenerator;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class SimplySulfur implements ModInitializer {
	public static final String MOD_ID = "simplysulfur";

	@Override
	public void onInitialize() {
		BlockInit.registerBlocks();
		ItemInit.registerItems();
		OreGenerator.genOres();
	}

	public static final ItemGroup TAB = FabricItemGroupBuilder.build(
			new Identifier("simplysulfur", "sulfurtab"),
			() -> new ItemStack(BlockInit.SULFUR_ORE));
}
