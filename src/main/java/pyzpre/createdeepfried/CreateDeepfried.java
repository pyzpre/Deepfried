package pyzpre.createdeepfried;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;
import pyzpre.createdeepfried.index.ItemRegistry;

import java.util.*;

@Mod(CreateDeepfried.MOD_ID)
public class CreateDeepfried
{
	public static final String MOD_ID = "create_deepfried";

	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateDeepfried.MOD_ID);
	@Deprecated
	public static final Random RANDOM = new Random();

	public CreateDeepfried()
	{
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemRegistry.register();
		CreateDeepfriedTabs.register(modEventBus);
		REGISTRATE.registerEventListeners(eventBus);




		eventBus.addListener(this::clientSetup);
		modEventBus.addListener(CreateDeepfried::clientInit);
		eventBus.addListener(CreateDeepfried::init);
		MinecraftForge.EVENT_BUS.register(this);



	}

	private void clientSetup(final FMLClientSetupEvent event) {
	}

	public static void clientInit(final FMLClientSetupEvent event) {
	}
	public static void init(final FMLCommonSetupEvent event) {
	}
}
