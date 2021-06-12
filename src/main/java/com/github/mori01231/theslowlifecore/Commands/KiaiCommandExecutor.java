package com.github.mori01231.theslowlifecore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static org.bukkit.Bukkit.getServer;

public class KiaiCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"Screaaaam!!!"));
        getServer().dispatchCommand(getServer().getConsoleSender(), "minecraft:give Mori01231 torch{display:{Name:'{\"text\":\"flashlight\",\"color\":\"red\"}',Lore:['{\"text\":\"ただの懐中電灯\",\"color\":\"gray\"}','{\"text\":\"オフハンドに懐中電灯をもって\",\"color\":\"dark_green\"}','{\"text\":\"メインに何も持たずに右クリック！\",\"color\":\"dark_green\"}','{\"text\":\"松明設置防止機能付き\",\"color\":\"dark_green\"}']}} 1");

        return true;
    }
}