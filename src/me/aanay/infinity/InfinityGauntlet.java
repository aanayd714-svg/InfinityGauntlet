package me.aanay.infinity;

import org.bukkit.plugin.java.JavaPlugin;

public class InfinityGauntlet extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gauntlet").setExecutor(new GauntletCommand());
        getServer().getPluginManager().registerEvents(new GauntletGUI(), this);
        getLogger().info("Infinity Gauntlet Enabled!");
    }
}
