package me.ignlamp.staffplugin.Commands.Staff.Teleport;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TeleportHereCommand {
    @Command(name = "", desc = "Allows you to teleport a player to you", usage = "[<player>]")
    @Require("staffplugin.teleporthere")
        public void onTeleport(@Sender Player executer, Player target) {

        target.teleport(executer);
        target.sendMessage(ChatColor.GREEN + "You have been teleported to " + ChatColor.WHITE + executer.getName());
        executer.sendMessage(ChatColor.GREEN + "You have teleported " + ChatColor.WHITE + target.getName() + ChatColor.GREEN + "to you!");
    }
}
