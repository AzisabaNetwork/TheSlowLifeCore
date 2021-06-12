package com.github.mori01231.theslowlifecore;

import com.github.mori01231.theslowlifecore.Commands.*;
import com.github.mori01231.theslowlifecore.Listeners.ItemUseListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheSlowLifeCore extends JavaPlugin {

    private static TheSlowLifeCore instance;

    public TheSlowLifeCore (){
        instance = this;
    }

    public static TheSlowLifeCore getInstance() {
        return instance;
    }


    @Override
    public void onEnable() {
        getLogger().info("TheSlowLifeCore has been enabled.");
        this.getCommand("wiki").setExecutor(new WikiCommandExecutor());
        this.getCommand("website").setExecutor(new WebsiteCommandExecutor());
        this.getCommand("tutorial").setExecutor(new TutorialCommandExecutor());
        this.getCommand("sara").setExecutor(new SaraCommandExecutor());
        this.getCommand("trash").setExecutor(new TrashCommandExecutor());
        this.getCommand("kiai").setExecutor(new KiaiCommandExecutor());
        this.getCommand("voteurl").setExecutor(new VoteCommandExecutor());

        registerEvents();
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("TheSlowLifeCore has been disabled.");
    }

    public void registerEvents(){

        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new ItemUseListener(),  this);
    }
}
