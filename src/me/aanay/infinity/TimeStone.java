package me.aanay.infinity;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.potion.*;

public class TimeStone {

    public static void use(Player p) {
        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 200, 2));

        p.getWorld().spawnParticle(Particle.PORTAL, p.getLocation(), 100);
        p.getWorld().playSound(p.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1, 1);
    }
}
