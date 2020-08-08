package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {

	public Commands(main main) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		if(arg3.length >= 1) {
			return false;
		}
		Player p = (Player) sender;
		if(p.isOp()) {
		ItemStack item = p.getInventory().getItemInMainHand();
		p.getInventory().addItem(item);
		}
		return true;
		}
	}
