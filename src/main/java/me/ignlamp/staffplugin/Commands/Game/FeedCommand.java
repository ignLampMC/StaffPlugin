package me.ignlamp.staffplugin.Commands.Game;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.OptArg;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class FeedCommand {
    @Command(name = "", desc = "Feed yourself or others")
    @Require("staffplugin.feed")
        public void onFeed(@Sender Player player, @OptArg Player target) {

            if (target == null)
                target = player;

            player.sendMessage(ChatColor.GOLD + "You have given full hunger to " + target.getName());
            player.setFoodLevel(20);
            player.setSaturation(20);
            if (target != player) {
                target.sendMessage(ChatColor.GOLD + "You now have full hunger.");
            }
    }
}
