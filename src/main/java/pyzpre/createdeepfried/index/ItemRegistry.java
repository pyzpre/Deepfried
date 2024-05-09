package pyzpre.createdeepfried.index;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import com.tterrag.registrate.util.entry.ItemEntry;
import pyzpre.createdeepfried.item.asian.asian;
import pyzpre.createdeepfried.item.asian.japan;
import pyzpre.createdeepfried.item.europe.*;
import pyzpre.createdeepfried.item.functional.south_american.yuca;
import pyzpre.createdeepfried.item.north_american.north_american;
import pyzpre.createdeepfried.item.south_american.south_american;


import static pyzpre.createdeepfried.CreateDeepfried.REGISTRATE;

public class ItemRegistry {
    public static final ItemEntry<north_american> RAW_CORN_DOG = REGISTRATE.item("raw_corn_dog", north_american::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.2f).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build()))
            .register();
    public static final ItemEntry<north_american> CORN_DOG = REGISTRATE.item("corn_dog", north_american::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.5f).meat().build()))
            .register();
    public static final ItemEntry<north_american> RAW_CHICKEN_NUGGETS = REGISTRATE.item("raw_chicken_nuggets", north_american::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(2).fast().saturationMod(0.2f).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build()))
            .register();
    public static final ItemEntry<north_american> CHICKEN_NUGGETS = REGISTRATE.item("chicken_nuggets", north_american::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(4).fast().saturationMod(0.5f).meat().build()))
            .register();
    public static final ItemEntry<yuca> YUCA = REGISTRATE.item("yuca", yuca::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.2f).build()))

            .register();
    public static final ItemEntry<south_american> YUCA_FRIES = REGISTRATE.item("yuca_fries", south_american::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.4f).build()))
            .register();
    public static final ItemEntry<asian> RAW_SPRINGROLL = REGISTRATE.item("raw_springroll", asian::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.2f).build()))
            .register();
    public static final ItemEntry<asian> SPRINGROLL = REGISTRATE.item("springroll", asian::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.5f).build()))
            .register();
    public static final ItemEntry<japan> RAW_TEMPURA = REGISTRATE.item("raw_tempura", japan::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.2f).build()))
            .register();
    public static final ItemEntry<japan> TEMPURA = REGISTRATE.item("tempura", japan::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(12).saturationMod(0.4f).build()))
            .register();
    public static final ItemEntry<greece> CALAMARI = REGISTRATE.item("calamari", greece::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f).build()))
            .register();
    public static final ItemEntry<european> APPLE_SLICES = REGISTRATE.item("apple_slices", european::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(2).fast().saturationMod(0.3f).build()))
            .register();
    public static final ItemEntry<germany> APFELKUCHLE = REGISTRATE.item("apfelkuchle", germany::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(4).fast().saturationMod(0.3f).build()))
            .register();
    public static final ItemEntry<germany> BERLINER = REGISTRATE.item("berliner", germany::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.2f).build()))
            .register();
    public static final ItemEntry<germany> COATED_BERLINER = REGISTRATE.item("coated_berliner", germany::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.3f).build()))
            .register();
    public static final ItemEntry<germany> COATED_HONEY_BERLINER = REGISTRATE.item("coated_honey_berliner", germany::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(11).saturationMod(0.6f).build()))
            .register();
    public static final ItemEntry<germany> COATED_CHOCOLATE_BERLINER = REGISTRATE.item("coated_chocolate_berliner", germany::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(13).saturationMod(0.9f).build()))
            .register();
    public static final ItemEntry<germany> HONEY_BERLINER = REGISTRATE.item("honey_filled_berliner", germany::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.5f).build()))
            .register();
    public static final ItemEntry<germany> CHOCOLATE_BERLINER = REGISTRATE.item("chocolate_filled_berliner", germany::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(12).saturationMod(0.8f).build()))
            .register();
    public static final ItemEntry<uk> DEEPFRIED_CHOCOLATE_BAR = REGISTRATE.item("deepfried_chocolate_bar", uk::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.8f).build()))
            .register();
    public static final ItemEntry<uk> FISH_AND_CHIPS = REGISTRATE.item("fish_and_chips", uk::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(12).saturationMod(0.8f).build()))
            .register();
    public static final ItemEntry<uk> FRIED_CHICKEN = REGISTRATE.item("fried_chicken", uk::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.8f).meat().build()))
            .register();


    //Farmers Delight
    public static final ItemEntry<italy> RAW_PANZEROTTO = REGISTRATE.item("raw_panzerotto", italy::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.4f).build()))
            .register();
    public static final ItemEntry<italy> PANZEROTTO = REGISTRATE.item("panzerotto", italy::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.8f).build()))
            .register();
    public static final ItemEntry<uk> RAW_ONION_RINGS = REGISTRATE.item("raw_onion_rings", uk::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.4f).build()))
            .register();
    public static final ItemEntry<uk> ONION_RINGS = REGISTRATE.item("onion_rings", uk::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.8f).build()))
            .register();
    public static final ItemEntry<north_american> BLOOMING_ONION = REGISTRATE.item("blooming_onion", north_american::new)
            .properties(p -> p.food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.8f).build()))
            .register();
    public static void register() {
    }
}