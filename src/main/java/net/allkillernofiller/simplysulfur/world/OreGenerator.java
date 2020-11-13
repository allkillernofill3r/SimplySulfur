package net.allkillernofiller.simplysulfur.world;

import net.allkillernofiller.simplysulfur.SimplySulfur;
import net.allkillernofiller.simplysulfur.init.BlockInit;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGenerator {
    // Vein size, Bottom offset, Min y, Max y, Times per chunk
    public static ConfiguredFeature<?, ?> ORE_SULFUR = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockInit.SULFUR_ORE.getDefaultState(), 5))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,63)))
            .spreadHorizontally().repeat(10);

    public static void genOres() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(SimplySulfur.MOD_ID, "ore_sulfur"), OreGenerator.ORE_SULFUR);
    }
}
