package com.chocohead.forgeextendedasm.forge;

import com.chocohead.forgeextendedasm.MM;

import net.minecraftforge.fml.common.Mod;

@Mod("forgeextendedasm")
public class MMForgeMod {

	public MMForgeMod() {
		MM.LOGGER.info("MM is loading as regular mod. If you are in a development env do not worry.");
	}

}
