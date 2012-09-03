package net.cloudapp.mcminecraftwest.bukkit.mccartspeed;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: MangaAddict
 * Date: 9/2/12
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class McCartSpeed extends JavaPlugin {

	public McCartSpeed() {

	}

	@Override
	public void onEnable(){
		getLogger().info("McCartSpeed enabled");
	}

	@Override
	public void onDisable(){
		getLogger().info("McCartSpeed disabled");
	}
}
