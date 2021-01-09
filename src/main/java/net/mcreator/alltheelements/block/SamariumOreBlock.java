
package net.mcreator.alltheelements.block;

import net.minecraft.block.material.Material;

@AllTheElementsModElements.ModElement.Tag
public class SamariumOreBlock extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:samarium_ore")
	public static final Block block = null;

	public SamariumOreBlock(AllTheElementsModElements instance) {
		super(instance, 171);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AllTheElementsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).lightValue(2));

			setRegistryName("samarium_ore");
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
