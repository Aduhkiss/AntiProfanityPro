package net.angusbeefgaming.antiprofpro;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import net.md_5.bungee.api.ChatColor;

/*
 * Anti Profanity Protection Bot
 * 
 * Completly Written by Atticus Zambrana
 * 
 */
public class onCurseWord implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
    	// Here is the list for banned words
    	List<String> bannedWords = Arrays.asList("fuck", "bitch", "nigger", "nigga", "<=3", "dick", "cock", "ass", "asshole", "penis", "pussy", "shit", "fag", "faggot", "bastard", "slut");
        for (String cens: bannedWords) {
            if (event.getMessage().contains(cens)) {
            	if(event.getPlayer().hasPermission("angusbeef.app-bypass")) {
            		return;
            	}
            	else {
                    Player player = event.getPlayer();
                    Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "mute " + player.getName() + " 1h Auto-Muted for 1 Hour by APP Reason: Do NOT Curse on our Server!");
                    player.sendMessage(ChatColor.GOLD + "You Have been caught using Profanity, and have automaticly been muted by APP!");
                    return;
            	}
            }
        }
    }
}
