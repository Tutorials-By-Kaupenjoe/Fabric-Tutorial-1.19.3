package net.kaupenjoe.tutorialmod.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();

        ModEntityGeneration.addSpawns();
    }
}
