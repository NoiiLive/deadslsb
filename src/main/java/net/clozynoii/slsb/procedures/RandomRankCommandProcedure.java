package net.clozynoii.slsb.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;

public class RandomRankCommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		double randomrank = 0;
		randomrank = Mth.nextInt(RandomSource.create(), 1, 18);
		if (randomrank >= 1 && randomrank < 2) {
			SetRankEProcedure.execute(arguments, entity);
		}
		if (randomrank >= 2 && randomrank < 7) {
			SetRankDProcedure.execute(arguments, entity);
		}
		if (randomrank >= 7 && randomrank < 12) {
			SetRankCProcedure.execute(arguments, entity);
		}
		if (randomrank >= 12 && randomrank < 15) {
			SetRankBProcedure.execute(arguments, entity);
		}
		if (randomrank >= 15 && randomrank < 17) {
			SetRankAProcedure.execute(arguments, entity);
		}
		if (randomrank >= 17 && randomrank < 19) {
			SetRankSProcedure.execute(arguments, entity);
		}
	}
}
