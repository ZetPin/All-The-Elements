
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Titanium_ArmorShovelItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:titanium_armor_shovel")
	public static final Item block = null;

	public Titanium_ArmorShovelItem(AllTheElementsModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
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
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("titanium_armor_shovel"));
	}

}
