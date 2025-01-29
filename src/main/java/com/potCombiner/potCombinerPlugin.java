package com.potCombiner;

import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Pot Combiner",
	description = "Automatically combines 1,2, and 3 dose potions into 4-dose potions",
	tags = {"potions", "combat"}
)

public class potCombinerPlugin extends Plugin {

}