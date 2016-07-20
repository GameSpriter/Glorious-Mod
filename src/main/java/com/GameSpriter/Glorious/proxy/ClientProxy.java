package com.GameSpriter.Glorious.proxy;

import com.GameSpriter.Glorious.init.GloriousBlocks;
import com.GameSpriter.Glorious.init.GloriousItems;

public class ClientProxy implements CommonProxy{
	
	@Override
	public void init() {
		GloriousItems.registerRenders();
		GloriousBlocks.registerRenders();
	}

}
