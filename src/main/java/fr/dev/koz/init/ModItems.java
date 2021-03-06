package fr.dev.koz.init;

        import fr.dev.koz.KindOfZelda;
        import fr.dev.koz.items.GoronsOrb;
        import fr.dev.koz.items.HumansOrb;
        import fr.dev.koz.items.OrbOfOrigin;
        import fr.dev.koz.items.ZorasOrb;
        import net.minecraft.item.Item;
        import net.minecraftforge.fml.RegistryObject;
        import net.minecraftforge.registries.DeferredRegister;
        import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KindOfZelda.MODID);

    public static final RegistryObject<Item> ORB_OF_ORIGIN = ITEMS.register("orb_of_origin" , () -> new OrbOfOrigin(new Item.Properties().maxStackSize(1).group(KindOfZelda.KOZ_ITEM_GROUP)));
    public static final RegistryObject<Item> GORONS_ORB = ITEMS.register("gorons_orb" , () -> new GoronsOrb(new Item.Properties().maxStackSize(1).group(KindOfZelda.KOZ_ITEM_GROUP)));
    public static final RegistryObject<Item> ZORAS_ORB = ITEMS.register("zoras_orb" , () -> new ZorasOrb(new Item.Properties().maxStackSize(1).group(KindOfZelda.KOZ_ITEM_GROUP)));
    public static final RegistryObject<Item> HUMANS_ORB = ITEMS.register("humans_orb" , () -> new HumansOrb(new Item.Properties().maxStackSize(1).group(KindOfZelda.KOZ_ITEM_GROUP)));




}
