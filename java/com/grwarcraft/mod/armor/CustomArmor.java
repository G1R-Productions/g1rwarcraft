package com.grwarcraft.mod.armor;

import com.grwarcraft.mod.grwarcraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CustomArmor extends ItemArmor {
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(grwarcraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) { return null; }
	
	@Override @SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) { return null; }

	public CustomArmor(ArmorMaterial GRArmorMaterial, int GRArmorMaterial2,
			int GRArmorMaterial3) {
		super(GRArmorMaterial, GRArmorMaterial2, GRArmorMaterial3);
		// TODO Auto-generated constructor stub
	}

}
