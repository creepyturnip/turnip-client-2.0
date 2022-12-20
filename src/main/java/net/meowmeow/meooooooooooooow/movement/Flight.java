package net.meowmeow.meooooooooooooow.movement;

import net.meowmeow.meooooooooooooow.MeowClient;
import net.meowmeow.meooooooooooooow.meows.Mod;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;


public class Flight extends Mod {

    public Flight() {
        super("Flight", "Makes you fly :D", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_UP);

    }

    @Override
    public void onTick() {
        if (MC.player!=null && MC.player.hasVehicle()) {
            Entity vehicle = MC.player.getVehicle();
            Vec3d velocity = vehicle.getVelocity();
            double motionY = MC.options.jumpKey.isPressed() ? 0.5 : 0;
            vehicle.setVelocity(new Vec3d(velocity.x, motionY, velocity.z));
        }
    }
}
