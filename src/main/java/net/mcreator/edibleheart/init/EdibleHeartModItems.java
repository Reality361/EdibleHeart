
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.edibleheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.edibleheart.item.HeartContainerItem;
import net.mcreator.edibleheart.item.AbsorptionHeartContainerItem;
import net.mcreator.edibleheart.EdibleHeartMod;

public class EdibleHeartModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EdibleHeartMod.MODID);
	public static final RegistryObject<Item> HEART_CONTAINER = REGISTRY.register("heart_container", () -> new HeartContainerItem());
	public static final RegistryObject<Item> ABSORPTION_HEART_CONTAINER = REGISTRY.register("absorption_heart_container", () -> new AbsorptionHeartContainerItem());
	// Start of user code block custom items
	// End of user code block custom items
}
