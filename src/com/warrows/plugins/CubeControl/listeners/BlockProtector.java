package com.warrows.plugins.CubeControl.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockProtector implements Listener {

	@EventHandler(ignoreCancelled = true)
	public void antiGlassBreak(BlockBreakEvent event)
	{
		if (isGlass(event.getBlock().getType()))
		{
			event.setCancelled(true);
		}
	}	
	
	@EventHandler(ignoreCancelled = true)
	public void adventurePlusPlus(BlockBreakEvent event)
	{
		if (event.getPlayer().getGameMode() == GameMode.ADVENTURE)
		{
			event.setCancelled(true);
		}
	}

	private boolean isGlass(Material m) {
		if (m == Material.GLASS)
			return true;
		if (m == Material.THIN_GLASS)
			return true;

		return false;
	}
}