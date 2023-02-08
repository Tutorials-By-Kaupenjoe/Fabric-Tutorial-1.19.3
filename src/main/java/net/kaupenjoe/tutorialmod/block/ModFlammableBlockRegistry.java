package net.kaupenjoe.tutorialmod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.RED_MAPLE_LOG, 5, 5);
        registry.add(ModBlocks.RED_MAPLE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_RED_MAPLE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_RED_MAPLE_WOOD, 5, 5);

        registry.add(ModBlocks.RED_MAPLE_LEAVES, 30, 60);
        registry.add(ModBlocks.RED_MAPLE_PLANKS, 5, 20);
    }
}
