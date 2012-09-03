package net.cloudapp.mcminecraftwest.bukkit.mccartspeed;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: MangaAddict
 * Date: 9/2/12
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class McCartSpeed extends JavaPlugin {

	private static double s_minecartSpeed = 1.0;

	public McCartSpeed() {
	}

	@Override
	public void onEnable(){
		getLogger().info("McCartSpeed enabled");
		this.getServer().getPluginManager().registerEvents(new MinecartListener(), this);
	}

	@Override
	public void onDisable(){
		getLogger().info("McCartSpeed disabled");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
		if(cmd.getName().equalsIgnoreCase("mccart")){
			if(args.length == 2){
				if(args[0].equalsIgnoreCase("set")){
					setMinecartSpeed(Double.parseDouble(args[1]));
					sender.sendMessage("Global Minecart Speed: " + getMinecartSpeed());
					return true;
				}
			} else if (args.length == 1) {
				if(args[0].equalsIgnoreCase("get")){
					sender.sendMessage("Global Minecart Speed: " + getMinecartSpeed());
					return true;
				}
			}
		}
		return false;
	}

	public static double getMinecartSpeed() {
		return s_minecartSpeed;
	}

	public static boolean setMinecartSpeed(double speed){
		if(0 < speed){
			s_minecartSpeed = speed;
			return true;
		}
		return false;
	}
}
