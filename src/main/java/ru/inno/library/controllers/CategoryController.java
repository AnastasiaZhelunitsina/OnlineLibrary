package ru.inno.library.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.inno.library.dto.CategoryForm;
import ru.inno.library.services.CategoryService;

@RequiredArgsConstructor
@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public String getCategories(@RequestParam(value = "orderBy", required = false) String orderBy,
                                    @RequestParam(value = "dir", required = false) String direction, Model model) {
        model.addAttribute("categories", categoryService.getCategories());
        return "categories/categories_page";
    }

    @GetMapping("/categories/{category-id}")
    public String getCategory(@PathVariable("category-id") Long categoryId, Model model) {
        model.addAttribute("category", categoryService.getCategory(categoryId));
        return "categories/category_page";
    }

    @PostMapping("/categories")
    public String addCategory(CategoryForm category) {
        categoryService.addCategory(category);
        return "redirect:/categories/";
    }

    @PostMapping("/categories/{category-id}/update")
    public String updateCategory(@PathVariable("category-id") Long categoryId, CategoryForm category) {
        categoryService.updateCategory(categoryId, category);
        return "redirect:/categories/" + categoryId;
    }

    @GetMapping("/categories/{category-id}/delete")
    public String deleteCategory(@PathVariable("category-id") Long categoryId) {
        categoryService.deleteCategory(categoryId);
        return "redirect:/categories/";
    }

}
