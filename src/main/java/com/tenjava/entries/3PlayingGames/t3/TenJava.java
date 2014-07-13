package com.tenjava.entries.p3PlayingGames.t3;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.ChatColor;

public class TenJava extends JavaPlugin {

  @Override
  public void onEnable(){
    //I had no ideas for a plugin so this is the best I could do <3
    ConsoleCommandSender consoleCommandSender = plugin.getServer().getConsoleSender();
    consoleCommandSender.sendMessage(ChatColor.RED + "Potato~");
  }
}
