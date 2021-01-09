
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class SamariumIngotItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:samarium_ingot")
	public static final Item block = null;

	public SamariumIngotItem(AllTheElementsModElements instance) {
		super(instance, 172);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(MaterialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("samarium_ingot");
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
