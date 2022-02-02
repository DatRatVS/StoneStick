package datrat.stonestick.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup STONE_STICK_GROUP = new ItemGroup("StoneStickTab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.STONE_STICK.get());
        }

    };

}
