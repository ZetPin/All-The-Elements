
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class NickelSwordItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:nickel_sword")
	public static final Item block = null;

	public NickelSwordItem(AllTheElementsModElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().group(ATEArmorItemGroup.tab)) {

		}.setRegistryName("nickel_sword"));
	}

}
