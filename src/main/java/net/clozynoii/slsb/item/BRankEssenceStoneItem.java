
package net.clozynoii.slsb.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class BRankEssenceStoneItem extends Item {
	public BRankEssenceStoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77Found within an \u00A7bB-Rank \u00A77magic beast, a proof of your effort."));
		list.add(Component.literal("\u00A77\u00A7oCan be sold for a decent price, or turned into armor and weapons"));
	}
}