package net.luxcore.beyondbedrock.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.luxcore.beyondbedrock.ElementsBeyondbedrockMod;

import java.util.Map;

@ElementsBeyondbedrockMod.ModElement.Tag
public class ProcedureAcidMobplayerCollidesBlock extends ElementsBeyondbedrockMod.ModElement {
	public ProcedureAcidMobplayerCollidesBlock(ElementsBeyondbedrockMod instance) {
		super(instance, 39);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AcidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.ON_FIRE, (float) 3);
	}
}
