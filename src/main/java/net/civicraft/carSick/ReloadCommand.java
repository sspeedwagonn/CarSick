package net.civicraft.carSick;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ReloadCommand implements CommandExecutor {
    CarSick instance = CarSick.getInstance();
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (commandSender instanceof Player player && player.hasPermission("carsick.reload")) {
            instance.reloadConfig();
            player.sendMessage(Component.text("[CarSick] Reloaded config!").color(NamedTextColor.GREEN));
        }
        return false;
    }
}
