package me.tamazaki.suite;

import org.bukkit.plugin.java.JavaPlugin;

import me.tamazaki.suite.commands.banning.BanCommand;
import me.tamazaki.suite.commands.basic.AlertPlayerCommand;
import me.tamazaki.suite.commands.basic.ListCommand;
import me.tamazaki.suite.commands.msg.MessageCommand;
import me.tamazaki.suite.commands.msg.ReplyCommand;
import me.tamazaki.suite.listeners.ChatListener;
import me.tamazaki.suite.listeners.JoinListener;
import me.tamazaki.suite.listeners.PlayerListener;

public class Main extends JavaPlugin {
public static Main plugin;
	
	@Override
	public void onEnable() {
		
		plugin = this;
		
		getServer().getPluginManager().registerEvents(new PlayerListener(), this);
		getServer().getPluginManager().registerEvents(new JoinListener(), this);
		getServer().getPluginManager().registerEvents(new ChatListener(), this);
		
		getCommand("ping").setExecutor(new AlertPlayerCommand());
		getCommand("list").setExecutor(new ListCommand());
		getCommand("ban").setExecutor(new BanCommand());
		getCommand("message").setExecutor(new MessageCommand());
		getCommand("reply").setExecutor(new ReplyCommand());
		
	}
	
	@Override
	public void onDisable() {
		
		plugin = null;
		
	}

}
