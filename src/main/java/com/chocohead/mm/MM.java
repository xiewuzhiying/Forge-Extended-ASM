/*
 * Copyright 2019 Chocohead
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.chocohead.mm;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod("forgeextendedasm")
public class MM {
	public static final Logger LOGGER = LogManager.getLogger();

	public static final List<Runnable> MM_REGISTRY = new ArrayList<Runnable>();

	public MM() {
		LOGGER.info("Definitely not up to no good");
	}
}
