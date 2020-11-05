package me.tapwater.customswords;

import me.tapwater.customswords.events.customSwordDamage;
import me.tapwater.customswords.commands.giveSword;
import me.tapwater.customswords.events.theWrathOfZeus;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;


public final class CustomSwords extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new customSwordDamage(), this);
        getServer().getPluginManager().registerEvents(new theWrathOfZeus(), this);
        getCommand("givecustomsword").setExecutor(new giveSword());




    }


}





