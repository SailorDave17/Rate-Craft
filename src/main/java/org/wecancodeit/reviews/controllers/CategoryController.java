package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.CategoryStorage;
import org.wecancodeit.reviews.storage.ReviewStorage;

@Controller
public class CategoryController {

    private CategoryStorage categoryStorage;
    private ReviewStorage reviewStorage;

    public CategoryController(CategoryStorage categoryStorage) { this.categoryStorage = categoryStorage; }

    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("categories", categoryStorage.retrieveAllCategories());
        return "home";
    }
    @RequestMapping("/categories/{id}")
    public String displayTypePage(Model model) {
        model.addAttribute("reviews", reviewStorage.retrieveAllReviews());
        return "category";
    }
}
