package com.grwarcraft.mod.items;

import com.grwarcraft.mod.grwarcraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class testSword extends ItemSword {

	public testSword(ToolMaterial arg0) {
		super(arg0);
		this.setCreativeTab(grwarcraft.g1rwarcraft);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(grwarcraft.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}
}
