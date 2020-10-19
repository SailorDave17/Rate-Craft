package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.models.Review;
import org.wecancodeit.reviews.storage.CategoryStorage;
import org.wecancodeit.reviews.storage.ReviewStorage;

import javax.persistence.Id;

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
    @RequestMapping("/category/{id}")
    public String displayCategoryPage(Model model, @PathVariable long id) {
        model.addAttribute("category", categoryStorage.retrieveCategoryById(id));
        return "category";
    }

    @PostMapping("/category")
    public String createCategoryAndReview(@RequestParam String bcategory, @RequestParam String bmakename, @RequestParam String bmodelname, @RequestParam String description){
       Review newReview = new Review(categoryStorage.retrieveCategoryById(Long.parseLong(bcategory)), bmakename, bmodelname, description);
//        categoryStorage.addCategory(categoryToAdd);
        reviewStorage.addReview(Review newReview);


    }
}
