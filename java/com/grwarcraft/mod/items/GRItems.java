package com.grwarcraft.mod.items;

import com.grwarcraft.mod.grwarcraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GRItems extends Item{
	
	public GRItems(){
		this.setCreativeTab(grwarcraft.g1rwarcraft);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(grwarcraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
