
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Malachite_ToolsSwordItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:malachite_tools_sword")
	public static final Item block = null;

	public Malachite_ToolsSwordItem(AllTheElementsModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(MalachiteIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("malachite_tools_sword"));
	}

}
