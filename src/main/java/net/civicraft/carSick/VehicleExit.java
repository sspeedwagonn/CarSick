package net.civicraft.carSick;

import nl.sbdeveloper.vehiclesplus.api.events.impl.VehicleLeaveEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;
import java.util.Random;

public class VehicleExit implements Listener {
    static CarSick instance = CarSick.getInstance();
    private final Random random = new Random();

    @EventHandler
    public void exitVehicle(VehicleLeaveEvent event) {
        Player player = event.getPlayer();
        List<String> excluded = instance.getConfig().getStringList("excluded-worlds");
        if (excluded.contains(player.getWorld().getName())) return;

        int ticks = instance.getConfig().getInt("time") * 20;
        int chance = instance.getConfig().getInt("chance");

        if (random.nextInt(100) <= chance) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, ticks + 80, 0));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, ticks, 0));
        }
    }
}
