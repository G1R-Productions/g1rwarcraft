
package com.grwarcraft.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Armor1 extends ModelBiped
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public Armor1()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 32);
      head.addBox(-4F, -16F, -4F, 8, 16, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      
      this.bipedHead.addChild(head);
      
      this.bipedBody.addChild(body);
      
      this.bipedLeftArm.addChild(leftarm);
      
      this.bipedRightLeg.addChild(rightleg);
      
      this.bipedLeftLeg.addChild(leftleg);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
  super.render(entity, f, f1, f2, f3, f4, f5);
  setRotationAngles(f, f1, f2, f3, f4, f5, entity);

  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
  model.rotateAngleX = x;
  model.rotateAngleY = y;
  model.rotateAngleZ = z;
  }
  public Armor1(float f) {
  super(f, 0, 64, 64);
  }
  }
