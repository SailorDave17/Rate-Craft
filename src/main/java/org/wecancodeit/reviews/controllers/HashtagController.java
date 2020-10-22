package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.HashtagStorage;

@Controller
@RequestMapping("/hashtags")
public class HashtagController {

    private HashtagStorage hashtagStorage;

    public HashtagController(HashtagStorage hashtagStorage) { this.hashtagStorage = hashtagStorage; }

    @RequestMapping({"", "/"})
    public String displayAllHashtagsPage(Model model) {
        model.addAttribute("hashtags",hashtagStorage.retrieveAllHashtags());
        return "all-hashtags";
    }
    @RequestMapping("/{id}")
    public String displaySingleHashtagPage(Model model, @PathVariable long id) {
        model.addAttribute("hashtag",hashtagStorage.retrieveHashtagById(id));
        return "single-hashtag";
    }
}
