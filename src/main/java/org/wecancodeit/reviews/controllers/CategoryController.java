package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.CategoryStorage;

@Controller
public class CategoryController {

    private CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) { this.categoryStorage = categoryStorage; }

    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("boatType", categoryStorage.retrieveAllCategories());
        return "home";
    }
    @RequestMapping("/categories/{id}")
    public String displayTypePage(Model model) {
        model.addAttribute("category", categoryStorage.retrieveAllCategories());
        return "category";
    }


}
