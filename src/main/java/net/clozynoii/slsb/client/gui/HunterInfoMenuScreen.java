package net.clozynoii.slsb.client.gui;

public class HunterInfoMenuScreen extends AbstractContainerScreen<HunterInfoMenuMenu> {

	private final static HashMap<String, Object> guistate = HunterInfoMenuMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public HunterInfoMenuScreen(HunterInfoMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("slsb:textures/screens/hunter_info_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		if (

		ReturnPlayerIconProcedure.execute(entity)

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + -74, this.topPos + 53, 45, 0f + (float) Math.atan((this.leftPos + -74 - mouseX) / 40.0), (float) Math.atan((this.topPos + 4 - mouseY) / 40.0), livingEntity);
		}

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("slsb:textures/screens/hunter_liecense.png"), this.leftPos + -214, this.topPos + -120, 0, 0, 427, 240, 427, 240);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.hunter_info_menu.label_the_hunters_assocation"), -36, 19, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnHunterInfoApprovalProcedure.execute(), -36, 32, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.slsb.hunter_info_menu.label_as_a_verified_hunter"), -36, 45, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnHunterInfoNameProcedure.execute(entity), -36, -37, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnHunterInfoRankProcedure.execute(entity), -36, -24, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnHunterInfoClassProcedure.execute(), -36, -11, -16777216, false);
		guiGraphics.drawString(this.font,

				ReturnHunterInfoGuildProcedure.execute(), -114, -77, -1, false);
		guiGraphics.drawString(this.font,

				ReturnBalanceProcedure.execute(), -114, 69, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

	}

}
