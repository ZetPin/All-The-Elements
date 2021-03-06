
package net.mcreator.alltheelements.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.alltheelements.itemgroup.AllTheElementsItemGroup;
import net.mcreator.alltheelements.AllTheElementsModElements;

import java.util.List;
import java.util.Collections;

@AllTheElementsModElements.ModElement.Tag
public class TungsteneOreBlock extends AllTheElementsModElements.ModElement {
	@ObjectHolder("all_the_elements:tungstene_ore")
	public static final Block block = null;
	public TungsteneOreBlock(AllTheElementsModElements instance) {
		super(instance, 208);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AllTheElementsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("tungstene_ore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(TungsteneOreBlock.block, (int) (1)));
		}
	}
}
