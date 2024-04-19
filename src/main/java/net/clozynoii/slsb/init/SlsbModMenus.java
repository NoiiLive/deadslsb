
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.clozynoii.slsb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.clozynoii.slsb.world.inventory.HunterInfoMenuMenu;
import net.clozynoii.slsb.SlsbMod;

public class SlsbModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SlsbMod.MODID);
	public static final RegistryObject<MenuType<HunterInfoMenuMenu>> HUNTER_INFO_MENU = REGISTRY.register("hunter_info_menu", () -> IForgeMenuType.create(HunterInfoMenuMenu::new));
}
