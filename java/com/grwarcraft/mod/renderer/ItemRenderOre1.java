package com.grwarcraft.mod.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemRenderOre1 implements IItemRenderer {

	TileEntitySpecialRenderer render;
	private TileEntity entity;
	
	public ItemRenderOre1(TileEntitySpecialRenderer render, TileEntity entity) {
		this.entity = entity;
		this.render = render;
		
	}
	
	@Override
	public boolean handleRenderType(ItemStack arg0, ItemRenderType arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		if(type == IItemRenderer.ItemRenderType.ENTITY)
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
		this.render.renderTileEntityAt(this.entity,0.0D, 0.0D, 0.0D, 0.0F);
		
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType arg0, ItemStack arg1, ItemRendererHelper arg2) {
		// TODO Auto-generated method stub
		return true;
	}
	

}
