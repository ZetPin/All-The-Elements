
package net.mcreator.alltheelements.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class Samarium_ToolsPickaxeItem extends AllTheElementsModElements.ModElement {
	@ObjectHolder("all_the_elements:samarium_tools_pickaxe")
	public static final Item block = null;
	public Samarium_ToolsPickaxeItem(AllTheElementsModElements instance) {
		super(instance, 178);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SamariumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("samarium_tools_pickaxe"));
	}
}
