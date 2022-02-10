package fr.dev.koz.capabilities;

import net.minecraft.nbt.IntTag;
import net.minecraft.core.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TestCapability  implements ICapabilitySerializable<IntTag> {
    @CapabilityInject(ITest.class)
    public static final Capability<ITest> TEST_CAPABILITY = null;
    private LazyOptional<ITest> instance = LazyOptional.of(TEST_CAPABILITY::getDefaultInstance);

    public static void register() {
        CapabilityManager.INSTANCE.register(ITest.class, new TestStorage(), Test::new);
    }


    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return TEST_CAPABILITY.orEmpty(cap, instance);
    }

    @Override
    public IntTag serializeNBT() {
        return (IntTag) TEST_CAPABILITY.getStorage().writeNBT(TEST_CAPABILITY, instance.orElseThrow(() -> new IllegalArgumentException("LazyOptional cannot be empty!")), null);
    }

    @Override
    public void deserializeNBT(IntTag nbt) {
        TEST_CAPABILITY.getStorage().readNBT(TEST_CAPABILITY, instance.orElseThrow(() -> new IllegalArgumentException("LazyOptional cannot be empty!")), null, nbt);
    }
}
