
package net.luxcore.beyondbedrock.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.luxcore.beyondbedrock.ElementsBeyondbedrockMod;

@ElementsBeyondbedrockMod.ModElement.Tag
public class ItemObsidian extends ElementsBeyondbedrockMod.ModElement {
	@GameRegistry.ObjectHolder("beyondbedrock:obsidianhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("beyondbedrock:obsidianbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("beyondbedrock:obsidianlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("beyondbedrock:obsidianboots")
	public static final Item boots = null;
	public ItemObsidian(ElementsBeyondbedrockMod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("OBSIDIAN", "beyondbedrock:blackopals_", 25, new int[]{9, 14, 11, 9}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("obsidianhelmet")
				.setRegistryName("obsidianhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("obsidianbody").setRegistryName("obsidianbody")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("obsidianlegs").setRegistryName("obsidianlegs")
				.setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("obsidianboots")
				.setRegistryName("obsidianboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("beyondbedrock:obsidianhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("beyondbedrock:obsidianbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("beyondbedrock:obsidianlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("beyondbedrock:obsidianboots", "inventory"));
	}
}
