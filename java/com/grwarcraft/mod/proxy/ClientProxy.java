package com.grwarcraft.mod.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.grwarcraft.mod.grwarcraft;
import com.grwarcraft.mod.model.Armor1;
import com.grwarcraft.mod.renderer.ItemRenderOre1;
import com.grwarcraft.mod.renderer.ItemRenderOre2;
import com.grwarcraft.mod.renderer.ItemRenderOre3;
import com.grwarcraft.mod.renderer.RenderOre1;
import com.grwarcraft.mod.renderer.RenderOre2;
import com.grwarcraft.mod.renderer.RenderOre3;
import com.grwarcraft.mod.tileentity.TileEntityOre1;
import com.grwarcraft.mod.tileentity.TileEntityOre2;
import com.grwarcraft.mod.tileentity.TileEntityOre3;

import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy {
	
	public ModelBiped getArmorModel(int armor1){ return null; 
	
	private static final Armor1 armorChest1 = new Armor1(1.0f);
	private static final Armor1 armorLegs1 = new Armor1(0.5f);
	
	 
	ModelBiped Armor1(int id){
	 switch (id) {
	 case 0:
	 return armorChest1;
	 case 1:
	 return armorLegs1;
	 default:
	 break;
	 
	 }
	
	 return armorChest1; //default, if whenever you should have passed on a wrong id

	 }

	 	}
	
	public void registerRenderThings() {
		//Ore1
		TileEntitySpecialRenderer render = new RenderOre1();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOre1.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(grwarcraft.Ore1), new ItemRenderOre1(render, new TileEntityOre1()));
		
		//Ore2
		TileEntitySpecialRenderer render1 = new RenderOre2();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOre2.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(grwarcraft.Ore2), new ItemRenderOre2(render1, new TileEntityOre2()));
		
		//Ore3
		TileEntitySpecialRenderer render2 = new RenderOre3();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOre3.class, render2);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(grwarcraft.Ore3), new ItemRenderOre3(render2, new TileEntityOre3()));
		
		
	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}

}
