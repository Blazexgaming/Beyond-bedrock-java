
package net.luxcore.beyondbedrock.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.luxcore.beyondbedrock.ElementsBeyondbedrockMod;

import java.util.Set;
import java.util.HashMap;

@ElementsBeyondbedrockMod.ModElement.Tag
public class ItemObsidionHoe extends ElementsBeyondbedrockMod.ModElement {
	@GameRegistry.ObjectHolder("beyondbedrock:obsidion_hoe")
	public static final Item block = null;
	public ItemObsidionHoe(ElementsBeyondbedrockMod instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("OBSIDION_HOE", 9, 1927, 14f, 0f, 60)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 9);
				return ret.keySet();
			}
		}.setUnlocalizedName("obsidion_hoe").setRegistryName("obsidion_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("beyondbedrock:obsidion_hoe", "inventory"));
	}
}
