package com.mjc813.food_web.ingredient.dto;

import com.mjc813.food_web.common.IIdName;
import com.mjc813.food_web.ingredient_category.dto.IngredientCategoryDto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IngredientDto implements IIngredient {
    private Long id;
    private String name;

    private Long ingredientCategoryId;
    private IngredientCategoryDto ingredientCategoryDto;

    @Override
    public IIdName getIngredientCategory() {
        return this.ingredientCategoryDto;
    }

    @Override
    public void setIngredientCategory(IIdName ingredientCategory) {
        if( this.ingredientCategoryDto == null ) {
            this.ingredientCategoryDto = new IngredientCategoryDto();
        }
        this.ingredientCategoryDto.copyMembersIdName(ingredientCategory);
    }

    @Override
    public Long getIngredientCategoryId() {
        // Long ingredientCategoryId 값과 IngredientCategoryDto ingredientCategoryDto.getId() 값이 항상 같도록 get 하는 기능
        this.setIngredientCategoryId(this.ingredientCategoryId);
        return this.ingredientCategoryId;
    }

    @Override
    public void setIngredientCategoryId(Long ingredientCategoryId) {
        // Long ingredientCategoryId 값과 IngredientCategoryDto ingredientCategoryDto.getId() 값이 항상 같도록 set 하는 기능
        if (ingredientCategoryId == null) {
            if (this.ingredientCategoryDto != null && this.ingredientCategoryDto.getId() != null) {
                this.ingredientCategoryId = this.ingredientCategoryDto.getId();
            }
            return;
        }
        this.ingredientCategoryId = ingredientCategoryId;
        if (this.ingredientCategoryDto == null) {
            this.ingredientCategoryDto = new IngredientCategoryDto();
        }
        this.ingredientCategoryDto.setId(ingredientCategoryId);
    }
}
