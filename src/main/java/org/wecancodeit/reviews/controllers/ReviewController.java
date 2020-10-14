package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.ReviewStorage;

@Controller
public class ReviewController {

    private ReviewStorage reviewStorage;

    public ReviewController(ReviewStorage reviewStorage){

        this.reviewStorage = reviewStorage;
    }

    @RequestMapping("review/{id}")
    public String showSingleReviewData(Model model, @PathVariable long id){

        model.addAttribute("review", reviewStorage.reviewStorageById(id));

        return "reviews";
    }

}
