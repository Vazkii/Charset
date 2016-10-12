package pl.asie.charset.lib.recipe;

import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IModIngredientRegistration;

import javax.annotation.Nonnull;

@JEIPlugin
public class JEIPluginCharsetLib implements IModPlugin {
    @Override
    public void register(@Nonnull IModRegistry registry) {
        registry.addRecipeHandlers(new JEIRecipeCharset.Handler());
    }

    @Override
    public void onRuntimeAvailable(@Nonnull IJeiRuntime jeiRuntime) {

    }

	@Override
	public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {

	}

	@Override
	public void registerIngredients(IModIngredientRegistration registry) {

	}
}
