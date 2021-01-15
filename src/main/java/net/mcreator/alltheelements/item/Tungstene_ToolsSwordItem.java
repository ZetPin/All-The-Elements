
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Tungstene_ToolsSwordItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:tungstene_tools_sword")
	public static final Item block = null;

	public Tungstene_ToolsSwordItem(AllTheElementsModElements instance) {
		super(instance, 212);
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
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TungsteneIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("tungstene_tools_sword"));
	}

}
