package fr.dev.koz.capabilities;

import net.minecraft.nbt.Tag;
import net.minecraft.nbt.IntTag;
import net.minecraft.core.Direction;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class TestStorage implements Capability.IStorage<ITest>{
    @Nullable
    @Override
    public Tag writeNBT(Capability<ITest> capability, ITest instance, Direction side) {
        return IntTag.valueOf(instance.getValue());
    }

    @Override
    public void readNBT(Capability<ITest> capability, ITest instance, Direction side, Tag nbt) {
        instance.setValue(((IntTag)nbt).getAsInt());
    }
}