package net.cloudapp.mcminecraftwest.bukkit.mccartspeed;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.entity.Minecart;

/**
 * Created with IntelliJ IDEA.
 * User: MangaAddict
 * Date: 9/2/12
 * Time: 11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class MinecartListener implements Listener {

	@EventHandler
	public void onVehicleCreate(VehicleCreateEvent event){
		if(event.getVehicle() instanceof Minecart){
			Minecart cart = (Minecart) event.getVehicle();
			cart.setMaxSpeed(McCartSpeed.getMinecartSpeed());
		}
	}
}
