
package net.luxcore.beyondbedrock.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.luxcore.beyondbedrock.ElementsBeyondbedrockMod;

import java.util.Set;
import java.util.HashMap;

@ElementsBeyondbedrockMod.ModElement.Tag
public class ItemObsidionPickaxe extends ElementsBeyondbedrockMod.ModElement {
	@GameRegistry.ObjectHolder("beyondbedrock:obsidion_pickaxe")
	public static final Item block = null;
	public ItemObsidionPickaxe(ElementsBeyondbedrockMod instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("OBSIDION_PICKAXE", 9, 1927, 14f, 5f, 60)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 9);
				return ret.keySet();
			}
		}.setUnlocalizedName("obsidion_pickaxe").setRegistryName("obsidion_pickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("beyondbedrock:obsidion_pickaxe", "inventory"));
	}
}
