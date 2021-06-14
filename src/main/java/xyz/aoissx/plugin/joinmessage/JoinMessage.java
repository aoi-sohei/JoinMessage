package xyz.aoissx.plugin.joinmessage;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinMessage extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        // Plugin startup logic
        // イベント
        getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e){
        Player p = e.getPlayer();
        String msg = "さんがやってきました！";
        if(p.isOp()){
            e.setJoinMessage(ChatColor.GOLD + p.getName() + ChatColor.WHITE +msg);
        }else {
            e.setJoinMessage(ChatColor.YELLOW + p.getName() + ChatColor.WHITE +msg);
        }
    }
}
