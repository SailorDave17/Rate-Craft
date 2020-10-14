package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.SingleReviewDataStorage;

@Controller
public class SingleReviewDataController {

    private SingleReviewDataStorage singleReviewDataStorage;

    public SingleReviewDataController(SingleReviewDataStorage singleReviewDataStorage){

        this.singleReviewDataStorage = singleReviewDataStorage;
    }

    @RequestMapping("review/{id}")
    public String showSingleReviewData(Model model, @PathVariable long id){

        model.addAttribute("singleReviewData", singleReviewDataStorage.singleReviewDataStorageById(id));

        return "reviews";
    }

}
