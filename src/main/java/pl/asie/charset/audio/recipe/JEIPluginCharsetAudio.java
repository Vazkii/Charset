/*
 * Copyright (c) 2015-2016 Adrian Siekierka
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.asie.charset.audio.recipe;

import mezz.jei.api.*;

import javax.annotation.Nonnull;

import mezz.jei.api.ingredients.IModIngredientRegistration;

@JEIPlugin
public class JEIPluginCharsetAudio implements IModPlugin {
	public static IJeiHelpers jeiHelpers;
	
	@Override
	public void register(IModRegistry registry) {
		jeiHelpers = registry.getJeiHelpers();
		registry.addRecipeHandlers(new JEITapeCraftingRecipe.Handler(), new JEITapeReelCraftingRecipe.Handler());
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
