package com.adrikikicp.atm.blocks;

import com.adrikikicp.atm.init.ModBlocks;
import com.adrikikicp.atm.init.ModItems;
import com.adrikikicp.atm.util.IHasModel;
import com.adrikikicp.atm.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class TrackBlock extends Block  {
    public TrackBlock(Material m) {
        super(m);
        this.setUnlocalizedName("track");
        this.setRegistryName("track");
        this.setCreativeTab(Reference.getItemGroup());
        ModBlocks.BLOCKS.add(this);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName("track").setUnlocalizedName("track").setCreativeTab(Reference.getItemGroup()));
    }


}
