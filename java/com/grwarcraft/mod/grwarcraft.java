package com.grwarcraft.mod;

import com.grwarcraft.mod.blocks.CopperOre;
import com.grwarcraft.mod.blocks.Ore1;
import com.grwarcraft.mod.items.GRItems;
import com.grwarcraft.mod.items.testSword;
import com.grwarcraft.mod.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid = grwarcraft.modid, version = grwarcraft.version)
public class grwarcraft {
	
	public static final String modid = "grwarcraft";
	public static final String version = "1.0";
	
	public static CreativeTabs g1rwarcraft;
	
	public static ToolMaterial testMaterial = EnumHelper.addToolMaterial("testMaterial", 0, 750, 3.0F, 1.0F, 10);
	
	
	public static Item itemCopperIngot;
	public static Item itemAntlers1;
	public static Item itemclothscraps1;
	public static Item itemclothscraps2;
	public static Item itemclothbolt1;
	public static Item itemclothbolt2;
	public static Item itemclothbolt3;
	public static Item itemHide1;
	public static Item itemHide2;
	public static Item itemspoolofthread1;
	public static Item itemspoolofthread2;
	public static Item itemFang1;
	public static Item itemhorn1;
	public static Item itemhorn2;
	public static Item itemtooth1;
	public static Item itemtooth2;
	public static Item itemteeth1;
	public static Item itemrawore1;
	public static Item itemrawore2;
	public static Item itemrawore3;
	
	public static Item itemtestSword;
	
	
	public static Block oreCopperOre;
	public static Block Ore1;
	public static Block Ore2;
	
	
	@SidedProxy(clientSide = "com.grwarcraft.mod.proxy.ClientProxy", serverSide = "com.grwarcraft.mod.proxy.CommonProxy")
	public static CommonProxy grwarcraftProxy;
	
	
	
	@EventHandler
	public void PreInit(FMLInitializationEvent preEvent){
		
		g1rwarcraft = new CreativeTabs("grwarcraft"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(grwarcraft.oreCopperOre);
			}
		};
		
		itemCopperIngot = new GRItems().setUnlocalizedName("CopperIngot");
		GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
		
		itemAntlers1 = new GRItems().setUnlocalizedName("Antlers1");
		GameRegistry.registerItem(itemAntlers1, "Antlers1");
		
		itemclothscraps1 = new GRItems().setUnlocalizedName("clothscraps1");
		GameRegistry.registerItem(itemclothscraps1, "clothscraps1");
		
		itemclothscraps2 = new GRItems().setUnlocalizedName("clothscraps2");
		GameRegistry.registerItem(itemclothscraps2, "clothscraps2");
		
		itemclothbolt1 = new GRItems().setUnlocalizedName("clothbolt1");
		GameRegistry.registerItem(itemclothbolt1, "clothbolt1");
		
		itemclothbolt2 = new GRItems().setUnlocalizedName("clothbolt2");
		GameRegistry.registerItem(itemclothbolt2, "clothbolt2");
		
		itemclothbolt3 = new GRItems().setUnlocalizedName("clothbolt3");
		GameRegistry.registerItem(itemclothbolt3, "clothbolt3");
		
		itemHide1 = new GRItems().setUnlocalizedName("Hide1");
		GameRegistry.registerItem(itemHide1, "Hide1");
		
		itemHide2 = new GRItems().setUnlocalizedName("Hide2");
		GameRegistry.registerItem(itemHide2, "Hide2");
		
		itemspoolofthread1 = new GRItems().setUnlocalizedName("spoolofthread1");
		GameRegistry.registerItem(itemspoolofthread1, "spoolofthread1");
		
		itemspoolofthread2 = new GRItems().setUnlocalizedName("spoolofthread2");
		GameRegistry.registerItem(itemspoolofthread2, "spoolofthread2");
		
		itemFang1 = new GRItems().setUnlocalizedName("Fang1");
		GameRegistry.registerItem(itemFang1, "Fang1");
		
		itemhorn1 = new GRItems().setUnlocalizedName("horn1");
		GameRegistry.registerItem(itemhorn1, "horn1");
		
		itemhorn2 = new GRItems().setUnlocalizedName("horn2");
		GameRegistry.registerItem(itemhorn2, "horn2");
		
		itemtooth1 = new GRItems().setUnlocalizedName("tooth1");
		GameRegistry.registerItem(itemtooth1, "tooth1");
		
		itemtooth2 = new GRItems().setUnlocalizedName("tooth2");
		GameRegistry.registerItem(itemtooth2, "tooth2");
		
		itemteeth1 = new GRItems().setUnlocalizedName("teeth1");
		GameRegistry.registerItem(itemteeth1, "teeth1");
		
		itemrawore1 = new GRItems().setUnlocalizedName("rawore1");
		GameRegistry.registerItem(itemrawore1, "rawore1");
		
		itemrawore2 = new GRItems().setUnlocalizedName("rawore2");
		GameRegistry.registerItem(itemrawore2, "rawore2");
		
		itemrawore3 = new GRItems().setUnlocalizedName("rawore3");
		GameRegistry.registerItem(itemrawore3, "rawore3");
		
		
		//swords
		
		itemtestSword = new testSword(testMaterial).setUnlocalizedName("testSword");
		GameRegistry.registerItem(itemtestSword, "testSword");
		
		
		
		//Blocks
		oreCopperOre = new CopperOre(Material.rock).setBlockName("CopperOre");
		GameRegistry.registerBlock(oreCopperOre, "CopperOre");
		
		Ore1 = new Ore1(Material.rock).setBlockName("Ore1");
		GameRegistry.registerBlock(Ore1, "Ore1");
		
		Ore2 = new Ore1(Material.rock).setBlockName("Ore2");
		GameRegistry.registerBlock(Ore2, "Ore2");
		
		
		//Renderers
		grwarcraftProxy.registerRenderThings();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postevent){
		
	}
}
