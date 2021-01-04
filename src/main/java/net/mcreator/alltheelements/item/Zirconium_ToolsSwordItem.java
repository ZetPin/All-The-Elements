
package net.mcreator.alltheelements.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.alltheelements.itemgroup.ATEArmorItemGroup;
import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class Zirconium_ToolsSwordItem extends AllTheElementsModElements.ModElement {
	@ObjectHolder("all_the_elements:zirconium_tools_sword")
	public static final Item block = null;
	public Zirconium_ToolsSwordItem(AllTheElementsModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ZirconiumIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ATEArmorItemGroup.tab)) {
		}.setRegistryName("zirconium_tools_sword"));
	}
}
