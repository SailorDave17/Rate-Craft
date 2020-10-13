package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.SingleBoatStorage;

@Controller
public class SingleBoatController {

    private SingleBoatStorage singleBoatStorage;

    public SingleBoatController(SingleBoatStorage singleBoatStorage) { this.singleBoatStorage = singleBoatStorage; }

    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("boatType", singleBoatStorage.retrieveAllBoats());
        return "home";
    }
    @RequestMapping("/types/{id}")
    public String displayTypePage(Model model){
        model.addAttribute("singleReview", singleReviewStorage.retrieveAllReviews());
    }


}
