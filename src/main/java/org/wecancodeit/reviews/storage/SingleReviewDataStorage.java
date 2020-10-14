package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.SingleBoat;
import org.wecancodeit.reviews.models.SingleReviewData;

import java.util.Collection;

@Service
public class SingleReviewDataStorage {
    public SingleReviewData singleReviewDataStorageById(long id) {
        return new SingleReviewData(new SingleBoat("catamaran" ), 5, 15, 10, 20, 50, 40);
    }



}
