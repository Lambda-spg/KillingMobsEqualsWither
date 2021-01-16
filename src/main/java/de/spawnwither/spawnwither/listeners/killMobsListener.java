package de.spawnwither.spawnwither.listeners;

import de.spawnwither.spawnwither.SpawnWither;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class killMobsListener implements Listener {
    SpawnWither plugin;

    public killMobsListener(SpawnWither plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onKill(EntityDeathEvent e){
        if (e.getEntity().getKiller() != null){
            if(plugin.active) {
                Entity Wither = SpawnWither.getPlugin().getServer().getWorld("world").spawnEntity(e.getEntity().getLocation(), EntityType.WITHER);
            }
        }
    }
}
