package net.allkillernofiller.simplysulfur.init;

import net.allkillernofiller.simplysulfur.SimplySulfur;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    public static final Item SULFUR = new Item(new Item.Settings().group(SimplySulfur.TAB));
    public static final Item SULFURIC_COAL = new Item(new Item.Settings().group(SimplySulfur.TAB));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(SimplySulfur.MOD_ID, "sulfur"), SULFUR);
        Registry.register(Registry.ITEM, new Identifier(SimplySulfur.MOD_ID, "sulfuric_coal"), SULFURIC_COAL);
    }
}
