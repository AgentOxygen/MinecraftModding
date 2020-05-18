package com.mntchkn.entities;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;

public class TestRenderer extends MobRenderer<TestEntity, BipedModel<TestEntity>>  {

	public TestRenderer(EntityRendererManager p_i50961_1_, BipedModel<TestEntity> p_i50961_2_, float p_i50961_3_) {
		super(p_i50961_1_, p_i50961_2_, p_i50961_3_);
		
	}

	@Override
	public ResourceLocation getEntityTexture(TestEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
