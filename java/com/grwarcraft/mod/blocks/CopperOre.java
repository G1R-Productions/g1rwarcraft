package com.grwarcraft.mod.blocks;

import java.util.Random;

import com.grwarcraft.mod.grwarcraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class CopperOre extends Block {

	public CopperOre(Material material) {
		super(material);
		
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(grwarcraft.g1rwarcraft);
	}

	public Item getItemDropped(int i, Random random, int j) {
		return this == grwarcraft.oreCopperOre ? grwarcraft.itemCopperIngot : Item.getItemFromBlock(this);
		
	}
	public int quantityDropped(Random random) {
		return this == grwarcraft.oreCopperOre ? 1 + random.nextInt(2) : 1;
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(grwarcraft.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}
	
}
