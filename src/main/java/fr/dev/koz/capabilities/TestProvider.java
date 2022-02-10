package fr.dev.koz.capabilities;

import net.minecraft.core.Direction;
import net.minecraft.nbt.IntTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;

public class TestProvider implements ICapabilitySerializable<IntTag> {
    private final LazyOptional<ITest> instance;

    public TestProvider() {
        this.instance = LazyOptional.of(Test::new);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return TestCapability.TEST_CAPABILITY.orEmpty(cap, instance);
    }

    @Override
    public IntTag serializeNBT() {
        return IntTag.valueOf(instance.orElseThrow(() -> new IllegalArgumentException("Unable to serialize the capability : the capability is not present")).getValue());
    }

    @Override
    public void deserializeNBT(IntTag nbt) {
        instance.orElseThrow(() -> new IllegalArgumentException("Unable to deserialize the capability : the capability is not present")).setValue(nbt.getAsInt());
    }

}
