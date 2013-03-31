package com.warrows.plugins.CubeControl.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.CraftItemEvent;

public class BedProtector implements Listener {

	@EventHandler(ignoreCancelled = true)
	public void antiBedPlace(BlockPlaceEvent event) {
		if ((event.getBlockPlaced().getType() == Material.BED_BLOCK)) {
			if (event.getBlockAgainst().getType() != Material.OBSIDIAN)
				event.setCancelled(true);
		}
	}
	
	@EventHandler(ignoreCancelled = true)
	public void antiBedCraft(CraftItemEvent event) {
		if ((event.getRecipe().getResult().getType() == Material.BED)) {
				event.setCancelled(true);
		}
	}
}