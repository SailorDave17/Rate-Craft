package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.CategoryStorage;
import org.wecancodeit.reviews.storage.HashtagStorage;

@Controller
public class CategoryController {

    private CategoryStorage categoryStorage;
    private HashtagStorage hashtagStorage;

    public CategoryController(CategoryStorage categoryStorage, HashtagStorage hashtagStorage) {
        this.categoryStorage = categoryStorage;
        this.hashtagStorage = hashtagStorage;
    }

    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("categories", categoryStorage.retrieveAllCategories());
        model.addAttribute("hashtags", hashtagStorage.retrieveAllHashtags());
        return "home";
    }

    @RequestMapping("/category/{id}")
    public String displayCategoryPage(Model model, @PathVariable long id) {
        model.addAttribute("category", categoryStorage.retrieveCategoryById(id));
        return "category";
    }


}
