package net.meowmeow.meooooooooooooow;
import net.fabricmc.api.ModInitializer;
import net.meowmeow.meooooooooooooow.meows.ModuleManager;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.meowmeow.meooooooooooooow.meows.Mod;

public class Meow implements ModInitializer {

	public static final Meow INSTANCE = new Meow();
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	private MinecraftClient MC = MinecraftClient.getInstance();

	@Override
	public void onInitialize() {
		LOGGER.info("well something works!");
	}

	public void onKeyPress(int key, int action) {
		if (action == GLFW.GLFW_PRESS) {
            for (Mod module : ModuleManager.INSTANCE.GetEnabledModules()) {
				if (key == module.getKey()) module.toggle();
            }
        }
	}
	public void onTick() {
		if(MC.player != null) {
			for (Mod module : ModuleManager.INSTANCE.GetEnabledModules()) {
				module.onTick();
			}
		}
	}
}
