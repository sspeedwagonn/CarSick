package net.civicraft.carSick;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CarSick extends JavaPlugin {
    static CarSick instance;

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new VehicleExit(), this);
        Objects.requireNonNull(getCommand("carsick")).setExecutor(new ReloadCommand());
    }

    public static CarSick getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
