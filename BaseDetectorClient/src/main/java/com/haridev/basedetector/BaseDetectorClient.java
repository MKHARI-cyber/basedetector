package com.haridev.basedetector;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
public class BaseDetectorClient implements ClientModInitializer {
 public static boolean enabled=true; private KeyBinding toggle;
 public void onInitializeClient(){
  toggle=KeyBindingHelper.registerKeyBinding(new KeyBinding("key.basedetector.toggle",InputUtil.Type.KEYSYM,GLFW.GLFW_KEY_B,"key.categories.basedetector"));
  ClientTickEvents.END_CLIENT_TICK.register(c->{while(toggle.wasPressed()) enabled=!enabled;});
 }
}
