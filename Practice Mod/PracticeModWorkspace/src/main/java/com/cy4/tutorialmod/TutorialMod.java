package com.cy4.tutorialmod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("tutorialmod")
public class TutorialMod {
	
	public static final String MOD_ID = "tutorialmod";
	
	public static final CreativeModeTab TUTORIAL_TAB = new CreativeMode
	
	public TutorialMod() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}