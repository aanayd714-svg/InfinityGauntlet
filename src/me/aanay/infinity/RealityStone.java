package me.aanay.infinity;

import org.bukkit.*;
import org.bukkit.entity.Player;

public class RealityStone {

    public static void use(Player p) {

        p.getWorld().setTime(18000);

        p.getWorld().spawnParticle(Particle.SPELL_WITCH, p.getLocation(), 100);
        p.getWorld().playSound(p.getLocation(), Sound.ENTITY_WITHER_SPAWN, 1, 1);
    }
}
