package ru.inno.library.services;

import ru.inno.library.dto.CategoryForm;

public interface CategoryService {

    public void deleteCategory(Long id);

    void updateCategory(Long categoryId, CategoryForm category);

    Object getCategories();

    Object getCategory(Long categoryId);

    void addCategory(CategoryForm category);
}