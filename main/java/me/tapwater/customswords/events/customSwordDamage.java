package me.tapwater.customswords.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Objects;


public class customSwordDamage implements Listener {

    @EventHandler
    public void onSwordHit(EntityDamageByEntityEvent event) {

        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            int slot = player.getInventory().getHeldItemSlot();
            if (player.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
            } else if (Objects.requireNonNull(player.getInventory().getItem(slot)).getType().equals(Material.IRON_SWORD)) {
                String item = player.getInventory().getItem(slot).getItemMeta().getDisplayName();
                if (item.contains(ChatColor.GOLD + "Blade of Infinity")) {
                    Entity entity = event.getEntity();
                    if (entity instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity) entity;
                        Double health = livingEntity.getHealth();
                        event.setDamage(health * health);
                        System.out.println(health);
                    }

                }
            }
        }
    }
}
