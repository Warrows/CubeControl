package com.warrows.plugins.CubeControl;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.warrows.plugins.CubeControl.listeners.BedProtector;
import com.warrows.plugins.CubeControl.listeners.BlockProtector;
/**
 * Loads Plugin and manages Data/Permissions
 * 
 * @author Warrows
 * 
 */
public class CubeControlPlugin extends JavaPlugin
{
	public static Logger			log;

	@Override
	public void onEnable()
	{
		/* get basis and warn about loading */
		log = this.getLogger();
		log.info("CubeControl loading");

		loadListeners();
		

		log.info("CubeControl enabled");
	}


	@Override
	public void onDisable()
	{
		log.info("CubeControl disabled");
	}
	
	private void loadListeners()
	{
		getServer().getPluginManager().registerEvents(new BlockProtector(),
				this);
		getServer().getPluginManager().registerEvents(new BedProtector(),
				this);
	}
}