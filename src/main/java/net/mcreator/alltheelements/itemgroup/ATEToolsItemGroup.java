
package net.mcreator.alltheelements.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.alltheelements.item.MalachitePickaxeItem;
import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class ATEToolsItemGroup extends AllTheElementsModElements.ModElement {
	public ATEToolsItemGroup(AllTheElementsModElements instance) {
		super(instance, 141);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabate_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MalachitePickaxeItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
