package com.github.mori01231.theslowlifecore.Commands;

import com.github.mori01231.theslowlifecore.TheSlowLifeCore;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class VoteCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&3Japan Minecraft Servers投票リンク: &f&l" + TheSlowLifeCore.getInstance().getConfig().getString("vote-url-jms") ));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&3Monocraft投票リンク: &f&l" + TheSlowLifeCore.getInstance().getConfig().getString("vote-url-monocraft") ));

        return true;
    }
}
