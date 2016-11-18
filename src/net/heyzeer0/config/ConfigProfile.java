package net.heyzeer0.config;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public class ConfigProfile {
	
	String nome;
	String pasta;
	
    File config_file;
    YamlConfiguration config;
    
    JavaPlugin pl;
    
    boolean loaded = false;
	
	public ConfigProfile(String nome, String pasta, JavaPlugin pm) {
		this.nome = nome;
		this.pasta = pasta;
		
		pl = pm;
	}
	
	public YamlConfiguration getConfig() {
		return config;
	}
	
	public ConfigProfile loadConfig() {
		
		if(!new File(pl.getDataFolder()).exists()) {
			new File(pl.getDataFolder()).mkdir();
		}
		
		if(pasta == null) {
			config_file = new File(pl.getDataFolder(), nome + ".yml");
		}else{
			
			if(!new File(pl.getDataFolder() + File.separator + pasta).exists()) {
				new File(pl.getDataFolder() + File.separator + pasta).mkdir();
			}
			
			config_file = new File(pl.getDataFolder() + File.separator + pasta, nome + ".yml");
		}
		
		if(!config_file.exists()) {
			try {
				config_file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		config = YamlConfiguration.loadConfiguration(config_file);
		loaded = true;
		
		return this;
	}
	
	public void saveConfig() {
		try {
			config.save(config_file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
