
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
public class ItemSilverHoe extends ElementsBeyondbedrockMod.ModElement {
	@GameRegistry.ObjectHolder("beyondbedrock:silver_hoe")
	public static final Item block = null;
	public ItemSilverHoe(ElementsBeyondbedrockMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("SILVER_HOE", 2, 250, 6f, 0f, 14)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("silver_hoe").setRegistryName("silver_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("beyondbedrock:silver_hoe", "inventory"));
	}
}
