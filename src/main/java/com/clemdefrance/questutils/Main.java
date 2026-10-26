package com.clemdefrance.questutils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Loading QuestUtils! ");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Disabling QuestUtils! ");

    }
}
