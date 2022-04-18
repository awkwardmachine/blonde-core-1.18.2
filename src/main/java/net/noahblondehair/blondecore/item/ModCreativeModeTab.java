package net.noahblondehair.blondecore.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.noahblondehair.blondecore.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab BLONDE_CORE = new CreativeModeTab("blondecore") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.COBALT_ORE.get());
        }
    };
}