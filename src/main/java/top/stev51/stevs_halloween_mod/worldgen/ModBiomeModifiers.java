package top.stev51.stevs_halloween_mod.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.ModEntities;

import java.util.List;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> SPAWN_GHOST = registerKey("spawn_ghost");
    public static final ResourceKey<BiomeModifier> SPAWN_VAMPIRE = registerKey("spawn_vampire");
    public static final ResourceKey<BiomeModifier> SPAWN_WEREWOLF = registerKey("spawn_werewolf");
    public static final ResourceKey<BiomeModifier> SPAWN_FRANKENSTEIN = registerKey("spawn_frankenstein");
    public static final ResourceKey<BiomeModifier> SPAWN_MUMMY = registerKey("spawn_mummy");
    public static final ResourceKey<BiomeModifier> SPAWN_DEVIL = registerKey("spawn_devil");

    public static final ResourceKey<BiomeModifier> SPAWN_DEVIL_BASALT_DELTAS = registerKey("spawn_devil_basalt_deltas");
    public static final ResourceKey<BiomeModifier> SPAWN_DEVIL_CRIMSON_FOREST = registerKey("spawn_devil_crimson_forest");
    public static final ResourceKey<BiomeModifier> SPAWN_DEVIL_NETHER_WASTES = registerKey("spawn_devil_nether_wastes");
    public static final ResourceKey<BiomeModifier> SPAWN_DEVIL_SOUL_SAND_VALLEY = registerKey("spawn_devil_soul_sand_valley");
    public static final ResourceKey<BiomeModifier> SPAWN_DEVIL_WARPED_FOREST = registerKey("spawn_devil_warped_forest");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {

        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        HolderSet<Biome> biomes_set = HolderSet.direct(
                biomes.getOrThrow(Biomes.BADLANDS),
                biomes.getOrThrow(Biomes.BAMBOO_JUNGLE),
                biomes.getOrThrow(Biomes.BEACH),
                biomes.getOrThrow(Biomes.BIRCH_FOREST),
                biomes.getOrThrow(Biomes.CHERRY_GROVE),
                biomes.getOrThrow(Biomes.COLD_OCEAN),
                biomes.getOrThrow(Biomes.DARK_FOREST),
                biomes.getOrThrow(Biomes.DEEP_COLD_OCEAN),
                biomes.getOrThrow(Biomes.DEEP_FROZEN_OCEAN),
                biomes.getOrThrow(Biomes.DEEP_LUKEWARM_OCEAN),
                biomes.getOrThrow(Biomes.DEEP_OCEAN),
                biomes.getOrThrow(Biomes.DESERT),
                biomes.getOrThrow(Biomes.DRIPSTONE_CAVES),
                biomes.getOrThrow(Biomes.ERODED_BADLANDS),
                biomes.getOrThrow(Biomes.FLOWER_FOREST),
                biomes.getOrThrow(Biomes.FOREST),
                biomes.getOrThrow(Biomes.FROZEN_OCEAN),
                biomes.getOrThrow(Biomes.FROZEN_RIVER),
                biomes.getOrThrow(Biomes.GROVE),
                biomes.getOrThrow(Biomes.ICE_SPIKES),
                biomes.getOrThrow(Biomes.JAGGED_PEAKS),
                biomes.getOrThrow(Biomes.JUNGLE),
                biomes.getOrThrow(Biomes.LUKEWARM_OCEAN),
                biomes.getOrThrow(Biomes.LUSH_CAVES),
                biomes.getOrThrow(Biomes.MANGROVE_SWAMP),
                biomes.getOrThrow(Biomes.MEADOW),
                biomes.getOrThrow(Biomes.OCEAN),
                biomes.getOrThrow(Biomes.OLD_GROWTH_BIRCH_FOREST),
                biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA),
                biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
                biomes.getOrThrow(Biomes.PLAINS),
                biomes.getOrThrow(Biomes.RIVER),
                biomes.getOrThrow(Biomes.SAVANNA),
                biomes.getOrThrow(Biomes.SAVANNA_PLATEAU),
                biomes.getOrThrow(Biomes.SNOWY_BEACH),
                biomes.getOrThrow(Biomes.SNOWY_PLAINS),
                biomes.getOrThrow(Biomes.SNOWY_SLOPES),
                biomes.getOrThrow(Biomes.SNOWY_TAIGA),
                biomes.getOrThrow(Biomes.SPARSE_JUNGLE),
                biomes.getOrThrow(Biomes.STONY_PEAKS),
                biomes.getOrThrow(Biomes.STONY_SHORE),
                biomes.getOrThrow(Biomes.SUNFLOWER_PLAINS),
                biomes.getOrThrow(Biomes.SWAMP),
                biomes.getOrThrow(Biomes.TAIGA),
                biomes.getOrThrow(Biomes.WARM_OCEAN),
                biomes.getOrThrow(Biomes.WINDSWEPT_FOREST),
                biomes.getOrThrow(Biomes.WINDSWEPT_GRAVELLY_HILLS),
                biomes.getOrThrow(Biomes.WINDSWEPT_HILLS),
                biomes.getOrThrow(Biomes.WINDSWEPT_SAVANNA),
                biomes.getOrThrow(Biomes.WOODED_BADLANDS)
        );

        context.register(SPAWN_GHOST, new BiomeModifiers
                .AddSpawnsBiomeModifier(biomes_set, List.of(
                        new MobSpawnSettings.SpawnerData(ModEntities.GHOST.get(), 80, 2, 4)))
        );

        context.register(SPAWN_VAMPIRE, new BiomeModifiers
                .AddSpawnsBiomeModifier(biomes_set, List.of(
                        new MobSpawnSettings.SpawnerData(ModEntities.VAMPIRE.get(), 50, 1, 1)))
        );

        context.register(SPAWN_WEREWOLF, new BiomeModifiers
                .AddSpawnsBiomeModifier(biomes_set, List.of(
                        new MobSpawnSettings.SpawnerData(ModEntities.WEREWOLF.get(), 80, 2, 4)))
        );

        context.register(SPAWN_FRANKENSTEIN, new BiomeModifiers
                .AddSpawnsBiomeModifier(biomes_set, List.of(
                        new MobSpawnSettings.SpawnerData(ModEntities.FRANKENSTEIN.get(), 50, 1, 1)))
        );

        context.register(SPAWN_MUMMY, new BiomeModifiers
                .AddSpawnsBiomeModifier(biomes_set, List.of(
                        new MobSpawnSettings.SpawnerData(ModEntities.MUMMY.get(), 80, 2, 4)))
        );

        context.register(SPAWN_DEVIL, new BiomeModifiers
                .AddSpawnsBiomeModifier(biomes_set, List.of(
                        new MobSpawnSettings.SpawnerData(ModEntities.DEVIL.get(), 60, 3, 5)))
        );

        context.register(SPAWN_DEVIL_BASALT_DELTAS, new BiomeModifiers
                .AddSpawnsBiomeModifier(HolderSet.direct(biomes.getOrThrow(Biomes.BASALT_DELTAS)), List.of(
                    new MobSpawnSettings.SpawnerData(ModEntities.DEVIL.get(), 40, 3, 5)))
        );

        context.register(SPAWN_DEVIL_CRIMSON_FOREST, new BiomeModifiers
                .AddSpawnsBiomeModifier(HolderSet.direct(biomes.getOrThrow(Biomes.CRIMSON_FOREST)), List.of(
                    new MobSpawnSettings.SpawnerData(ModEntities.DEVIL.get(), 5, 3, 5)))
        );

        context.register(SPAWN_DEVIL_NETHER_WASTES, new BiomeModifiers
                .AddSpawnsBiomeModifier(HolderSet.direct(biomes.getOrThrow(Biomes.NETHER_WASTES)), List.of(
                    new MobSpawnSettings.SpawnerData(ModEntities.DEVIL.get(), 50, 3, 5)))
        );

        context.register(SPAWN_DEVIL_SOUL_SAND_VALLEY, new BiomeModifiers
                .AddSpawnsBiomeModifier(HolderSet.direct(biomes.getOrThrow(Biomes.SOUL_SAND_VALLEY)), List.of(
                    new MobSpawnSettings.SpawnerData(ModEntities.DEVIL.get(), 5, 3, 5)))
        );

        context.register(SPAWN_DEVIL_WARPED_FOREST, new BiomeModifiers
                .AddSpawnsBiomeModifier(HolderSet.direct(biomes.getOrThrow(Biomes.WARPED_FOREST)), List.of(
                    new MobSpawnSettings.SpawnerData(ModEntities.DEVIL.get(), 1, 3, 5)))
        );

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, name));
    }

}
