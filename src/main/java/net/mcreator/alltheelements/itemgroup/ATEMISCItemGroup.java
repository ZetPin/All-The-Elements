
package net.mcreator.alltheelements.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class ATEMISCItemGroup extends AllTheElementsModElements.ModElement {
	public ATEMISCItemGroup(AllTheElementsModElements instance) {
		super(instance, 130);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabatemisc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.LAVA_BUCKET, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
