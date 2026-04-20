package me.aanay.infinity;

import org.bukkit.*;
import org.bukkit.entity.Player;

public class SpaceStone {

    public static void use(Player p) {

        Location loc = p.getLocation().add(10,0,0);
        p.teleport(loc);

        p.getWorld().spawnParticle(Particle.END_ROD, loc, 100);
        p.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
    }
}
