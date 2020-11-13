package net.allkillernofiller.simplysulfur.init;

import net.allkillernofiller.simplysulfur.SimplySulfur;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
    public static final Block SULFUR_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES));
    public static final Block SULFUR_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .strength(5, 30).sounds(BlockSoundGroup.METAL).breakByHand(false).breakByTool(FabricToolTags.PICKAXES));

    public static final Item SULFUR_ORE_ITEM = new BlockItem(SULFUR_ORE, new Item.Settings().group(SimplySulfur.TAB));
    public static final Item SULFUR_BLOCK_ITEM = new BlockItem(SULFUR_BLOCK, new Item.Settings().group(SimplySulfur.TAB));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(SimplySulfur.MOD_ID, "sulfur_ore"), SULFUR_ORE);
        Registry.register(Registry.BLOCK, new Identifier(SimplySulfur.MOD_ID, "sulfur_block"), SULFUR_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(SimplySulfur.MOD_ID, "sulfur_ore"), SULFUR_ORE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(SimplySulfur.MOD_ID, "sulfur_block"), SULFUR_BLOCK_ITEM);
    }
}
