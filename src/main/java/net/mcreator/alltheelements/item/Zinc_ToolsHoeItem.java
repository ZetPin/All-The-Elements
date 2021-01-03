
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Zinc_ToolsHoeItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:zinc_tools_hoe")
	public static final Item block = null;

	public Zinc_ToolsHoeItem(AllTheElementsModElements instance) {
		super(instance, 88);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(ZincIngotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("zinc_tools_hoe"));
	}

}
