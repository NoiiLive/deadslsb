package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GiantRatOnSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if ((entity instanceof GiantRatGreyEntity _datEntS ? _datEntS.getEntityData().get(GiantRatGreyEntity.DATA_Color) : "").equals("")) {
			random = Mth.nextInt(RandomSource.create(), 1, 3);
			if (random == 1) {
				if (entity instanceof GiantRatGreyEntity _datEntSetS)
					_datEntSetS.getEntityData().set(GiantRatGreyEntity.DATA_Color, "Grey");
				if (entity instanceof GiantRatGreyEntity animatable)
					animatable.setTexture("greyrattexture");
			}
			if (random == 2) {
				if (entity instanceof GiantRatGreyEntity _datEntSetS)
					_datEntSetS.getEntityData().set(GiantRatGreyEntity.DATA_Color, "Brown");
				if (entity instanceof GiantRatGreyEntity animatable)
					animatable.setTexture("brownrattexture");
			}
			if (random == 3) {
				if (entity instanceof GiantRatGreyEntity _datEntSetS)
					_datEntSetS.getEntityData().set(GiantRatGreyEntity.DATA_Color, "Black");
				if (entity instanceof GiantRatGreyEntity animatable)
					animatable.setTexture("blackrattexture");
			}
		}
	}
}
