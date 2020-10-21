package org.wecancodeit.reviews.controllers;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.models.Category;
import org.wecancodeit.reviews.models.Review;
import org.wecancodeit.reviews.storage.CategoryStorage;
import org.wecancodeit.reviews.storage.ReviewStorage;


@Controller
public class ReviewController {

    private ReviewStorage reviewStorage;
    private CategoryStorage categoryStorage;

    public ReviewController(ReviewStorage reviewStorage, CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
        this.reviewStorage = reviewStorage;
    }

    @RequestMapping("review/{id}")
    public String showSingleReviewData(Model model, @PathVariable long id) {

        model.addAttribute("review", reviewStorage.retrieveReviewById(id));

        return "reviews";
    }

    @PostMapping("/review")
    public String createReview(@RequestParam long bcategory, @RequestParam String bmakename, @RequestParam String bmodelname, @RequestParam String description){
        Category selectedCategory = categoryStorage.retrieveCategoryById(bcategory);
        Review newReview = new Review(selectedCategory, bmakename, bmodelname, description);
//        categoryStorage.addCategory(categoryToAdd);
        reviewStorage.addReview(newReview);
        return "redirect:/";
    }

    @RequestMapping("/revieweditor/{id}")
    public String showSingleReviewEditor(Model model, @PathVariable long id){
        model.addAttribute("review", reviewStorage.retrieveReviewById(id));
        model.addAttribute("categories", categoryStorage.retrieveAllCategories());
        return "revieweditor";
    }

    @PostMapping("/editreview/{id}")
    public String editReview(@RequestParam long bcategory, @RequestParam String bmakename, @RequestParam String bmodelname, @RequestParam String description, @RequestParam Long id){
        Category selectedCategory = categoryStorage.retrieveCategoryById(bcategory);
        Review editedReview = new Review(selectedCategory, bmakename, bmodelname, description);
        editedReview.setId(id);
        reviewStorage.updateReview(editedReview);
        return "redirect:/";
    }

    @RequestMapping("/deletereview/{id}")
    public String deleteReview(@PathVariable Long id){
        reviewStorage.deleteReview(id);
        return "redirect:/";
    }

}
