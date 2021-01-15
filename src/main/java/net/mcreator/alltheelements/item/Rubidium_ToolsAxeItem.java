
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Rubidium_ToolsAxeItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:rubidium_tools_axe")
	public static final Item block = null;

	public Rubidium_ToolsAxeItem(AllTheElementsModElements instance) {
		super(instance, 230);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 216;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubidiumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("rubidium_tools_axe"));
	}

}
