package com.grwarcraft.mod.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.lwjgl.opengl.GL11;

import com.grwarcraft.mod.model.Modelsword1;

public class ItemRender3DTool implements IItemRenderer {
    //you'll need an instance of your model. you could also add it to the constructor as an argument to be able to reuse this class for
    //every model you add
    Modelsword1 swordmodel;

    //constructor
    public ItemRender3DTool() {
        swordmodel = new Modelsword1();
    }

    

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
    	
    	
    	
        switch (type) {

        case EQUIPPED: // render in third person
            GL11.glPushMatrix(); //start gl rendering for this section
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(
                    "grwarcraft:/sword1.png"));
            //var4 = true;
           //var5 = 0.7F;
            GL11.glTranslatef(0.4F, 0.0F, -0.1F);
            GL11.glScalef(2.0F, 2.0F, 2.0F);
            GL11.glRotatef(100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(10.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-10.0F, 0.0F, 0.0F, 1.0F);
//the entity argument can/could be passed to as null.
            swordmodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                    0.0625F);
            GL11.glPopMatrix(); //Stop gl rendering for this section
            break;

        case EQUIPPED_FIRST_PERSON:

//rince and repeat the rendering. adjust axis' and translation as needed
            GL11.glPushMatrix();
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(
                    "grwarcraft:/sword1.png"));
            GL11.glTranslatef(0.4F, 0.0F, -0.5F);
            GL11.glScalef(2.0F, 2.0F, 2.0F);
            GL11.glRotatef(100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(10.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            swordmodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                    0.0625F);
            GL11.glPopMatrix();
            break;

        case ENTITY:
            GL11.glPushMatrix();

            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(
                    "grwarcraft:/sword1.png"));
            GL11.glScalef(2.0F, 2.0F, 2.0F);
            GL11.glRotatef(90F, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(0F, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(45F, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-0.2F, 1F, 0F);
            swordmodel.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F,
                    0.0625F);
            GL11.glPopMatrix();
            break;


        default:
            break;
        }
        
        
        
    }
    
    
@Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
            ItemRendererHelper helper) {

        return false;

    }

}



//Minecraft.getMinecraft().