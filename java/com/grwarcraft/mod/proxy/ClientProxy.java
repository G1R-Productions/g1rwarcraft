package com.grwarcraft.mod.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.grwarcraft.mod.grwarcraft;
import com.grwarcraft.mod.renderer.ItemRenderOre1;
import com.grwarcraft.mod.renderer.ItemRenderOre2;
import com.grwarcraft.mod.renderer.RenderOre1;
import com.grwarcraft.mod.renderer.RenderOre2;
import com.grwarcraft.mod.tileentity.TileEntityOre1;

import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy {
	
	public void registerRenderThings() {
		//Ore1
		TileEntitySpecialRenderer render = new RenderOre1();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOre1.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(grwarcraft.Ore1), new ItemRenderOre1(render, new TileEntityOre1()));
		
		//Ore2
		TileEntitySpecialRenderer render1 = new RenderOre2();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOre1.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(grwarcraft.Ore2), new ItemRenderOre2(render1, new TileEntityOre1()));
	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}

}
