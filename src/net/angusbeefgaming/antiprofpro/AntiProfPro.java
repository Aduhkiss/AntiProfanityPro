package net.angusbeefgaming.antiprofpro;

import org.bukkit.plugin.java.JavaPlugin;

public class AntiProfPro extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("NoCursePro Has Been Enabled!");
        // Setup the Event Listener
        getServer().getPluginManager().registerEvents(new onCurseWord(), this);
    }
    @Override
    public void onDisable() {
        getLogger().warning("WARNING! APP HAS BEEN DISABLED!  BOT WILL NO LONGER PROTECT CHAT!");
    }
}
