package me.dkavila.dynamicprotection.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlacedBlockListener {
    public static boolean placedBlockEvent (BlockPlaceEvent blockPlaceEvent){
        boolean cancel = true;
        if(blockPlaceEvent.getPlayer().hasPermission("dynamicbuilder") || blockPlaceEvent.getPlayer().isOp()){
            cancel = false;
        } else {
            World world = blockPlaceEvent.getBlock().getWorld();
            for(int height = 1; height < 5; height++){
                Location blockLocation = blockPlaceEvent.getBlock().getLocation();
                Block belowBlock = world.getBlockAt(
                        blockLocation.getBlockX(),
                        blockLocation.getBlockY() - height,
                        blockLocation.getBlockZ());
                if(belowBlock.getType().equals(Material.NETHERITE_BLOCK)){
                    cancel = false;
                    break;
                }
            }
        }
        blockPlaceEvent.setCancelled(cancel);
        return cancel;
    }

}
