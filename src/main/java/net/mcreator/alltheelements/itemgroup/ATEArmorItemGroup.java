
package net.mcreator.alltheelements.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.alltheelements.item.MalachiteArmorItem;
import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class ATEArmorItemGroup extends AllTheElementsModElements.ModElement {
	public ATEArmorItemGroup(AllTheElementsModElements instance) {
		super(instance, 116);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabate_armor") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MalachiteArmorItem.helmet, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
