package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.clozynoii.slsb.entity.GiantRatEntity;

public class GiantRatOnSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if ((entity instanceof GiantRatEntity _datEntS ? _datEntS.getEntityData().get(GiantRatEntity.DATA_Color) : "").equals("")) {
			random = Mth.nextInt(RandomSource.create(), 1, 3);
			if (random == 1) {
				if (entity instanceof GiantRatEntity _datEntSetS)
					_datEntSetS.getEntityData().set(GiantRatEntity.DATA_Color, "Grey");
				if (entity instanceof GiantRatEntity animatable)
					animatable.setTexture("greyrattexture");
			}
			if (random == 2) {
				if (entity instanceof GiantRatEntity _datEntSetS)
					_datEntSetS.getEntityData().set(GiantRatEntity.DATA_Color, "Brown");
				if (entity instanceof GiantRatEntity animatable)
					animatable.setTexture("brownrattexture");
			}
			if (random == 3) {
				if (entity instanceof GiantRatEntity _datEntSetS)
					_datEntSetS.getEntityData().set(GiantRatEntity.DATA_Color, "Black");
				if (entity instanceof GiantRatEntity animatable)
					animatable.setTexture("blackrattexture");
			}
		}
	}
}
