package com.grwarcraft.mod.blocks;

import java.util.Random;

import com.grwarcraft.mod.grwarcraft;
import com.grwarcraft.mod.tileentity.TileEntityOre1;
import com.grwarcraft.mod.tileentity.TileEntityOre2;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Ore2 extends BlockContainer {

	public Ore2(Material material) {
		super(material);

		this.setHardness(2.0F);
		this.setResistance(3.0F);
		this.setBlockBounds(0F, 0F, 0F, 0.9F, 0.8F, 0.9F);
		this.setCreativeTab(grwarcraft.g1rwarcraft);
		
	}
	
	public Item getItemDropped(int i, Random random, int j) {
		return this == grwarcraft.Ore2 ? grwarcraft.itemrawore3 : Item.getItemFromBlock(this);
		
	}
	public int quantityDropped(Random random) {
		return this == grwarcraft.Ore2 ? 1 + random.nextInt(2) : 1;
		
	}
	
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityOre2();
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(grwarcraft.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}

}
