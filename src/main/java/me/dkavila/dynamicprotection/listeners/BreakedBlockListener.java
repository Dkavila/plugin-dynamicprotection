package me.dkavila.dynamicprotection.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakedBlockListener {
    public static boolean breakedBlockEvent (BlockBreakEvent blockBreakEvent){
        boolean cancel = true;
        if(blockBreakEvent.getPlayer().hasPermission("dynamicbuilder") || blockBreakEvent.getPlayer().isOp()){
            cancel = false;
        } else {
            World world = blockBreakEvent.getBlock().getWorld();
            for(int height = 1; height < 5; height++){
                Location blockLocation = blockBreakEvent.getBlock().getLocation();
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
        blockBreakEvent.setCancelled(cancel);
        return cancel;
    }
}
