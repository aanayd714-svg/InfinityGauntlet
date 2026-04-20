package me.aanay.infinity;

import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class GauntletCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) return true;
        Player p = (Player) sender;

        // Only admin
        if (!p.isOp()) {
            p.sendMessage("§cOnly admin can use this!");
            return true;
        }

        // Give stones
        if (args.length == 1) {

            if (args[0].equalsIgnoreCase("time")) {
                p.getInventory().addItem(new ItemStack(Material.CLOCK));
            }

            if (args[0].equalsIgnoreCase("space")) {
                p.getInventory().addItem(new ItemStack(Material.ENDER_PEARL));
            }

            if (args[0].equalsIgnoreCase("power")) {
                p.getInventory().addItem(new ItemStack(Material.NETHER_STAR));
            }

            if (args[0].equalsIgnoreCase("reality")) {
                p.getInventory().addItem(new ItemStack(Material.AMETHYST_SHARD));
            }

            p.sendMessage("§aStone given!");
            return true;
        }

        // Open GUI
        GauntletGUI.open(p);
        return true;
    }
        }
