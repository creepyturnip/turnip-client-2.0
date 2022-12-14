package net.meowmeow.meooooooooooooow;
import net.fabricmc.api.ModInitializer;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Meow implements ModInitializer {

	public static final Meow INSTANCE = new Meow();
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}

	public void onKeyPress(int key, int action) {
		if (action == GLFW.GLFW_PRESS) System.out.println("key " + key + " was pressed");
	}
	public void onTick() {
	}
}