
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
public class CobaltSwordItem extends AllTheElementsModElements.ModElement {
	@ObjectHolder("all_the_elements:cobalt_sword")
	public static final Item block = null;
	public CobaltSwordItem(AllTheElementsModElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3250;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CobaltIngotItem.block, (int) (1)));
			}
		}, 3, -1.5f, new Item.Properties().group(ATEArmorItemGroup.tab)) {
		}.setRegistryName("cobalt_sword"));
	}
}
