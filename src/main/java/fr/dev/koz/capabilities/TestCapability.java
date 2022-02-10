package fr.dev.koz.capabilities;

import net.minecraft.nbt.IntTag;
import net.minecraft.core.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;

public class TestCapability {
    public static final Capability<ITest> TEST_CAPABILITY = CapabilityManager.get(new CapabilityToken<>(){});

    public static void register(RegisterCapabilitiesEvent event) {
        event.register(ITest.class);
    }

}
