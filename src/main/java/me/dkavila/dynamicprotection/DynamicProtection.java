package me.dkavila.dynamicprotection;

import me.dkavila.dynamicprotection.listeners.Listeners;
import org.bukkit.plugin.java.JavaPlugin;

public class DynamicProtection extends JavaPlugin {

    public void onEnable(){
        getLogger().info("DynamicProtection - Initialized");
        saveDefaultConfig();
        saveConfig();
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }
    public void onDisable() {
        getLogger().info("DynamicProtection - Disabling...");
        saveDefaultConfig();
        saveConfig();
    }
}
