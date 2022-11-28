package me.ignlamp.staffplugin.Commands.Staff.other;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Require;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ClearChatCommand {

    @Command(name = "", desc = "Clear's the chat!")
    @Require("staffplugin.clearchat")
        public void ClearChat() {

            for (Player online : Bukkit.getServer().getOnlinePlayers()) {
                if (!online.hasPermission("staffplugin.clearchat.bypass")) {
                    for (int i = 0; i < 200; i++)
                        online.sendMessage(" ");

                    online.sendMessage(ChatColor.RED + "Chat has been cleared by a staff member!");
                } else
                    online.sendMessage(ChatColor.GREEN + "Chat has been cleared by a staff member! (Since you are staff, you're immune)");
            }

    }



}
