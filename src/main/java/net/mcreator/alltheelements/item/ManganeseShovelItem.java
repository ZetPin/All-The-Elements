
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class ManganeseShovelItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:manganese_shovel")
	public static final Item block = null;

	public ManganeseShovelItem(AllTheElementsModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ManganeseIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ATEToolsItemGroup.tab)) {

		}.setRegistryName("manganese_shovel"));
	}

}
