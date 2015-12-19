package me.tamazaki.suite.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		event.setJoinMessage(null);
		
		player.sendMessage("§6■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		player.sendMessage(" ");
		player.sendMessage("    §7Welcome to §c§l§nScapeMC");
		player.sendMessage(" ");
		player.sendMessage(" §7Network Owners §cTamazaki §7and §ckmohawesome");
		player.sendMessage(" §7Nework Developers §aTamazaki §7and §awebbhead");
		player.sendMessage(" ");
		player.sendMessage(" §6Network Version: §c0.4 Alpha");
		player.sendMessage(" ");
		player.sendMessage("§6■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}

}
