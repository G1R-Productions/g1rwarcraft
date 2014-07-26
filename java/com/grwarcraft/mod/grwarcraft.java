package com.grwarcraft.mod;

import com.grwarcraft.mod.blocks.CopperOre;
import com.grwarcraft.mod.blocks.Ore1;
import com.grwarcraft.mod.blocks.Ore2;
import com.grwarcraft.mod.blocks.Ore3;
import com.grwarcraft.mod.items.GRItems;
import com.grwarcraft.mod.items.testSword;
import com.grwarcraft.mod.proxy.ClientProxy;
import com.grwarcraft.mod.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
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
	public static final String version = "1.5.0";
	
	public static CreativeTabs g1rwarcraft;
	
	public static ToolMaterial testMaterial = EnumHelper.addToolMaterial("testMaterial", 0, 750, 3.0F, 1.0F, 10);
	//public static ArmorMaterial ArmorMaterial = EnumHelper.addArmorMaterial("ArmorMaterial", 1000, 1.0, 10);
	
	
	
	public static Item itemCopperIngot;
	public static Item itemAntlers1;
	public static Item itemAntlers2;
	public static Item itemclothscraps1;
	public static Item itemclothscraps2;
	public static Item itemclothbolt1;
	public static Item itemclothbolt2;
	public static Item itemclothbolt3;
	public static Item itemHide1;
	public static Item itemHide2;
	public static Item itemHide3;
	public static Item itemHide4;
	public static Item itemHide5;
	public static Item itemHide6;
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
	
	public static Item itemrawore4;
	public static Item itemneedle1;
	public static Item itemneedle2;
	public static Item itemclaw1;
	public static Item itemsand1;
	public static Item itemgravel1;
	public static Item itemhardenedwood1;
	public static Item itemironchainlink1;
	public static Item itemironchainsheet1;
	public static Item itemironarrowhead1;
	public static Item itembonearrowhead1;
	public static Item itemscale1;
	public static Item itemcrystal1;
	public static Item itemcrystal2;
	public static Item itemcrystal3;
	
	public static Item foodmeat1;
	public static Item foodmeat2;
	public static Item foodmeat3;

	
	public static Item itemtestSword;
	
	public static Item armorHelmet1;
	public static Item armorChest1;
	public static Item armorLegs1;
	public static Item armorBoots1;
	
	public static Item item3dtool;
	
	
	
	public static Block oreCopperOre;
	public static Block Ore1;
	public static Block Ore2;
	public static Block Ore3;
	
	
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
		
		itemAntlers2 = new GRItems().setUnlocalizedName("Antlers2");
		GameRegistry.registerItem(itemAntlers2, "Antlers2");
		
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
		
		itemHide3 = new GRItems().setUnlocalizedName("Hide3");
		GameRegistry.registerItem(itemHide3, "Hide3");
		
		itemHide4 = new GRItems().setUnlocalizedName("Hide4");
		GameRegistry.registerItem(itemHide4, "Hide4");
		
		itemHide5 = new GRItems().setUnlocalizedName("Hide5");
		GameRegistry.registerItem(itemHide5, "Hide5");
		
		itemHide6 = new GRItems().setUnlocalizedName("Hide6");
		GameRegistry.registerItem(itemHide6, "Hide6");
		
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
		
		itemrawore4 = new GRItems().setUnlocalizedName("rawore4");
		GameRegistry.registerItem(itemrawore4, "rawore4");
		
		itemneedle1 = new GRItems().setUnlocalizedName("needle1");
		GameRegistry.registerItem(itemneedle1, "needle1");
   
		itemneedle2 = new GRItems().setUnlocalizedName("needle2");
		GameRegistry.registerItem(itemneedle2, "needle2");

        itemclaw1 = new GRItems().setUnlocalizedName("claw1");
		GameRegistry.registerItem(itemclaw1, "claw1");

		itemgravel1 = new GRItems().setUnlocalizedName("gravel1");
		GameRegistry.registerItem(itemgravel1, "gravel1");
  
		itemsand1 = new GRItems().setUnlocalizedName("sand1");
		GameRegistry.registerItem(itemsand1, "sand1");

		itemhardenedwood1 = new GRItems().setUnlocalizedName("hardenedwood1");
		GameRegistry.registerItem(itemhardenedwood1, "hardenedwood1");

		itemironchainlink1 = new GRItems().setUnlocalizedName("ironchainlink1");
		GameRegistry.registerItem(itemironchainlink1, "ironchainlink1");

		itemironchainsheet1 = new GRItems().setUnlocalizedName("ironchainsheet1");
		GameRegistry.registerItem(itemironchainsheet1, "ironchainsheet1");

		itemironarrowhead1 = new GRItems().setUnlocalizedName("ironarrowhead1");
		GameRegistry.registerItem(itemironarrowhead1, "ironarrowhead1");
   
		itembonearrowhead1 = new GRItems().setUnlocalizedName("bonearrowhead1");
        GameRegistry.registerItem(itembonearrowhead1, "bonearrowhead1");

		itemscale1 = new GRItems().setUnlocalizedName("scale1");
		GameRegistry.registerItem(itemscale1, "scale1");
		
		itemcrystal1 = new GRItems().setUnlocalizedName("crystal1");
		GameRegistry.registerItem(itemcrystal1, "crystal1");
		
		itemcrystal2 = new GRItems().setUnlocalizedName("crystal2");
		GameRegistry.registerItem(itemcrystal2, "crystal2");
		
		itemcrystal3 = new GRItems().setUnlocalizedName("crystal3");
		GameRegistry.registerItem(itemcrystal3, "crystal3");
		
		item3dtool = new GRItems().setUnlocalizedName("3dtool");
		GameRegistry.registerItem(item3dtool, "3dtool");


		foodmeat1 = new ItemFood(6, 0.6F, true).setUnlocalizedName("rawfish1").setTextureName("grwarcraft:rawfish1").setCreativeTab(grwarcraft.g1rwarcraft);
        GameRegistry.registerItem(foodmeat1, "rawfish1");

		foodmeat2 = new ItemFood(6, 0.6F, true).setUnlocalizedName("cookedfish1").setTextureName("grwarcraft:cookedfish1").setCreativeTab(grwarcraft.g1rwarcraft);
		GameRegistry.registerItem(foodmeat2, "cookedfish1");
    
		foodmeat3 = new ItemFood(2, 0.2F, true).setUnlocalizedName("burntfish1").setTextureName("grwarcraft:burntfish1").setCreativeTab(grwarcraft.g1rwarcraft);
		GameRegistry.registerItem(foodmeat3, "burntfish1");
		
		
		//swords
		
		itemtestSword = new testSword(testMaterial).setUnlocalizedName("testSword");
		GameRegistry.registerItem(itemtestSword, "testSword");
		
		//Armor
		
		//helmet = new CustomArmor(8469, EnumArmorMaterial.IRON, 4, 0).setUnlocalizedName("a.iron_helmet");
		//chest = new CustomArmor(8470, EnumArmorMaterial.IRON, 4, 1).setUnlocalizedName("a.iron_chestplate");
		//legs = new CustomArmor(8471, EnumArmorMaterial.IRON, 4, 2).setUnlocalizedName("a.iron_leggings"); 
		//boots = new CustomArmor(8472, EnumArmorMaterial.IRON, 4, 3).setUnlocalizedName("a.iron_boots"); 
		//LanguageRegistry.addName(helmet, "3D Helmet"); LanguageRegistry.addName(chest, "3D Chest"); 
		//LanguageRegistry.addName(legs, "3D Legs"); LanguageRegistry.addName(boots, "3D Boots"); 
		
		
		//Blocks
		oreCopperOre = new CopperOre(Material.rock).setBlockName("CopperOre");
		GameRegistry.registerBlock(oreCopperOre, "CopperOre");
		
		Ore1 = new Ore1(Material.rock).setBlockName("Ore1");
		GameRegistry.registerBlock(Ore1, "Ore1");
		
		Ore2 = new Ore2(Material.rock).setBlockName("Ore2");
		GameRegistry.registerBlock(Ore2, "Ore2");
		
		Ore3 = new Ore3(Material.rock).setBlockName("Ore3");
		GameRegistry.registerBlock(Ore3, "Ore3");
		
		
		//Renderers
		grwarcraftProxy.registerRenderThings();
		grwarcraftProxy.registerItemRenderers();

		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postevent){
		
	}
}
