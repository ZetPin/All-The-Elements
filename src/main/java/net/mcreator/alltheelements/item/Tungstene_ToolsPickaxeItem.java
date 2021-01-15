
package net.mcreator.alltheelements.item;

@AllTheElementsModElements.ModElement.Tag
public class Tungstene_ToolsPickaxeItem extends AllTheElementsModElements.ModElement {

	@ObjectHolder("all_the_elements:tungstene_tools_pickaxe")
	public static final Item block = null;

	public Tungstene_ToolsPickaxeItem(AllTheElementsModElements instance) {
		super(instance, 210);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(TungsteneIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("tungstene_tools_pickaxe"));
	}

}
