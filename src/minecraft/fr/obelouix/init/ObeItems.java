package fr.obelouix.init;

import net.minecraft.init.Bootstrap;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Louis on 20/06/2017.
 */
public class ObeItems {


    private static Item getRegisteredItem(String name)
    {
        Item item = Item.REGISTRY.getObject(new ResourceLocation(name));

        if (item == null)
        {
            throw new IllegalStateException("Invalid Item requested: " + name);
        }
        else
        {
            return item;
        }
    }

    static {
        if (!Bootstrap.isRegistered()) {
            throw new RuntimeException("Accessed Items before Bootstrap!");
        } else {

        }
    }
}
