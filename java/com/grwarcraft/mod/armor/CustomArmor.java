package com.grwarcraft.mod.armor;

import com.grwarcraft.mod.grwarcraft;
import com.grwarcraft.mod.model.Armor1;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CustomArmor extends ItemArmor {
	
	public CustomArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(grwarcraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) { return null; }
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,
	ItemStack itemStack, int armorSlot) {
	if(itemStack != null){
	if(itemStack.getItem() instanceof CustomArmor){
	int type = ((ItemArmor)itemStack.getItem()).armorType;

	if(type == 1 || type == 3){
		Armor1 = com.grwarcraft.mod.proxy.ClientProxy.getArmor1(0);
	}else{
		Armor1 = com.grwarcraft.mod.proxy.ClientProxy.getArmor1(1);
	}
	}
	if(armorModel != null){
	Armor1.bipedHead.showModel = armorSlot == 0;
	Armor1.bipedHeadwear.showModel = armorSlot == 0;
	Armor1.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
	Armor1.bipedRightArm.showModel = armorSlot == 1;
	Armor1.bipedLeftArm.showModel = armorSlot == 1;
	Armor1.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
	Armor1.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;

	Armor1.isSneak = entityLiving.isSneaking();
	Armor1.isRiding = entityLiving.isRiding();
	Armor1.isChild = entityLiving.isChild();
	Armor1.heldItemRight = entityLiving.getCurrentItemOrArmor(0) != null ? 1 :0;
	if(entityLiving instanceof EntityPlayer){
	Armor1.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
	}
	return Armor1;
	}
	}
	return null;
	}
	}
