// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer arm2;
	private final ModelRenderer arm3;
	private final ModelRenderer head;
	private final ModelRenderer bb_main;

	public Modelcustom_model() {
		textureWidth = 32;
		textureHeight = 32;

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.0F, 21.0F, -1.0F);
		leg1.cubeList.add(new ModelBox(leg1, 20, 0, -1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.0F, 21.0F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 18, 13, -1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F, false));

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(-4.0F, 16.0F, 0.0F);
		arm2.cubeList.add(new ModelBox(arm2, 18, 18, -1.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, false));

		arm3 = new ModelRenderer(this);
		arm3.setRotationPoint(3.0F, 16.0F, -2.0F);
		arm3.cubeList.add(new ModelBox(arm3, 0, 24, -1.0F, -1.0F, 1.0F, 2, 5, 2, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -16.0F, -3.0F, 7, 7, 6, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 13, -3.0F, -9.0F, -2.0F, 5, 7, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leg1.render(f5);
		leg2.render(f5);
		arm2.render(f5);
		arm3.render(f5);
		head.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.arm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}