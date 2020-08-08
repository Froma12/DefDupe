package main;

import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin{
	public void onEnable() {
		getLogger().info("Dupe plugin is aviable now");
		getCommand("dupe").setExecutor(new Commands(this));
	}
	
	public void onDisable() {
		getLogger().info("Dupe plugin is disabling");
	}
}
