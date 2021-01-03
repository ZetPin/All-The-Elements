
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class MalachiteIngotItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:malachite_ingot")
	public static final Item block = null;

	public MalachiteIngotItem(AllTheElementsModElements instance) {
		super(instance, 29);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("malachite_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
