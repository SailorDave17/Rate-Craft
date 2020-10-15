package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.Category;
import org.wecancodeit.reviews.models.Review;

@Service
public class ReviewStorage {
    public Review reviewStorageById(long id) {
        return new Review(new Category("Catamaran" ), "Jameson Shipworks", "Battlestation",
                "Give me fuel, give me fire, give me that which I desire!");

    }
}
