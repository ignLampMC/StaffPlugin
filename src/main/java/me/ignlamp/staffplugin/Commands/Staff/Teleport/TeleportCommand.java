package me.ignlamp.staffplugin.Commands.Staff.Teleport;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.OptArg;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TeleportCommand {
    @Command(name = "", desc = "Teleport to a player", usage = "[<player>]")
    @Require("staffplugin.teleport")
        public static void onTeleport(@Sender Player player, @OptArg() Player target) {
            player.sendMessage(ChatColor.YELLOW + "Teleporting to " + target.getName() + ".");
            player.teleport(target);
    }

}
