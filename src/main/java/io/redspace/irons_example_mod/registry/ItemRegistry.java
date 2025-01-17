package io.redspace.irons_example_mod.registry;

import io.redspace.irons_example_mod.PocketSpell;
import io.redspace.irons_example_mod.items.weapons.HolySword;
import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PocketSpell.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> HOLYSWORD = ITEMS.register("holysword", () -> new HolySword(new SpellDataRegistryHolder[]{new SpellDataRegistryHolder(ExampleSpellRegistry.SUPER_HEAL_SPELL, 1)}));

}
