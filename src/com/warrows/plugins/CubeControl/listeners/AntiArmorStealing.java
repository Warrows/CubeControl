package com.warrows.plugins.CubeControl.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class AntiArmorStealing implements Listener
{

	@EventHandler(ignoreCancelled = true)
	public void antiArmorStealing(PlayerPickupItemEvent event)
	{
		Material type = event.getItem().getItemStack().getType();
		if (type.equals(Material.LEATHER_CHESTPLATE)
				|| type.equals(Material.LEATHER_HELMET))
		{
			ItemStack item = event.getItem().getItemStack();
			item = new ItemStack(item.getType());
			event.getPlayer().getInventory().addItem(item);
			event.getItem().remove();
			event.setCancelled(true);
		}
	}
}