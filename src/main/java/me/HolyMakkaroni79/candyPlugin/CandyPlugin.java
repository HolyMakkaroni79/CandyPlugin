package me.HolyMakkaroni79.candyPlugin;

import me.HolyMakkaroni79.candyPlugin.loot.LootTable;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CandyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new LootTable(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
