package me.aanay.infinity;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.*;

public class GauntletGUI implements Listener {

    public static void open(Player p) {
        Inventory gui = Bukkit.createInventory(null, 27, "§5Infinity Gauntlet");

        gui.setItem(10, new ItemStack(Material.CLOCK));
        gui.setItem(12, new ItemStack(Material.NETHER_STAR));
        gui.setItem(14, new ItemStack(Material.ENDER_PEARL));
        gui.setItem(16, new ItemStack(Material.AMETHYST_SHARD));

        p.openInventory(gui);
    }

    @EventHandler
    public void click(InventoryClickEvent e) {

        if (!e.getView().getTitle().equals("§5Infinity Gauntlet")) return;

        e.setCancelled(true);
        Player p = (Player) e.getWhoClicked();

        if (e.getCurrentItem() == null) return;

        Material m = e.getCurrentItem().getType();

        if (m == Material.CLOCK) TimeStone.use(p);
        if (m == Material.ENDER_PEARL) SpaceStone.use(p);
        if (m == Material.NETHER_STAR) PowerStone.use(p);
        if (m == Material.AMETHYST_SHARD) RealityStone.use(p);
    }
            }
