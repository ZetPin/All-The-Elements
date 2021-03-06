
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class RubidiumIngotItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:rubidium_ingot")
	public static final Item block = null;

	public RubidiumIngotItem(AllTheElementsModElements instance) {
		super(instance, 227);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(MaterialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("rubidium_ingot");
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
