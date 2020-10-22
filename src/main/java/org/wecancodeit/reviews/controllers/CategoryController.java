package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.CategoryStorage;

@Controller
public class CategoryController {

    private CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) { this.categoryStorage = categoryStorage; }

    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("categories", categoryStorage.retrieveAllCategories());
        return "home";
    }
    @RequestMapping("/category/{id}")
    public String displayCategoryPage(Model model, @PathVariable long id) {
        model.addAttribute("category", categoryStorage.retrieveCategoryById(id));
        return "category";
    }


}
