package fr.dev.koz.capabilities;

import net.minecraft.nbt.INBT;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class TestStorage implements Capability.IStorage<ITest>{
    @Nullable
    @Override
    public INBT writeNBT(Capability<ITest> capability, ITest instance, Direction side) {
        return IntNBT.valueOf(instance.getValue());
    }

    @Override
    public void readNBT(Capability<ITest> capability, ITest instance, Direction side, INBT nbt) {
        instance.setValue(((IntNBT)nbt).getInt());
    }
}