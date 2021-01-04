
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class NickelPickaxeItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:nickel_pickaxe")
	public static final Item block = null;

	public NickelPickaxeItem(AllTheElementsModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(NickelIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ATEToolsItemGroup.tab)) {

		}.setRegistryName("nickel_pickaxe"));
	}

}
