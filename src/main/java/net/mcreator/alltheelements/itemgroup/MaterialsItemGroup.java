
package net.mcreator.alltheelements.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.alltheelements.item.ThermiteItem;
import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class MaterialsItemGroup extends AllTheElementsModElements.ModElement {
	public MaterialsItemGroup(AllTheElementsModElements instance) {
		super(instance, 170);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmaterials") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ThermiteItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
