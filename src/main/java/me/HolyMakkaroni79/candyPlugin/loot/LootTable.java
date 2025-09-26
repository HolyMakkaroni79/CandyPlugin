package me.HolyMakkaroni79.candyPlugin.loot;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

public class LootTable implements Listener {

    public int minVal = 1; //inklusiv
    public int maxVal = 4; //exklusiv
    public double dropChange = 0.2; //chance to drop a candy (for example: 0.5 = 50%) only 10 steps (10%; 20%; 30%)

    ItemStack candy = new ItemStack(Material.COOKIE);
    ItemMeta meta = candy.getItemMeta();
    @EventHandler
    public void onMobDeath(EntityDeathEvent event){

        if(event.getEntity().getKiller() instanceof Player){
            Random random = new Random();
            var chance = random.nextDouble();
            if(chance <= dropChange){
                int randomModelData = random.nextInt(minVal, maxVal);
                meta.setCustomModelData(randomModelData);
                candy.setItemMeta(meta);
                event.getEntity().getKiller().getInventory().addItem(candy);
            }
        }
    }
}
