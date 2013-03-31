package com.warrows.plugins.CubeControl.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class AntiPvP implements Listener
{

	@EventHandler(ignoreCancelled = true)
	public void antiPvP(EntityDamageByEntityEvent event)
	{
		if (event.getDamager() instanceof Player)
		{
			if (((Player) event.getDamager()).getGameMode() == GameMode.ADVENTURE)
				event.setCancelled(true);
		}
	}
}