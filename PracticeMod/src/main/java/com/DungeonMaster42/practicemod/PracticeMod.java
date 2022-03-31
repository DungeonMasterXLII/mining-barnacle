package com.DungeonMaster42.practicemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("practicemod")
public class PracticeMod {
	
	public PracticeMod() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
