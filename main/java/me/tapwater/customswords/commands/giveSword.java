package me.tapwater.customswords.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class giveSword implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length != 0) {
                if (args[0].length() > 0) {
                    if (args[0].equals("BLADE_OF_INFINITY")) {
                        ItemStack BOI = new ItemStack(Material.IRON_SWORD);
                        ItemMeta meta = BOI.getItemMeta();
                        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "I " + ChatColor.RESET + ChatColor.GOLD + "Blade of Infinity" + ChatColor.MAGIC + " I");
                        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                        ArrayList<String> lore = new ArrayList<>();
                        lore.add(ChatColor.GRAY + "Damage: " + ChatColor.RED + "∞");
                        meta.setLore(lore);
                        BOI.setItemMeta(meta);
                        if (player.getInventory().firstEmpty() > 0 || player.getInventory().getSize() >= 0) {
                            player.getInventory().addItem(BOI);
                        }
                    }
                    if (args[0].equals("THE_WRATH_OF_ZEUS")) {
                        ItemStack WOZ = new ItemStack(Material.TRIDENT);
                        ItemMeta meta = WOZ.getItemMeta();
                        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.MAGIC + "I " + ChatColor.RESET + ChatColor.GOLD + "The Wrath of Zeus" + ChatColor.MAGIC + " I");
                        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, false);
                        ArrayList<String> lore = new ArrayList<>();
                        lore.add(ChatColor.GRAY + "Damage: " + ChatColor.RED + "∞");
                        meta.setLore(lore);
                        WOZ.setItemMeta(meta);
                        if (player.getInventory().firstEmpty() > 0 || player.getInventory().getSize() >= 0) {
                            player.getInventory().addItem(WOZ);
                        }

                    }
                }
            } else {
            }
        }
        return false;
    }
}
