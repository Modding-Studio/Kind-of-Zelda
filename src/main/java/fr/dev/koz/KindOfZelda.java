package fr.dev.koz;

import fr.dev.koz.capabilities.TestCapability;
import fr.dev.koz.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KindOfZelda.MODID)
public class KindOfZelda {

    public static final String MODID = "koz";

    public KindOfZelda() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);


        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
    }

    private void setup(FMLCommonSetupEvent e) {

        TestCapability.register();

    }

    private void clientSetup(FMLClientSetupEvent e) {

    }

    public static final ItemGroup KOZ_ITEM_GROUP = new ItemGroup("KoZTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.ORB_OF_ORIGIN.get());
        }
    };
}
