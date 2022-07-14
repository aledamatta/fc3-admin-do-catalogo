package com.fullcycle.admin.catalogo.application.category.update;

import com.fullcycle.admin.catalogo.domain.category.Category;
import com.fullcycle.admin.catalogo.domain.category.CategoryID;

public record UpdateCategoryOutput(String id) {

    public static UpdateCategoryOutput from(String anId) {
        return new UpdateCategoryOutput(anId);
    }

    public static UpdateCategoryOutput from(Category aCategory) {
        return new UpdateCategoryOutput(aCategory.getId().getValue());
    }
}
