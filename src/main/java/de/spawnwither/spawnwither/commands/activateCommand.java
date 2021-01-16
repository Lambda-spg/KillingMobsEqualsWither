package de.spawnwither.spawnwither.commands;

import de.spawnwither.spawnwither.SpawnWither;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class activateCommand implements CommandExecutor {
    SpawnWither plugin;

    public activateCommand(SpawnWither plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("SpawnWither.activate")){
                if(plugin.active){
                    plugin.active = false;
                    p.sendMessage(ChatColor.AQUA + "Plugin is now deactivated");
                }else {
                    plugin.active = true;
                    p.sendMessage(ChatColor.AQUA + "Plugin is now activated");
                }
            }
        }else{
            sender.sendMessage("Command only for ingame");
        }
        return false;
    }
}
