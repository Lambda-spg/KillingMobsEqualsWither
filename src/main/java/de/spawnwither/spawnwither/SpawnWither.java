package de.spawnwither.spawnwither;

import de.spawnwither.spawnwither.commands.activateCommand;
import de.spawnwither.spawnwither.listeners.killMobsListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnWither extends JavaPlugin {

    private static SpawnWither plugin;
    public boolean active;

    @Override
    public void onEnable() {
        plugin = this;

        getCommand("activate").setExecutor(new activateCommand(this));
        getServer().getPluginManager().registerEvents(new killMobsListener(this),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SpawnWither getPlugin(){
        return plugin;
    }
}
