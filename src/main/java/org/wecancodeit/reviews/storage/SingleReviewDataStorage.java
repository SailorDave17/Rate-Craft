package org.wecancodeit.reviews.storage;

import org.wecancodeit.reviews.models.SingleBoat;
import org.wecancodeit.reviews.models.SingleReviewData;

import java.util.Collection;

public class SingleReviewDataStorage {
    public SingleReviewDataStorage() {}


    public Collection<SingleReviewData> retrieveAllSingleReviewData() {
        return singleReviewDataList.values();
    }

    public SingleReviewData retrieveReviewDataById(long id) {
        return singleReviewDataList.get(id);
    }
}
