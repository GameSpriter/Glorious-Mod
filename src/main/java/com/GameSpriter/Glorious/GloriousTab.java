package com.GameSpriter.Glorious;

import com.GameSpriter.Glorious.init.GloriousItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GloriousTab extends CreativeTabs 
{
	public GloriousTab(String string) 
	{
		super(string);
	}

	public Item getTabIconItem() 
	{
		return GloriousItems.sparklingPowder;
	}

}
