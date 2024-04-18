package net.clozynoii.slsb.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;

import net.clozynoii.slsb.network.SlsbModVariables;
import net.clozynoii.slsb.init.SlsbModBlocks;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class PlaceGateProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		boolean Singular = false;
		String GateRank = "";
		double RandomX = 0;
		double RandomY = 0;
		double RandomZ = 0;
		double GateRandomize = 0;
		SlsbModVariables.MapVariables.get(world).GateTimer = Mth.nextInt(RandomSource.create(), 18000, 30000);
		SlsbModVariables.MapVariables.get(world).syncData(world);
		RandomX = entity.getX() + 1;
		RandomY = entity.getY() - 1;
		RandomZ = entity.getZ() - 1;
		if (((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("e") || ((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("e-rank")) {
			GateRank = "\u00A7f\u00A7lE-Rank";
			world.setBlock(BlockPos.containing(RandomX, RandomY + 1, RandomZ), SlsbModBlocks.BLUE_GATE_SMALL.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(RandomX, RandomY + 1, RandomZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("GateRank", "E-Rank");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("d") || ((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("d-rank")) {
			GateRank = "\u00A7e\u00A7lD-Rank";
			world.setBlock(BlockPos.containing(RandomX, RandomY + 1, RandomZ), SlsbModBlocks.BLUE_GATE_SMALL.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(RandomX, RandomY + 1, RandomZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("GateRank", "D-Rank");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("c") || ((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("c-rank")) {
			GateRank = "\u00A7a\u00A7lC-Rank";
			world.setBlock(BlockPos.containing(RandomX, RandomY + 1, RandomZ), SlsbModBlocks.BLUE_GATE_MEDIUM.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(RandomX, RandomY + 1, RandomZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("GateRank", "C-Rank");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("b") || ((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("b-rank")) {
			GateRank = "\u00A7b\u00A7lB-Rank";
			world.setBlock(BlockPos.containing(RandomX, RandomY + 1, RandomZ), SlsbModBlocks.BLUE_GATE_MEDIUM.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(RandomX, RandomY + 1, RandomZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("GateRank", "B-Rank");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("a") || ((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("a-rank")) {
			GateRank = "\u00A7c\u00A7lA-Rank";
			world.setBlock(BlockPos.containing(RandomX, RandomY + 1, RandomZ), SlsbModBlocks.BLUE_GATE_MEDIUM.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(RandomX, RandomY + 1, RandomZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("GateRank", "A-Rank");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("s") || ((StringArgumentType.getString(arguments, "rank")).toLowerCase()).equals("s-rank")) {
			GateRank = "\u00A7d\u00A7lS-Rank";
			world.setBlock(BlockPos.containing(RandomX, RandomY + 1, RandomZ), SlsbModBlocks.BLUE_GATE_MEDIUM.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(RandomX, RandomY + 1, RandomZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("GateRank", "S-Rank");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (BoolArgumentType.getBool(arguments, "redgate") == true) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(RandomX, RandomY + 1, RandomZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("RedGate", true);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A7f\u00A7lA " + GateRank + " \u00A7f\u00A7lGate Has Opened At: \u00A7f" + new java.text.DecimalFormat("##").format(RandomX) + " "
					+ new java.text.DecimalFormat("##").format(RandomY + 1) + " " + new java.text.DecimalFormat("##").format(RandomZ))), false);
	}
}
