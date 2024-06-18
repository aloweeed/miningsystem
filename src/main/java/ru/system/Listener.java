package ru.system;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler
    public void clickOn(PlayerInteractEvent inter) {
        Block block = inter.getClickedBlock();
        Location click = inter.getInteractionPoint();
        Player player = inter.getPlayer();
    }
}
