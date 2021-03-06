package com.grwarcraft.mod.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArmor1 extends ModelBiped
{

    //ModelRenderer helmet1;
   // ModelRenderer helmet2;
    ModelRenderer helmet3;
    ModelRenderer helmet4;
    ModelRenderer helmet5;
    ModelRenderer helmet6;
    ModelRenderer helmet7;
    ModelRenderer ribbon1;
    ModelRenderer ribbon2;

    ModelRenderer body1;
    ModelRenderer body2;

    ModelRenderer rightarm1;

    ModelRenderer leftarm1;

    ModelRenderer rightleg1;
    ModelRenderer rightleg2;
    ModelRenderer rightboot1;

    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer leftboot1;

	public ModelArmor1(float f)
	{
		super(f, 0,64,64);

		textureWidth = 64;
		textureHeight = 64;

	     // helmet1 = new ModelRenderer(this, 0, 41);
	     // helmet1.addBox(-4.5F, -8.5F, -4.8F, 9, 2, 1);
	     // helmet1.setRotationPoint(0F, 0F, 0F);
	     // helmet1.setTextureSize(64, 64);
	     // helmet1.mirror = true;
	     // setRotation(helmet1, 0F, 0F, 0F);
	     // helmet2 = new ModelRenderer(this, 0, 32);
	     // helmet2.addBox(-4.5F, -8.5F, -3.8F, 9, 8, 8);
	     /// helmet2.setRotationPoint(0F, 0F, 0F);
	     // helmet2.setTextureSize(64, 64);
	     // helmet2.mirror = true;
	     // setRotation(helmet2, 0F, 0F, 0F);
	      helmet3 = new ModelRenderer(this, 0, 10);
	      helmet3.addBox(3.8F, -7.8F, 4F, 2, 2, 1);
	      helmet3.setRotationPoint(0F, 0F, 0F);
	      helmet3.setTextureSize(64, 64);
	      helmet3.mirror = true;
	      setRotation(helmet3, 0F, 0F, -0.8203047F);
	      helmet4 = new ModelRenderer(this, 6, 12);
	      helmet4.addBox(3F, -8.666667F, -1F, 3, 3, 1);
	      helmet4.setRotationPoint(0F, 0F, 0F);
	      helmet4.setTextureSize(64, 64);
	      helmet4.mirror = true;
	      setRotation(helmet4, 0F, 0F, -0.8203047F);
	      helmet5 = new ModelRenderer(this, 6, 12);
	      helmet5.addBox(6F, -5.4F, -1F, 3, 3, 1);
	      helmet5.setRotationPoint(0F, 0F, 0F);
	      helmet5.setTextureSize(64, 64);
	      helmet5.mirror = true;
	      setRotation(helmet5, 0F, 0F, -0.8203047F);
	      helmet6 = new ModelRenderer(this, 0, 10);
	      helmet6.addBox(6F, -5.5F, 4F, 2, 2, 1);
	      helmet6.setRotationPoint(0F, 0F, 0F);
	      helmet6.setTextureSize(64, 64);
	      helmet6.mirror = true;
	      setRotation(helmet6, 0F, 0F, -0.8203047F);
	      helmet7 = new ModelRenderer(this, 0, 15);
	      helmet7.addBox(5.5F, -6F, 4F, 1, 1, 1);
	      helmet7.setRotationPoint(0F, 0F, 0F);
	      helmet7.setTextureSize(64, 64);
	      helmet7.mirror = true;
	      setRotation(helmet7, 0F, 0F, -0.8203047F);
	      ribbon1 = new ModelRenderer(this, 4, 0);
	      ribbon1.addBox(-1.5F, -8F, 5F, 1, 7, 0);
	      ribbon1.setRotationPoint(0F, 0F, 0F);
	      ribbon1.setTextureSize(64, 64);
	      ribbon1.mirror = true;
	      setRotation(ribbon1, 0F, 0F, 0.1047198F);
	      ribbon2 = new ModelRenderer(this, 4, 0);
	      ribbon2.addBox(0.5F, -8F, 5F, 1, 7, 0);
	      ribbon2.setRotationPoint(0F, 0F, 0F);
	      ribbon2.setTextureSize(64, 64);
	      ribbon2.mirror = true;
	      setRotation(ribbon2, 0F, 0F, -0.122173F);

	      body1 = new ModelRenderer(this, 34, 33);
	      body1.addBox(-4.5F, 0F, -2.5F, 9, 12, 5);
	      body1.setRotationPoint(0F, 0F, 0F);
	      body1.setTextureSize(64, 64);
	      body1.mirror = true;
	      setRotation(body1, 0F, 0F, 0F);
	      body2 = new ModelRenderer(this, 11, 0);
	      body2.addBox(3F, -1F, -3F, 1, 9, 1);
	      body2.setRotationPoint(0F, 0F, 0F);
	      body2.setTextureSize(64, 64);
	      body2.mirror = true;
	      setRotation(body2, 0F, 0F, 0.7853982F);

	      rightarm1 = new ModelRenderer(this, 43, 0);
	      rightarm1.addBox(1.3F, -4.2F, -2.5F, 5, 12, 5);
	      rightarm1.setRotationPoint(-5F, 2F, 0.0F);
	      rightarm1.setTextureSize(64, 64);
	      rightarm1.mirror = true;
	      setRotation(rightarm1, 0F, 0F, 0F);

	      leftarm1 = new ModelRenderer(this, 43, 0);
	      leftarm1.addBox(-6.5F, -4.2F, -2.5F, 5, 12, 5);
	      leftarm1.setRotationPoint(5F, 2F, 0F);
	      leftarm1.setTextureSize(64, 64);
	      leftarm1.mirror = true;
	      setRotation(leftarm1, 0F, 0F, 0F);

	      rightleg1 = new ModelRenderer(this, 13, 48);
	      rightleg1.addBox(-0.1F, -12.0F, -2.5F, 5, 11, 5);
	      rightleg1.setRotationPoint(-2F, 12F, 0F);
	      rightleg1.setTextureSize(64, 64);
	      rightleg1.mirror = true;
	      setRotation(rightleg1, 0F, 0F, 0F);
	      
	      rightleg2 = new ModelRenderer(this, 29, 0);
	      rightleg2.addBox(-0.0F, -9.0F, -3.1F, 4, 4, 1);
	      rightleg2.setRotationPoint(-2F, 12F, 0F);
	      rightleg2.setTextureSize(64, 64);
	      rightleg2.mirror = true;
	      setRotation(rightleg2, 0F, 0F, 0F);
	      
	      rightboot1 = new ModelRenderer(this, 41, 56);
	      rightboot1.addBox(0.0F, -1.0F, -4F, 4, 1, 7);
	      rightboot1.setRotationPoint(-2F, 12F, 0F);
	      rightboot1.setTextureSize(64, 64);
	      rightboot1.mirror = true;
	      setRotation(rightboot1, 0F, 0F, 0F);
	      
	      leftleg1 = new ModelRenderer(this, 13, 48);
	      leftleg1.addBox(-4.9F, -12.0F, -2.5F, 5, 11, 5);
	      leftleg1.setRotationPoint(2F, 12F, 0F);
	      leftleg1.setTextureSize(64, 64);
	      leftleg1.mirror = true;
	      setRotation(leftleg1, 0F, 0F, 0F);
	      
	      leftleg2 = new ModelRenderer(this, 29, 0);
	      leftleg2.addBox(-4.1F, -9.0F, -3.1F, 4, 4, 1);
	      leftleg2.setRotationPoint(2F, 12F, 0F);
	      leftleg2.setTextureSize(64, 64);
	      leftleg2.mirror = true;
	      setRotation(leftleg2, 0F, 0F, 0F);
	      
	      leftboot1 = new ModelRenderer(this, 41, 56);
	      leftboot1.addBox(-4F, -1.0F, -4F, 4, 1, 7);
	      leftboot1.setRotationPoint(2F, 12F, 0F);
	      leftboot1.setTextureSize(64, 64);
	      leftboot1.mirror = true;
	      setRotation(leftboot1, 0F, 0F, 0F);
		
		this.bipedLeftArm.addChild(leftarm1);
		this.bipedRightArm.addChild(rightarm1);
		
		this.bipedLeftLeg.addChild(leftleg1);
		this.bipedLeftLeg.addChild(leftleg2);
		this.bipedLeftLeg.addChild(leftboot1);
		
		this.bipedRightLeg.addChild(rightleg1);
		this.bipedRightLeg.addChild(rightleg2);
		this.bipedRightLeg.addChild(rightboot1);
		
		this.bipedBody.addChild(body1);
		this.bipedBody.addChild(body2);
		
		//this.bipedHead.addChild(helmet1);
		//this.bipedHead.addChild(helmet2);
		this.bipedHead.addChild(helmet3);
		this.bipedHead.addChild(helmet4);
		this.bipedHead.addChild(helmet5);
		this.bipedHead.addChild(helmet6);
		this.bipedHead.addChild(helmet7);
		this.bipedHead.addChild(ribbon1);
		this.bipedHead.addChild(ribbon2);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//		Shape1.render(f5);
//		Shape2.render(f5);
//		Shape3.render(f5);
//		Shape4.render(f5);
//		Shape5.render(f5);
//		Shape6.render(f5);
//		Shape7.render(f5);
//		Shape8.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}

