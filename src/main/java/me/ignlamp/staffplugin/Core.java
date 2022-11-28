package me.ignlamp.staffplugin;

import com.jonahseguin.drink.CommandService;
import com.jonahseguin.drink.Drink;
import lombok.Getter;
import me.ignlamp.staffplugin.Commands.Game.FeedCommand;
import me.ignlamp.staffplugin.Commands.Game.HealCommand;
import me.ignlamp.staffplugin.Commands.Staff.FlyCommand;
import me.ignlamp.staffplugin.Commands.Staff.Teleport.TeleportCommand;
import me.ignlamp.staffplugin.Commands.Staff.Teleport.TeleportHereCommand;
import me.ignlamp.staffplugin.Commands.Staff.other.ClearChatCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {
    @Getter private static Core instance;

    @Override
    public void onEnable() {
        // This will be useful later
        instance = this;

        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("&b&StaffPlugin&f has &aenabled&f successfully.");
        Bukkit.getConsoleSender().sendMessage(" &7- &6Author&f: TheyLoveJosh/ignLamp");
        Bukkit.getConsoleSender().sendMessage(" ");

// todo: Make a command manager to clean the main class up a bit
        CommandService drink = Drink.get(this);

        //Teleport Commands
        drink.register(new TeleportCommand(), "tp");
        drink.register(new TeleportHereCommand(), "tphere");

        //Chat Commands
        drink.register(new ClearChatCommand(), "cc", "clearchat");

        //Regular Commands
        drink.register(new FlyCommand(), "fly");
        drink.register(new HealCommand(), "heal");
        drink.register(new FeedCommand(), "feed");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
