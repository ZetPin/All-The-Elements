
package net.mcreator.alltheelements.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.alltheelements.block.NikelOreBlock;
import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class AllTheElementsItemGroup extends AllTheElementsModElements.ModElement {
	public AllTheElementsItemGroup(AllTheElementsModElements instance) {
		super(instance, 117);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taball_the_elements") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(NikelOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
