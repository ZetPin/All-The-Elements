
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Rubidium_ToolsSwordItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:rubidium_tools_sword")
	public static final Item block = null;

	public Rubidium_ToolsSwordItem(AllTheElementsModElements instance) {
		super(instance, 231);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 216;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("rubidium_tools_sword"));
	}

}
