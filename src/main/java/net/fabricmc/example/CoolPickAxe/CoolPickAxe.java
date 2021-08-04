package net.fabricmc.example.CoolPickAxe;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CoolPickAxe extends PickaxeItem {

    public CoolPickAxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

}
