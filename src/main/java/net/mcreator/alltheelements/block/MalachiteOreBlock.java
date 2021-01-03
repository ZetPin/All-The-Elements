
package net.mcreator.alltheelements.block;

import net.minecraft.block.material.Material;

@AllTheElementsModElements.ModElement.Tag
public class MalachiteOreBlock extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:malachite_ore")
	public static final Block block = null;

	public MalachiteOreBlock(AllTheElementsModElements instance) {
		super(instance, 28);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("malachite_ore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
