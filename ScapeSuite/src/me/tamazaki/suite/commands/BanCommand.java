package me.tamazaki.suite.commands;

import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.tamazaki.suite.Prefixes;

public class BanCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!sender.hasPermission("scape.ban")) {
			sender.sendMessage(Prefixes.PREFIX + "You can't run this command.");
			return true;
		}
		if(args.length < 2) {
			sender.sendMessage(Prefixes.PREFIX + "Invalid Arguments! Usage: /ban <player> <message>");
			return true;
		}
		Player target = Bukkit.getServer().getPlayer(args[0]);
		
		if(target == null) {
			sender.sendMessage(Prefixes.PREFIX + "That player isn't online!");
			return true;
		}
		
		StringBuilder reason = new StringBuilder("");
		
		for (int i = 1; i < args.length; i++) {
			reason.append(args[i]).append(" ");
		}
				
		final String msg = reason.toString().trim();
		final BanList list = Bukkit.getBanList(Type.NAME);
		
		target.kickPlayer("§7You have been banned from §cScapeMC§7:" + "\n" + " " + "\n" + "§7Banned by: §c" + sender.getName() + "\n" + "§7Reason: §f" + msg + "\n" + " " + "§7Appeal at: §f§nscapemcn.enjin.com");
		
		
		return true;
	}

}
