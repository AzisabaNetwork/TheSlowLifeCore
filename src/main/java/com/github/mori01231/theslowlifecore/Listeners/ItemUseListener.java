package com.github.mori01231.theslowlifecore.Listeners;

import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItemUseListener implements Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    public void onItemUsed(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack offHandItem = player.getInventory().getItemInOffHand();

        // flash light
        if(offHandItem.getType() == Material.TORCH || offHandItem.getType() == Material.WOODEN_SWORD){
            try{
                if(offHandItem.hasItemMeta() && offHandItem.getItemMeta().hasDisplayName() && offHandItem.getItemMeta().getDisplayName().equalsIgnoreCase("§cflashlight")){
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,18000,1));
                }
            }catch(Exception e){
                // no display name
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onItemPlaced(BlockPlaceEvent event) {
        Player player = event.getPlayer();

        ItemStack offHandItem = player.getInventory().getItemInOffHand();
        // flash light
        if(offHandItem.getType() == Material.TORCH){
            try{
                if(offHandItem.hasItemMeta() && offHandItem.getItemMeta().hasDisplayName() && offHandItem.getItemMeta().getDisplayName().equalsIgnoreCase("§cflashlight")){
                    if(event.getBlockPlaced().getType() == Material.TORCH){
                        event.setCancelled(true);
                    }
                }
            }catch(Exception e){
                // no display name
            }
        }
    }
}
