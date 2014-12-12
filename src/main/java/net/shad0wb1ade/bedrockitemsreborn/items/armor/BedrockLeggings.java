package net.shad0wb1ade.bedrockitemsreborn.items.armor;

import net.shad0wb1ade.bedrockitemsreborn.BedrockItemsReborn;
import net.shad0wb1ade.bedrockitemsreborn.init.BIRGameObjects;
import net.shad0wb1ade.bedrockitemsreborn.items.armor.main.BedrockArmor;

public class BedrockLeggings extends BedrockArmor
{
    public BedrockLeggings(String name)
    {
        super(BIRGameObjects.BedrockArmorMaterial, BedrockItemsReborn.proxy.addArmor("bedrockArmor"), 2);
        this.setUnlocalizedName(name);
    }
}
