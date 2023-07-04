package ru.inno.library.services.impl;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ru.inno.library.dto.CategoryForm;
import ru.inno.library.models.Category;
import ru.inno.library.repositories.CategoryRepository;
import ru.inno.library.services.CategoryService;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow();
    }

    @Override
    public void addCategory(CategoryForm category) {
        Category newCategory = Category.builder()
                .name(category.getName())
                .summary(category.getSummary())
                .build();

        categoryRepository.save(newCategory);
    }

    @Override
    public void updateCategory(Long categoryId, CategoryForm categoryForm) {
        Category categoryForUpdate = categoryRepository.findById(categoryId)
                .orElseThrow();
        categoryForUpdate.setName(categoryForm.getName());
        categoryForUpdate.setSummary(categoryForUpdate.getSummary());

        categoryRepository.save(categoryForUpdate);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        Category categoryForDelete = categoryRepository.findById(categoryId).orElseThrow();
        categoryForDelete.setState(Category.State.DELETED);

        categoryRepository.save(categoryForDelete);
    }

}