package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.CoolPickAxe.CoolPickAxe;
import net.fabricmc.example.CoolPickAxe.CoolToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	private static final ExampleBlock EXAMPLE_BLOCK = new ExampleBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD));
	private static final ExampleItem EXAMPLE_ITEM = new ExampleItem(EXAMPLE_BLOCK,new FabricItemSettings().group(ItemGroup.MISC));
	private static final CoolPickAxe COOL_PICKAXE = new CoolPickAxe(CoolToolMaterial.COOL_TOOL_MATERIAL, 7, 5.0F, new FabricItemSettings().group(ItemGroup.TOOLS));
	private static final Item COOL_STICK = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	private static final Item COOL_HEAD = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("tutorial", "example_block"), EXAMPLE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "example_block"), EXAMPLE_ITEM);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "cool_pickaxe"), COOL_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "cool_head"), COOL_HEAD);
		Registry.register(Registry.ITEM, new Identifier("tutorial", "cool_stick"), COOL_STICK);
	}
}
