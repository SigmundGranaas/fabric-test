package net.fabricmc.example;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ExampleItem extends BlockItem {

    public ExampleItem(ExampleBlock block,Settings settings) {
        super(block, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        long time = world.getTimeOfDay();
        if(time < 300){
            playerEntity.playSound(SoundEvents.ENTITY_SHEEP_DEATH, 1.0F, 1.0F);
        }else if(time < 600 ){
            playerEntity.playSound(SoundEvents.ENTITY_CHICKEN_DEATH, 1.0F, 1.0F);
        }else if(time < 900 ){
            playerEntity.playSound(SoundEvents.ENTITY_WOLF_DEATH, 1.0F, 1.0F);
        }else if(time < 1200 ){
            playerEntity.playSound(SoundEvents.ENTITY_FOX_DEATH, 1.0F, 1.0F);
        }else if(time < 2400 ){
            playerEntity.playSound(SoundEvents.ENTITY_PIG_DEATH, 1.0F, 1.0F);
        }else{
            playerEntity.playSound(SoundEvents.ENTITY_COW_DEATH, 1.0F, 1.0F);
        }

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
