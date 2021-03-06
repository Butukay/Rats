package com.github.alexthe666.rats.client.model;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPiratCannon extends AdvancedModelBase {
    public AdvancedModelRenderer base;
    public AdvancedModelRenderer middle;
    public AdvancedModelRenderer backCannon;
    public AdvancedModelRenderer midCannon;
    public AdvancedModelRenderer whick;
    public AdvancedModelRenderer frontCannon;

    public ModelPiratCannon() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.backCannon = new AdvancedModelRenderer(this, 0, 16);
        this.backCannon.setRotationPoint(0.0F, -10.0F, 0.0F);
        this.backCannon.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 12, 0.0F);
        this.midCannon = new AdvancedModelRenderer(this, 0, 36);
        this.midCannon.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.midCannon.addBox(-3.0F, -3.0F, -6.0F, 6, 6, 10, 0.0F);
        this.middle = new AdvancedModelRenderer(this, 40, 0);
        this.middle.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.middle.addBox(-2.0F, -10.0F, -2.5F, 4, 10, 5, 0.0F);
        this.frontCannon = new AdvancedModelRenderer(this, 0, 52);
        this.frontCannon.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.frontCannon.addBox(-4.0F, -4.0F, -2.0F, 8, 8, 2, 0.0F);
        this.base = new AdvancedModelRenderer(this, 0, 0);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.base.addBox(-5.0F, -2.0F, -5.0F, 10, 2, 10, 0.0F);
        this.whick = new AdvancedModelRenderer(this, 0, 0);
        this.whick.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.whick.addBox(0.0F, -4.0F, -2.0F, 0, 4, 4, 0.0F);
        this.middle.addChild(this.backCannon);
        this.backCannon.addChild(this.midCannon);
        this.base.addChild(this.middle);
        this.midCannon.addChild(this.frontCannon);
        this.backCannon.addChild(this.whick);
        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        this.base.render(f5);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
