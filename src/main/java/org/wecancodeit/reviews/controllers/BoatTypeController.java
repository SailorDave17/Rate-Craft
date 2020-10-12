package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.BoatTypeStorage;

@Controller
public class BoatTypeController {

    private BoatTypeStorage boatTypeStorage;

    public BoatTypeController(BoatTypeStorage boatTypeStorage) { this.boatTypeStorage = boatTypeStorage; }

    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("boatType", boatTypeStorage.retrieveAllBoats());
        return "home";
    }
}
