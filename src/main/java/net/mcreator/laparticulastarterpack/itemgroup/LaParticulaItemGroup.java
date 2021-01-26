
package net.mcreator.laparticulastarterpack.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.laparticulastarterpack.item.IceSwordItem;
import net.mcreator.laparticulastarterpack.LaparticulastarterpackModElements;

@LaparticulastarterpackModElements.ModElement.Tag
public class LaParticulaItemGroup extends LaparticulastarterpackModElements.ModElement {
	public LaParticulaItemGroup(LaparticulastarterpackModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabla_particula") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IceSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
