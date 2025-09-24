package me.HolyMakkaroni79.candyPlugin.loot;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class LootTable implements Listener {
    @EventHandler
    public void onMobDeath(EntityDeathEvent event){
        if(event.getEntity().getLastDamageCause() == null || !(event.getEntity().getLastDamageCause().getEntity() instanceof Player)){
            Bukkit.broadcastMessage("kein plan why aber n entity ist tot");
            //return;
        }

        if(event.getEntity().getKiller() instanceof Player){
            Random random = new Random();
            Bukkit.broadcastMessage("Achso du warst des");
            var chance = random.nextDouble();
            if(chance >= 0.5){
                Bukkit.broadcastMessage("joa irgendwie hast du dep es jetzt geschaft n zufalls gen zu baun. Frag mich bitte nicht wie du es geschaft hast");

            }
        }
    }
}
