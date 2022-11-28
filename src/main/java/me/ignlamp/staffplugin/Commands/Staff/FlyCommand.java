package me.ignlamp.staffplugin.Commands.Staff;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.OptArg;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class FlyCommand {

    @Command(name = "", desc = "Fly commnd", usage = "[<player>]")
    @Require("staffplugin.fly")
        public void fly(@Sender Player player, @OptArg() Player target) {

            if (target == null)
                target = player;

            if (target.getAllowFlight()) {
                target.setAllowFlight(false);
                target.setFlying(false);
                target.sendMessage(ChatColor.RED + "Flight mode has been disabled!");

                if (target != player)
                    player.sendMessage(ChatColor.RED + "You have disabled flight mode for " + target.getName());
            } else {
                target.setAllowFlight(true);
                target.setFlying(true);
                target.sendMessage(ChatColor.GREEN + "Flight mode has been enabled!");

                if (target != player)
                    player.sendMessage(ChatColor.GREEN + "You have enabled flight mode for " + target.getName());

            }

    }



}
