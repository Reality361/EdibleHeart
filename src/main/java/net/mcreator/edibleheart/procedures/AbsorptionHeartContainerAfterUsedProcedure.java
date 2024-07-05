package net.mcreator.edibleheart.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AbsorptionHeartContainerAfterUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isAlive()) {
			if (entity instanceof LivingEntity _entity) {
				if (_entity.getAbsorptionAmount() <= 14) {
					_entity.setAbsorptionAmount((float) (_entity.getAbsorptionAmount() + 2));
				} else if (_entity.getAbsorptionAmount() == 15) {
					_entity.setAbsorptionAmount((float) (_entity.getAbsorptionAmount() + 1));
				}
			}
		}
	}
}
