
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Titanium_ArmorSwordItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:titanium_armor_sword")
	public static final Item block = null;

	public Titanium_ArmorSwordItem(AllTheElementsModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("titanium_armor_sword"));
	}

}
