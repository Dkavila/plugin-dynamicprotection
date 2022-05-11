package me.dkavila.dynamicprotection.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import static me.dkavila.dynamicprotection.listeners.BreakedBlockListener.breakedBlockEvent;
import static me.dkavila.dynamicprotection.listeners.PlacedBlockListener.placedBlockEvent;
public class Listeners implements Listener {

    @EventHandler
    public boolean placeBlockListener (BlockPlaceEvent blockPlaceEvent){
        return placedBlockEvent(blockPlaceEvent);
    }

    @EventHandler
    public boolean breakBlockListener (BlockBreakEvent blockBreakEvent){
        return breakedBlockEvent(blockBreakEvent);
    }

}
