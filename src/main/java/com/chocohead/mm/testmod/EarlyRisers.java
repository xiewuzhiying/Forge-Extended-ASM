package com.chocohead.mm.testmod;

import com.chocohead.mm.Asm;
import com.chocohead.mm.api.ClassTinkerers;
import com.chocohead.mm.api.EnumAdder;

@Asm
public class EarlyRisers implements Runnable{

	@Override
	public void run() {
		EnumAdder enumAdder = ClassTinkerers.enumBuilder("net.minecraft.class_1959$class_1961", String.class);
		enumAdder.addEnum("UNDERGROUND", () -> new Object[] { "UNDERGROUND" });
		enumAdder.build();
	}

}
