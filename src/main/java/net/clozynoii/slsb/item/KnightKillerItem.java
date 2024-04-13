
package net.clozynoii.slsb.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class KnightKillerItem extends SwordItem {
	public KnightKillerItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 71f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1.5f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7f-Effect \"\u00A7eKnight Killer\u00A7f\":"));
		list.add(Component.literal("\u00A7fAttacks used against armored units will inflict 25% additional damage."));
	}
}
