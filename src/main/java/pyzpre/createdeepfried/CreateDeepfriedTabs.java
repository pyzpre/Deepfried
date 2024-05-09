package pyzpre.createdeepfried;

import createbicyclesbitterballen.index.CreateBicBitModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import pyzpre.createdeepfried.index.ItemRegistry;

public class CreateDeepfriedTabs {

    private static final DeferredRegister<CreativeModeTab> TAB_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "create_deepfried");

    public static final RegistryObject<CreativeModeTab> DEEPFRIED =
            TAB_REGISTER.register("deepfried",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("item_group.create_deepfried.deepfried"))
                            .icon(() -> new ItemStack(CreateBicBitModItems.FRYING_OIL_BUCKET.get()))
                            .displayItems((parameters, tabData) -> {
                                tabData.accept(ItemRegistry.RAW_CORN_DOG.get());
                                tabData.accept(ItemRegistry.CORN_DOG.get());
                                tabData.accept(ItemRegistry.RAW_CHICKEN_NUGGETS.get());
                                tabData.accept(ItemRegistry.CHICKEN_NUGGETS.get());
                                tabData.accept(ItemRegistry.YUCA.get());
                                tabData.accept(ItemRegistry.YUCA_FRIES.get());
                                tabData.accept(ItemRegistry.RAW_SPRINGROLL.get());
                                tabData.accept(ItemRegistry.SPRINGROLL.get());
                                tabData.accept(ItemRegistry.RAW_TEMPURA.get());
                                tabData.accept(ItemRegistry.TEMPURA.get());
                                tabData.accept(ItemRegistry.CALAMARI.get());
                                tabData.accept(ItemRegistry.BERLINER.get());
                                tabData.accept(ItemRegistry.HONEY_BERLINER.get());
                                tabData.accept(ItemRegistry.CHOCOLATE_BERLINER.get());
                                tabData.accept(ItemRegistry.COATED_BERLINER.get());
                                tabData.accept(ItemRegistry.COATED_HONEY_BERLINER.get());
                                tabData.accept(ItemRegistry.COATED_CHOCOLATE_BERLINER.get());
                                tabData.accept(ItemRegistry.APPLE_SLICES.get());
                                tabData.accept(ItemRegistry.APFELKUCHLE.get());
                                tabData.accept(ItemRegistry.DEEPFRIED_CHOCOLATE_BAR.get());
                                tabData.accept(ItemRegistry.FISH_AND_CHIPS.get());
                                tabData.accept(ItemRegistry.FRIED_CHICKEN.get());
                                // Check if Farmer's Delight is loaded before adding these foods
                                if (ModList.get().isLoaded("farmersdelight")) {
                                    tabData.accept(ItemRegistry.RAW_ONION_RINGS.get());
                                    tabData.accept(ItemRegistry.ONION_RINGS.get());
                                    tabData.accept(ItemRegistry.BLOOMING_ONION.get());
                                    tabData.accept(ItemRegistry.RAW_PANZEROTTO.get());
                                    tabData.accept(ItemRegistry.PANZEROTTO.get());
                                }
                            })
                            .build());
    public static void register(IEventBus modEventBus) {
        TAB_REGISTER.register(modEventBus);
    }
}
