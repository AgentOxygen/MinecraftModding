package com.mntchkn.client;

import com.mntchkn.entities.CamelEntity;
import com.mntchkn.main.Main;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.HorseModel;
import net.minecraft.util.ResourceLocation;

public class CamelEntityRenderer extends MobRenderer<CamelEntity, HorseModel<CamelEntity>>{

	public static final ResourceLocation CAMEL_TEXTURE = new ResourceLocation(Main.MODID, "textures/entity/camel/camel.png");
	
	public CamelEntityRenderer(EntityRendererManager entityRendererManager) {
		super(entityRendererManager, new HorseModel<CamelEntity>(0.7f), 0.7f);
		
	}

	@Override
	public ResourceLocation getEntityTexture(CamelEntity entity) {
		// TODO Auto-generated method stub
		return CAMEL_TEXTURE;
	}

}
