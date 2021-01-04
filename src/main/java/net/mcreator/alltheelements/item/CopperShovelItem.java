
package net.mcreator.alltheelements.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.alltheelements.itemgroup.ATEToolsItemGroup;
import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class CopperShovelItem extends AllTheElementsModElements.ModElement {
	@ObjectHolder("all_the_elements:copper_shovel")
	public static final Item block = null;
	public CopperShovelItem(AllTheElementsModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}, 1, -3f, new Item.Properties().group(ATEToolsItemGroup.tab)) {
		}.setRegistryName("copper_shovel"));
	}
}
