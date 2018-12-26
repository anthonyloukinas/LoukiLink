import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("LoukiLink has been enabled!");
    }

    @Override
    public void onDisable(){
        getLogger().info("LoukiLink has been disabled!");
    }
}
