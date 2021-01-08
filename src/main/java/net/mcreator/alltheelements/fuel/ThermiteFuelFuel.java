
package net.mcreator.alltheelements.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.alltheelements.item.ThermiteItem;
import net.mcreator.alltheelements.AllTheElementsModElements;

@AllTheElementsModElements.ModElement.Tag
public class ThermiteFuelFuel extends AllTheElementsModElements.ModElement {
	public ThermiteFuelFuel(AllTheElementsModElements instance) {
		super(instance, 168);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(ThermiteItem.block, (int) (1)).getItem())
			event.setBurnTime(18000);
	}
}
