
package net.luxcore.beyondbedrock.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.luxcore.beyondbedrock.item.ItemSilverIngot;
import net.luxcore.beyondbedrock.block.BlockSilverOre;
import net.luxcore.beyondbedrock.ElementsBeyondbedrockMod;

@ElementsBeyondbedrockMod.ModElement.Tag
public class RecipeSilverOreSmelting extends ElementsBeyondbedrockMod.ModElement {
	public RecipeSilverOreSmelting(ElementsBeyondbedrockMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSilverOre.block, (int) (1)), new ItemStack(ItemSilverIngot.block, (int) (1)), 0.7F);
	}
}
