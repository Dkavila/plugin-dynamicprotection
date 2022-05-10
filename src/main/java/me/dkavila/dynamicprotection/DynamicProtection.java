package me.dkavila.dynamicprotection;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DynamicProtection extends JavaPlugin {

    public void onEnable(){
        getLogger().info("DynamicProtection - Initialized");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("dynamicprotection")) {
            getLogger().info("Sender:" + sender);
            getLogger().info("Player:" + (Player)sender );
            getLogger().info("Command:" + command);
            getLogger().info("Label:" + label);
            getLogger().info("Args:" + args);
        }
        return true;
    }

}
