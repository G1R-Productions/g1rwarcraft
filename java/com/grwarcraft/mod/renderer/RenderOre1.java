package com.grwarcraft.mod.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.grwarcraft.mod.grwarcraft;
import com.grwarcraft.mod.model.ModelOre1;

public class RenderOre1 extends TileEntitySpecialRenderer{

	private static final ResourceLocation texture = new ResourceLocation(grwarcraft.modid + ":" + "textures/model/Ore1.png");
	
	private ModelOre1 model; {
		this.model = new ModelOre1();
		
	}
	
	
	@Override
	public void renderTileEntityAt(TileEntity tileenity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
			GL11.glRotatef(180, 0F, 0F, 1F);
		
			this.bindTexture(texture);
			
			GL11.glPushMatrix();
				this.model.renderModel(0.0625f);
			GL11.glPopMatrix();
		GL11.glPopMatrix();
		
	}

}
