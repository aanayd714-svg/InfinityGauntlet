package me.aanay.infinity;

import org.bukkit.*;
import org.bukkit.entity.*;

public class PowerStone {

    public static void use(Player p) {

        for (Entity e : p.getNearbyEntities(5,5,5)) {
            if (e instanceof LivingEntity) {
                ((LivingEntity)e).damage(10);
            }
        }

        p.getWorld().strikeLightning(p.getLocation());
        p.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, p.getLocation(), 5);
    }
}
