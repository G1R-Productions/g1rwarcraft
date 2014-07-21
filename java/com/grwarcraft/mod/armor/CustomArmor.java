package com.grwarcraft.mod.armor;

import com.grwarcraft.mod.grwarcraft;
import com.grwarcraft.mod.model.Armor1;

import net.java.games.input.Keyboard;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomArmor extends ItemArmor{

public CustomArmor(int par1, ArmorMaterial par2ArmorMaterial,
int par3, int par4) {
super(par2ArmorMaterial, par3, par4);
// TODO Auto-generated constructor stub
}

@Override
public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
String type) {
switch(slot){
  case 2:
   return "armour:chest1.png";
//2 should be the slot for legs
  default:
   return "armour:legs1.png";
  }
}
			
	

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1IconRegister) {
String itemName = getUnlocalizedName().substring(getUnlocalizedName().lastIndexOf(".") + 1);
this.itemIcon = par1IconRegister.registerIcon(itemName);
}

public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemstack)
{

if(player.getCurrentArmor(4) != null){
ItemStack helmet = player.getCurrentArmor(4);
}
if(player.getCurrentArmor(3) != null){
ItemStack chestplate = player.getCurrentArmor(3);

if(player.getCurrentArmor(2) != null){
ItemStack leggings = player.getCurrentArmor(2);
}
if(player.getCurrentArmor(1) != null){
ItemStack boots = player.getCurrentArmor(1);
}
}
}

ModelBiped Armor1 = new ModelBiped();

@Override
@SideOnly(Side.CLIENT)
public ModelBiped getArmorModel(EntityLivingBase entityLiving,
ItemStack itemStack, int armorSlot) {

  ModelBiped Armor1 = null;
  if(itemStack != null) {
   if(itemStack.getItem() instanceof CustomArmor) {
    int type = ((ItemArmor)itemStack.getItem()).armorType;
    if(type == 1 || type == 3 || type == 0){
    Armor1 = grwarcraft.grwarcraftProxy.getArmorModel(0);
    }else{
    Armor1 = grwarcraft.grwarcraftProxy.getArmorModel(1);
    }
   }
if(Armor1 != null){
Armor1.bipedBody.showModel = armorSlot == 1;
Armor1.bipedRightArm.showModel = armorSlot == 1;
Armor1.bipedLeftArm.showModel = armorSlot == 1;

Armor1.isSneak = entityLiving.isSneaking();
Armor1.isRiding = entityLiving.isRiding();
Armor1.isChild = entityLiving.isChild();
Armor1.heldItemRight = entityLiving.getEquipmentInSlot(0)  != null ? 1 :0;
if(entityLiving instanceof EntityPlayer){
Armor1.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
}
return Armor1;
}
}
return Armor1;
}
}