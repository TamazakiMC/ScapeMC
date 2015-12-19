package me.tamazaki.suite.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import me.tamazaki.suite.Prefixes;


public class PlayerListener implements Listener {
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent event) {
		Player player = event.getPlayer();
		
		if(event.getMessage().startsWith("/icanhasbukkit") || event.getMessage().startsWith("/pl") || event.getMessage().startsWith("/plugins") || event.getMessage().startsWith("/minecraft:") || event.getMessage().startsWith("/say") || event.getMessage().startsWith("?")) {
			event.setCancelled(true);
			player.sendMessage("§6■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			player.sendMessage(" ");
			player.sendMessage(Prefixes.PREFIX + "§oScape Suite §cv0.4 Alpha");
			player.sendMessage("§3Developed by §b§lTamazaki §3and §b§lwebbhead");
			player.sendMessage(" ");
			player.sendMessage("§6■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		} 
	}
}
