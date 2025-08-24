package net.happysnowball.pethouse;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.happysnowball.pethouse.register.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PET_HOUSE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PetHouse.MOD_ID, "pet_house"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pet_house"))
                    .icon(() -> new ItemStack(Items.ACACIA_BOAT)).entries((displayContext, entries) -> {


                        entries.add(ModBlocks.TEST_HOUSE);
                    }).build());
}
