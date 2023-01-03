package com.adrikikicp.atm.util;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Reference {
    public static final String MOD_ID = "atm";
    public static final String CLIENT = "com.adrikikicp.atm.proxy.ClientProxy";
    public static final String SERVER = "com.adrikikicp.atm.proxy.CommonProxy";
public static CreativeTabs getItemGroup(){
    return new CreativeTabs("atmtab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.ACACIA_BOAT);
        }
    };
}

}
