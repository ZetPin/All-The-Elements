
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Copper_ToolsAxeItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:copper_tools_axe")
	public static final Item block = null;

	public Copper_ToolsAxeItem(AllTheElementsModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("copper_tools_axe"));
	}

}
