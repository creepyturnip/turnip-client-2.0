package net.meowmeow.meooooooooooooow.movement;

import net.meowmeow.meooooooooooooow.meows.Mod;
import org.lwjgl.glfw.GLFW;

public class Flight extends Mod {

    public Flight() {
        super("Flight", "Makes you fly :D", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_N);
    }

    @Override
    public void onTick() {
        MC.player.getAbilities().allowFlying = true;
        System.out.println("FLYING");
        super.onTick();
    }

    @Override
    public void onDisable() {
        MC.player.getAbilities().allowFlying = false;
        System.out.println("flying disabled :(");
        super.onDisable();
    }
}
