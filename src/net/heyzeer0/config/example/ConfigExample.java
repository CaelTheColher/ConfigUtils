package net.heyzeer0.config.example;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.heyzeer0.config.ConfigProfile;


public class ConfigExample /*extends JavaPlugin*/ {
	
	/*public static ConfigExample main;
	
	
	public void onEnable() {
		main = this;
	}
	
	public void onDisable() {
		
	}
	
	private static HashMap<String, ConfigProfile> config_profiles = new HashMap<String, ConfigProfile>();
	
	public static ConfigProfile getConfigProfile(Player p) {
		if(!config_profiles.containsKey(p.getName())) {
			config_profiles.put(p.getName(), new ConfigProfile(p.getName(), "Profiles", main).loadConfig());
		}
		return config_profiles.get(p.getName());
	}
	
	@EventHandler
	public void entrar(PlayerJoinEvent e) {
		getConfigProfile(e.getPlayer()).getConfig().set("test", true);
	}*/
	

}
