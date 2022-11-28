package me.ignlamp.staffplugin.Commands.Game;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.OptArg;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HealCommand {
    @Command(name = "", desc = "Heal yourself + others")
    @Require("staffplugin.heal")
        public void onHeal(@Sender Player player, @OptArg Player target) {

        if (target == null)
            target = player;

        player.sendMessage(ChatColor.GOLD + "You have full healed " + target.getName());
        target.setHealth(target.getMaxHealth());
        target.setFireTicks(0);
        if (target != player) {
            target.sendMessage(ChatColor.GOLD + "You have been fully healed.");
        }

    }
}
